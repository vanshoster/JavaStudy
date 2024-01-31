package vansho.lambdass.test;

import vansho.lambdass.utils.Album;
import vansho.lambdass.utils.Person;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaTest3 {
    public static void main(String[] args) {
        f1(DataLoader.personList);
        f2(DataLoader.personList);
        f3(DataLoader.albumList);
        f3stream(DataLoader.albumList);
        f3stream(DataLoader.albumList);
        f4stream2(DataLoader.albumList);
        f4stream(DataLoader.albumList);
        f4(DataLoader.albumList);
    }

    private static void f1(List<Person> personList) {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (Person person : personList) {
            if (stringBuilder.length() > 1) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(person.getName());
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }

    private static void f2(List<Person> personList) {
        String result = personList.stream()
                .map(q -> q.getName())
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(result);
    }

    private static void f3(List<Album> albumList) {
        Map<Person, Integer> mapa = new HashMap<>();
        Map<Person, List<Album>> personToAlbums = albumList.stream()
                .collect(Collectors.groupingBy(q -> q.getFirstPersonFromListPersons()));
        for (Map.Entry<Person, List<Album>> setik : personToAlbums.entrySet()) {
            mapa.put(setik.getKey(), setik.getValue().size());
        }
        System.out.println(mapa);
    }

    //сделать через flatMap для каждой персоны, развернуть листы персон
    private static void f3stream(List<Album> albumList) {
        Map<Person, Long> mapa = albumList.stream()
                .flatMap(album -> album.getPersonsList().stream()
                        .map(person -> new AbstractMap.SimpleEntry<>(person, album)))
                .collect(Collectors.groupingBy(q -> q.getKey(), Collectors.counting()));
        //чуть жопа не взорвалась
        System.out.println(mapa);
    }

    private static void f3withFlatMap(List<Album> albumList) {
        var mapa = albumList.stream()
                .collect(Collectors.groupingBy(q -> q.getPersonsStream()));
        System.out.println(mapa);
    }

    private static void f4stream(List<Album> albumList) {
        Map<Person, List<String>> result = albumList.stream()
                .collect(Collectors.groupingBy(
                        q -> q.getFirstPersonFromListPersons(),
                        Collectors.mapping(q -> q.getNameAlbum(), Collectors.toList())));

        System.out.println(result);
    }

    private static void f4(List<Album> albumList) {
        Map<Person, List<String>> nameOfAlbumForPerson = new HashMap<>();
        Map<Person, List<Album>> mapPersonAlbum = albumList.stream()
                .collect(Collectors.groupingBy(q -> q.getFirstPersonFromListPersons()));
        for (Map.Entry<Person, List<Album>> mapEntry : mapPersonAlbum.entrySet()) {
            nameOfAlbumForPerson.put(mapEntry.getKey(), mapEntry.getValue().stream().map(q -> q.getNameAlbum()).toList());
        }
        System.out.println(nameOfAlbumForPerson);
    }

    private static void f4stream2(List<Album> albumList) {
        Map<Person, List<String>> result = albumList.stream()
                .flatMap(album -> album.getPersonsList().stream()
                        .map(person -> new AbstractMap.SimpleEntry<>(person, album.getNameAlbum())))
                .collect(Collectors.groupingBy(q -> q.getKey(),
                        Collectors.mapping(r -> r.getValue(), Collectors.toList())));
        System.out.println(result);
    }
    }
