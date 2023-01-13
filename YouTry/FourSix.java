import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FourSix extends MouseAdapter {
    private JPanel panel;
    private int width;
    private int height;

    public FourSix(JPanel panel) {
        this.panel = panel;
        panel.addMouseMotionListener(this);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        width = panel.getWidth();
        height = panel.getHeight();
        int x = e.getX();
        int y = e.getY();

        if (x < width / 2 && y < height / 2) {
            panel.setBackground(Color.RED);
        } else if (x < width / 2 && y >= height / 2) {
            panel.setBackground(Color.GREEN);
        } else if (x >= width / 2 && y < height / 2) {
            panel.setBackground(Color.BLUE);
        } else {
            panel.setBackground(Color.YELLOW);
        }
    }
}