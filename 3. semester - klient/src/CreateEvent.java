import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;


public class CreateEvent extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton btnShareCalendar;
	private JButton btnBackToMenu;

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
	public CreateEvent() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Create event");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setBounds(311, 6, 182, 40);
		contentPane.add(lblNewLabel);
		
		btnShareCalendar = new JButton("Create");
		btnShareCalendar.setBounds(343, 199, 117, 29);
		contentPane.add(btnShareCalendar);
		
		btnBackToMenu = new JButton("Back to menu");
		btnBackToMenu.setBounds(343, 240, 117, 29);
		contentPane.add(btnBackToMenu);
	}

}
