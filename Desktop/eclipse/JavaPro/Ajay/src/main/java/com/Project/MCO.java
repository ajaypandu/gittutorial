package com.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MCO {

	private JFrame frame;
	private JTextField txtManchuria;
	private JTextField txtKerabuSalad;
	private JTextField txtEggDropSoup;
	private JTextField txtCapreseSalad;
	private JTextField txtFriedRice;
	private JTextField txtChickenScallopini;
	private JTextField txtKungPaoChicken;
	private JTextField txtAcar;
	private JTextField txtGulabJamun;
	private JTextField txtAiskacang;
	private JTextField txtPanettone;
	public  String Manager;
	public   String Server;
	
	
	public double  Manchuria=50;                               //
	public double KerabuSalad=50;
	public double  EggDropSoup=60;                               //
	public double CapreseSalad=70;
	public double  FriedRice=55;                               //
	public double ChickenScallopini=65;
	public double  KungPaoChicken=80;                               //
	public double Acar=100;
	public double GulabJamun=10;                               //
	public double Aiskacang=20;
	public double Panettone=20;
	

	/**
	 * Launch the application.
	 */
	public     void NewScreen4() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MCO window = new MCO(Manager, Server );
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
	public MCO(String a1,String a2) {
		Manager=a1;
		Server=a2;
		
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
				txtCapreseSalad.setEnabled(false);txtCapreseSalad.setText("0");
				txtManchuria.setEnabled(false);txtManchuria.setText("0");
				txtKerabuSalad.setEnabled(false);txtKerabuSalad.setText("0");        //
				txtEggDropSoup.setEnabled(false);txtEggDropSoup.setText("0");
				txtChickenScallopini.setEnabled(false);txtChickenScallopini.setText("0");
				txtFriedRice.setEnabled(false);txtFriedRice.setText("0");
				txtChickenScallopini.setEnabled(false);txtChickenScallopini.setText("0");
				txtKungPaoChicken.setEnabled(false);txtKungPaoChicken.setText("0");
				txtAcar.setEnabled(false);txtAcar.setText("0");
				txtGulabJamun.setEnabled(false);txtGulabJamun.setText("0");
				txtPanettone.setEnabled(false);txtPanettone.setText("0");
				txtAiskacang.setEnabled(false);txtAiskacang.setText("0");
			}
		});
		frame.setBounds(0, 0, 1000, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMulticuisineMenu = new JLabel("MULTICUISINE MENU");
		lblMulticuisineMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMulticuisineMenu.setBounds(376, 11, 236, 31);
		frame.getContentPane().add(lblMulticuisineMenu);
		
		JLabel lblNewLabel = new JLabel("STARTERS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 115, 97, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MAIN COURSE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 217, 131, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DESERTS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 319, 89, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblSGST = new JLabel("");
		lblSGST.setBounds(899, 339, 46, 14);
		frame.getContentPane().add(lblSGST);
		
		JLabel lblCGST = new JLabel("");
		lblCGST.setBounds(899, 364, 46, 14);
		frame.getContentPane().add(lblCGST);
		
		JLabel lblCost = new JLabel("");
		lblCost.setBounds(899, 392, 46, 14);
		frame.getContentPane().add(lblCost);
		
		JCheckBox chckbxManchuria = new JCheckBox("Manchuria");
		chckbxManchuria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxManchuria.isSelected())                                //
				{
					txtManchuria.setEnabled(true);
					txtManchuria.setText("0");
					txtManchuria.requestFocus();
				}
				else
				{
					txtManchuria.setEnabled(false);
					txtManchuria.setText("");
				}                  
			}
		});
		chckbxManchuria.setBounds(10, 151, 97, 23);
		frame.getContentPane().add(chckbxManchuria);
		
		txtManchuria = new JTextField();
		txtManchuria.setBounds(109, 152, 32, 20);
		frame.getContentPane().add(txtManchuria);
		txtManchuria.setColumns(10);
		
		JCheckBox chckbxKerabuSalad = new JCheckBox("KerabuSalad");
		chckbxKerabuSalad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxKerabuSalad.isSelected())                                //
				{
					txtKerabuSalad.setEnabled(true);
					txtKerabuSalad.setText("0");
					txtKerabuSalad.requestFocus();
				}
				else
				{
					txtKerabuSalad.setEnabled(false);
					txtKerabuSalad.setText("");
				}                  
				
			}
		});
		chckbxKerabuSalad.setBounds(251, 151, 138, 23);
		frame.getContentPane().add(chckbxKerabuSalad);
		
		txtKerabuSalad = new JTextField();
		txtKerabuSalad.setBounds(394, 152, 32, 20);
		frame.getContentPane().add(txtKerabuSalad);
		txtKerabuSalad.setColumns(10);
		
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
				}                  
				
			}
		});
		chckbxEggDropSoup.setBounds(517, 151, 117, 23);
		frame.getContentPane().add(chckbxEggDropSoup);
		
		txtEggDropSoup = new JTextField();
		txtEggDropSoup.setBounds(647, 152, 32, 20);
		frame.getContentPane().add(txtEggDropSoup);
		txtEggDropSoup.setColumns(10);
		
		JCheckBox chckbxCapreseSalad = new JCheckBox("CapreseSalad");
		chckbxCapreseSalad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCapreseSalad.isSelected())                                //
				{
					txtCapreseSalad.setEnabled(true);
					txtCapreseSalad.setText("0");
					txtCapreseSalad.requestFocus();
				}
				else
				{
					txtCapreseSalad.setEnabled(false);
					txtCapreseSalad.setText("");
				}                  
			}
		});
		chckbxCapreseSalad.setBounds(756, 151, 106, 23);
		frame.getContentPane().add(chckbxCapreseSalad);
		
		txtCapreseSalad = new JTextField();
		txtCapreseSalad.setBounds(864, 152, 32, 20);
		frame.getContentPane().add(txtCapreseSalad);
		txtCapreseSalad.setColumns(10);
		
		JCheckBox chckbxFriedRice = new JCheckBox("FriedRice");
		chckbxFriedRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxFriedRice.isSelected())                                //
				{
					txtFriedRice.setEnabled(true);
					txtFriedRice.setText("0");
					txtFriedRice.requestFocus();
				}
				else
				{
					txtFriedRice.setEnabled(false);
					txtFriedRice.setText("");
				}                  
			}
		});
		chckbxFriedRice.setBounds(6, 253, 97, 23);
		frame.getContentPane().add(chckbxFriedRice);
		
		JCheckBox chckbxGulabJamun = new JCheckBox("GulabJamun");
		chckbxGulabJamun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(chckbxGulabJamun.isSelected())                                //
					{
						txtGulabJamun.setEnabled(true);
						txtGulabJamun.setText("0");
						txtGulabJamun.requestFocus();
					}
					else
					{
						txtGulabJamun.setEnabled(false);
						txtGulabJamun.setText("");
					}                  
			}
		});
		chckbxGulabJamun.setBounds(10, 355, 97, 23);
		frame.getContentPane().add(chckbxGulabJamun);
		
		txtFriedRice = new JTextField();
		txtFriedRice.setBounds(108, 254, 32, 20);
		frame.getContentPane().add(txtFriedRice);
		txtFriedRice.setColumns(10);
		
		JCheckBox chckbxChickenScallopini = new JCheckBox("ChickenScallopini");
		chckbxChickenScallopini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxChickenScallopini.isSelected())                                //
				{
					txtChickenScallopini.setEnabled(true);
					txtChickenScallopini.setText("0");
					txtChickenScallopini.requestFocus();
				}
				else
				{
					txtChickenScallopini.setEnabled(false);
					txtChickenScallopini.setText("");
				}                  
			}
		});
		chckbxChickenScallopini.setBounds(251, 251, 137, 23);
		frame.getContentPane().add(chckbxChickenScallopini);
		
		txtChickenScallopini = new JTextField();
		txtChickenScallopini.setBounds(394, 254, 32, 20);
		frame.getContentPane().add(txtChickenScallopini);
		txtChickenScallopini.setColumns(10);
		
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
				}                  
			}
		});
		chckbxKungPaoChicken.setBounds(517, 253, 124, 23);
		frame.getContentPane().add(chckbxKungPaoChicken);
		
		txtKungPaoChicken = new JTextField();
		txtKungPaoChicken.setBounds(647, 254, 32, 20);
		frame.getContentPane().add(txtKungPaoChicken);
		txtKungPaoChicken.setColumns(10);
		
		JCheckBox chckbxAcar = new JCheckBox("Acar");
		chckbxAcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAcar.isSelected())                                //
				{
					txtAcar.setEnabled(true);
					txtAcar.setText("0");
					txtAcar.requestFocus();
				}
				else
				{
					txtAcar.setEnabled(false);
					txtAcar.setText("");
				}                  
			}
		});
		chckbxAcar.setBounds(756, 253, 106, 23);
		frame.getContentPane().add(chckbxAcar);
		
		txtAcar = new JTextField();
		txtAcar.setBounds(864, 254, 32, 20);
		frame.getContentPane().add(txtAcar);
		txtAcar.setColumns(10);
		
		txtGulabJamun = new JTextField();
		txtGulabJamun.setBounds(109, 356, 32, 20);
		frame.getContentPane().add(txtGulabJamun);
		txtGulabJamun.setColumns(10);
		
		JCheckBox chckbxAiskacang = new JCheckBox("Aiskacang");
		chckbxAiskacang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAiskacang.isSelected())                                //
				{
					txtAiskacang.setEnabled(true);
					txtAiskacang.setText("0");
					txtAiskacang.requestFocus();
				}
				else
				{
					txtAiskacang.setEnabled(false);
					txtAiskacang.setText("");
				}                  
			}
		});
		chckbxAiskacang.setBounds(251, 355, 124, 23);
		frame.getContentPane().add(chckbxAiskacang);
		
		txtAiskacang = new JTextField();
		txtAiskacang.setBounds(394, 356, 32, 20);
		frame.getContentPane().add(txtAiskacang);
		txtAiskacang.setColumns(10);
		
		JCheckBox chckbxPanettone = new JCheckBox("Panettone");
		chckbxPanettone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPanettone.isSelected())                                //
				{
					txtPanettone.setEnabled(true);
					txtPanettone.setText("0");
					txtPanettone.requestFocus();
				}
				else
				{
					txtPanettone.setEnabled(false);
					txtPanettone.setText("");
				}                  
			}
		});
		chckbxPanettone.setBounds(517, 355, 115, 23);
		frame.getContentPane().add(chckbxPanettone);
		
		txtPanettone = new JTextField();
		txtPanettone.setBounds(647, 356, 32, 20);
		frame.getContentPane().add(txtPanettone);
		txtPanettone.setColumns(10);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtManchuria.setText(null);
				txtKerabuSalad.setText(null);
				txtEggDropSoup.setText(null);
				txtCapreseSalad.setText(null);
				txtFriedRice.setText(null);
				txtChickenScallopini.setText(null);
				txtKungPaoChicken.setText(null);
				txtAcar.setText(null);
				txtGulabJamun.setText(null);
				txtAiskacang.setText(null);
				txtPanettone.setText(null);
				
				
				
				chckbxManchuria.setSelected(false);				
				chckbxKerabuSalad.setSelected(false);
				chckbxEggDropSoup.setSelected(false);
				chckbxCapreseSalad.setSelected(false);
				chckbxFriedRice.setSelected(false);
				chckbxChickenScallopini.setSelected(false);								
				chckbxKungPaoChicken.setSelected(false);
				chckbxAcar.setSelected(false);
				chckbxGulabJamun.setSelected(false);
				chckbxAiskacang.setSelected(false);
				chckbxPanettone.setSelected(false);
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(885, 19, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Total");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double mCost=EggDropSoup*Double.parseDouble(txtEggDropSoup.getText());                     // 	
				double frCost=Manchuria*Double.parseDouble(txtManchuria.getText());
				double sCost=KerabuSalad*Double.parseDouble(txtKerabuSalad.getText());                     // 	
				double chCost=CapreseSalad*Double.parseDouble(txtCapreseSalad.getText());
				double aCost=FriedRice*Double.parseDouble(txtFriedRice.getText());                     // 	
				double brCost=ChickenScallopini*Double.parseDouble(txtChickenScallopini.getText());
				double nCost=KungPaoChicken*Double.parseDouble(txtKungPaoChicken.getText());                     // 	
				double birCost=Acar*Double.parseDouble(txtAcar.getText());
				double rCost=GulabJamun*Double.parseDouble(txtGulabJamun.getText());                     // 	
				double narCost=Aiskacang *Double.parseDouble(txtAiskacang .getText());
				double pCost=Panettone *Double.parseDouble(txtPanettone .getText());
				                    // 	
				
				
				double Total= mCost+frCost+ sCost+chCost+aCost+brCost+nCost+birCost+rCost+narCost+ pCost;
				
				double tax=((Total*9)/100);
				String SGST= String.format("Rs %.2f", tax);
				
					lblCGST.setText(SGST);
					lblSGST.setText(SGST);
				 
				String T= String.format("Rs %.2f", Total+tax+tax);
				 	 
				 
				lblCost.setText(T);                  
			}
		});
		btnNewButton_1.setBounds(768, 388, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("Manager :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 51, 70, 23);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblManager = new JLabel("New label");
		lblManager.setBounds(77, 56, 46, 14);
		frame.getContentPane().add(lblManager);
		lblManager.setText(Manager);
		
		JLabel lblNewLabel_4 = new JLabel("Server :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(195, 51, 53, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblServer = new JLabel("New label");
		lblServer.setBounds(251, 56, 77, 14);
		frame.getContentPane().add(lblServer);
		lblServer.setText(Server);
		
		JButton btnNewButton_2 = new JButton("FeedBack");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FeedBackForm p= new FeedBackForm();
				p.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(885, 56, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("SGST-9%");
		lblNewLabel_5.setBounds(768, 339, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("CGST-9%");
		lblNewLabel_6.setBounds(768, 364, 53, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		
		
	}

}
