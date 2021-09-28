import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class AdminHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHomePage frame = new AdminHomePage();
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
	public AdminHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 11, 390, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAdminhomepage = new JLabel("AdminHomePage");
		lblAdminhomepage.setBounds(147, 22, 89, 14);
		panel.add(lblAdminhomepage);
		
		JButton btnAddproduct = new JButton("AddProduct");
		btnAddproduct.setBounds(130, 70, 113, 23);
		panel.add(btnAddproduct);
		
		JButton btnAddcategory = new JButton("AddCategory");
		btnAddcategory.setBounds(130, 129, 113, 23);
		panel.add(btnAddcategory);
	}
}
