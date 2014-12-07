import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Mainmenu extends JFrame {

	private JPanel contentPane;
	private JLabel lblKalendere;
	private JButton btnCreateNewCalendar;
	private JButton btnShowWeatherforecast;
	private JButton btnShowDayView;
	private JButton btnShowWeekView;
	private JButton btnShowRandom;
	private JButton btnLogout;
	private JLabel lblWhatWouldYou;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainmenu frame = new Mainmenu();
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
	public Mainmenu() {
		setTitle("Marie's Calendar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblKalendere = new JLabel("Menu");
		lblKalendere.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		lblKalendere.setBounds(360, 6, 85, 47);
		contentPane.add(lblKalendere);
		
		btnCreateNewCalendar = new JButton("Create new calendar");
		btnCreateNewCalendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreateNewCalendar.setBounds(314, 274, 178, 29);
		contentPane.add(btnCreateNewCalendar);
		
		btnShowWeatherforecast = new JButton("Show weatherforecast");
		btnShowWeatherforecast.setBounds(314, 233, 178, 29);
		contentPane.add(btnShowWeatherforecast);
		
		btnShowDayView = new JButton("Show day view");
		btnShowDayView.setBounds(314, 110, 178, 29);
		contentPane.add(btnShowDayView);
		
		btnShowWeekView = new JButton("Show week view");
		btnShowWeekView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnShowWeekView.setBounds(314, 151, 178, 29);
		contentPane.add(btnShowWeekView);
		
		btnShowRandom = new JButton("Show random quote");
		btnShowRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnShowRandom.setBounds(314, 192, 178, 29);
		contentPane.add(btnShowRandom);
		
		btnLogout = new JButton("Log-out");
		btnLogout.setBounds(314, 315, 178, 29);
		contentPane.add(btnLogout);
		
		lblWhatWouldYou = new JLabel("What would you like to do?");
		lblWhatWouldYou.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lblWhatWouldYou.setBounds(310, 65, 185, 16);
		contentPane.add(lblWhatWouldYou);
		
	}
}
