/*
 * Album
 * ruicouto in 28/nov/2016
 */
package pt.uminho.di.business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ruicouto
 */
public class Album {
    /** Id of the Album */
    private int id;
    /** Name of the album */
    private String name;
    /** Artist */
    private String artist;
    /** List of tracks */
    private List<Track> tracks;

    public Album(String name, String artist) {
        this.id = -1;
        this.name = name;
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public String getArtist() {
        return artist;
    }

    public int getId() {
        return id;
    }
        
    public void setName(String name) {
        this.name = name;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
