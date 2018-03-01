package entity;

import util.Reader;

import java.util.List;

/**
 * Created by Alexandra on 3/1/2018.
 */
public class Main {
    public int R, C, F, N, B, T;
    public List<Ride> rides;

    public static void main(String args){
        Reader reader = new Reader();
        Main main = new Main();

        // Test for small input
        reader.readFile("a_example.in", main);
        System.out.println(main.B);
    }
}
