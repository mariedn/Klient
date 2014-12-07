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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblKalendere = new JLabel("Kalendere");
		lblKalendere.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		lblKalendere.setBounds(147, 6, 148, 47);
		contentPane.add(lblKalendere);
		
		btnCreateNewCalendar = new JButton("Create new calendar");
		btnCreateNewCalendar.setBounds(133, 243, 178, 29);
		contentPane.add(btnCreateNewCalendar);
		
		btnShowWeatherforecast = new JButton("Show weatherforecast");
		btnShowWeatherforecast.setBounds(133, 202, 178, 29);
		contentPane.add(btnShowWeatherforecast);
		
		btnShowDayView = new JButton("Show day view");
		btnShowDayView.setBounds(133, 79, 178, 29);
		contentPane.add(btnShowDayView);
		
		btnShowWeekView = new JButton("Show week view");
		btnShowWeekView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnShowWeekView.setBounds(133, 120, 178, 29);
		contentPane.add(btnShowWeekView);
		
		btnShowRandom = new JButton("Show random quote");
		btnShowRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnShowRandom.setBounds(133, 161, 178, 29);
		contentPane.add(btnShowRandom);
		
	}
}
