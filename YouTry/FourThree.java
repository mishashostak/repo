import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FourThree extends JFrame{

    public FourThree() {
        // Call the parent JFrame constructor to set the title, and switch to FlowLayout
        super( ":) or :(" );
        setLayout( new FlowLayout() );
        
        // Followed by a JButton with an image on it
        JButton noButton = new JButton(new ImageIcon(getClass().getClassLoader().getResource("nooo.gif")));
        // Add an event listener just for this imageButton, all in one step
        noButton.addActionListener( new ActionListener() {
            @Override 
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog( null, "You clicked the IMAGE JButton.", "Event!", JOptionPane.INFORMATION_MESSAGE );    
            }         
        } );
        add( noButton );  
        
        // Followed by a JButton with an image on it
        JButton yesButton = new JButton(new ImageIcon(getClass().getClassLoader().getResource("yes.png")));
        // Add an event listener just for this imageButton, all in one step
        yesButton.addActionListener( new ActionListener() {
            @Override 
            public void actionPerformed( ActionEvent e ) {
                JOptionPane.showMessageDialog( null, "You clicked the IMAGE JButton.", "Event!", JOptionPane.INFORMATION_MESSAGE );    
            }         
        } );
        add( yesButton );

        setPreferredSize(new Dimension(1200,1200));
        setLocationRelativeTo(null);
        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }  
}

class Main {
    public static void main( String[] args ) {
        FourThree test = new FourThree();
        test.setVisible(true);
    }
}