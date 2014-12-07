import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;


public class Overview extends JFrame {

	private JPanel contentPane;
	private JLabel lblKalendere;
	private JLabel lblEgneKalendere;
	private JLabel lblDelteKalender;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Overview frame = new Overview();
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
	public Overview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblKalendere = new JLabel("Kalendere");
		lblKalendere.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 27));
		lblKalendere.setBounds(148, 20, 148, 47);
		contentPane.add(lblKalendere);
		
		lblEgneKalendere = new JLabel("Egne kalendere");
		lblEgneKalendere.setBounds(6, 77, 100, 16);
		contentPane.add(lblEgneKalendere);
		
		lblDelteKalender = new JLabel("Delte kalender");
		lblDelteKalender.setBounds(292, 79, 100, 16);
		contentPane.add(lblDelteKalender);
		
		list = new JList();
		list.setBounds(16, 105, 1, 1);
		contentPane.add(list);
		
	}
}
