package com.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class ChOrder {

	private JFrame frame;
	private JTextField txtEggDropSoup;
	private JTextField txtPorkRibs;
	private JTextField txtCrispyCrab;
	private JTextField txtSpringRolls;
	private JTextField txtKungPaoChicken;
	private JTextField txtGingerVeggie;
	private JTextField txtSpicyChicken;
	private JTextField txtPepperBeef;
	private JTextField txtBananaRoll;
	private JTextField txtCoconutBar;
	public  String Manager;
	public   String Server;
	public   String LineCook;
	private JLabel lblSGST;
	private JLabel lblCGST;
	private JLabel lblCost;
	
	
	public double  EggDropSoup=50;                               //
	public double PorkRibs=50;
	public double  CrispyCrab=60;                               //
	public double SpringRolls=70;
	public double  KungPaoChicken=55;                               //
	public double GingerVeggie=65;
	public double  SpicyChicken=80;                               //
	public double PepperBeef=100;
	public double BananaRoll=10;                               //
	public double CoconutBar=20;
	                        //
	

	/**
	 * Launch the application.
	 */
	public   void NewScreen1() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChOrder window = new ChOrder(Manager, Server, LineCook);
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
	public ChOrder(String a1,String a2,String a3) {
		Manager=a1;
		Server=a2;
		LineCook=a3;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
				txtEggDropSoup.setEnabled(false);txtEggDropSoup.setText("0");
				txtPorkRibs.setEnabled(false);txtPorkRibs.setText("0");
				txtCrispyCrab.setEnabled(false); txtCrispyCrab.setText("0");
				txtSpringRolls.setEnabled(false);txtSpringRolls.setText("0");
				txtKungPaoChicken.setEnabled(false);txtKungPaoChicken.setText("0");
				txtGingerVeggie.setEnabled(false);txtGingerVeggie.setText("0");
				txtSpicyChicken.setEnabled(false);txtSpicyChicken.setText("0");
				txtPepperBeef.setEnabled(false);txtPepperBeef.setText("0");
				txtBananaRoll.setEnabled(false);txtBananaRoll.setText("0");
				txtCoconutBar.setEnabled(false);txtCoconutBar.setText("0");
			}
		});
		frame.setBounds(0, 0, 1000, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		JLabel lblSGST = new JLabel("");
		lblSGST.setBounds(895, 342, 60, 14);
		frame.getContentPane().add(lblSGST);
		
		JLabel lblCGST = new JLabel("");
		lblCGST.setBounds(895, 363, 60, 14);
		frame.getContentPane().add(lblCGST);
		
		JLabel lblCost = new JLabel("");
		lblCost.setBounds(895, 386, 79, 25);
		frame.getContentPane().add(lblCost);
		
		JLabel lblNewLabel = new JLabel("CHINESE MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(389, 11, 182, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("STARTERS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 104, 88, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox chckbxEggDropSoup = new JCheckBox("EggDropSoup");
		chckbxEggDropSoup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxEggDropSoup.isSelected())                                //
				{
					txtEggDropSoup.setEnabled(true);
					txtEggDropSoup.setText("0");
					txtEggDropSoup.requestFocus();
				}
				else
				{
					txtEggDropSoup.setEnabled(false);
					txtEggDropSoup.setText("");
				}                                                                //
				
				
				
				
				
			}
		});
		chckbxEggDropSoup.setBounds(10, 160, 119, 23);
		frame.getContentPane().add(chckbxEggDropSoup);
		
		txtEggDropSoup = new JTextField();
		txtEggDropSoup.setBounds(140, 161, 32, 20);
		frame.getContentPane().add(txtEggDropSoup);
		txtEggDropSoup.setColumns(10);
		
		JCheckBox chckbxPorkRibs = new JCheckBox("PorkRibs");
		chckbxPorkRibs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPorkRibs.isSelected())                                //
				{
					txtPorkRibs.setEnabled(true);
					txtPorkRibs.setText("0");
					txtPorkRibs.requestFocus();
				}
				else
				{
					txtPorkRibs.setEnabled(false);
					txtPorkRibs.setText("");
				}                                                                //
				
				
			}
		});
		chckbxPorkRibs.setBounds(249, 160, 88, 23);
		frame.getContentPane().add(chckbxPorkRibs);
		
		txtPorkRibs = new JTextField();
		txtPorkRibs.setBounds(339, 161, 32, 20);
		frame.getContentPane().add(txtPorkRibs);
		txtPorkRibs.setColumns(10);
		
		JCheckBox chckbxCrispyCrab = new JCheckBox("CrispyCrab");
		chckbxCrispyCrab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCrispyCrab.isSelected())                                //
				{
					txtCrispyCrab.setEnabled(true);
					txtCrispyCrab.setText("0");
					txtCrispyCrab.requestFocus();
				}
				else
				{
					txtCrispyCrab.setEnabled(false);
					txtCrispyCrab.setText("");
				}                                                                //
				
			}
		});
		chckbxCrispyCrab.setBounds(502, 160, 97, 23);
		frame.getContentPane().add(chckbxCrispyCrab);
		
		txtCrispyCrab = new JTextField();
		txtCrispyCrab.setBounds(605, 161, 32, 20);
		frame.getContentPane().add(txtCrispyCrab);
		txtCrispyCrab.setColumns(10);
		
		JCheckBox chckbxSpringRolls = new JCheckBox("SpringRolls");
		chckbxSpringRolls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpringRolls.isSelected())                                //
				{
					txtSpringRolls.setEnabled(true);
					txtSpringRolls.setText("0");
					txtSpringRolls.requestFocus();
				}
				else
				{
					txtSpringRolls.setEnabled(false);
					txtSpringRolls.setText("");
				}                                                                //
			}
		});
		chckbxSpringRolls.setBounds(708, 160, 97, 23);
		frame.getContentPane().add(chckbxSpringRolls);
		
		txtSpringRolls = new JTextField();
		txtSpringRolls.setBounds(811, 161, 32, 20);
		frame.getContentPane().add(txtSpringRolls);
		txtSpringRolls.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MAIN COURSE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 233, 119, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JCheckBox chckbxKungPaoChicken = new JCheckBox("KungPaoChicken");
		chckbxKungPaoChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxKungPaoChicken.isSelected())                                //
				{
					txtKungPaoChicken.setEnabled(true);
					txtKungPaoChicken.setText("0");
					txtKungPaoChicken.requestFocus();
				}
				else
				{
					txtKungPaoChicken.setEnabled(false);
					txtKungPaoChicken.setText("");
				}                                                                //
			}
		});
		chckbxKungPaoChicken.setBounds(10, 298, 133, 23);
		frame.getContentPane().add(chckbxKungPaoChicken);
		
		txtKungPaoChicken = new JTextField();
		txtKungPaoChicken.setBounds(154, 299, 32, 20);
		frame.getContentPane().add(txtKungPaoChicken);
		txtKungPaoChicken.setColumns(10);
		
		JCheckBox chckbxGingerVeggie = new JCheckBox("GingerVeggie");
		chckbxGingerVeggie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxGingerVeggie.isSelected())                                //
				{
					txtGingerVeggie.setEnabled(true);
					txtGingerVeggie.setText("0");
					txtGingerVeggie.requestFocus();
				}
				else
				{
					txtGingerVeggie.setEnabled(false);
					txtGingerVeggie.setText("");
				}                                                                //
			}
		});
		chckbxGingerVeggie.setBounds(248, 298, 109, 23);
		frame.getContentPane().add(chckbxGingerVeggie);
		
		txtGingerVeggie = new JTextField();
		txtGingerVeggie.setBounds(361, 299, 32, 20);
		frame.getContentPane().add(txtGingerVeggie);
		txtGingerVeggie.setColumns(10);
		
		JCheckBox chckbxSpicyChicken = new JCheckBox("SpicyChicken");
		chckbxSpicyChicken.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpicyChicken.isSelected())                                //
				{
					txtSpicyChicken.setEnabled(true);
					txtSpicyChicken.setText("0");
					txtSpicyChicken.requestFocus();
				}
				else
				{
					txtSpicyChicken.setEnabled(false);
					txtSpicyChicken.setText("");
				}                                                                //
			}
		});
		chckbxSpicyChicken.setBounds(530, 298, 109, 23);
		frame.getContentPane().add(chckbxSpicyChicken);
		
		txtSpicyChicken = new JTextField();
		txtSpicyChicken.setBounds(628, 299, 32, 20);
		frame.getContentPane().add(txtSpicyChicken);
		txtSpicyChicken.setColumns(10);
		
		JCheckBox chckbxPepperBeef = new JCheckBox("PepperBeef");
		chckbxPepperBeef.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPepperBeef.isSelected())                                //
				{
					txtPepperBeef.setEnabled(true);
					txtPepperBeef.setText("0");
					txtPepperBeef.requestFocus();
				}
				else
				{
					txtPepperBeef.setEnabled(false);
					txtPepperBeef.setText("");
				}                                                                //
				
			}
		});
		chckbxPepperBeef.setBounds(708, 298, 97, 23);
		frame.getContentPane().add(chckbxPepperBeef);
		
		txtPepperBeef = new JTextField();
		txtPepperBeef.setBounds(811, 299, 32, 20);
		frame.getContentPane().add(txtPepperBeef);
		txtPepperBeef.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DESERTS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 354, 88, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chckbxBananaRoll = new JCheckBox("BananaRoll");
		chckbxBananaRoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBananaRoll.isSelected())                                //
				{
					txtBananaRoll.setEnabled(true);
					txtBananaRoll.setText("0");
					txtBananaRoll.requestFocus();
				}
				else
				{
					txtBananaRoll.setEnabled(false);
					txtBananaRoll.setText("");
				}                                                                //
				
			}
		});
		chckbxBananaRoll.setBounds(10, 381, 97, 23);
		frame.getContentPane().add(chckbxBananaRoll);
		
		txtBananaRoll = new JTextField();
		txtBananaRoll.setBounds(113, 382, 32, 20);
		frame.getContentPane().add(txtBananaRoll);
		txtBananaRoll.setColumns(10);
		
		JCheckBox chckbxCoconutBar = new JCheckBox("CoconutBar ");
		chckbxCoconutBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCoconutBar .isSelected())                                //
				{
					txtCoconutBar .setEnabled(true);
					txtCoconutBar .setText("0");
					txtCoconutBar .requestFocus();
				}
				else
				{
					txtCoconutBar .setEnabled(false);
					txtCoconutBar .setText("");
				}                                                                //
			}
		});
		chckbxCoconutBar.setBounds(154, 381, 97, 23);
		frame.getContentPane().add(chckbxCoconutBar);
		
		txtCoconutBar = new JTextField();
		txtCoconutBar.setBounds(259, 382, 32, 20);
		frame.getContentPane().add(txtCoconutBar);
		txtCoconutBar.setColumns(10);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtEggDropSoup.setText(null);
				txtSpringRolls.setText(null);
				txtPorkRibs.setText(null);
				txtCrispyCrab.setText(null);
				txtKungPaoChicken.setText(null);
				txtGingerVeggie.setText(null);
				txtSpicyChicken.setText(null);
				txtPepperBeef.setText(null);
				txtBananaRoll.setText(null);
				txtCoconutBar.setText(null);
				
				
				
				chckbxEggDropSoup.setSelected(false);				
				chckbxPorkRibs.setSelected(false);
				chckbxSpringRolls.setSelected(false);
				chckbxCrispyCrab.setSelected(false);
				chckbxKungPaoChicken.setSelected(false);
				chckbxGingerVeggie.setSelected(false);								
				chckbxSpicyChicken.setSelected(false);
				chckbxPepperBeef.setSelected(false);
				chckbxBananaRoll.setSelected(false);
				chckbxCoconutBar.setSelected(false);
				
				
				
			}
		});
		btnNewButton.setBounds(865, 55, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Manager :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(25, 58, 74, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblManager = new JLabel("New label");
		lblManager.setBounds(97, 59, 46, 14);
		frame.getContentPane().add(lblManager);
		lblManager.setText(Manager);
		
		JLabel lblNewLabel_6 = new JLabel("Server :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(361, 58, 60, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblServer = new JLabel("New label");
		lblServer.setBounds(426, 59, 46, 14);
		frame.getContentPane().add(lblServer);
		lblServer.setText(Server);
		
		JLabel lblNewLabel_7 = new JLabel("LineCook :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(690, 58, 66, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblLineCook = new JLabel("New label");
		lblLineCook.setBounds(760, 59, 46, 14);
		frame.getContentPane().add(lblLineCook);
		lblLineCook.setText(LineCook);
		
		JButton btnCost = new JButton("Total");
		btnCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double mCost=EggDropSoup*Double.parseDouble(txtEggDropSoup.getText());                     // 	
				double frCost=PorkRibs*Double.parseDouble(txtPorkRibs.getText());
				double sCost=CrispyCrab*Double.parseDouble(txtCrispyCrab.getText());                     // 	
				double chCost=SpringRolls*Double.parseDouble(txtSpringRolls.getText());
				double aCost=GingerVeggie*Double.parseDouble(txtGingerVeggie.getText());                     // 	
				double brCost=SpicyChicken*Double.parseDouble(txtSpicyChicken.getText());
				double nCost=KungPaoChicken*Double.parseDouble(txtKungPaoChicken.getText());                     // 	
				double birCost=PepperBeef*Double.parseDouble(txtPepperBeef.getText());
				double rCost=BananaRoll*Double.parseDouble(txtBananaRoll.getText());                     // 	
				double narCost=CoconutBar *Double.parseDouble(txtCoconutBar .getText());
				                    // 	
				
				
				double Total= mCost+frCost+ sCost+chCost+aCost+brCost+nCost+birCost+rCost+narCost;
				double tax=((Total*9)/100);
				String SGST= String.format("Rs %.2f", tax);
				
					lblCGST.setText(SGST);
					lblSGST.setText(SGST);
				 
				String T= String.format("Rs %.2f", Total+tax+tax);
				 	 
				 lblCost.setText(T);            
				
				
				
				
			}
		});
		btnCost.setBounds(784, 388, 89, 23);
		frame.getContentPane().add(btnCost);
		
		JLabel lblNewLabel_4 = new JLabel("SGST- 9%");
		lblNewLabel_4.setBounds(784, 342, 66, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_8 = new JLabel("CGST-9%");
		lblNewLabel_8.setBounds(784, 363, 66, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		
		JButton btnNewButton_1 = new JButton("FeedBack");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FeedBackForm p= new FeedBackForm();
				p.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(865, 89, 109, 23);
		frame.getContentPane().add(btnNewButton_1);
		
	}
}
