package util;

import entity.Car;
import entity.Position;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexandra on 3/1/2018.
 */
public class CarDistribution {

    //map coords
    private int X;
    private int Y;
    private Position centerZone0;
    private Position centerZone1;
    private Position centerZone2;
    private Position centerZone3;

    private List<Car> carsNE = new ArrayList<>();
    private List<Car> carsNV = new ArrayList<>();
    private List<Car> carsSE = new ArrayList<>();
    private List<Car> carsSV = new ArrayList<>();

    public static Position sortBy;

    public CarDistribution(int x, int y) {
        X = x;
        Y = y;

        this.centerZone0 = new Position(X/4, Y/4);
        this.centerZone1 = new Position(X/4 * 3, Y/4);
        this.centerZone2 = new Position(X/4 * 3, Y/4 * 3);
        this.centerZone3 = new Position(X/4, Y/4 * 3);
    }

    public void addCar(Car car){
        int x = car.getPosition().getX();
        int y = car.getPosition().getY();

        if(x <= X/2 && y <= Y/2)
            carsSV.add(car);
        else
            if(x <= X/2 && y > Y/2)
                carsNV.add(car);
            else
                if(x > X/2 && y>Y/2)
                    carsNE.add(car);
                else
                    carsSE.add(car);
    }

    public void removeCar(Car car){
        int x = car.getPosition().getX();
        int y = car.getPosition().getY();

        if(x <= X/2 && y <= Y/2)
            carsSV.remove(car);
        else
            if(x <= X/2 && y > Y/2)
            carsNV.remove(car);
                else
                    if(x > X/2 && y>Y/2)
                        carsNE.remove(car);
                    else
                        carsSE.remove(car);
    }

    public void initiateCars(int nrOfCars){
        for(int i = 0; i<nrOfCars; i++){
            Position poz = new Position(0, 0);
            Car car = new Car(poz, false, 0l, i);
            carsSV.add(car);
        }

    }



}
