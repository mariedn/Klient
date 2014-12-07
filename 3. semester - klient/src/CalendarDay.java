import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class CalendarDay extends JFrame {

	private JPanel contentPane;
	private JLabel lblWeekView;
	private JScrollPane scrollPane;
	private JButton btnDayView;
	private JButton btnAddNote;
	private JButton btnDeleteNote;
	private JButton btnDeleteEvent;
	private JButton btnMenu;
	private JButton btnLogout;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 807, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblWeekView = new JLabel("Day view");
		lblWeekView.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		lblWeekView.setBounds(147, 6, 205, 33);
		contentPane.add(lblWeekView);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 309, 214);
		contentPane.add(scrollPane);
		
		btnDayView = new JButton("Week view");
		btnDayView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDayView.setBounds(327, 45, 117, 29);
		contentPane.add(btnDayView);
		
		btnAddNote = new JButton("Add Note");
		btnAddNote.setBounds(327, 73, 117, 29);
		contentPane.add(btnAddNote);
		
		btnDeleteNote = new JButton("Delete Note");
		btnDeleteNote.setBounds(327, 102, 117, 29);
		contentPane.add(btnDeleteNote);
		
		btnDeleteEvent = new JButton("Delete Event");
		btnDeleteEvent.setBounds(327, 130, 117, 29);
		contentPane.add(btnDeleteEvent);
		
		btnMenu = new JButton("Menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMenu.setBounds(331, 203, 117, 29);
		contentPane.add(btnMenu);
		
		btnLogout = new JButton("Log-out");
		btnLogout.setBounds(331, 230, 117, 29);
		contentPane.add(btnLogout);
	}

}
