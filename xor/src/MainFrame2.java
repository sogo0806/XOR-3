import javax.swing.*;
import java.awt.*;

public class MainFrame2 extends JFrame {
    JFrame frame = new JFrame("Jfile choose");
    private JButton enter = new JButton("Enter");
    private JLabel jlbAdd = new JLabel("輸入密碼");
    private JTextField jtf = new JTextField();
    private JLabel jlb = new JLabel();
    private Container cp;
    private JPanel jpnn = new JPanel(new GridLayout(1, 3, 5, 5));
    private JPanel jpnc = new JPanel(new GridLayout(1, 1, 3, 3));


    public MainFrame2() {
        init();
    }

    public void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(50, 50, 400, 300);
        this.setTitle("輸入密碼:");
        cp = this.getContentPane();

        jlbAdd.setSize(100,0);

        jpnn.add(jlbAdd);
        jpnc.add(jlb);
        jpnn.add(jtf);
        jpnn.add(enter);
        cp.add(jpnn, BorderLayout.NORTH);
    }
}