package vansho.lambdass.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Person {
    private String name;
    private List<Person> childrens;
    private String nationality;

    public Person(String name, String nationality) {
        this(name, Collections.emptyList(), nationality);
    }

    public Person(String name, List<Person> members, String nationality) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(members);
        Objects.requireNonNull(nationality);
        this.name = name;
        this.childrens = new ArrayList<>(members);
        this.nationality = nationality;
    }

    public String getName() {return name;}
    public Stream<Person> getChildrens() {  return childrens.stream();   }
    public String getNationality() {
        return nationality;
    }
    public boolean isSolo() {return childrens.isEmpty();}
    public boolean isFrom(String nationality) {
        return this.nationality.equals(nationality);
    }

    @Override
    public String toString() {
        return getName();
    }
}
