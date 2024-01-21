package vansho.lambdass.test;

import java.util.Iterator;
import java.util.List;
import vansho.lambdass.utils.ActionListener;
import vansho.lambdass.utils.Person;
import vansho.lambdass.test.DataLoader;

import java.util.function.Predicate;

public class LambdaTest1 {
    public static void main(String[] args) {
        DataLoader data = new DataLoader();
        f2(data.getPersonList());
        f2iterator(data.getPersonList());
        f2stream(data.getPersonList());
    }

    private static void f1() {
        ActionListener actionListener = (actionEvent) -> System.out.println();
        Predicate<Integer> mostPredicate = (a) -> a > 5;
    }

    private static void f2(List<Person> listOfPersons) {
        int counter = 0;
        for (Person person : listOfPersons) {
            if (person.isFrom("Jewish")) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static void f2iterator(List<Person> listOfPersons) {
        int counter = 0;
        Iterator<Person> iter = listOfPersons.iterator();
        while (iter.hasNext()) {
            if (iter.next().isFrom("Jewish")) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static void f2stream(List<Person> listOfPersons) {
        long counter = listOfPersons.stream()
                .filter(q -> q.isFrom("Jewish"))
                .count();
        System.out.println(counter);
    }
}
