import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Weather extends JPanel {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnBackToMenu;
	private JLabel lblTheQuoteOf;
	private JButton btnLogout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateCalendar frame = new CreateCalendar();
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
	public Weather() {
		setTitle("Marie's Calendar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Weather");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setBounds(344, 5, 117, 40);
		contentPane.add(lblNewLabel);
		
		btnBackToMenu = new JButton("Back to menu");
		btnBackToMenu.setBounds(344, 240, 117, 29);
		contentPane.add(btnBackToMenu);
		
		lblTheQuoteOf = new JLabel("Let's go check out the weather");
		lblTheQuoteOf.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lblTheQuoteOf.setBounds(296, 50, 213, 16);
		contentPane.add(lblTheQuoteOf);
		
		btnLogout = new JButton("Log-out");
		btnLogout.setBounds(344, 281, 117, 29);
		contentPane.add(btnLogout);
	}

}
