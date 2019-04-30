package base_de_donne;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gg.BDD;
import gg.parametre;
import gg.tableA;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class login extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField text_username;
	ResultSet rs;
	BDD db;
	String username1, password, hak;
	private JPasswordField text_password;
	
		
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public login() {
		new parametre();
	
		db = new BDD(parametre.HOST_DB, parametre.USERNAME_DB,parametre.PASSWORD_DB, parametre.IPHOST, parametre.PORT);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setForeground(Color.RED);
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 45));
		lblLogin.setBounds(211, 13, 137, 49);
		contentPane.add(lblLogin);
		
		JLabel lblUsername = new JLabel("UserName :");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setFont(new Font("Dialog", Font.BOLD, 30));
		lblUsername.setBounds(29, 100, 177, 49);
		contentPane.add(lblUsername);
		
		JLabel lblP = new JLabel("Password :");
		lblP.setHorizontalAlignment(SwingConstants.CENTER);
		lblP.setFont(new Font("Dialog", Font.BOLD, 30));
		lblP.setBounds(29, 193, 177, 49);
		contentPane.add(lblP);
		
		text_username = new JTextField();
		text_username.setHorizontalAlignment(SwingConstants.CENTER);
		text_username.setFont(new Font("Dialog", Font.BOLD, 30));
		text_username.setBounds(247, 114, 200, 31);
		contentPane.add(text_username);
		text_username.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				String  uname=text_username.getText();
				@SuppressWarnings("deprecation")
				String psd=text_password.getText();
				if (uname.equals("name") && psd.equals("password"))
				{
				
					table.main(null);
					
				}
				else {
					JOptionPane.showMessageDialog(lblLogin, "le nom d'utilisateur ou le mot de passe est incorrect");
					
			
				
					
					
				}
				
				
			
			}

			@SuppressWarnings("unused")
			private void dispose() {
				// TODO Auto-generated method stub
				
			}});
		
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 30));
		btnNewButton.setBounds(52, 274, 171, 37);
		contentPane.add(btnNewButton);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setFont(new Font("Dialog", Font.BOLD, 30));
		btnClose.setBounds(276, 274, 171, 37);
		contentPane.add(btnClose);
		
		text_password = new JPasswordField();
		text_password.setHorizontalAlignment(SwingConstants.CENTER);
		text_password.setFont(new Font("Dialog", Font.BOLD, 30));
		text_password.setBounds(247, 202, 200, 31);
		contentPane.add(text_password);
	}
}
