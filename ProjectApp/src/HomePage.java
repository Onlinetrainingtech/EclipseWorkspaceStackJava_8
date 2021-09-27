import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHrMappingSystem = new JLabel("HR MAPPING SYSTEM");
		lblHrMappingSystem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHrMappingSystem.setBounds(129, 35, 166, 14);
		contentPane.add(lblHrMappingSystem);
		
		JButton btnAdminlogin = new JButton("AdminLogin");
		btnAdminlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				new AdminLoginPage().setVisible(true);
			}
		});
		btnAdminlogin.setBounds(158, 87, 124, 23);
		contentPane.add(btnAdminlogin);
		
		JButton btnUserlogin = new JButton("UserLogin");
		btnUserlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				new UserLoginPage().setVisible(true);
			}
		});
		btnUserlogin.setBounds(158, 145, 124, 23);
		contentPane.add(btnUserlogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				new RegisterPage().setVisible(true);
			}
		});
		btnRegister.setBounds(158, 208, 124, 23);
		contentPane.add(btnRegister);
	}
}
