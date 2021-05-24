import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {
    private int count;
    private int tmpColor;
    public Tiger() {
    }

    @Override
    public Action getMove(CritterInfo info) {
        count++;
        if (info.frontThreat()) {
            return Action.INFECT;
        }
        else if (info.getFront()==Neighbor.WALL || info.getRight()==Neighbor.WALL) {
            return Action.LEFT;
        } else {
            if (info.getFront()==Neighbor.SAME) {
                return Action.RIGHT;

            } else {
                return Action.HOP;

            }
        }
    }



    @Override
    public Color getColor() {

if (count%3==0)
{
    Random rand = new Random();
    int rand1=rand.nextInt(3);
    tmpColor=rand1;
    return fromInteger(rand1);
}
else
{
    return fromInteger(tmpColor);
}
    }

    @Override
    public String toString() {
        return "TGR";
    }

    public static Color fromInteger(int x)
    {
        switch(x) {
            case 0:
                return Color.GREEN;
            case 1:
                return Color.BLUE;
            case 2:
                return Color.RED;
        }
        return null;
    }
}
