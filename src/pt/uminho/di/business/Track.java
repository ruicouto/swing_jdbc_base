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
    /** Duration of the track */
    private String title;
    /** Length of the track */
    private double length;

    public Track(String title, double length) {
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
    
    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public String toString() {
        return title;
    }
    
}
