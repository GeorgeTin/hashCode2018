package util;

/**
 * Created by Alexandra on 3/1/2018.
 */
public class Timer {

    private static long TIMER = 0;

    public static void incrementTimer(){
        TIMER++;
    }

    public static long getTIMER() {
        return TIMER;
    }
}
