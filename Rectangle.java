public class Rectangle {
    private int x1, y1, x2, y2;
    private boolean filled;

   /*public int getX1() {
        return x1;
    }
    public int getY1() {
        return y1;
    }
    public int getX2() {
        return x2;
    }
    public int getY2() {
        return y2;
    }
    public boolean getFilled() {
        return filled;
    }*/

    public int setX1(int newx1) {
        if (newx1 < 0) {
            System.err.println( "Attempt to set x1 coordinate negative ignored, setting to 0 by default." );
            x1 = 0;
        }
        else {
            x1 = newx1;
        }
        return newx1;
    }
    public int setY1(int newy1) {
        if (newy1 < 0) {
            System.err.println( "Attempt to set y1 coordinate negative ignored, setting to 0 by default." );
            y1 = 0;
        }
        else {
            y1 = newy1;
        }
        return newy1;
    }
    public int setX2(int newx2) {
        if (newx2 < 0) {
            System.err.println( "Attempt to set x2 coordinate negative ignored, setting to 0 by default." );
            x2 = 0;
        }
        else {
            x2 = newx2;
        }
        return newx2;
    }
    public int setY2(int newy2) {
        if (newy2 < 0) {
            System.err.println( "Attempt to set y2 coordinate negative ignored, setting to 0 by default." );
            y2 = 0;
        }
        else {
            y2 = newy2;
        }
        return newy2;
    }
    public boolean setFilled(boolean newFilled){
        filled = newFilled;
        return filled;
    }
    public String toString() {
        return "("+x1+","+y1+"), ("+x2+","+y2+"), filled = " + filled;
    }
    public Rectangle(int initialx1,int initialy1,int initialx2,int initialy2, boolean initialFilled){
        x1 = setX1(initialx1);
        y1 = setY1(initialy1);
        x2 = setX2(initialx2);
        y2 = setY2(initialy2);
        filled = setFilled(initialFilled);
    }

}
