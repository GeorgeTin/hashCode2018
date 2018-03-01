package util;

import entity.Car;
import entity.Position;
import entity.Ride;

/**
 * Created by Alexandra on 3/1/2018.
 */
public class Utily {

    public static long calculateTime(Ride ride, Car car){
        long availableFrom;
        if(car.isHasRide())
            availableFrom = car.getAvailableTime();
        else
            availableFrom = Timer.getTIMER();

        long distCarToStartPoint = Math.max(availableFrom, ride.getEarliest()) + calculateDistance(car.getPosition(), ride.getStartPoz());

        return distCarToStartPoint + ride.getDistance();
    }

    public static long calculateDistance(Position from, Position to){
        long distance = Math.abs(from.getX() - to.getX()) + Math.abs(from.getY() - to.getY());
        return distance;
    }
}
