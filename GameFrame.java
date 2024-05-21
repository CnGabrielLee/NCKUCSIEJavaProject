import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.ImageIcon;

public class GameFrame extends JFrame {
    private InitialPanel initialPanel;
    private GamePanel gamePanel;
    private JPanel mainPanel;
    private CardLayout cardLayout;

    public GameFrame(){
        setSize(800, 600);
        init();
    }

    private void init(){
        this.setTitle("PaoPaoTang");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        initialPanel = new InitialPanel();
        gamePanel = new GamePanel();

        mainPanel.add(initialPanel, "InitialPanel");
        mainPanel.add(gamePanel, "GamePanel");

        this.add(mainPanel);
        cardLayout.show(mainPanel, "InitialPanel");

        this.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameFrame::new);
    }

    public void switchToGamePanel() {
        cardLayout.show(mainPanel, "GamePanel");
    }
}
