package vansho.lambdass.test;

import vansho.lambdass.utils.Album;
import vansho.lambdass.utils.Person;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LambdaTest4 {
    public static void main(String[] args) {
        f1stream(DataLoader.albumList);
    }

    private static void f1stream(List<Album> albumList) {
        Map<Person, List<String>> result = albumList.stream()
                .flatMap(album -> album.getPersonsList().stream()
                        .map(person -> new AbstractMap.SimpleEntry<>(person, album.getNameAlbum())))
                .collect(Collectors.groupingBy(q -> q.getKey(), Collectors.mapping(q -> q.getValue(), Collectors.toList())));

        System.out.println(result);
    }

    private static void f1() {
        Map<Person, List<String>> nameOfAlbumForPerson = new HashMap<>();
    }
}
