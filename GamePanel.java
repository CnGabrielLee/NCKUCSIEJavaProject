import javax.swing.JPanel;
import java.awt.Color;

public class GamePanel extends JPanel {

    public GamePanel() {
        init();
    }

    private void init() {
        this.setBackground(Color.GREEN); // Set the background color or add your game components here
        this.setVisible(true);
    }
}
