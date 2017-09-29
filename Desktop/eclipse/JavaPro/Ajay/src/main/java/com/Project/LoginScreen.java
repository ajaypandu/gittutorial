package com.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class LoginScreen {

	private JFrame frame;
	private JTextField textUserName;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen window = new LoginScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(86, 64, 81, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(86, 114, 81, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textUserName = new JTextField();
		textUserName.setBounds(212, 61, 86, 20);
		frame.getContentPane().add(textUserName);
		textUserName.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(212, 111, 86, 20);
		frame.getContentPane().add(password);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String UName=textUserName.getText();
				String Pass=password.getText();
				if(UName.contains("a")&&Pass.contains("b"))
				{
					textUserName.setText(null);
					password.setText(null);
					PreMain p=new PreMain	();
					p.setVisible(true);
					frame.dispose();
				}
				else
				{
					JOptionPane.showConfirmDialog(null, "Invalid Credentials", "Login Error", JOptionPane.ERROR_MESSAGE);
					textUserName.setText(null);
					password.setText(null);
				}
				
				 
			}
		});
		btnLogin.setBounds(209, 160, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textUserName.setText(null);
				password.setText(null);
				 
			}
		});
		btnReset.setBounds(312, 160, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JLabel lblLoginToRuby = new JLabel("LOGIN");
		lblLoginToRuby.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblLoginToRuby.setBounds(189, 11, 81, 20);
		frame.getContentPane().add(lblLoginToRuby);
	}
}
