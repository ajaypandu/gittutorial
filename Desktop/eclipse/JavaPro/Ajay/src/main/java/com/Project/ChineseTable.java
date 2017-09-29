package com.Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class ChineseTable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChineseTable frame = new ChineseTable();
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
	public ChineseTable() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Table6");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChOrder nw1 =new ChOrder("Chin","Bhan","Lue");                                         //
				 nw1.NewScreen1();  
				 close();//
			
				
				
			}
		});
		btnNewButton.setBounds(22, 59, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Table8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChOrder nw1 =new ChOrder("Thom","Sam","Cam");                                         //
				 nw1.NewScreen1();                                                    //
				 close();
				 
				
			}
		});
		btnNewButton_1.setBounds(22, 193, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Table 7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChOrder nw1 =new ChOrder("Mun","Jam","Flun");                                         //
				 nw1.NewScreen1();                                                    //
			
				 close();
				
			}
		});
		btnNewButton_2.setBounds(283, 59, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Table9");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChOrder nw1 =new ChOrder("Loc","Nack","Phun");                                         //
				 nw1.NewScreen1();                                                    //
			
				 close();
			}
		});
		btnNewButton_3.setBounds(283, 193, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Table 10");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChOrder nw1 =new ChOrder("Den","Lusi","kit");                                         //
				 nw1.NewScreen1();                                                    //
				 close();
				
				
			}
		});
		btnNewButton_4.setBounds(125, 108, 157, 52);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Choose a table");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 101, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Executive Chef :Chong");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(261, 6, 163, 23);
		contentPane.add(lblNewLabel_1);
	}

}
