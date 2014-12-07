import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Quote extends JPanel {

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
	public Quote() {
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Quote");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setBounds(357, 5, 91, 40);
		contentPane.add(lblNewLabel);
		
		btnBackToMenu = new JButton("Back to menu");
		btnBackToMenu.setBounds(344, 240, 117, 29);
		contentPane.add(btnBackToMenu);
		
		lblTheQuoteOf = new JLabel("The quote of the day, enjoy");
		lblTheQuoteOf.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lblTheQuoteOf.setBounds(307, 50, 192, 16);
		contentPane.add(lblTheQuoteOf);
		
		btnLogout = new JButton("Log-out");
		btnLogout.setBounds(344, 281, 117, 29);
		contentPane.add(btnLogout);
	}

}
