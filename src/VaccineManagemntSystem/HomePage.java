package VaccineManagemntSystem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollBar;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

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
		setBounds(100, 100, 819, 501);
		JPanel contentPane = new JPanel();
		contentPane.setAutoscrolls(true);
		contentPane.setBounds(new Rectangle(6, 6, 47, 61));
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 10, 799, 161);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("COVID-19 VACCINE MANAGEMENT");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 32));
		lblNewLabel_2.setBounds(95, 27, 561, 94);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				LoginPage pl = new LoginPage ();
				pl.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		btnNewButton.setBounds(70, 409, 112, 46);
		contentPane.add(btnNewButton);
		
		JButton btnSingnup = new JButton("SIGN-UP");
		btnSingnup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				SignUpPage sp = new SignUpPage();
				sp.setVisible(true);
				setVisible(false);
			}
		});
		btnSingnup.setForeground(new Color(255, 255, 255));
		btnSingnup.setBorderPainted(false);
		btnSingnup.setBackground(new Color(0, 0, 0));
		btnSingnup.setFont(new Font("Tempus Sans ITC", Font.BOLD, 18));
		btnSingnup.setBounds(227, 409, 159, 46);
		contentPane.add(btnSingnup);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(563, 185, 231, 205);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("F:\\IMG_20220730_133734.jpg"));
		lblNewLabel.setIgnoreRepaint(true);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(0, 0, 205));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		
		JLabel lblNewLabel_1 = new JLabel("Home Page");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(20, 181, 173, 69);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setDisabledIcon(new ImageIcon("F:\\IMG_20220730_133734.jpg"));
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblNewLabel_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblNewLabel_1.setIgnoreRepaint(true);
		lblNewLabel_1.setDoubleBuffered(true);
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setBackground(new Color(32, 178, 170));
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 31));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(558, 185, 236, 205);
		contentPane.add(panel_1);
		setUndecorated(true);
	}
}
