package entity;

/**
 * Created by Alexandra on 3/1/2018.
 */
public class Car {

    private Position lastPosition;
    private Position nextPosition;
    private boolean hasRide;
    private int availableTime;


    public Position getLastPosition() {
        return lastPosition;
    }

    public void setLastPosition(Position lastPosition) {
        this.lastPosition = lastPosition;
    }

    public Position getNextPosition() {
        return nextPosition;
    }

    public void setNextPosition(Position nextPosition) {
        this.nextPosition = nextPosition;
    }

    public boolean isHasRide() {
        return hasRide;
    }

    public void setHasRide(boolean hasRide) {
        this.hasRide = hasRide;
    }

    public int getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(int availableTime) {
        this.availableTime = availableTime;
    }
}
