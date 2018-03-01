package util;

import entity.Main;
import entity.Position;
import entity.Ride;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static javafx.scene.input.KeyCode.T;


class Sortbyroll implements Comparator<Ride>
{
    // Used for sorting
    public int compare(Ride a, Ride b)
    {
        return a.getEarliest() - b.getEarliest();
    }
}


public class Reader {
    public static void readFile(String fileName, Main main) {
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            // 3 rows, 4 columns, 2 vehicles, 3 rides, 2 bonus and 10 steps
            main.R = scanner.nextInt();
            main.C = scanner.nextInt();
            main.F = scanner.nextInt();
            main.N = scanner.nextInt();
            main.B = scanner.nextInt();
            main.T = scanner.nextInt();

            int rideNumber = 0;
            main.rides = new ArrayList<Ride>();

            for (int i = 0; i < main.N; i++) {

                int startR = scanner.nextInt();
                int startC = scanner.nextInt();
                Position start = new Position(startR, startC);
                int endR = scanner.nextInt();
                int endC = scanner.nextInt();
                Position end = new Position(endR, endC);
                int earliest = scanner.nextInt();
                int latest = scanner.nextInt();

                Ride r = new Ride(start, end, earliest, latest, rideNumber);
                main.rides.add(r);
                rideNumber++;
            }

            Collections.sort(main.rides, new Sortbyroll());

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
