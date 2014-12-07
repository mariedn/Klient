package GUI;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;


public class Login extends JPanel {
	private JLabel lblWelcomeToCbs;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JPasswordField pwdPassword;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JButton btnLogin;

	/**
	 * Create the panel.
	 */
	public Login() {
		setLayout(null);
		
		lblWelcomeToCbs = new JLabel("Welcome to CBS Calendar");
		lblWelcomeToCbs.setBounds(224, 5, 352, 33);
		lblWelcomeToCbs.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		add(lblWelcomeToCbs);
		
		lblNewLabel = new JLabel("Please log-in");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(352, 50, 96, 16);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(276, 139, 247, 33);
		add(textField);
		textField.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setBounds(276, 216, 247, 33);
		add(pwdPassword);
		
		lblUsername = new JLabel("Username");
		lblUsername.setBounds(276, 122, 73, 16);
		add(lblUsername);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(276, 201, 61, 16);
		add(lblPassword);
		
		btnLogin = new JButton("Log-in");
		btnLogin.setBounds(341, 310, 117, 29);
		add(btnLogin);

	}

}
