import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Random;

public class MainFrame extends JFrame {
    JFrame frame = new JFrame("Jfile choose");
    private JButton loading = new JButton("loading");
    private JButton enter = new JButton("Enter");
    private JTextField jtf = new JTextField();
    private JLabel jlb = new JLabel();
    private Container cp;
    private JPanel jpnn = new JPanel(new GridLayout(1, 3, 5, 5));
    private JPanel jpnc = new JPanel(new GridLayout(1, 1, 3, 3));
    private static final int RADIX = 16;
    private static final String SEED = "0933910847463829232312312";


    public MainFrame() {
        init();
    }

    public void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 400, 300);
        this.setTitle("XOR加密");
        cp = this.getContentPane();


        jpnn.add(jtf);
        jpnn.add(loading);
        jpnn.add(enter);
        jpnc.add(jlb);
        cp.add(jpnn, BorderLayout.NORTH);
        cp.add(jpnc, BorderLayout.CENTER);


        loading.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser choose = new JFileChooser();
                choose.showOpenDialog(frame);
                File f = choose.getSelectedFile();
                jlb.setText(f.getAbsolutePath());
            }
        });


        enter.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                key();
                MainFrame2  frm = new MainFrame2();
                frm.setVisible(true);
            }
        });


    }

    public void key() {
        if (jlb.getText().equals(null) || jlb.getText().length()==0){
            jlb.setText(" ");
        }
        BigInteger bi = new BigInteger(jlb.getText().getBytes());
        BigInteger bi2 = new BigInteger(SEED,RADIX);
        bi2 = bi2.xor(bi);
        jtf.setText(bi2.toString(RADIX).toUpperCase());
    }
}
