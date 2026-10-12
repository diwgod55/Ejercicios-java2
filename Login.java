import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {
    private JTextField userTxt;
    private JPasswordField passTxt;
    private JButton btnSign, btnExit;

    public Login() {
        setLayout(null);
        setSize(400, 300);
        setTitle("Mic Tutorials Login");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel title = new JLabel("Mic Tutorials Login", SwingConstants.CENTER);
        title.setBounds(100, 20, 200, 30);
        title.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel l1 = new JLabel("Username:"); l1.setBounds(50, 70, 100, 25);
        userTxt = new JTextField(); userTxt.setBounds(150, 70, 150, 25);

        JLabel l2 = new JLabel("Password:"); l2.setBounds(50, 110, 100, 25);
        passTxt = new JPasswordField(); passTxt.setBounds(150, 110, 150, 25);

        btnSign = new JButton("Sign up"); btnSign.setBounds(80, 180, 100, 35);
        btnExit = new JButton("Exit"); btnExit.setBounds(200, 180, 100, 35);

        btnSign.addActionListener(e -> {
            String u = userTxt.getText();
            String p = new String(passTxt.getPassword());
            if (u.isEmpty() || p.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campos vacíos", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "User: " + u + "\nPass: " + p);
            }
        });

        btnExit.addActionListener(e -> System.exit(0));

        add(title); add(l1); add(userTxt); add(l2); add(passTxt); add(btnSign); add(btnExit);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login().setVisible(true));
    }
}
