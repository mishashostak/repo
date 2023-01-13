import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FourFour extends JFrame {
    // This JTextField reference will be accessed by the inner class.
    private JTextField moneyField;
    private LabelField labels[] = new LabelField[] { new LabelField("toonies"), new LabelField("loonies"), new LabelField("quarters"), new LabelField("dimes"), new LabelField("nickels"), new LabelField("pennies")};
    
    public FourFour() {
        super( "4-4 #1" );
        setLayout( new FlowLayout() );
        
        // Create and add a JLabel to our JFrame in one step
        add( new JLabel( "Enter some quantity of money:" ) );
        
        // Create a JTextField with default text in it, and roughly 10 characters width
        moneyField = new JTextField( "" );
        moneyField.setColumns(10);
                
        // Create a TextFieldEventListener object
        ActionListener moneyFieldListener = new TextFieldEventListener();
        // And associate it with the JTextField
        moneyField.addActionListener( moneyFieldListener );
        add( moneyField );          
        for(LabelField label : labels) {
            add(label.getLabel());
            add(label.getTextField());
        }
    }
    
    // Here is the inner class for event handling
    class TextFieldEventListener implements ActionListener {
        // We override the actionPerformed() method as required by the ActionListener Interface
        @Override 
        public void actionPerformed( ActionEvent e ) {
            // When the user presses the <Enter> key:

            try {
                double moneyNumber = Double.parseDouble(moneyField.getText());
                if(moneyNumber < 0) throw new Exception("smaller then 0 :(");
                moneyNumber *= 100;
                moneyNumber = Math.floor(moneyNumber);
                moneyNumber /= 100;

                int toonies = (int) (moneyNumber / 2);
                labels[0].setText(Integer.toString(toonies));
                moneyNumber -= toonies * 2;
                labels[1].setText(Integer.toString((int) moneyNumber));
                moneyNumber -= (int) moneyNumber;
                int quarters = (int) (moneyNumber * 100 / 25);
                labels[2].setText(Integer.toString((quarters > 0 ? quarters : 0)));
                moneyNumber -= (quarters > 0 ? quarters : 0) / 4.0;
                int dimes = (int) (moneyNumber * 100 / 10);
                labels[3].setText(Integer.toString((dimes > 0 ? dimes : 0)));
                moneyNumber -= (dimes > 0 ? dimes : 0) / 10.0;
                int nickels = (int) (moneyNumber * 100 / 5);
                labels[4].setText(Integer.toString((nickels > 0 ? nickels : 0)));
                moneyNumber -= (nickels > 0 ? nickels: 0) / 20.0;
                int pennies = (int) (moneyNumber * 100);
                labels[5].setText(Integer.toString((pennies > 0 ? pennies : 0)));
            }
            catch (Exception exception) {
                JOptionPane.showMessageDialog( null, "Remember to enter a number greater or equal to 0!" );
            }
        }
    }

    public class LabelField {
        private JLabel label;
        private JTextField textField;

        public LabelField(String text, boolean editable) {
            label = new JLabel(text);
            textField = new JTextField("???");
            textField.setColumns(10);
            if(editable) textField.setEditable(true);
            else textField.setEditable(false);
        }

        public LabelField(String text) {
            this(text, false);
        }

        public void setText(String text) {
            textField.setText(text);
        }

        public JLabel getLabel() {
            return label;
        }

        public JTextField getTextField() {
            return textField;
        }
    }
}

class Main {
    public static void main( String[] args ) {
        FourFour appWindow = new FourFour();
        
        appWindow.setSize( 960, 540 );
        appWindow.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        appWindow.setVisible( true );
    }    
}