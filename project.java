import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class project {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.getContentPane().setBackground(Color.PINK);

        // Buttons and panel
        JButton btn = new JButton("Click me!");
        JButton btn1 = new JButton("Another Button");
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(btn);
        buttonPanel.add(btn1);

        // Button listeners
        MyButtonListener buttonListener = new MyButtonListener();
        btn.addActionListener(buttonListener);
        btn1.addActionListener(buttonListener);

        // Label
        JLabel label = new JLabel("Welcome to the world!", JLabel.CENTER);

        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem item1 = new JMenuItem("MenuItem1");
        JMenuItem item2 = new JMenuItem("MenuItem2");
        item1.addActionListener(new MyMenuListener());
        item2.addActionListener(new MyMenuListener());
        menu.add(item1);
        menu.add(item2);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        // Text input field
        JTextField input = new JTextField("<Input your name here>", 20);

        // Text area
        JTextArea inputLines = new JTextArea("<Input your message here>", 5, 20);
        inputLines.setLineWrap(true);
        inputLines.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(inputLines);

        // Adding components to the frame
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(label, BorderLayout.NORTH);
        frame.add(input, BorderLayout.SOUTH);
        frame.add(scrollPane, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    static class MyButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button pressed: " + e.getActionCommand());
        }
    }

    static class MyMenuListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Menu item selected: " + e.getActionCommand());
        }
    }
}
