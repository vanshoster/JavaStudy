package vansho.lambdass.test;

import vansho.lambdass.utils.Album;
import vansho.lambdass.utils.Person;
import vansho.lambdass.utils.Track;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class DataLoader {
    Person person1 = new Person("Krist Novoselic", null, "American");
    Person person2 = new Person("Frances Bean Cobain", null, "American");
    Person person3 = new Person("Kurt Cobain", asList(person2), "American");
    Person person4 = new Person("Lars Ulrich", null, "Danish-American");
    Person person5 = new Person("Cali Hetfield", null, "American");
    Person person6 = new Person("Castor Hetfield", null, "American");
    Person person7 = new Person("Marcella Hetfield", null, "American");
    Person person8 = new Person("James Hetfield", asList(person5, person6, person7), "American");
    Person person9 = new Person("Kirk Hammett", null, "American");
    Person person10 = new Person("Jason Newsted", null, "American");
    Person person11 = new Person("Jim Morrison", null, "African");
    Person person12 = new Person("Pablo Manzarek", null, "Jewish");
    Person person13 = new Person("Ray Manzarek", asList(person12), "Jewish");
    Person person14 = new Person("Destiny Jones", null, "Russian");
    Person person15 = new Person("Nasir Jones", asList(person14), "Russian");
    Person person16 = new Person("Joseph Adenuga", null, "African");

    List<Person> personList = Stream.of(person1, person2, person3, person4, person5, person6, person7, person8,
            person9, person10, person11, person12, person13, person14, person15, person16).toList();

    Track track1 = new Track("Smells Like Teen Spirit", 301);
    Track track2 = new Track("In Bloom", 255);
    Track track3 = new Track("Come As You Are", 218);
    Track track4 = new Track("Breed", 184);
    Track track5 = new Track("Lithium", 257);
    Track track6 = new Track("Polly", 173);
    Track track7 = new Track("Territorial Pissings", 142);
    Track track8 = new Track("Drain You", 223);
    Track track9 = new Track("Lounge Act", 156);
    Track track10 = new Track("Stay Away", 211);
    Track track11 = new Track("On A Plain", 194);
    Track track12 = new Track("Something In The Way", 173);
    Track track13 = new Track("Endless, Nameless", 403);
    Track track14 = new Track("Enter Sandman", 331);
    Track track15 = new Track("Sad But True", 323);
    Track track16 = new Track("Holier Than Thou", 227);
    Track track17 = new Track("Wherever I May Roam", 403);
    Track track18 = new Track("Don't Tread On Me", 240);
    Track track19 = new Track("Throught The Never", 242);
    Track track20 = new Track("Nothing Else Matter", 388);
    Track track21 = new Track("Of Wolf And Man", 256);
    Track track22 = new Track("The God That Failed", 308);
    Track track23 = new Track("My Friend Of Misery", 407);
    Track track24 = new Track("The Stuggle Within", 233);
    Track track25 = new Track("Break on Through", 145);
    Track track26 = new Track("Soul Kitchen", 213);
    Track track27 = new Track("The Crystal Ship", 152);
    Track track28 = new Track("Twentieth Century Fox", 231);
    Track track29 = new Track("Alabama Song (Whisky Bar)", 242);
    Track track30 = new Track("Light My Fire", 167);
    Track track31 = new Track("Back Door Man", 164);
    Track track32 = new Track("I Looked at You", 202);
    Track track33 = new Track("End of the Night", 189);
    Track track34 = new Track("Take It as It Come", 220);
    Track track35 = new Track("The End", 408);
    Track track36 = new Track("The Genesis", 123);
    Track track37 = new Track("N.Y. State of Mind", 265);
    Track track38 = new Track("Life's a Bitch", 187);
    Track track39 = new Track("The World Is Yours", 250);
    Track track40 = new Track("Halftime", 242);
    Track track41 = new Track("Memory Lane", 182);
    Track track42 = new Track("One Love", 136);
    Track track43 = new Track("One Time 4 Your Mind", 349);
    Track track44 = new Track("Represent", 143);
    Track track45 = new Track("It Ain't Hard to Tell", 248);
    Track track46 = new Track("Bullet From A Gun", 123);
    Track track47 = new Track("Greaze Mode", 265);
    Track track48 = new Track("Redrum", 187);
    Track track49 = new Track("What Do You Mean?", 250);
    Track track50 = new Track("Going Through It", 242);
    Track track51 = new Track("Same Old Story", 182);
    Track track52 = new Track("Love Me Not", 136);
    Track track53 = new Track("Glow In The Dark", 349);
    Track track54 = new Track("You Wish", 143);
    Track track55 = new Track("Gangsta", 248);
    Track track56 = new Track("Pure Water", 248);

    List<Track> trackList = Stream.of(track1, track2, track3, track4, track5, track6, track7, track8, track9, track10,
            track11, track12, track13, track14, track15, track16, track17, track18, track19, track20,
            track21, track22, track23, track24, track25, track26, track27, track28, track29, track30,
            track31, track32, track33, track34, track35, track36, track37, track38, track39, track40,
            track41, track42, track43, track44, track45, track46, track47, track48, track49, track50,
            track51, track52, track53, track54, track55, track56).toList();


    Album album1 = new Album("Nevermind", asList(track1, track2, track3, track4, track5, track6, track7,
            track8, track9, track10, track11, track12, track13), asList(person1, person3));

    Album album2 = new Album("Metallica", asList(track14, track15, track16, track17, track18, track19,
            track20, track21, track22, track23, track24), asList(person4, person8, person9, person10));

    Album album3 = new Album("The Doors", asList(track25, track26, track27, track28, track29, track30,
            track31, track32, track33, track34, track35), asList(person11, person13));
    Album album4 = new Album("Illmatic", asList(track36, track37, track38, track39, track40, track41,
            track42, track43, track44, track45), asList(person15));
    Album album5 = new Album("Ignorance Is Bliss", asList(track46, track47, track48, track49, track50,
            track51, track52, track53, track54, track55, track56), asList(person16));

    List<Album> albumList = Stream.of(album1, album2, album3, album4, album5).toList();
}
