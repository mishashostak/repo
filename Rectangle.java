public class Rectangle extends fillableShape{
    public Rectangle(int initialx1,int initialy1,int initialx2,int initialy2, boolean initialFilled){
        rectCount++;
        setX1(initialx1);
        setY1(initialy1);
        setX2(initialx2);
        setY2(initialy2);
        setFilled(initialFilled);
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