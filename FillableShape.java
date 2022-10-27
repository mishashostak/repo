public class FillableShape {
    private int x1, y1, x2, y2;
    private boolean filled;

    public FillableShape(int initialx1,int initialy1,int initialx2,int initialy2, boolean initialFilled) {
        setX1(initialx1);
        setY1(initialy1);
        setX2(initialx2);
        setY2(initialy2);
        setFilled(initialFilled);
    }
    public int getTopLeftX() {
        return Math.min(x1, x2);
    }
    public int getTopLeftY() {
        return Math.min(y1, y2);
    }
    public int getWidth() {
        return Math.abs(x1 - x2);
    }
    public int getHeight() {
        return Math.abs(y1 - y2);
    }
    public int getX1() {
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
    }

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
    public void setY1(int newy1) {
        if (newy1 < 0) {
            System.err.println( "Attempt to set y1 coordinate negative ignored, setting to 0 by default." );
            y1 = 0;
        }
        else {
            y1 = newy1;
        }
    }
    public void setX2(int newx2) {
        if (newx2 < 0) {
            System.err.println( "Attempt to set x2 coordinate negative ignored, setting to 0 by default." );
            x2 = 0;
        }
        else {
            x2 = newx2;
        }
    }
    public void setY2(int newy2) {
        if (newy2 < 0) {
            System.err.println( "Attempt to set y2 coordinate negative ignored, setting to 0 by default." );
            y2 = 0;
        }
        else {
            y2 = newy2;
        }
    }
    public void setFilled(boolean newFilled){
        filled = newFilled;
    }
    public String toString() {
        return "("+x1+","+y1+"), ("+x2+","+y2+"), filled = " + filled;
    }
}
