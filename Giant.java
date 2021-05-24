import java.awt.*;
import java.util.Random;

public class Giant extends Critter{
    private int count;

    public Giant() {
    }

private int moves;
    @Override
    public Action getMove(CritterInfo info) {
        if (count==24)
        {
            count=0;
        }
        count++;

        if (info.frontThreat()) {
            return Action.INFECT;
        }
        else if(info.getFront()!=Neighbor.WALL)
            return Action.HOP;
        return Action.RIGHT;
    }

    @Override
    public Color getColor() {
        return Color.gray;
    }

    @Override
    public String toString() {
        if (isBetween(count, 0, 5))
        {
            return "fee";
        }
        else if (isBetween(count, 6, 11))
        {
            return "fie";
        }
        else if (isBetween(count, 12, 17))
        {
            return "foe";
        }
        else  if (isBetween(count, 18, 23))
        {
            return  "fum";
        }
        return "";
    }
    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }
}
