import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Colores extends JFrame {
    private JButton btnRed, btnGreen, btnBlue, btnReset, btnExit;

    public Colores() {
        setLayout(new FlowLayout());
        setTitle("Colores");
        setSize(400, 150);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnRed = new JButton("Rojo");
        btnGreen = new JButton("Verde");
        btnBlue = new JButton("Azul");
        btnReset = new JButton("Reset");
        btnExit = new JButton("Salir");

        btnRed.addActionListener(e -> getContentPane().setBackground(Color.RED));
        btnGreen.addActionListener(e -> getContentPane().setBackground(Color.GREEN));
        btnBlue.addActionListener(e -> getContentPane().setBackground(Color.BLUE));
        btnReset.addActionListener(e -> getContentPane().setBackground(new Color(238, 238, 238)));
        btnExit.addActionListener(e -> System.exit(0));

        add(btnRed);
        add(btnGreen);
        add(btnBlue);
        add(btnReset);
        add(btnExit);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Colores().setVisible(true));
    }
}
