import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class GameFrame extends JFrame {
    //private JPanel contentPane;
    private InitialPanel initialPanel;
    private GamePanel gamePanel;
    private JPanel mainPanel;
    private CardLayout cardLayout;
    //private OverPanel overPanel;
    //private static GameThread gameThread;


    public GameFrame(){
        setSize(800, 600);
        init();
    }

    private void init(){
        this.setTitle("PaoPaoTang");
        //List<String> size = ResourceLoader.getResourceLoader().getGameInfo().get("windowSize");
        //this.setSize(Integer.valueOf(size.get(0)), Integer.valueOf(size.get(1)));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);        //将窗口设置于屏幕中央
       /*  CardLayout cardLayout = new CardLayout();
        this.contentPane = new JPanel();
        this.setContentPane(contentPane);
        this.contentPane.setLayout(cardLayout);*/
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        initialPanel = new InitialPanel();
        gamePanel = new GamePanel();

        mainPanel.add(initialPanel, "InitialPanel");
        mainPanel.add(gamePanel, "GamePanel");
        
        this.add(mainPanel);

        this.setVisible(true);
        
        /*this.contentPane.add("start",startPanel);
        this.overPanel = new OverPanel();
        this.contentPane.add("over", overPanel);
        ((CardLayout)this.contentPane.getLayout()).show(contentPane,"start");*/
    }

    /*public void startGame(String map){
        gameThread = new GameThread(map);
        gameThread.start();
        gamePanel = new GamePanel();
        contentPane.add("game", gamePanel);
        new Thread(gamePanel).start();
    }

    public void switchPanel(String panelName){
        ((CardLayout)this.contentPane.getLayout()).show(contentPane, panelName);
        if(panelName == "game"){
            gamePanel.requestFocus();
        }
    }

    public static GameThread getGameThread(){
        return gameThread;
    }*/
    public static void main(String[] args) {
        // 创建一个 GameFrame 实例并显示
        SwingUtilities.invokeLater(GameFrame::new);
    }
    public void switchToGamePanel() {
        cardLayout.show(mainPanel, "GamePanel");
    }
}