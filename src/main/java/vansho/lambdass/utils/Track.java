package vansho.lambdass.utils;

public class Track {
    private final String name;
    private final int lenghtTrack;


    public Track(String name, int lenghtTrack) {
        this.name = name;
        this.lenghtTrack = lenghtTrack;
    }

    public String getName() {return name;}
    public int getLenghtTrack() {return lenghtTrack;}
}
