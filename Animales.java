import javax.swing.*;
import java.awt.*;

public class Animales extends JFrame {
    private JButton b1, b2, b3, b4, b5;
    private JLabel imgLabel;

    public Animales() {
        setLayout(null);
        setTitle("Animales");
        setSize(600, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1 = new JButton("Perro"); b1.setBounds(30, 50, 100, 40);
        b2 = new JButton("Gato"); b2.setBounds(30, 110, 100, 40);
        b3 = new JButton("Pajaro"); b3.setBounds(30, 170, 100, 40);
        b4 = new JButton("Pato"); b4.setBounds(30, 230, 100, 40);
        b5 = new JButton("Salir"); b5.setBounds(30, 300, 100, 40);

        imgLabel = new JLabel();
        imgLabel.setBounds(180, 20, 380, 320);
        imgLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        b1.addActionListener(e -> scaleImg("perro.jpg"));
        b2.addActionListener(e -> scaleImg("gato.jpg"));
        b3.addActionListener(e -> scaleImg("pajaro.jpg"));
        b4.addActionListener(e -> scaleImg("pato.jpg"));
        b5.addActionListener(e -> System.exit(0));

        add(b1); add(b2); add(b3); add(b4); add(b5); add(imgLabel);
    }

    private void scaleImg(String path) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage().getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH);
        imgLabel.setIcon(new ImageIcon(img));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Animales().setVisible(true));
    }
}
