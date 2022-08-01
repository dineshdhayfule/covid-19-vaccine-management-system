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

public class SignUpPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
		setBounds(100, 100, 600, 960);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(40, 136, 139, 62);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 21));
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 21, 552, 69);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBackground(new Color(255, 255, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setBounds(142, 15, 269, 44);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 36));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(21, 115, 552, 638);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(213, 169, 251, 32);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name");
		lblNewLabel_1_2.setBounds(26, 153, 119, 62);
		panel_1.add(lblNewLabel_1_2);
		lblNewLabel_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		
		JLabel lblNewLabel_1_1 = new JLabel("Middle Name");
		lblNewLabel_1_1.setBounds(16, 89, 139, 62);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		
		textField_1 = new JTextField();
		textField_1.setBounds(213, 105, 251, 32);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(171, 173, 179)));
		textField.setBounds(213, 33, 251, 32);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Phone No.");
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel_1_2_1.setBounds(26, 221, 119, 62);
		panel_1.add(lblNewLabel_1_2_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(213, 237, 251, 32);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Gender");
		lblNewLabel_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel_1_2_1_1.setBounds(26, 293, 119, 62);
		panel_1.add(lblNewLabel_1_2_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBorderPainted(true);
		rdbtnNewRadioButton.setContentAreaFilled(false);
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		rdbtnNewRadioButton.setBounds(229, 327, 103, 56);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBorderPainted(true);
		rdbtnFemale.setBackground(new Color(255, 255, 255));
		rdbtnFemale.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		rdbtnFemale.setBounds(347, 327, 103, 56);
		panel_1.add(rdbtnFemale);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(213, 308, 257, 92);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Address");
		lblNewLabel_1_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel_1_2_1_1_1.setBounds(26, 424, 119, 62);
		panel_1.add(lblNewLabel_1_2_1_1_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setSelectedTextColor(new Color(0, 0, 0));
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setBounds(213, 444, 257, 92);
		panel_1.add(textArea);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("E-Mail ID");
		lblNewLabel_1_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1_1_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 23));
		lblNewLabel_1_2_1_1_1_1.setBounds(26, 570, 119, 62);
		panel_1.add(lblNewLabel_1_2_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(213, 570, 257, 32);
		panel_1.add(textField_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(24, 811, 549, 114);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				LoginPage pl = new LoginPage ();
				pl.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 9));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 29));
		btnNewButton.setBounds(208, 29, 149, 51);
		panel_3.add(btnNewButton);
		setUndecorated(true);

	}
}
