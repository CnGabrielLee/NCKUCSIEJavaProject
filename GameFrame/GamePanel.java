import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class GamePanel extends JPanel {
    private Tile[][] tiles;
    private static final int TILE_SIZE = 50; // 設定每個Tile的大小

    public GamePanel() {
        init();
    }

    private void init() {
        setLayout(null);

        // Create the map using a GridLayout
        JPanel mapPanel = new JPanel(new GridLayout(10, 10, 0, 0));
        mapPanel.setBounds(100, 50, TILE_SIZE * 10, TILE_SIZE * 10); // Adjust the size as needed

        // Initialize the map with tiles
        tiles = new Tile[10][10];
        String[][] map = {
            {"images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png"},
            {"images/blue_house.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/blue_house.png"},
            {"images/blue_house.png", "images/green_tile.png", "images/box.png", "images/green_tile.png", "images/box.png", "images/green_tile.png", "images/box.png", "images/green_tile.png", "images/green_tile.png", "images/blue_house.png"},
            {"images/blue_house.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/blue_house.png"},
            {"images/blue_house.png", "images/green_tile.png", "images/box.png", "images/green_tile.png", "images/box.png", "images/green_tile.png", "images/box.png", "images/green_tile.png", "images/green_tile.png", "images/blue_house.png"},
            {"images/blue_house.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/blue_house.png"},
            {"images/blue_house.png", "images/green_tile.png", "images/box.png", "images/green_tile.png", "images/box.png", "images/green_tile.png", "images/box.png", "images/green_tile.png", "images/green_tile.png", "images/blue_house.png"},
            {"images/blue_house.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/green_tile.png", "images/blue_house.png"},
            {"images/blue_house.png", "images/green_tile.png", "images/box.png", "images/green_tile.png", "images/box.png", "images/green_tile.png", "images/box.png", "images/green_tile.png", "images/green_tile.png", "images/blue_house.png"},
            {"images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png", "images/blue_house.png"}
        };

        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                tiles[row][col] = new Tile(map[row][col], TILE_SIZE);
                mapPanel.add(tiles[row][col]);
            }
        }
        // Add the map panel to the GamePanel
        add(mapPanel);
        // Set panel properties
        setVisible(true);
    }
}
