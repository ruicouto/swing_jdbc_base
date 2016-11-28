/*
 * Track
 * ruicouto in 28/nov/2016
 */
package pt.uminho.di.business;

/**
 *
 * @author ruicouto
 */
public class Track {
    /** Id of the track */
    private int id;
    /** Duration of the track */
    private String title;
    /** Length of the track */
    private double length;

    public Track(String title, double length) {
        this.id=-1;
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLength() {
        return length;
    }

    public int getId() {
        return id;
    }
    
    public void setLength(double length) {
        this.length = length;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return title;
    }
    
}
