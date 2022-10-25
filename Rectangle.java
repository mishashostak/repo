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
}