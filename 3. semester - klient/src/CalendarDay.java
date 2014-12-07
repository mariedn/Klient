import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalendarDay extends JPanel {

	private JPanel contentPane;
	private JLabel lblWeekView;
	private JButton btnDayView;
	private JButton btnAddNote;
	private JButton btnDeleteNote;
	private JButton btnDeleteEvent;
	private JButton btnMenu;
	private JButton btnLogout;
	private JLabel lblTime;
	private JLabel lblMon;
	private JLabel lblTue;
	private JLabel lblWed;
	private JLabel lblThu;
	private JLabel lblFri;
	private JLabel lblSaturday;
	private JLabel lblSunday;
	private JTable table;
	private JButton btnAddNote_1;

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
	public CalendarDay() {
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		lblWeekView = new JLabel("Day view");
		lblWeekView.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		lblWeekView.setBounds(336, 5, 134, 33);
		contentPane.add(lblWeekView);
		
		btnDayView = new JButton("Week view");
		btnDayView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDayView.setBounds(683, 78, 117, 29);
		contentPane.add(btnDayView);
		
		btnAddNote = new JButton("Add Note");
		btnAddNote.setBounds(683, 118, 117, 29);
		contentPane.add(btnAddNote);
		
		btnDeleteNote = new JButton("Delete Note");
		btnDeleteNote.setBounds(683, 159, 117, 29);
		contentPane.add(btnDeleteNote);
		
		btnDeleteEvent = new JButton("Delete Event");
		btnDeleteEvent.setBounds(683, 241, 117, 29);
		contentPane.add(btnDeleteEvent);
		
		btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMenu.setBounds(683, 282, 117, 29);
		contentPane.add(btnMenu);
		
		btnLogout = new JButton("Log-out");
		btnLogout.setBounds(683, 323, 117, 29);
		contentPane.add(btnLogout);
		
		lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTime.setBounds(10, 58, 61, 16);
		contentPane.add(lblTime);
		
		lblMon = new JLabel("Mon");
		lblMon.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblMon.setBounds(80, 58, 61, 16);
		contentPane.add(lblMon);
		
		lblTue = new JLabel("Tue");
		lblTue.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblTue.setBounds(160, 58, 61, 16);
		contentPane.add(lblTue);
		
		lblWed = new JLabel("Wed");
		lblWed.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblWed.setBounds(240, 58, 75, 16);
		contentPane.add(lblWed);
		
		lblThu = new JLabel("Thu");
		lblThu.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblThu.setBounds(320, 58, 61, 16);
		contentPane.add(lblThu);
		
		lblFri = new JLabel("Fri");
		lblFri.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblFri.setBounds(400, 58, 61, 16);
		contentPane.add(lblFri);
		
		lblSaturday = new JLabel("Sat");
		lblSaturday.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblSaturday.setBounds(480, 58, 61, 16);
		contentPane.add(lblSaturday);
		
		lblSunday = new JLabel("Sun");
		lblSunday.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblSunday.setBounds(560, 58, 61, 16);
		contentPane.add(lblSunday);
		
		table = new JTable();
		table.setBounds(404, 159, -29, -52);
		contentPane.add(table);
		
		btnAddNote_1 = new JButton("Add Event");
		btnAddNote_1.setBounds(683, 200, 117, 29);
		contentPane.add(btnAddNote_1);
	}

}
