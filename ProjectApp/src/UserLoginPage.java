import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class UserLoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLoginPage frame = new UserLoginPage();
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
	public UserLoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserloginpage = new JLabel("UserLoginPage");
		lblUserloginpage.setBounds(169, 27, 89, 14);
		contentPane.add(lblUserloginpage);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(51, 69, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(154, 66, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(51, 132, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(154, 129, 137, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(90, 200, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(256, 200, 89, 23);
		contentPane.add(btnReset);
	}

}
