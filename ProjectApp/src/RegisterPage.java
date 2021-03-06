import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
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
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 449);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(10, 31, 414, 368);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblRegisterpage = new JLabel("RegisterPage");
		lblRegisterpage.setBounds(164, 27, 90, 14);
		panel.add(lblRegisterpage);
		
		JLabel lblUsername = new JLabel("UserName");
		lblUsername.setBounds(34, 79, 81, 14);
		panel.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(180, 76, 143, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(34, 150, 46, 14);
		panel.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(180, 147, 143, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setBounds(34, 214, 46, 14);
		panel.add(lblGender);
		
		textField_2 = new JTextField();
		textField_2.setBounds(180, 211, 143, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(34, 267, 46, 14);
		panel.add(lblAddress);
		
		textField_3 = new JTextField();
		textField_3.setBounds(180, 264, 143, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String u1=textField.getText();
					String p1=textField_1.getText();
					String g1=textField_2.getText();
					String a1=textField_3.getText();
					
					String str1="insert into userreg values('"+u1+"','"+p1+"','"+g1+"','"+a1+"')";
					
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstack8","sa","");
					Statement stm=conn.createStatement();
					
					stm.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnRegister,"LoginSucess!!!");
					
					
					
					
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnRegister.setBounds(93, 321, 89, 23);
		panel.add(btnRegister);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
			}
		});
		btnReset.setBounds(234, 321, 89, 23);
		panel.add(btnReset);
	}
}
