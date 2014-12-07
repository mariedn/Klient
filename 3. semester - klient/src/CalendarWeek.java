import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;


public class CalendarWeek extends JFrame {

	private JPanel contentPane;
	private JLabel lblWeekView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarWeek frame = new CalendarWeek();
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
	public CalendarWeek() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWeekView = new JLabel("Week view");
		lblWeekView.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		lblWeekView.setBounds(147, 6, 205, 33);
		contentPane.add(lblWeekView);
	}

}
