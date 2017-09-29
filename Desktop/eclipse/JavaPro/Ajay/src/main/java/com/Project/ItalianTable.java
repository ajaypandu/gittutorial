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

public class ItalianTable extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItalianTable frame = new ItalianTable();
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
	public ItalianTable() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Table 11");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ItOrder nw2 =new ItOrder("Manager1","Server1","Chef1");                                         //
				 nw2.NewScreen2();                                                    //
				 close();
				
				
			}
		});
		btnNewButton.setBounds(38, 49, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Table 13");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ItOrder nw2 =new ItOrder("Manager1","Server1","Chef1");                                         //
				 nw2.NewScreen2();                                                    //
				 close();
			}
		});
		btnNewButton_1.setBounds(83, 115, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Table 12");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ItOrder nw2 =new ItOrder("Manager1","Server1","Chef1");                                         //
				 nw2.NewScreen2();                                                    //
				 close();
			}
		});
		btnNewButton_2.setBounds(280, 49, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Table 14");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ItOrder nw2 =new ItOrder("Manager1","Server1","Chef1");                                         //
				 nw2.NewScreen2();                                                    //
				 close();
			}
		});
		btnNewButton_3.setBounds(248, 115, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Table 15");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ItOrder nw2 =new ItOrder("Manager1","Server1","Chef1");                                         //
				 nw2.NewScreen2();                                                    //
				 close();
			}
		});
		btnNewButton_4.setBounds(166, 182, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Choose a table");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 106, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Executive Chef :Thomas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(258, 11, 166, 14);
		contentPane.add(lblNewLabel_1);
	}

}
