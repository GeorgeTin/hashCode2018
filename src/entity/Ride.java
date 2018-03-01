package entity;

/**
 * Created by Alexandra on 3/1/2018.
 */
public class Ride {

    private Position startPoz;
    private Position endPosition;

    private int earliest;
    private int latest;

    public Position getStartPoz() {
        return startPoz;
    }

    public void setStartPoz(Position startPoz) {
        this.startPoz = startPoz;
    }

    public Position getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Position endPosition) {
        this.endPosition = endPosition;
    }

    public int getEarliest() {
        return earliest;
    }

    public void setEarliest(int earliest) {
        this.earliest = earliest;
    }

    public int getLatest() {
        return latest;
    }

    public void setLatest(int latest) {
        this.latest = latest;
    }
}
