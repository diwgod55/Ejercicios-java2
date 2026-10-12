import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    public Dashboard() {
        setLayout(new GridLayout(2, 3, 10, 10));
        setTitle("Keep Too Dashboard");
        setSize(500, 400);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 1; i <= 5; i++) {
            JButton btn = new JButton("Opción " + i);
            int num = i;
            btn.addActionListener(e -> openModal("Imagen " + num, "img" + num + ".jpg"));
            add(btn);
        }

        JButton btnExit = new JButton("Salir");
        btnExit.addActionListener(e -> System.exit(0));
        add(btnExit);
    }

    private void openModal(String title, String imgPath) {
        JDialog modal = new JDialog(this, title, true);
        modal.setSize(300, 300);
        modal.setLocationRelativeTo(this);
        modal.add(new JLabel(new ImageIcon(imgPath)));
        modal.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Dashboard().setVisible(true));
    }
}
