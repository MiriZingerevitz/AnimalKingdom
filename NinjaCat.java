import java.awt.*;
import java.util.Random;

public class NinjaCat extends Critter{
    private int count;
    public NinjaCat() {
    }

    @Override
    public Action getMove(CritterInfo info) {
        count++;

        if (info.frontThreat()) {
            return Action.INFECT;
        }
        else if(info.getFront()!=Neighbor.WALL)
            return Action.HOP;
        return Action.HOP;
    }

    @Override
    public Color getColor() {
        if (count%2==0)
        {
            return Color.MAGENTA;
        }
        else
        {
            return Color.YELLOW;
        }

    }

    @Override
    public String toString() {
       return "!!!!!";
    }
}
