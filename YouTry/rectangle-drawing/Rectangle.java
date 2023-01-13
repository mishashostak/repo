import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends FillableShape{
     public Rectangle(int x1,int  x2,int  y1,int  y2, Color color,boolean filled) {
        super(x1, x2, y1, y2, color, filled);
    }

     @Override
        public void draw( Graphics g ) {
            g.setColor( getColor() );
            if(getFilled())
                g.fillRect( getX1(), getX2(), getY1(), getY2() );
            else g.drawRect( getX1(), getX2(), getY1(), getY2() );
        }  
}
