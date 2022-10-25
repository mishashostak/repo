public class Oval extends fillableShape{
    public Oval(int initialx1,int initialy1,int initialx2,int initialy2, boolean initialFilled){
        ovalCount++;
        setX1(initialx1);
        setY1(initialy1);
        setX2(initialx2);
        setY2(initialy2);
        setFilled(initialFilled);
    }
    public Oval(){
        this(0,0,0, 0, false);
    }
    public int getOvalCount() {
        return ovalCount;
    }
    public boolean isCircle() {
        return (getWidth() == getHeight());
    }
    public double calcArea(boolean f) {
        if (f){
            return Math.PI * Math.pow(getWidth()/2,2);
        }
        else {
            return Math.PI * (getWidth()/2) * (getHeight()/2);
        }
    }
    public boolean isOverlapping (Oval a, Oval b) {
        return (Math.max(Math.min(a.getX2(), b.getX2())
        - Math.max(a.getX1(), b.getX1()), 0)
        * Math.max(Math.min(a.getY2(), b.getY2())
        - Math.max(a.getY1(), b.getY1()), 0) > 0);
    }
}