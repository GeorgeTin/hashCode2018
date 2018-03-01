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
    private int rideNumber;

    public Ride(Position startPoz, Position  endPosition, int earliest, int latest, int rideNumber) {
        this.endPosition = endPosition;
        this.startPoz = startPoz;
        this.earliest = earliest;
        this.latest = latest;
        this.rideNumber = rideNumber;

        this.distance = Utily.calculateDistance(startPoz, endPosition);
    }

    public int getRideNumber() {
        return rideNumber;
    }

    public void setRideNumber(int rideNumber) {
        this.rideNumber = rideNumber;
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

    @Override
    public String toString() {
        return this.startPoz.getX() + " " + this.startPoz.getY() + " " + this.endPosition.getX() + " " + this.endPosition.getY() + " " +
                this.earliest + " " + this.latest;
    }
}
