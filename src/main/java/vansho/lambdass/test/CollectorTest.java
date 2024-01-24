package vansho.lambdass.test;

import vansho.lambdass.utils.Album;
import vansho.lambdass.utils.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorTest {
    public static void main(String[] args) {
        findMaxGroup(DataLoader.personList);
        f2(DataLoader.albumList);
        f3(DataLoader.personList);
        f4(DataLoader.albumList);
    }

    private static void findMaxGroup(List<Person> personList) {
        Person personWithMaxChildren = personList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(q -> q.getChildrens().count()))).get();
        System.out.println("Person with maximum childrens is " + personWithMaxChildren.getName());
    }

    private static void f2(List<Album> albumList) {
        Double averageTrackCount = albumList.stream()
                .collect(Collectors.averagingInt(q -> q.getTracksList().size()));
        System.out.println("Average track in album list is " + averageTrackCount);
    }

    private static void f3(List<Person> personList) {
    Map<Boolean, List<Person>> partitioningBySolo = personList.stream()
                .collect(Collectors.partitioningBy(q -> q.isSolo()));
        System.out.println("Partitioninf persons by solo or not: " + partitioningBySolo);
    }

    private static void f4(List<Album> albumList) {
        Map<String, List<Album>> albumsGroupByName = albumList.stream()
                .collect(Collectors.groupingBy(q -> q.getNameAlbum()));
        System.out.println("Albums group by album name: " + albumsGroupByName);
    }
}
