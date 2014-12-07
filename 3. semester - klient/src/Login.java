import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;


public class Login extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-21,371
	 */
	private final JPanel panel = new JPanel();
	private JLabel lblWelcomeToCbs;
	private JLabel lblPleaseLogin;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWelcomeToCbs = new JLabel("Welcome to CBS Calendar");
		lblWelcomeToCbs.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		lblWelcomeToCbs.setBounds(42, 16, 362, 41);
		contentPane.add(lblWelcomeToCbs);
		
		lblPleaseLogin = new JLabel("Please log-in");
		lblPleaseLogin.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lblPleaseLogin.setBounds(179, 56, 97, 16);
		contentPane.add(lblPleaseLogin);
		
		textField = new JTextField();
		textField.setBounds(80, 105, 292, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(80, 172, 292, 39);
		contentPane.add(passwordField);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(80, 92, 79, 16);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(80, 160, 79, 16);
		contentPane.add(lblPassword);
		
		btnLogin = new JButton("Log-in");
		btnLogin.setBounds(159, 223, 117, 29);
		contentPane.add(btnLogin);
	}
}
