import javax.swing.*;
import java.awt.*;

public class TestDraw {
    public static void main( String[] args ) {
        JFrame appWindow = new JFrame( "Abstract Art" );

        DrawPanel linePanel = new DrawPanel();
        appWindow.add( linePanel );
        appWindow.add( new JLabel(linePanel.toString()), BorderLayout.SOUTH );

        appWindow.setSize( 300, 300 );
        appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        appWindow.setVisible( true );
    }    
}