package vansho.lambdass.test;

import vansho.lambdass.utils.Track;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class LambdaTest2 {
    public static void main(String[] args) {
        f6();
    }

    private static void f1() {
        List<String> listOfStrings = Stream.of("a", "b", "c", "lol")
                .collect(Collectors.toList());
        System.out.println(listOfStrings);
        System.out.println(asList("a", "b", "c", "lol"));
    }

    private static void f2() {
        List<String> listOfStrings = new ArrayList<>();
        for (String word : Arrays.asList("a", "b", "c", "lol")) {
            listOfStrings.add(word.toUpperCase());
        }
        System.out.println(listOfStrings);
    }

    private static void f2Stream() {
        List<String> list = Stream.of("a", "b", "c", "lol")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list);
    }

    private static void f3() {
        List<Integer> list = Stream.of(asList(24, 25), asList(50, 51), asList(70, 72))
                .flatMap(q -> q.stream())
                .collect(Collectors.toList());
        System.out.println(list);
    }

    private static void f4Min() {
        List<Track> trackList = asList(
                new Track("a", 15),
                new Track("b", 5),
                new Track("c", 115));
        Track shortTrack = trackList.stream()
                .min(Comparator.comparing(q -> q.getLenghtTrack()))
                .get();
        System.out.println(shortTrack.getName());
    }

    //f4Max() на максимум
    private static void f4Max() {
        List<Track> trackList = asList(
                new Track("a", 12),
                new Track("b", 112),
                new Track("c", 51));
        Track longTrack = trackList.stream()
                .max(Comparator.comparing(q -> Integer.valueOf(q.getLenghtTrack())))
                .get();
        System.out.println(longTrack.getName());
    }

    private static void f4Max2() {
        List<Track> trackList = asList(
                new Track("a", 12),
                new Track("b", 112),
                new Track("c", 51));
        Track longTrack = trackList.stream()
                .max(Comparator.comparingInt(q -> q.getLenghtTrack()))
                .get();
        System.out.println(longTrack.getName());
    }

    private static void f5() {
        int sum = Stream.of(1,2,3,4)
                .reduce(Integer.valueOf(1), (a, b) -> Integer.valueOf(a * b));
        System.out.println(sum);
    }

    private static void f6() {
        DataLoader data = new DataLoader();
        Set<String> info = data.getAlbumList().stream()
                .filter(q -> q.getNameAlbum().startsWith("Me"))
                .map(q -> q.getFirstPersonFromListPersons().getNationality())
                .collect(Collectors.toSet());
        System.out.println(info);
    }
}
