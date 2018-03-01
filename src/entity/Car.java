package entity;

import util.CarDistribution;
import util.Utily;

import java.util.List;

/**
 * Created by Alexandra on 3/1/2018.
 */
public class Car implements Comparable<Car>{

    private Position position;
    private boolean hasRide;
    private long availableTime;
    private int carNumber;
    private List<Integer> ridesList;

    public Car(Position position, boolean hasRide, long availableTime, int carNumber) {
        this.position = position;
        this.hasRide = hasRide;
        this.availableTime = availableTime;
        this.carNumber = carNumber;
    }

    @Override
    public int compareTo(Car o) {
        if(Utily.calculateDistance(o.getPosition(), CarDistribution.sortBy) < Utily.calculateDistance(this.getPosition(), CarDistribution.sortBy))
            return 1;
        else
            return -1;
    }

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
