import javax.swing.*;
import java.awt.*;
 
public class FourOneN3 {
    public static void main( String[] args ) {
        JFrame frame = new JFrame("your damn lines");
        String inp="";

        while(!inp.equals("1") && !inp.equals("2")) inp = JOptionPane.showInputDialog("1 for circle, 2 for rectangle");
        int n = Integer.parseInt(inp);

        if(n == 2) {
            Rect drawRectangles = new Rect();
            frame.add(drawRectangles);
        }
        else if(n == 1) {
            Circ drawCircles = new Circ();
            frame.add(drawCircles);
        } 
        else System.out.println("how did we get here?");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(550, 300));
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.BLACK);
        frame.pack();
        frame.setVisible(true);
    }    
}

class Circ extends JPanel {
    // This method is called automatically by the JVM when the window needs to be (re)drawn.
    @Override
    public void paintComponent( Graphics g ) {
        // We MUST call the overridden paintComponent() method from JPanel first
        super.paintComponent( g );
        
        for(int i = 3; i < 13; ++i) g.drawOval( 10 * i + 5, 10 * i + 5, 10 * i, 10 * i );
    }
}

class Rect extends JPanel {
    // This method is called automatically by the JVM when the window needs to be (re)drawn.
    @Override
    public void paintComponent( Graphics g ) {
        // We MUST call the overridden paintComponent() method from JPanel first
        super.paintComponent( g );

        for(int i = 3; i < 13; ++i) g.drawRect( 10 * i + 5, 10 * i + 5, 10 * i, 10 * i );
    }
}