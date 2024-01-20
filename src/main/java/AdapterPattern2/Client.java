package AdapterPattern2;

import AdapterPattern2.latest.RoundHoles;
import AdapterPattern2.latest.RoundPeg;
import AdapterPattern2.legacy.SquarePeg;
import AdapterPattern2.adapter.SquarePegAdapter;

public class Client {

    public static void main(String[] args) {
        RoundHoles roundHoles = new RoundHoles(10);
        RoundPeg roundPeg = new RoundPeg(2);

        if(roundHoles.doesFit(roundPeg)) {
            System.out.println("Fits");
        }


        SquarePeg squarePeg = new SquarePeg(5);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        if(roundHoles.doesFit(squarePegAdapter)) {
            System.out.println("Fits");
        }




    }




}
