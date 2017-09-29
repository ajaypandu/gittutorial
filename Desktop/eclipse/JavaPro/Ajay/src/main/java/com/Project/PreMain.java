package com.Project;
 import java.awt.Event.*;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JLabel;

import com.sun.glass.events.WindowEvent;

import java.awt.Color;

public class PreMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PreMain frame = new PreMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public void close()
	{
		this.setVisible(false);
		this.dispose();
	}
	/**
	 * Create the frame.
	 */
	public  PreMain() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("HaveIt");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				choo Table1= new choo();
				Table1.setVisible(true);
				close();
								
				
			}
		});
		btnNewButton.setBounds(125, 84, 175, 71);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("TakeAway");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				choo Table1= new choo();
				Table1.setVisible(true);
				close();
			}
		});
		btnNewButton_1.setBounds(125, 179, 175, 71);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(159, 11, 108, 25);
		contentPane.add(lblNewLabel);
	}

	
	 
	
	
	
	
	protected static void EXIT_ON_CLOSE() {
		// TODO Auto-generated method stub
		
	}

	

}
