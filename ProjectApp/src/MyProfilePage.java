import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MyProfilePage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyProfilePage frame = new MyProfilePage();
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
	public MyProfilePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 343);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMyprofile = new JLabel("MyProfile");
		lblMyprofile.setBounds(162, 30, 46, 14);
		contentPane.add(lblMyprofile);
		
		textField = new JTextField();
		textField.setBounds(144, 69, 135, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(48, 72, 70, 14);
		contentPane.add(lblUsername);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 123, 135, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(48, 126, 46, 14);
		contentPane.add(lblPass);
		
		textField_2 = new JTextField();
		textField_2.setBounds(144, 182, 135, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdddetails = new JButton("Search");
		btnAdddetails.setBounds(95, 252, 89, 23);
		contentPane.add(btnAdddetails);
		
		JButton btnSearch = new JButton("Update");
		btnSearch.setBounds(258, 252, 89, 23);
		contentPane.add(btnSearch);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(48, 185, 46, 14);
		contentPane.add(lblGender);
	}
}
