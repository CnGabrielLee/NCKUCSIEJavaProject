import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
public class project extends JFrame implements ActionListener{
private JTextArea inputlines;
public static void main(String[] args) {
project frame = new project();
frame.setVisible(true);
}
public project(){
setSize(800, 600);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(null);
JButton btn = new JButton("Ok");
btn.setLocation(100,400);
btn.setSize(btn.getPreferredSize());
btn.addActionListener(this);
add(btn);
inputlines = new JTextArea(10,50);
inputlines.setLocation(100,200);
inputlines.setSize(inputlines.getPreferredSize());
inputlines.setText("<Input your message here>");
add(inputlines);
}
public void actionPerformed(ActionEvent e){
if(e.getActionCommand().equals("Ok")){
System.out.println(inputlines.getText());
}
}
}