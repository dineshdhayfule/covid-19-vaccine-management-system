package VaccineManagemntSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import VaccineManagemntSystem.databse.data;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.JEditorPane;
import javax.swing.DropMode;
import java.awt.TextArea;

public class SignUpPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_8;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_2;
	private JTextField textField_9;
	@SuppressWarnings("rawtypes")
	ArrayList al = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage frame = new SignUpPage();
					frame.setVisible(true);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	/**
	 * 
	 */
	public SignUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1145, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Name Can't Be Null Or Number");
		lblNewLabel_11.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblNewLabel_11.setForeground(new Color(255, 0, 0));
		lblNewLabel_11.setBounds(159, 113, 249, 20);
		contentPane.add(lblNewLabel_11);
		lblNewLabel_11.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("Enter Vallid Password");
		lblNewLabel.setVisible(false);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(756, 210, 176, 23);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		contentPane.add(lblNewLabel);
		lblNewLabel.setVisible(false);

		
		JLabel lblNewLabel_5 = new JLabel("E-Mail Id");
		lblNewLabel_5.setForeground(new Color(0, 255, 0));
		lblNewLabel_5.setBounds(535, 145, 108, 25);
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("Name Can't Be Null Or Number");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setBounds(159, 211, 249, 23);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);

		
		JLabel lblNewLabel_4 = new JLabel("Enter Valid Password");
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setBounds(771, 312, 161, 32);
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Phone No.\r\n\r\n");
		lblNewLabel_6.setForeground(new Color(0, 255, 0));
		lblNewLabel_6.setBounds(27, 343, 153, 41);
		lblNewLabel_6.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Address Can't Be Null or number");
		lblNewLabel_7.setVisible(false);
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setBounds(747, 409, 268, 27);
		lblNewLabel_7.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		textField.setBounds(197, 351, 211, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		textField_1.setBounds(756, 145, 211, 32);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(197, 448, 221, 32);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_8 = new JLabel("Enter Date");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setBounds(233, 407, 123, 31);
		lblNewLabel_8.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		contentPane.add(lblNewLabel_8);
		lblNewLabel_8.setVisible(false);
		
		JLabel lblNewLabel_9 = new JLabel("Enter Valid E-Mail ID");
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setBackground(Color.RED);
		lblNewLabel_9.setBounds(747, 112, 197, 23);
		lblNewLabel_9.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		contentPane.add(lblNewLabel_9);
		lblNewLabel_9.setVisible(false);
		
		JLabel lblNewLabel_10 = new JLabel("enter valid mobile number");
		lblNewLabel_10.setForeground(Color.RED);
		lblNewLabel_10.setBounds(197, 318, 233, 23);
		lblNewLabel_10.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		contentPane.add(lblNewLabel_10);
		lblNewLabel_10.setVisible(false);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(219, 636, 142, 47);
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(197, 515, 211, 32);
		comboBox.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Male", "Female", "Other"}));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("DOB\r\n");
		lblNewLabel_3.setForeground(new Color(0, 255, 0));
		lblNewLabel_3.setBounds(27, 442, 86, 23);
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		contentPane.add(lblNewLabel_3);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		textField_8.setToolTipText("");
		textField_8.setName("");
		textField_8.setBounds(197, 144, 211, 32);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JTextArea txtrRegistration = new JTextArea();
		txtrRegistration.setBackground(new Color(0, 0, 0));
		txtrRegistration.setForeground(new Color(0, 255, 0));
		txtrRegistration.setFont(new Font("Tempus Sans ITC", Font.BOLD, 33));
		txtrRegistration.setText("REGISTRATION \r\n");
		txtrRegistration.setBounds(379, 28, 279, 47);
		contentPane.add(txtrRegistration);
		
		JLabel lblNewLabel_1 = new JLabel("First Name\r\n");
		lblNewLabel_1.setForeground(new Color(0, 255, 0));
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_1.setBounds(27, 143, 136, 32);
		contentPane.add(lblNewLabel_1);

		
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(756, 245, 211, 32);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel(" Confirm Password");
		lblNewLabel_1_1.setForeground(new Color(0, 255, 0));
		lblNewLabel_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(535, 347, 197, 32);
		contentPane.add(lblNewLabel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		textField_4.setColumns(10);
		textField_4.setBounds(756, 351, 211, 32);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_13 = new JLabel("Password");
		lblNewLabel_13.setForeground(new Color(0, 255, 0));
		lblNewLabel_13.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_13.setBounds(535, 246, 171, 23);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Address");
		lblNewLabel_14.setForeground(new Color(0, 255, 0));
		lblNewLabel_14.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_14.setBounds(548, 442, 95, 32);
		contentPane.add(lblNewLabel_14);

		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		textField_2.setToolTipText("");
		textField_2.setName("");
		textField_2.setColumns(10);
		textField_2.setBounds(197, 252, 211, 32);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_18 = new JLabel("Last Name");
		lblNewLabel_18.setForeground(new Color(0, 255, 0));
		lblNewLabel_18.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_18.setBounds(27, 234, 117, 47);
		contentPane.add(lblNewLabel_18);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		textField_9.setForeground(new Color(255, 0, 0));
		textField_9.setBounds(771, 434, 204, 83);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Gender\r\n");
		lblNewLabel_12.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_12.setForeground(new Color(0, 255, 0));
		lblNewLabel_12.setBounds(27, 519, 86, 22);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_15 = new JLabel("Select Gender");
		lblNewLabel_15.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblNewLabel_15.setForeground(Color.RED);
		lblNewLabel_15.setBounds(249, 492, 136, 25);
		contentPane.add(lblNewLabel_15);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				textField_8.setText("");
				textField_2.setText("");
				textField.setText("");
				textField_1.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_9.setText("");
				dateChooser.setDate(null);
				comboBox.setSelectedIndex(0);
				
				lblNewLabel_11.setVisible(false);
				lblNewLabel_2.setVisible(false);
				lblNewLabel_10.setVisible(false);
				lblNewLabel_8.setVisible(false);
				lblNewLabel_15.setVisible(false);
				lblNewLabel_9.setVisible(false);
				lblNewLabel.setVisible(false);
				lblNewLabel_4.setVisible(false);
				lblNewLabel_7.setVisible(false);

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(460, 635, 142, 47);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("HOME");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				HomePage h = new HomePage();
				h.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(0, 255, 0));
		btnNewButton_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		btnNewButton_2.setBounds(746, 635, 142, 47);
		contentPane.add(btnNewButton_2);
		lblNewLabel_15.setVisible(false);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{ 	
				lblNewLabel.setVisible(false);
				lblNewLabel_2.setVisible(false);
				lblNewLabel_4.setVisible(false);
				lblNewLabel_7.setVisible(false);
				lblNewLabel_8.setVisible(false);
				lblNewLabel_9.setVisible(false);
				lblNewLabel_10.setVisible(false);
				lblNewLabel_11.setVisible(false);
				lblNewLabel_15.setVisible(false);
				boolean b1;
	            int c = 0;

				//dob
				if(dateChooser.getDate()==null) { 
					lblNewLabel_8.setVisible(true);
				}
				
				//phone no
				boolean b ;
			    b = Pattern.compile("^\\d{10}$").matcher(textField.getText()).matches();
			    if(b==false) {
			    	lblNewLabel_10.setVisible(true);
			    }
			    
			    //email id
			    b = Pattern.compile("^(.+)@(.+)$").matcher(textField_1.getText()).matches();
			    if(b==false)
			    {
			    lblNewLabel_9.setVisible(true);
			    }
			    //name
			    if(textField_8.getText().trim().isEmpty())
	            {
					lblNewLabel_11.setVisible(true);
				}
			    //lname
			    if(textField_2.getText().trim().isEmpty())
	            {
					lblNewLabel_2.setVisible(true);
				}
			    //pass1
			    if(textField_3.getText().trim().isEmpty())
	            {
			    	lblNewLabel_4.setVisible(true);
				}
			    //pass
			    if(textField_3.getText().trim().isEmpty())
	            {
	            	lblNewLabel.setVisible(true);
				}
			    if(textField_9.getText().trim().isEmpty())
	            {
	            	lblNewLabel_7.setVisible(true);
				}
			   
			  //First Name
				b1 = Pattern.compile("[a-zA-Z]{3,30}").matcher(textField_8.getText()).matches();
				if(b1==false) 
				{
					lblNewLabel_11.setVisible(true);
					c = 1;
					//txtVkhnvk.setText(null);
				}
				else {
					al.add(textField_8.getText());
				}
				
				
				//Last Name
				b1 = Pattern.compile("[a-zA-Z]{3,30}").matcher(textField_2.getText()).matches();
				if(b1==false) 
				{
					lblNewLabel_2.setVisible(true);
				}
				else {
					al.add(textField_2.getText());
				}
				
				//Email Id
				b1 = Pattern.compile("^(.+)@(.+)$").matcher(textField_1.getText()).matches();
				if(b1==false) 
				{
					lblNewLabel_9.setVisible(true);
					c = 1;
					//textField_6.setText(null);
				}
				else {
					al.add(textField_1.getText());
				}
				
				//Phone No
				b1 = Pattern.compile("\\d{10}$").matcher(textField.getText()).matches();
				if(b1==false) 
				{
					lblNewLabel_10.setVisible(true);
					c = 1;
					//textField_5.setText(null);
				}
				else {
					al.add(textField.getText());
				}
				
				//confirm password
				if(!textField_4.getText().equals(textField_3.getText()))
				{
					lblNewLabel_14.setVisible(true);
					c = 1;
				}
				else {
					al.add(textField_4.getText());
				}

				//gender
				if(comboBox.getSelectedIndex()==0) {
					lblNewLabel_15.setVisible(true);
					c = 1;
				}
				else {
					al.add(comboBox.getSelectedItem());
				}
					
					//Address
					b1 = Pattern.compile("[a-z]").matcher(textField_9.getText()).matches();
					if(b1==true) 
					{
						lblNewLabel_7.setVisible(true);
						c = 1;
					}
					else {
						al.add(textField_9.getText());
					}
				data db = new data();
				db.insertIntoDB(al);
				int a = db.insertIntoDB(al); 
				if (a==1) {
					JOptionPane.showMessageDialog(null, "Succesfully Submited");
				      }
		     else {
		    	 JOptionPane.showMessageDialog(null, "Not Submited");
		    	 }
				if(a==1)
				{
				LoginPage lp = new LoginPage();
						lp.setVisible(true);
						setVisible(false);
				}
			}
		});
	}
}