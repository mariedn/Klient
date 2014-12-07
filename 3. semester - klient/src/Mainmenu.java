import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Mainmenu extends JPanel {

	private JPanel contentPane;
	private JLabel lblKalendere;
	private JButton btnCreateNewCalendar;
	private JButton btnShowWeatherforecast;
	private JButton btnShowDayView;
	private JButton btnShowWeekView;
	private JButton btnShowRandom;
	private JLabel lblWhatWouldYou;
	private JButton btnLogout;

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
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		lblKalendere = new JLabel("Menu");
		lblKalendere.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		lblKalendere.setBounds(357, 5, 85, 47);
		contentPane.add(lblKalendere);
		
		btnCreateNewCalendar = new JButton("Create new calendar");
		btnCreateNewCalendar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreateNewCalendar.setBounds(311, 250, 178, 29);
		contentPane.add(btnCreateNewCalendar);
		
		btnShowWeatherforecast = new JButton("Show weatherforecast");
		btnShowWeatherforecast.setBounds(311, 210, 178, 29);
		contentPane.add(btnShowWeatherforecast);
		
		btnShowDayView = new JButton("Show day view");
		btnShowDayView.setBounds(311, 90, 178, 29);
		contentPane.add(btnShowDayView);
		
		btnShowWeekView = new JButton("Show week view");
		btnShowWeekView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnShowWeekView.setBounds(311, 130, 178, 29);
		contentPane.add(btnShowWeekView);
		
		btnShowRandom = new JButton("Show random quote");
		btnShowRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnShowRandom.setBounds(311, 170, 178, 29);
		contentPane.add(btnShowRandom);
		
		lblWhatWouldYou = new JLabel("What would you like to do?");
		lblWhatWouldYou.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lblWhatWouldYou.setBounds(307, 50, 185, 16);
		contentPane.add(lblWhatWouldYou);
		
		btnLogout = new JButton("Log-out");
		btnLogout.setBounds(311, 290, 178, 29);
		contentPane.add(btnLogout);
		
	}
}
