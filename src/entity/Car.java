package entity;

import java.util.List;

/**
 * Created by Alexandra on 3/1/2018.
 */
public class Car {

    private Position position;
    private boolean hasRide;
    private long availableTime;
    private int carNumber;
    private List<Integer> ridesList;

    public List<Integer> getRidesList() {
        return ridesList;
    }

    public void setRidesList(List<Integer> ridesList) {
        this.ridesList = ridesList;
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public boolean isHasRide() {
        return hasRide;
    }

    public void setHasRide(boolean hasRide) {
        this.hasRide = hasRide;
    }

    public long getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(long availableTime) {
        this.availableTime = availableTime;
    }
}
