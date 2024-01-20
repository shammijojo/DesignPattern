package AdapterPattern2.latest;

public class RoundHoles {

    public int radius;

    public RoundHoles(int radius) {
        this.radius = radius;
    }

    public boolean doesFit(RoundPeg roundPeg) {
        if(roundPeg.radius <= this.radius) {
            return true;
        }
        return false;
    }

}
