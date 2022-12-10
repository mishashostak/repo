import javax.swing.*;
import java.awt.*;
 
public class FourOneN3 {
    public static void main( String[] args ) {
        JFrame frame = new JFrame("your damn lines");
        String inp = "";
        String[] inpVals = new String[] {"1","2","3","4","5","6"};

        while(!Arrays.asList(inpVals).contains(inp)) 
        inp = JOptionPane.showInputDialog("1 for circle, 2 for rectangle, 3 for circular spiral,"
            + "4 for rectangular spiral, 5 for four-corner pattern, 6 for center pattern");
        
        switch(inp) {
            case "1":
                Circ cir = new Circ();
                frame.add(cir);
            case "2":
                Rect rec = new Rect();
                frame.add(rec);
            case "3":
                CircSpir cirSp = new CircSpir();
                frame.add(cirSp);
            case "4":
                RectSpir recSp = new RectSpir();
                frame.add(recSp);
            case "5":
                FourCorner fourCorner = new FourCorner();
                frame.add(fourCorner);
            case "6":
                CenterPattern centPat = new CenterPattern();
                frame.add(centPat);
            default: System.out.println("how did we get here?");
        }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));
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

class CircSpir extends JPanel {
    // This method is called automatically by the JVM when the window needs to be (re)drawn.
    @Override
    public void paintComponent( Graphics g ) {
        // We MUST call the overridden paintComponent() method from JPanel first
        super.paintComponent( g );
        
        int x = 100;
        int y = 120;
        int width = 40;
        int height = 60;
        int startAngle = 20;
        int arcAngle = 80;

        for (int i = 0; i < 10; i++) {
            g.drawArc(x, y, width, height, startAngle, arcAngle);
            g.drawArc(x + 10, y + 10, width, height, startAngle + 10, arcAngle);
            x = x + 5;
            y = y + 5;
            startAngle = startAngle - 10;
            arcAngle = arcAngle + 10;
        }
    }
}

class RectSpir extends JPanel {
    // This method is called automatically by the JVM when the window needs to be (re)drawn.
    @Override
    public void paintComponent( Graphics g ) {
        // We MUST call the overridden paintComponent() method from JPanel first
        super.paintComponent( g );

        int widthCenter = getSize().width / 2;
        int heightCenter = getSize().height / 2;

        for (int i = 0; i < 10; i++) {
            g.drawLine(widthCenter + (20 * i), heightCenter + (20 * i), widthCenter + (20 * i), heightCenter + 20 + (20 * i));
            g.drawLine(widthCenter + (20 * i), heightCenter + 20 + (20 * i), widthCenter - 20 - (20 * i), heightCenter + 20 + (20 * i));
            g.drawLine(widthCenter - 20 - (20 * i), heightCenter + 20 + (20 * i), widthCenter - 20 - (20 * i), heightCenter - 20 - (20 * i));
            g.drawLine(widthCenter - 20 - (20 * i), heightCenter - 20 - (20 * i), widthCenter + 20 + (20 * i), heightCenter - 20 - (20 * i));
        }
    }
}

class FourCorner extends JPanel {
    // This method is called automatically by the JVM when the window needs to be (re)drawn.
    @Override
    public void paintComponent( Graphics g ) {
        // We MUST call the overridden paintComponent() method from JPanel first
        super.paintComponent( g );

        int w = getSize().width;
        int h = getSize().height;
        int ivlWidth = w / 12;
        int ivlHeight = h / 12;

        for (int luW = 0, luH = h; luW < w && luH > 0; luW += ivlWidth, luH -= ivlHeight) 
            g.drawLine(0, luH, luW, 0);
        for (int ldW = 0, ldH = 0; ldW < w && ldH < h; ldW += ivlWidth, ldH += ivlHeight) 
            g.drawLine(0, ldH, ldW, h);
        for (int ruW = 0, ruH = 0; ruW < w && ruH < h; ruW += ivlWidth, ruH += ivlHeight) 
            g.drawLine(ruW, 0, w, ruH);
        for (int rdW = 0, rdH = h; rdW < w && rdH > 0; rdW += ivlWidth, rdH -= ivlHeight) 
            g.drawLine(rdW, h, w, rdH);
    }
}

class CenterPattern extends JPanel {
    // This method is called automatically by the JVM when the window needs to be (re)drawn.
    @Override
    public void paintComponent( Graphics g ) {
        // We MUST call the overridden paintComponent() method from JPanel first
        super.paintComponent( g );

        int w = getSize().width;
        int h = getSize().height;
        int xIvl = w / 36;
        //functions calculations assuming x-axis reflection to simulate standard lines
        //effectively slope (m)
        int m = h/w;
        //additional b value necessary to apply when using in this context

        //fxPos lines [\] in array, [/] in graph
        for (int x = 0; x < w; x += xIvl) 
            g.drawLine(0, h, x, m * x);
        for (int x = 0; x < w; x += xIvl) 
            g.drawLine(w, 0, x, m * x);
        //fxNeg lines [/] in array, [\] in graph
        for (int x = w; x > 0; x -= xIvl) 
            g.drawLine(0, 0, x, ((-m) * x) + h);
        for (int x = w; x > 0; x -= xIvl) 
            g.drawLine(w, h, x, ((-m) * x) + h);
        g.drawLine(0, 0, w, h);
        g.drawLine(0, h, w, 0);
    }
}