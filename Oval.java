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
}
