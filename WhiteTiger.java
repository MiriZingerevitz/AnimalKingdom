import java.awt.*;

public class WhiteTiger extends Critter {
    private boolean ifInfect;

    public WhiteTiger() {
    }

    @Override
    public Action getMove(CritterInfo info) {

        if (info.frontThreat()) {
            ifInfect = true;
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
        return Color.white;
    }

    @Override
    public String toString() {
        if (ifInfect) {
            return "tgr";
        }
        return "TGR";
    }
}
