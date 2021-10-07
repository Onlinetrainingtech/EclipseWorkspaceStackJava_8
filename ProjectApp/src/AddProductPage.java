import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class AddProductPage extends JFrame {

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
					AddProductPage frame = new AddProductPage();
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
	public AddProductPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddproduct = new JLabel("AddProduct");
		lblAddproduct.setBounds(184, 34, 85, 14);
		contentPane.add(lblAddproduct);
		
		JLabel lblProductid = new JLabel("ProductId");
		lblProductid.setBounds(53, 77, 73, 14);
		contentPane.add(lblProductid);
		
		textField = new JTextField();
		textField.setBounds(164, 74, 144, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblProductname = new JLabel("ProductName");
		lblProductname.setBounds(54, 138, 72, 14);
		contentPane.add(lblProductname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 135, 144, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblProductprice = new JLabel("ProductPrice");
		lblProductprice.setBounds(57, 200, 85, 14);
		contentPane.add(lblProductprice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 197, 144, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPquanity = new JLabel("PQuanity");
		lblPquanity.setBounds(59, 261, 46, 14);
		contentPane.add(lblPquanity);
		
		textField_3 = new JTextField();
		textField_3.setBounds(164, 258, 144, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSubmit = new JButton("Insert");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					String p1=textField.getText();
					String pn=textField_1.getText();
					String pp=textField_2.getText();
					String qu=textField_3.getText();
					
					String str1="insert into product values('"+p1+"','"+pn+"','"+pp+"','"+qu+"')";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstack8","sa","");
					Statement stm=conn.createStatement();
					
					stm.executeUpdate(str1);
					
					JOptionPane.showMessageDialog(btnSubmit,"Inserted..!!!");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnSubmit.setBounds(57, 337, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(184, 337, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String pid=textField.getText();
					
					String str2="select * from product where pid='"+pid+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstack8","sa","");
					Statement stm=conn.createStatement();
					
					ResultSet rs=stm.executeQuery(str2);
					
					rs.next();
					
					String t1=rs.getString(2);
					String t2=rs.getString(3);
					String t3=rs.getString(4);
					
					
					textField_1.setText(t1);
					textField_2.setText(t2);
					textField_3.setText(t3);
					
					JOptionPane.showMessageDialog(btnSearch,"Searching!!!!");
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnSearch.setBounds(302, 337, 89, 23);
		contentPane.add(btnSearch);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String pid=textField.getText();
					
					String pname=textField_1.getText();
					
					String str3="update product set pname='"+pname+"' where pid='"+pid+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstack8","sa","");
					Statement stm=conn.createStatement();
					
					stm.executeUpdate(str3);
					
					JOptionPane.showMessageDialog(btnUpdate,"updated..!!!");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnUpdate.setBounds(335, 242, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					String pid=textField.getText();
					
					
					
					String str4="delete from product where pid='"+pid+"'";
					
					Class.forName("org.h2.Driver");
					Connection conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/fullstack8","sa","");
					Statement stm=conn.createStatement();
					
					stm.executeUpdate(str4);
					
					JOptionPane.showMessageDialog(btnDelete,"Deleted..!!!");
					
				}
				catch(Exception t)
				{
					System.out.println(t);
				}
			}
		});
		btnDelete.setBounds(335, 159, 89, 23);
		contentPane.add(btnDelete);
	}
}
