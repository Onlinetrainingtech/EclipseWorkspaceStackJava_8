import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddCategory extends JFrame {

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
					AddCategory frame = new AddCategory();
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
	public AddCategory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddcategorypage = new JLabel("AddCategoryPage");
		lblAddcategorypage.setBounds(162, 30, 97, 14);
		contentPane.add(lblAddcategorypage);
		
		JLabel lblCategoryid = new JLabel("CategoryId");
		lblCategoryid.setBounds(59, 74, 73, 14);
		contentPane.add(lblCategoryid);
		
		textField = new JTextField();
		textField.setBounds(162, 71, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCategoryname = new JLabel("CategoryName");
		lblCategoryname.setBounds(59, 138, 85, 14);
		contentPane.add(lblCategoryname);
		
		textField_1 = new JTextField();
		textField_1.setBounds(162, 135, 149, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAddcategory = new JButton("AddCategory");
		btnAddcategory.setBounds(82, 226, 116, 23);
		contentPane.add(btnAddcategory);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(259, 226, 89, 23);
		contentPane.add(btnReset);
	}

}
