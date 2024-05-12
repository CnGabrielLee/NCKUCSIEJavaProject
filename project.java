import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class project {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton btn = new JButton("Click me!");
        JButton btn1 = new JButton("skrskhfhjhjskr");
        MyButtonListener mblistener = new MyButtonListener();
        btn.addActionListener(mblistener);
        btn.setLocation(250, 100);
        btn.setSize(200, 50);

        JLabel lb = new JLabel("Welcome to the new world!");
        lb.setLocation(100, 100);
        lb.setSize(200, 50);

        frame.setLayout(null);
        frame.add(btn);
        frame.add(lb);
        frame.setVisible(true);
    }

    static class MyButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button clicked!");
        }
    }
}
