import java.awt.*;

public class Bear extends Critter{
    private boolean pollar;
private int count;

    public Bear(boolean pollar) {
        this.pollar = pollar;
    }





    public boolean isPollar() {
        return pollar;
    }

    public void setPollar(boolean pollar) {
        this.pollar = pollar;
    }
    @Override
    public Action getMove(CritterInfo info) {

        if (info.frontThreat()) {
            return Action.INFECT;
        }
         else if(info.getFront()!=Neighbor.WALL)
            return Action.HOP;
        return Action.LEFT;
    }

    @Override
    public Color getColor() {
        if (pollar)
            return Color.white;
        else
            return Color.black;
    }

    @Override
    public String toString() {
        count++;
       if (count%2==0) {

           return "/";
       }
       else {
           return "\\";
       }
    }
}
