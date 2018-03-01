package entity;

import util.Utily;

/**
 * Created by Alexandra on 3/1/2018.
 */
public class Ride {

    private Position startPoz;
    private Position endPosition;
    private long distance;
    private int earliest;
    private int latest;

    public Ride(Position endPosition, Position startPoz, int earliest, int latest) {
        this.endPosition = endPosition;
        this.startPoz = startPoz;
        this.earliest = earliest;
        this.latest = latest;

        this.distance = Utily.calculateDistance(startPoz, endPosition);
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public Position getStartPoz() {
        return startPoz;
    }

    public void setStartPoz(Position startPoz) {
        this.startPoz = startPoz;
    }

    public Position getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Position endPosition) {
        this.endPosition = endPosition;
    }

    public int getEarliest() {
        return earliest;
    }

    public void setEarliest(int earliest) {
        this.earliest = earliest;
    }

    public int getLatest() {
        return latest;
    }

    public void setLatest(int latest) {
        this.latest = latest;
    }
}
