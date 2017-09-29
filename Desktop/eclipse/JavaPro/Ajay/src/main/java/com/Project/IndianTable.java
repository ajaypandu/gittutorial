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

public class IndianTable extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndianTable frame = new IndianTable();
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
	public IndianTable() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		JButton btnTable = new JButton("Table 1");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 InOrder nw =new InOrder("Raj","Konda","Mitra");                                              //
				 nw.NewScreen(); 
				 close();//
							}
		});
		btnTable.setBounds(33, 54, 89, 23);
		contentPane.add(btnTable);
		
		JButton btnTable_1 = new JButton("Table2");
		btnTable_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 InOrder nw =new InOrder("Ravi","Govind","Bhujam");                                           //
				 nw.NewScreen();
				 close();//
			}
		});
		btnTable_1.setBounds(33, 227, 89, 23);
		contentPane.add(btnTable_1);
		
		JButton btnTable_2 = new JButton("Table3");
		btnTable_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 InOrder nw =new InOrder("Kailesh","Rishi","Padma");                                           //
				 nw.NewScreen();         
				 close();//
			}
		});
		btnTable_2.setBounds(368, 54, 89, 23);
		contentPane.add(btnTable_2);
		
		JButton btnTable_3 = new JButton("Table4");
		btnTable_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 InOrder nw =new InOrder("Megha","Dinesh","Mohan");                                         //
				 nw.NewScreen();   
				 close();//
			}
		});
		btnTable_3.setBounds(368, 227, 89, 23);
		contentPane.add(btnTable_3);
		
		JButton btnNewButton = new JButton("Table5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 InOrder nw =new InOrder("Gnani","Praveen","Harish");                                         //   
				 nw.NewScreen();	
				 close();//
			}
		});
		btnNewButton.setBounds(166, 114, 157, 67);
		contentPane.add(btnNewButton);
		
		JLabel lblChooseTheTable = new JLabel("Choose a table");
		lblChooseTheTable.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChooseTheTable.setBounds(10, 12, 102, 14);
		contentPane.add(lblChooseTheTable);
		
		JLabel lblExecutiveChef = new JLabel("Executive Chef : Kumar");
		lblExecutiveChef.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblExecutiveChef.setBounds(307, 11, 167, 14);
		contentPane.add(lblExecutiveChef);
	}

}
