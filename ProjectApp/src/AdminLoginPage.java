import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AdminLoginPage extends JFrame {

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
					AdminLoginPage frame = new AdminLoginPage();
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
	public AdminLoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdminloginpage = new JLabel("AdminLoginPage");
		lblAdminloginpage.setBounds(173, 11, 98, 14);
		contentPane.add(lblAdminloginpage);
		
		JLabel lblUname = new JLabel("Uname");
		lblUname.setBounds(46, 53, 46, 14);
		contentPane.add(lblUname);
		
		textField = new JTextField();
		textField.setBounds(142, 50, 164, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(46, 110, 46, 14);
		contentPane.add(lblPass);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 110, 164, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String u1=textField.getText();
					String p1=textField_1.getText();
					
					String str="select * from adminpage";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstack8","sa","");
					Statement stm=conn.createStatement();
					
					ResultSet rs=stm.executeQuery(str);
					
					rs.next();
					
					String uname=rs.getString(1);
					
					String pass=rs.getString(2);
					
					if(uname.equals(u1)&&pass.equals(p1))
					{
						new AdminHomePage().setVisible(true);
						JOptionPane.showMessageDialog(btnSubmit,"LoginSucess!!");
					}
					else
					{
						JOptionPane.showMessageDialog(btnSubmit,"LoginFail!!!");
					}
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnSubmit.setBounds(103, 186, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(277, 186, 89, 23);
		contentPane.add(btnReset);
	}
}
