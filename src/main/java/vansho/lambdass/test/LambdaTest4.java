package vansho.lambdass.test;

import vansho.lambdass.utils.Person;

import java.util.*;

public class LambdaTest4 {
    public static void main(String[] args) {
        f1(DataLoader.personList);
        f2(DataLoader.personList);
        f3(DataLoader.personList);
    }

    private static void f1(List<Person> personList) {
        StringBuilder stringBuilder = new StringBuilder("[");
        for (Person person : personList) {
            if (stringBuilder.length() > 1) {
                stringBuilder.append(",");
            }
            stringBuilder.append(person.getName());
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }

    private static void f2(List<Person> personList) {
        StringBuilder stringBuilder = new StringBuilder("[");
        personList.stream()
                .map(q -> q.getName())
                .forEach(q -> {
                    if (stringBuilder.length() > 1) {
                        stringBuilder.append(", ");
                    }
                    stringBuilder.append(q);
                });
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
    }

    private static void f3(List<Person> personList) {
        StringBuilder result = personList.stream()
                .reduce(new StringBuilder("["), (builder, person) -> {
                    if (builder.length() > 1) {
                        builder.append(", ");
                    }
                    builder.append(person.getName());
                    return builder;
                }, (stringBuilder, stringBuilder2) -> stringBuilder.append(stringBuilder2));
        result.append("]");
//        result.insert(0,"[");  можно вставлять в любое место
        System.out.println(result);
    }

    private static void f5() {

    }
}
