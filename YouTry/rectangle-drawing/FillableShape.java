import java.awt.Color;

abstract class FillableShape extends Shape {
    private boolean filled;

    public FillableShape(int x1,int  x2,int  y1,int  y2, Color color, boolean filled) {
        super(x1, x2, y1, y2, color);
        setFilled(filled);
    }

    public int getUpperLeftX() {
        return Math.min(getX1(), getX2());
    }

    public int getUpperLeftY() {
        return Math.min(getY1(), getY2());
    }

    public int getWidth() { 
        return Math.abs(getX1() - getX2());
    }

    public int getHeight() {
        return Math.abs(getY1() - getY2());
    }
    
    public boolean getFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    } 
    
    public String toString(int x) {
        return String.valueOf(x);
    }
}
