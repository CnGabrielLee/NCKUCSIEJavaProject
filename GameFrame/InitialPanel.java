import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class InitialPanel extends JPanel {
    public static int playerIndex;
    private JLabel startLabel;
    private JLabel playerLabel;
    private JButton introButton;
    private JButton selectButton;
    private JButton ensureButton;
    private JButton changeButton;
    private JButton startButton;
    private JLayeredPane layeredPane;
    private ImageIcon playerIcon; // Declare playerIcon as a class-level variable

    public InitialPanel() {
        init();
    }

    private void init() {
        playerIndex = 1;

        // Create a layered pane
        layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 800, 600);

        // Load and scale the background image
        ImageIcon startBg = new ImageIcon("images/str_bg.jpeg");
        Image img = startBg.getImage();
        Image scaledImg = img.getScaledInstance(800, 600, Image.SCALE_SMOOTH); // Adjust the size as needed
        startBg = new ImageIcon(scaledImg);

        // Create JLabel with the background image
        startLabel = new JLabel(startBg);
        startLabel.setBounds(0, 0, 800, 600); // Adjust the bounds as needed
        startLabel.setVisible(true);

        // Load and scale the intro button image
        ImageIcon introducebuttIcon = new ImageIcon("images/introduce.png");
        Image intro_butt_img = introducebuttIcon.getImage();
        Image intro_scaledImg = intro_butt_img.getScaledInstance(100, 50, Image.SCALE_SMOOTH); // Adjust the size as needed
        introducebuttIcon = new ImageIcon(intro_scaledImg);

        // Create JButton with the intro button image
        introButton = new JButton(introducebuttIcon);
        introButton.setBounds(200, 250, 200, 100); // Adjust the bounds as needed
        introButton.setBorderPainted(false);
        introButton.setFocusPainted(false);
        introButton.setContentAreaFilled(false);
        introButton.setVisible(true);

        // Load and scale the select button image
        ImageIcon selectbuttIcon = new ImageIcon("images/select.png");
        Image select_butt_img = selectbuttIcon.getImage();
        Image select_scaledImg = select_butt_img.getScaledInstance(100, 50, Image.SCALE_SMOOTH); // Adjust the size as needed
        selectbuttIcon = new ImageIcon(select_scaledImg);

        // Create JButton with the select button image
        selectButton = new JButton(selectbuttIcon);
        selectButton.setBounds(200, 400, 200, 100); // Adjust the bounds as needed
        selectButton.setBorderPainted(false);
        selectButton.setFocusPainted(false);
        selectButton.setContentAreaFilled(false);
        selectButton.setVisible(true);
        selectButton.addActionListener(e -> selectButtonActionPerformed());

        // Load and scale the change button image
        ImageIcon changebuttIcon = new ImageIcon("images/change.png");
        Image change_butt_img = changebuttIcon.getImage();
        Image change_scaledImg = change_butt_img.getScaledInstance(100, 50, Image.SCALE_SMOOTH); // Adjust the size as needed
        changebuttIcon = new ImageIcon(change_scaledImg);

        // Create JButton with the change button image
        changeButton = new JButton(changebuttIcon);
        changeButton.setBounds(450, 400, 200, 100); // Adjust the bounds as needed
        changeButton.setBorderPainted(false);
        changeButton.setFocusPainted(false);
        changeButton.setContentAreaFilled(false);
        changeButton.setVisible(false); // Initially hidden
        changeButton.addActionListener(e -> changePlayerActionPerformed());

        // Load and scale the ensure button image
        ImageIcon ensurebuttIcon = new ImageIcon("images/check.png");
        Image ensure_butt_img = ensurebuttIcon.getImage();
        Image ensure_scaledImg = ensure_butt_img.getScaledInstance(100, 50, Image.SCALE_SMOOTH); // Adjust the size as needed
        ensurebuttIcon = new ImageIcon(ensure_scaledImg);

        // Create JButton with the ensure button image
        ensureButton = new JButton(ensurebuttIcon);
        ensureButton.setBounds(650, 400, 200, 100); // Adjust the bounds as needed
        ensureButton.setBorderPainted(false);
        ensureButton.setFocusPainted(false);
        ensureButton.setContentAreaFilled(false);
        ensureButton.setVisible(false); // Initially hidden
        ensureButton.addActionListener(e -> ensureButtonActionPerformed());
        // Load and scale the ensure button image
        ImageIcon startbuttIcon = new ImageIcon("images/start-button.png");
        Image start_butt_img = startbuttIcon.getImage();
        Image start_scaledImg = start_butt_img.getScaledInstance(100, 50, Image.SCALE_SMOOTH); // Adjust the size as needed
        startbuttIcon = new ImageIcon(start_scaledImg);

        // Create JButton with the ensure button image
        startButton = new JButton(startbuttIcon);
        startButton.setBounds(200, 150, 200, 100); // Adjust the bounds as needed
        startButton.setBorderPainted(false);
        startButton.setFocusPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setVisible(true); // Initially hidden
        startButton.addActionListener(e -> startButtonActionPerformed());
        // Load and scale the player image
        playerIcon = new ImageIcon("images/character1.png");
        Image player_img = playerIcon.getImage();
        Image player_scaledImg = player_img.getScaledInstance(200, 100, Image.SCALE_SMOOTH); // Adjust the size as needed
        playerIcon = new ImageIcon(player_scaledImg);
        playerLabel = new JLabel(playerIcon);
        playerLabel.setBounds(500, 200, 200, 100); // Adjust the bounds as needed
        playerLabel.setVisible(false); // Initially hidden

        // Add components to the layered pane
        layeredPane.add(startLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(introButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(selectButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(changeButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(ensureButton, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(playerLabel, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(startButton, JLayeredPane.PALETTE_LAYER);
        // Set layout and add components
        this.setLayout(null);
        this.add(layeredPane);

        // Set panel properties
        this.setVisible(true);
        this.setOpaque(true);
    }

    private void selectButtonActionPerformed() {
        changeButton.setVisible(true);
        ensureButton.setVisible(true);
        playerLabel.setVisible(true);
        layeredPane.repaint();
        layeredPane.revalidate();
    }

    private void changePlayerActionPerformed() {
        playerIndex = playerIndex + 1;
        if (playerIndex > 2) {
            playerIndex = 1;
        }
        // Change player image
        String playerImagePath = "images/character" + playerIndex + ".png";
        ImageIcon newPlayerIcon = new ImageIcon(playerImagePath);
        Image player_img = newPlayerIcon.getImage();
        Image player_scaledImg = player_img.getScaledInstance(200, 100, Image.SCALE_SMOOTH); // Adjust the size as needed
        newPlayerIcon.setImage(player_scaledImg);
        playerIcon.setImage(player_scaledImg); // Update the existing ImageIcon
        playerLabel.repaint();
        layeredPane.repaint();
        layeredPane.revalidate();
    }

    private void ensureButtonActionPerformed() {
        changeButton.setVisible(false);
        ensureButton.setVisible(false);
        playerLabel.setVisible(false);
        layeredPane.repaint();
        layeredPane.revalidate();
    }
    private void startButtonActionPerformed() {
        // Switch to GamePanel
        GameFrame parentFrame = (GameFrame) SwingUtilities.getWindowAncestor(this);
        parentFrame.switchToGamePanel();
    }
}
