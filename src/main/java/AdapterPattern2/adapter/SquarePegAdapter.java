package AdapterPattern2.adapter;

import AdapterPattern2.latest.RoundPeg;
import AdapterPattern2.legacy.SquarePeg;


/**
 * Extending round peg because fits method takes Round peg as argument. If it took radius
 * as arg, then no need to extend
 */
public class SquarePegAdapter extends RoundPeg  {

    SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(peg.getWidth());
        this.peg = peg;
    }


    @Override
    public int getRadius() {
        return (int) Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }


}
