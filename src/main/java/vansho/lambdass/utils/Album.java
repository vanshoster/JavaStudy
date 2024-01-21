package vansho.lambdass.utils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.Collections.unmodifiableList;

public class Album {
    private String nameAlbum;
    private List<Track> tracksList;
    private List<Person> personsList;

    public Album(String nameAlbum, List<Track> tracksList, List<Person> personsList) {
        Objects.requireNonNull(nameAlbum);
        Objects.requireNonNull(tracksList);
        Objects.requireNonNull(personsList);
        this.nameAlbum = nameAlbum;
        this.tracksList = tracksList;
        this.personsList = personsList;
    }

    public String getNameAlbum() {return nameAlbum;}
    public Stream<Track> getTracksStream() {return tracksList.stream();}
    public Stream<Person> getPersonsStream() {return personsList.stream();}
    public List<Track> getTracksList() {  return unmodifiableList(tracksList);   }
    public List<Person> getPersonsList() {    return unmodifiableList(personsList);    }
    public Person getFirstPersonFromListPersons() {return personsList.get(0);}

}
