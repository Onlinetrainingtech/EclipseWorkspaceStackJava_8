import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

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
		btnSubmit.setBounds(57, 337, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(184, 337, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(302, 337, 89, 23);
		contentPane.add(btnSearch);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(335, 242, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(335, 159, 89, 23);
		contentPane.add(btnDelete);
	}
}
