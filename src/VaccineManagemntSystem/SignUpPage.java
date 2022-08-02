package VaccineManagemntSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import com.toedter.calendar.JCalendar;

public class SignUpPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

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
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 670);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBounds(21, 22, 848, 626);
		contentPane.add(contentPane_1);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.WHITE);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(182, 130, 143, 29);
		contentPane_1.add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(182, 199, 143, 29);
		contentPane_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(182, 264, 143, 29);
		contentPane_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(182, 334, 171, 29);
		contentPane_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(501, 130, 264, 29);
		contentPane_1.add(textField_5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(21, 264, 127, 37);
		contentPane_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("First Name");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(21, 130, 127, 37);
		contentPane_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Middle Name");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2.setBounds(21, 199, 127, 37);
		contentPane_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(21, 439, 127, 37);
		contentPane_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Phone No.");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3_1.setBounds(21, 334, 127, 37);
		contentPane_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Email ID");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3_2.setBounds(375, 124, 96, 37);
		contentPane_1.add(lblNewLabel_1_3_2);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				setVisible(false);

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(182, 545, 133, 37);
		contentPane_1.add(btnNewButton_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBorderPainted(false);
		btnReset.setBackground(Color.YELLOW);
		btnReset.setBounds(500, 545, 133, 37);
		contentPane_1.add(btnReset);
		
		JLabel lblNewLabel_1_3_3 = new JLabel("Gender");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3_3.setBounds(375, 203, 96, 29);
		contentPane_1.add(lblNewLabel_1_3_3);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(182, 439, 454, 73);
		contentPane_1.add(textField_6);
		
		JLabel lblNewLabel_1_3_3_1 = new JLabel("DOB");
		lblNewLabel_1_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_3_3_1.setBounds(375, 258, 96, 37);
		contentPane_1.add(lblNewLabel_1_3_3_1);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setBounds(261, 10, 269, 44);
		contentPane_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 36));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setToolTipText("Male\r\nFemale\r\n");
		comboBox.setBounds(501, 197, 252, 33);
		contentPane_1.add(comboBox);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(501, 249, 206, 152);
		contentPane_1.add(calendar);
		setUndecorated(true);

	}
}
