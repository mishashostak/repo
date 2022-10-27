public class Rectangle extends FillableShape{
    public static int rectCount = 0;
    
    public Rectangle(int initialx1,int initialy1,int initialx2,int initialy2, boolean initialFilled){
        super (initialx1,initialy1,initialx2,initialy2,initialFilled);
        rectCount++;
    }
    public Rectangle(){
        this(0,0,0, 0, false);
    }
    public int getRectCount() {
        return rectCount;
    }
    public boolean isSquare() {
        return (getWidth() == getHeight());
    }
    public double calcArea() {
        return getWidth()*getHeight();
    }
    public boolean isOverlapping (Rectangle a, Rectangle b) {
        return (Math.max(Math.min(a.getX2(), b.getX2())
        - Math.max(a.getX1(), b.getX1()), 0)
        * Math.max(Math.min(a.getY2(), b.getY2())
        - Math.max(a.getY1(), b.getY1()), 0) > 0);
    }
}