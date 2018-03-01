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

    private List<Car> carsNE = new ArrayList<>();
    private List<Car> carsNV = new ArrayList<>();
    private List<Car> carsSE = new ArrayList<>();
    private List<Car> carsSV = new ArrayList<>();



    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
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
