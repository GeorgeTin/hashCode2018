package entity;

import util.Reader;
import util.Utily;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Alexandra on 3/1/2018.
 */
public class Main {
    public int R, C, F, N, B, T;
    public List<Ride> rides;
    public List<Car> cars;

    public static int binarySearch(List<Ride> rides, long possibleTime){
        int st = 0, dr = rides.size()-1, m;
        while(st <= dr)
        {
            m = (st + dr) >> 1;
            if(rides.get(m).getEarliest() <= possibleTime) st = m + 1;
            else dr = m - 1;
        }
        if (st < 1) return  -1;
        if(rides.get(st-1).getEarliest() <= possibleTime) return st-1;
        return -1;
    }

    public static Ride getClosestRide(Main main, Position position, long timeNow){
        Ride theRide = null;
        long minTime = Integer.MAX_VALUE;
        for (int i = 0; i< main.rides.size(); i++){
            // Check if the time is good
            // Distanta intre o masina noastra aflata la position si la timeNow
            // si potentiala masina este de: distance (position, ride.startPoz)
            // Timpul pentru ca noi sa ajungem chiar in earliest, este
            // earliest = timeNow + distance(position, ride.startPoz)
            long possibleTime = timeNow + Utily.calculateDistance(position, main.rides.get(i).getStartPoz());
            if (possibleTime < minTime) {
                int index = binarySearch(main.rides, possibleTime);
                if (index != -1)
                if (main.rides.get(index).getLatest() > possibleTime)
                        theRide = main.rides.get(index);
            }
        }
        return theRide;
    }

    public static void main(String[] args){
        Reader reader = new Reader();
        //Main main = new Main();
        List<String> fileNames = new ArrayList<>();
        fileNames.add("a_example");
        fileNames.add("b_should_be_easy");
        fileNames.add("c_no_hurry");
        fileNames.add("d_metropolis");
        fileNames.add("e_high_bonus");
        // Test for small input
        for (String fileName : fileNames) {
            Main main = new Main();
            reader.readFile(fileName+".in", main);
            //reader.printFile(main);

            // Initialize cars:
            main.cars = new ArrayList<>();
            for (int i = 0; i < main.F; i++) {
                main.cars.add(new Car(new Position(0, 0), false, 0L, i));
            }

            // Find the best cars for each car
            while (!main.rides.isEmpty()) {
                // System.out.println(main.rides);
                for (int i = 0; i < main.F; i++) {
                    Position position = main.cars.get(i).getPosition();
                    long timeNow = main.cars.get(i).getAvailableTime();
                    Ride ride = getClosestRide(main, position, timeNow);
                    if (ride != null) {
                        // Update the TIME and DISTANCE
                        main.cars.get(i).assign(ride);
                        main.rides.remove(ride);
                    }
                }
            }

            // Print on screen
//            System.out.println("Result for file " + fileName);
//            for (int i = 0; i < main.F; i++) {
//                System.out.print(main.cars.get(i).getRidesList().size() + " ");
//                for (Integer r : main.cars.get(i).getRidesList()) {
//                    System.out.print(r + " ");
//                }
//                System.out.println();
//            }

            try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName +".out"))) {
                for(Car car : main.cars){
                    StringBuilder sb = new StringBuilder();
                    sb.append(car.getRidesList().size() + " ");
                    for(Integer integer : car.getRidesList())
                        sb.append(integer.toString() + " ");
                    out.write(sb.toString());
                    out.newLine();             }
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
