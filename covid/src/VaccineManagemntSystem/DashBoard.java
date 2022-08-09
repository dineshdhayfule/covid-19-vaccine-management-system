package VaccineManagemntSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDateChooser;

import VaccineManagemntSystem.databse.data;
import VaccineManagemntSystem.databse.data2;

public class DashBoard extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	ArrayList al = new ArrayList();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashBoard frame = new DashBoard();
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
	public DashBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		contentPane = new JPanel();
		contentPane.setForeground(Color.PINK);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(0, 68, 786, 401);
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(305, 59, 233, 41);
		panel.add(textField);
		textField.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter Mobile no");
		lblNewLabel.setBounds(25, 64, 180, 29);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_1 = new JLabel("CHOOSE VACCINE");
		lblNewLabel_1.setBounds(25, 139, 203, 29);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"VACCINE", "COVAXIN", "COVI-SHIELD"}));
		comboBox_1.setBounds(305, 132, 233, 44);
		panel.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("CHOOSE VACCINE\r\n CENTER");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 263, 260, 60);
		panel.add(lblNewLabel_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 21));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"CENTER", "SOLAPUR ", "PUNE", "MUMBAI"}));
		comboBox_2.setBounds(305, 273, 233, 41);
		panel.add(comboBox_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("CHOOSE DATE");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 22));
		lblNewLabel_1_1.setBounds(25, 209, 203, 29);
		panel.add(lblNewLabel_1_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(305, 209, 233, 29);
		panel.add(dateChooser);
		
		JLabel lblNewLabel_3 = new JLabel("Enter no");
		lblNewLabel_3.setVisible(false);
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblNewLabel_3.setBounds(340, 26, 100, 23);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Select Vaccine");
		lblNewLabel_4.setVisible(false);
		lblNewLabel_4.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(340, 110, 139, 29);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Select Date");
		lblNewLabel_5.setVisible(false);
		lblNewLabel_5.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(340, 186, 139, 23);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Select Center");
		lblNewLabel_6.setVisible(false);
		lblNewLabel_6.setFont(new Font("Tempus Sans ITC", Font.BOLD, 17));
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setBounds(340, 250, 139, 13);
		panel.add(lblNewLabel_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 786, 70);
		panel_1.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 16, 118, 44);
		panel_1.add(comboBox);
		comboBox.setFont(new Font("Tempus Sans ITC", Font.BOLD, 20));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				if(comboBox.getSelectedIndex() ==2)
				{
					LoginPage l= new LoginPage();
					l.setVisible(true);
					setVisible(true);
					setVisible(false);
					}

			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Menue", "Profiels", "SIGN-OUT"}));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBackground(new Color(0, 255, 0));
		panel_2.setBounds(0, 465, 786, 148);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnHome = new JButton("HOME");
		btnHome.setFont(new Font("Tempus Sans ITC", Font.BOLD, 21));
		btnHome.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		btnHome.setBackground(Color.GREEN);
		btnHome.setBounds(385, 72, 129, 38);
		panel_2.add(btnHome);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				//Phone No
				boolean b1;
				int c=0;
				b1 = Pattern.compile("\\d{10}$").matcher(textField.getText()).matches();
				if(b1==false) 
				{
					lblNewLabel_3.setVisible(true);
				}
				else {
					al.add(textField.getText());
				}
			//vname
				if(comboBox_1.getSelectedIndex()==0) {
					lblNewLabel_4.setVisible(true);
				}
				else {
					al.add(comboBox_1.getSelectedItem());
				}
				
				
				if(dateChooser.getDate()==null) 
				{
				lblNewLabel_5.setVisible(true);
				}
				
				
				//vcen
				if(comboBox_2.getSelectedIndex()==0) {
					lblNewLabel_6.setVisible(true);
				}
				else {
					al.add(comboBox_1.getSelectedItem());
				}
				data2 db = new data2();
				db.insertdash(al);
				int a = db.insertdash(al); 
				if (a==1) {
					JOptionPane.showMessageDialog(null, "Succesfully Submited");
				      }
		     else {
		    	 JOptionPane.showMessageDialog(null, "Not Submited");
		    	 }
				
			}
		});
		btnNewButton.setBounds(147, 72, 129, 38);
		panel_2.add(btnNewButton);
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 21));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				HomePage h = new HomePage();
				h.setVisible(true);
				setVisible(false);
			}
		});
		
	}
}
