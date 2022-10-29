/*
This abstract class defines all basic independent attributes of a shape
*/
public abstract class FillableShape {
    private int x1, y1, x2, y2;
    private boolean filled;
    
    //Constructor
    public FillableShape(int initx1,int inity1,int initx2,int inity2, boolean initFilled) {
        setX1(initx1);
        setY1(inity1);
        setX2(initx2);
        setY2(inity2);
        setFilled(initFilled);
    }

    // Method to return the top-left-most x coordinate of the fillable shape
    public int getTopLeftX() {
        return Math.min(x1, x2);
    }
    // Method to return the top-left-most y coordinate of the fillable shape
    public int getTopLeftY() {
        return Math.min(y1, y2);
    }
    // Method to return the Width of the fillable shape
    public int getWidth() {
        return Math.abs(x1 - x2);
    }
    // Method to return the Height of the fillable shape
    public int getHeight() {
        return Math.abs(y1 - y2);
    }
    // Accessor to return the value of the x1 instance variable as an integer
    public int getX1() {
        return x1;
    }
    // Accessor to return the value of the y1 instance variable as an integer
    public int getY1() {
        return y1;
    }
    // Accessor to return the value of the x2 instance variable as an integer
    public int getX2() {
        return x2;
    }
    // Accessor to return the value of the y2 instance variable as an integer
    public int getY2() {
        return y2;
    }
    // Accessor to return the value of the filled instance variable as a boolean object
    public boolean getFilled() {
        return filled;
    }

    // Mutator for x1 instance variable
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
    // Mutator for y1 instance variable
    public void setY1(int newy1) {
        if (newy1 < 0) {
            System.err.println( "Attempt to set y1 coordinate negative ignored, setting to 0 by default." );
            y1 = 0;
        }
        else {
            y1 = newy1;
        }
    }
    // Mutator for x2 instance variable
    public void setX2(int newx2) {
        if (newx2 < 0) {
            System.err.println( "Attempt to set x2 coordinate negative ignored, setting to 0 by default." );
            x2 = 0;
        }
        else {
            x2 = newx2;
        }
    }
    // Mutator for y2 instance variable
    public void setY2(int newy2) {
        if (newy2 < 0) {
            System.err.println( "Attempt to set y2 coordinate negative ignored, setting to 0 by default." );
            y2 = 0;
        }
        else {
            y2 = newy2;
        }
    }
    // Mutator for filled instance variable
    public void setFilled(boolean newFilled){
        filled = newFilled;
    }
    
    //An abstract method to Calculate the Area of the fillable shape
    public abstract double calcArea();

    //Method to return the boolean value of overlapping shapes
    public boolean isOverlapping (FillableShape a, FillableShape b) {
        return (Math.max(Math.min(a.getX2(), b.getX2())
        - Math.max(a.getX1(), b.getX1()), 0)
        * Math.max(Math.min(a.getY2(), b.getY2())
        - Math.max(a.getY1(), b.getY1()), 0) > 0);
    }   

    //Standard toString() method
    public String toString() {
        return "("+x1+","+y1+"), ("+x2+","+y2+"), filled = " + filled;
    } 
}
