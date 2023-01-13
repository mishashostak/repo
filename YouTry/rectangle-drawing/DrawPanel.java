import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    private JLabel statusBar; 
    private Rectangle currentRectangle = null;
    private ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
    
    // Constructor instantiates an array of 10 Random Rectangle objects
    public DrawPanel( JLabel statusLabel ) {
        statusBar = statusLabel;
        setBackground( Color.WHITE ); 
        
        // Create and register listener for mouse and mouse motion events
        MouseEventListener drawPanelListener = new MouseEventListener(); 
        addMouseListener( drawPanelListener ); 
        addMouseMotionListener( drawPanelListener );       
    } 
    
    // Inner class to handle mouse events
    class MouseEventListener extends MouseAdapter {
        // Mouse press indicates a new line has been started
        @Override
        public void mousePressed( MouseEvent event ) {
            //currentRectangle = new Rectangle( event.getX()/2, event.getY()/2, event.getX(), event.getY(), Color.RED, false );
            currentRectangle = new Rectangle( event.getX() - 5, event.getY() - 5, 10, 10, Color.RED, false );
            // Tell JVM to call paintComponent( g )
            repaint();
        } 
        
        // Mouse release indicates the new line is finished
        @Override
        public void mouseReleased( MouseEvent event ) {
            // Update ending coordinates and switch color to BLACK
            //currentRectangle.setY1( event.getX() );
            //currentRectangle.setY2( event.getY() );

            currentRectangle.setY1( event.getX()-currentRectangle.getX1() );
            currentRectangle.setY2( event.getY()-currentRectangle.getX2() );

            currentRectangle.setColor( Color.BLACK );
            
            // If there's space, add the new line to our array

            rectangles.add(currentRectangle);
            
            // Get ready for the next line to be drawn
            currentRectangle = null;
            repaint();            
        } 
        
        // As mouse is dragged, update ending coordinates of currentRectangle and statusBar
        @Override
        public void mouseDragged( MouseEvent event ) {
            //currentRectangle.setY1( event.getX() );
            //currentRectangle.setY2( event.getY() );

            //currentRectangle.setY1( Math.max(event.getX()-currentRectangle.getX1(), 10) );
            //currentRectangle.setY2( Math.max(event.getY()-currentRectangle.getX2(), 10) );
            
            currentRectangle.setY1( event.getX()-currentRectangle.getX1() );
            currentRectangle.setY2( event.getY()-currentRectangle.getX2() );
            statusBar.setText( String.format( "Mouse at (%d, %d)", 
                                             event.getX(), event.getY() ) );
            repaint();
        } 
        
        // As mouse is moved, just update the statusBar
        @Override
        public void mouseMoved( MouseEvent event ) {
            statusBar.setText( String.format( "Mouse at (%d, %d)", 
                                             event.getX(), event.getY() ) );
        } 
    } 
    
    // This method is called automatically by the JVM when the window needs to be (re)drawn.
    @Override
    public void paintComponent( Graphics g ) {
        super.paintComponent( g );
        // Call the draw() method for each Rectangle object in the array
        //for ( int i = 0; i < rectangles.size(); i++ ) 
            //rectangles.get(i).draw( g );

        for (Rectangle l : rectangles) l.draw(g);
        
        // If a line is in progress, draw it on top of all others
        if ( currentRectangle != null )
            currentRectangle.draw( g );
    } 
} 
