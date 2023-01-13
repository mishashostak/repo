import java.awt.Color;
import java.awt.Graphics;

abstract class Shape {
    private int x1, x2, y1, y2;
    private Color color;

    public Shape(int x1,int  x2,int  y1,int  y2, Color color) {
        setX1(x1);
        setX2(x2);
        setY1(y1);
        setY2(y2);
        setColor(color);
    }
    
    public Color getColor() {
        return color;
    }   

    public int getX1() {
        return x1;
    }
   
    public int getX2() {
        return x2;
    }
    
    public int getY1() {
        return y1;
    }
    
    public int getY2() {
        return y2;
    }
           
    public void setColor(Color color) {
        this.color = color;
    }
    
    public void setX1(int x1) {
        if (x1 >= 0) {
            this.x1 = x1;
        }
        else {
            System.err.println("x1 should not be smaller then 0");
            this.x1 = 0;
        }
    }
   
    public void setX2(int x2) {
        if (x2 >= 0) {
            this.x2 = x2;
        }
        else {
            System.err.println("x2 should not be smaller then 0");
            this.x2 = 0;
        }
    }
    
    public void setY1(int y1) {
        if (y1 >= 0) {
            this.y1 = y1;
        }
        else {
            System.err.println("y1 should not be smaller then 0");
            this.y1 = 0;
        }
    }
    
    public void setY2(int y2) {
        if (y2 >= 0) {
            this.y2 = y2;
        }
        else {
            System.err.println("y2 should not be smaller then 0");
            this.y2 = 0;
        }
    } 

    public String toString(int x) {
        return String.valueOf(x);
    }

    public abstract void draw(Graphics g);
}
