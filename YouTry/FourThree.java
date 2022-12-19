import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FourThree extends JFrame implements ActionListener{
    private JButton noButton;
    private JButton yesButton;
    private int totalC = 0;
    private int yesC = 0;
    private JLabel str;

    public FourThree() {
        // Call the parent JFrame constructor to set the title, and switch to FlowLayout
        super( ":) or :(" );
        setLayout(new FlowLayout());
        
        str = new JLabel("Out of " + totalC + " choices, you chose yes " + yesC + " times.");

        // Followed by a JButton with an image on it
        ImageIcon noIcon = new ImageIcon( "noooo.gif" );
        Image noImage = noIcon.getImage(); //transform 
        Image newNoImage = noImage.getScaledInstance(120, 120, Image.SCALE_SMOOTH); // scale it the smooth way  
        noIcon = new ImageIcon(newNoImage);  // transform it back
        noButton = new JButton(noIcon);
        // Add an event listener just for this imageButton, all in one step
        noButton.addActionListener(this); 
        
        // Followed by a JButton with an image on it
        ImageIcon yesIcon = new ImageIcon( "yes.png" );
        Image yesImage = yesIcon.getImage(); //transform 
        Image newYesImage = yesImage.getScaledInstance(120, 120, Image.SCALE_SMOOTH); // scale it the smooth way  
        yesIcon = new ImageIcon(newYesImage);  // transform it back
        yesButton = new JButton(yesIcon);
        // Add an event listener just for this imageButton, all in one step
        yesButton.addActionListener(this); 

        add(noButton);
        add(str);
        add(yesButton);

        setPreferredSize(new Dimension(500,300));
        setLocationRelativeTo(null);
        setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }  

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==noButton) {
            totalC++;
            str.setText("Out of " + totalC + " choices, you chose yes " + yesC + " times.");
        }
        else if(e.getSource()==yesButton) {
            totalC++;
            yesC++;
            str.setText("Out of " + totalC + " choices, you chose yes " + yesC + " times.");
        }
    }

    public static void main( String[] args ) {
        FourThree test = new FourThree();
        while(true){
            test.setVisible(true);
        }
    }
}