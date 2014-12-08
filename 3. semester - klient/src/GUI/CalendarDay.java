package GUI;
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
		
		String [] columnNames = {"time", "xxxx", "xxxx", "xxxx", "xxxx", "xxxx"};
		Object [][] data = {
				{"01.00", null, null, null, null, null},
				{"02.00", null, null, null, null, null},
				{"03.00", null, null, null, null, null},
				{"04.00", null, null, null, null, null},
				{"05.00", null, null, null, null, null},
				{"06.00", null, null, null, null, null},
				{"07.00", null, null, null, null, null},
				{"08.00", null, null, null, null, null},
				{"09.00", null, null, null, null, null},
				{"10.00", null, null, null, null, null},
				{"11.00", null, null, null, null, null},
				{"12.00", null, null, null, null, null},
				{"13.00", null, null, null, null, null},
				{"14.00", null, null, null, null, null},
				{"15.00", null, null, null, null, null},
				{"16.00", null, null, null, null, null},
				{"17.00", null, null, null, null, null},
				{"18.00", null, null, null, null, null},
				{"19.00", null, null, null, null, null},
				{"20.00", null, null, null, null, null},
				{"21.00", null, null, null, null, null},
				{"22.00", null, null, null, null, null},
				{"23.00", null, null, null, null, null},
				{"24.00", null, null, null, null, null},
		};
		
		table = new JTable(data, columnNames);
		table.setBounds(10, 80, 650, 315);
		contentPane.add(table);
		table.setRowHeight(13);
		table.setShowGrid(true);
		
		btnAddNote_1 = new JButton("Add Event");
		btnAddNote_1.setBounds(683, 200, 117, 29);
		contentPane.add(btnAddNote_1);
	}

}
