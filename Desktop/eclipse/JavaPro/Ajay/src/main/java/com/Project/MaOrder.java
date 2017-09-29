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

public class MaOrder {

	private JFrame frame;
	private JTextField txtKerabuSalad;
	private JTextField txtKaripapPusing;
	private JTextField txtPrawnFritters;
	private JTextField txtSatay;
	private JTextField txtAcar;
	private JTextField txtKampungFriedRice;
	private JTextField txtChowFriedRice;
	private JTextField txtAiskacang;
	private JTextField txtGorengPisang;
	private JLabel lblCost;
	public String Manager;
	public  String Server;
	public  String LineCook;
	
	public double  KerabuSalad=50;                               //
	public double KaripapPusing=50;
	public double  PrawnFritters=60;                               //
	public double Satay=70;
	public double  Acar=55;                               //
	public double KampungFriedRice=65;
	public double  ChowFriedRice=80;                               //
	public double Aiskacang=100;
	public double  GorengPisang=10;                               //
	
	
	

	/**
	 * Launch the application.
	 */
	public  void NewScreen3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaOrder window = new MaOrder(Manager, Server, LineCook);
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
	public MaOrder(String a1,String a2,String a3) {
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
				txtKerabuSalad.setEnabled(false);txtKerabuSalad.setText("0");
				txtKaripapPusing.setEnabled(false);txtKaripapPusing.setText("0");
				txtPrawnFritters.setEnabled(false);txtPrawnFritters.setText("0");                                     //
				txtSatay.setEnabled(false);txtSatay.setText("0");
				txtAcar.setEnabled(false);txtAcar.setText("0");
				txtKampungFriedRice.setEnabled(false);txtKampungFriedRice.setText("0");
				txtChowFriedRice.setEnabled(false);txtChowFriedRice.setText("0");
				txtAiskacang.setEnabled(false);txtAiskacang.setText("0");
				txtGorengPisang.setEnabled(false);txtGorengPisang.setText("0");
				
			}
		});
		frame.setBounds(0, 0, 1000, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MALAYSIAN MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(427, 11, 218, 25);
		frame.getContentPane().add(lblNewLabel);
		JLabel lblCGST = new JLabel("");
		lblCGST.setBounds(860, 352, 46, 14);
		frame.getContentPane().add(lblCGST);
		
		JLabel lblSGST = new JLabel("");
		lblSGST.setBounds(860, 318, 46, 14);
		frame.getContentPane().add(lblSGST);
		
		JLabel lblCost = new JLabel("");
		lblCost.setBounds(860, 377, 64, 23);
		frame.getContentPane().add(lblCost);
		
		JLabel lblNewLabel_1 = new JLabel("STARTERS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 81, 126, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
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
				}                                                                //
				
			}
		});
		chckbxKerabuSalad.setBounds(10, 131, 126, 23);
		frame.getContentPane().add(chckbxKerabuSalad);
		
		txtKerabuSalad = new JTextField();
		txtKerabuSalad.setBounds(136, 132, 32, 20);
		frame.getContentPane().add(txtKerabuSalad);
		txtKerabuSalad.setColumns(10);
		
		JCheckBox chckbxKaripapPusing = new JCheckBox("KaripapPusing");
		chckbxKaripapPusing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxKaripapPusing.isSelected())                                //
				{
					txtKaripapPusing.setEnabled(true);
					txtKaripapPusing.setText("0");
					txtKaripapPusing.requestFocus();
				}
				else
				{
					txtKaripapPusing.setEnabled(false);
					txtKaripapPusing.setText("");
				}                                                                //
				
			}
		});
		chckbxKaripapPusing.setBounds(290, 131, 126, 23);
		frame.getContentPane().add(chckbxKaripapPusing);
		
		txtKaripapPusing = new JTextField();
		txtKaripapPusing.setBounds(417, 132, 32, 20);
		frame.getContentPane().add(txtKaripapPusing);
		txtKaripapPusing.setColumns(10);
		
		JCheckBox chckbxPrawnFritters = new JCheckBox("PrawnFritters");
		chckbxPrawnFritters.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPrawnFritters.isSelected())                                //
				{
					txtPrawnFritters.setEnabled(true);
					txtPrawnFritters.setText("0");
					txtPrawnFritters.requestFocus();
				}
				else
				{
					txtPrawnFritters.setEnabled(false);
					txtPrawnFritters.setText("");
				}                                                                //
			}
		});
		chckbxPrawnFritters.setBounds(547, 131, 126, 23);
		frame.getContentPane().add(chckbxPrawnFritters);
		
		txtPrawnFritters = new JTextField();
		txtPrawnFritters.setBounds(696, 132, 32, 20);
		frame.getContentPane().add(txtPrawnFritters);
		txtPrawnFritters.setColumns(10);
		
		JCheckBox chckbxSatay = new JCheckBox("Satay");
		chckbxSatay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSatay.isSelected())                                //
				{
					txtSatay.setEnabled(true);
					txtSatay.setText("0");
					txtSatay.requestFocus();
				}
				else
				{
					txtSatay.setEnabled(false);
					txtSatay.setText("");
				}                                                                //
				
			}
		});
		chckbxSatay.setBounds(790, 131, 64, 23);
		frame.getContentPane().add(chckbxSatay);
		
		txtSatay = new JTextField();
		txtSatay.setBounds(860, 132, 32, 20);
		frame.getContentPane().add(txtSatay);
		txtSatay.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MAIN COURSE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 194, 126, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
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
				}                                                                //
			}
		});
		chckbxAcar.setBounds(6, 242, 97, 23);
		frame.getContentPane().add(chckbxAcar);
		
		txtAcar = new JTextField();
		txtAcar.setBounds(104, 243, 32, 20);
		frame.getContentPane().add(txtAcar);
		txtAcar.setColumns(10);
		
		JCheckBox chckbxKampungFriedRice = new JCheckBox("KampungFriedRice");
		chckbxKampungFriedRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxKampungFriedRice.isSelected())                                //
				{
					txtKampungFriedRice.setEnabled(true);
					txtKampungFriedRice.setText("0");
					txtKampungFriedRice.requestFocus();
				}
				else
				{
					txtKampungFriedRice.setEnabled(false);
					txtKampungFriedRice.setText("");
				}                                                                //
			}
		});
		chckbxKampungFriedRice.setBounds(226, 242, 140, 23);
		frame.getContentPane().add(chckbxKampungFriedRice);
		
		txtKampungFriedRice = new JTextField();
		txtKampungFriedRice.setBounds(384, 243, 32, 21);
		frame.getContentPane().add(txtKampungFriedRice);
		txtKampungFriedRice.setColumns(10);
		
		JCheckBox chckbxChowFriedRice = new JCheckBox("ChowFriedRice");
		chckbxChowFriedRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxChowFriedRice.isSelected())                                //
				{
					txtChowFriedRice.setEnabled(true);
					txtChowFriedRice.setText("0");
					txtChowFriedRice.requestFocus();
				}
				else
				{
					txtChowFriedRice.setEnabled(false);
					txtChowFriedRice.setText("");
				}                                                                //
			}
		});
		chckbxChowFriedRice.setBounds(548, 242, 125, 23);
		frame.getContentPane().add(chckbxChowFriedRice);
		
		txtChowFriedRice = new JTextField();
		txtChowFriedRice.setBounds(692, 243, 32, 20);
		frame.getContentPane().add(txtChowFriedRice);
		txtChowFriedRice.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DESERT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 301, 93, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
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
				}                                                                //
			}
		});
		chckbxAiskacang.setBounds(10, 348, 97, 23);
		frame.getContentPane().add(chckbxAiskacang);
		
		txtAiskacang = new JTextField();
		txtAiskacang.setBounds(109, 349, 32, 20);
		frame.getContentPane().add(txtAiskacang);
		txtAiskacang.setColumns(10);
		
		JCheckBox chckbxGorengPisang = new JCheckBox("GorengPisang");
		chckbxGorengPisang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxGorengPisang.isSelected())                                //
				{
					txtGorengPisang.setEnabled(true);
					txtGorengPisang.setText("0");
					txtGorengPisang.requestFocus();
				}
				else
				{
					txtGorengPisang.setEnabled(false);
					txtGorengPisang.setText("");
				}                                                                //
			}
			
		});
		chckbxGorengPisang.setBounds(234, 348, 118, 23);
		frame.getContentPane().add(chckbxGorengPisang);
		
		txtGorengPisang = new JTextField();
		txtGorengPisang.setBounds(353, 349, 32, 20);
		frame.getContentPane().add(txtGorengPisang);
		txtGorengPisang.setColumns(10);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKerabuSalad.setText(null);
				txtKaripapPusing.setText(null);
				txtPrawnFritters.setText(null);
				txtSatay.setText(null);
				txtAcar.setText(null);
				txtKampungFriedRice.setText(null);
				txtChowFriedRice.setText(null);
				txtAiskacang.setText(null);
				txtGorengPisang.setText(null);
				
				
				
				chckbxKerabuSalad.setSelected(false);				
				chckbxKaripapPusing.setSelected(false);
				chckbxPrawnFritters.setSelected(false);
				chckbxSatay.setSelected(false);
				chckbxAcar.setSelected(false);
				chckbxKampungFriedRice.setSelected(false);								
				chckbxAiskacang.setSelected(false);
				chckbxChowFriedRice.setSelected(false);
				chckbxGorengPisang.setSelected(false);
				
				
			}
		});
		btnNewButton.setBounds(860, 41, 114, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Manager");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(10, 44, 64, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblManager = new JLabel("New label");
		lblManager.setBounds(136, 44, 73, 14);
		frame.getContentPane().add(lblManager);
		lblManager.setText(Manager);
		
		JLabel lblNewLabel_6 = new JLabel("Server");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(304, 44, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblServer = new JLabel("New label");
		lblServer.setBounds(427, 44, 93, 14);
		frame.getContentPane().add(lblServer);
		lblServer.setText(Server);
		
		JLabel lblNewLabel_7 = new JLabel("LineCook");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(599, 44, 74, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblLineCook = new JLabel("New label");
		lblLineCook.setBounds(726, 44, 106, 14);
		frame.getContentPane().add(lblLineCook);
		lblLineCook.setText(LineCook);
		
		JButton btnCost = new JButton("Total");
		btnCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double mCost=KerabuSalad*Double.parseDouble(txtKerabuSalad.getText());                     // 	
				double frCost=KaripapPusing*Double.parseDouble(txtKaripapPusing.getText());
				double sCost=PrawnFritters*Double.parseDouble(txtPrawnFritters.getText());                     // 	
				double chCost=Satay*Double.parseDouble(txtSatay.getText());
				double aCost=Acar*Double.parseDouble(txtAcar.getText());                     // 	
				double brCost=KampungFriedRice*Double.parseDouble(txtKampungFriedRice.getText());
				double nCost=ChowFriedRice*Double.parseDouble(txtChowFriedRice.getText());                     // 	
				double birCost=Aiskacang*Double.parseDouble(txtAiskacang.getText());
				double rCost=GorengPisang*Double.parseDouble(txtGorengPisang.getText());                     // 	
				
				
				
				double Total= mCost+frCost+ sCost+chCost+aCost+brCost+nCost+birCost+rCost;
				
				double tax=((Total*9)/100);
				String SGST= String.format("Rs %.2f", tax);
				
					lblCGST.setText(SGST);
					lblSGST.setText(SGST);
				 
				String T= String.format("Rs %.2f", Total+tax+tax);
				 	 
				 lblCost.setText(T);            
				
				  
				
			}
		});
		btnCost.setBounds(755, 377, 89, 23);
		frame.getContentPane().add(btnCost);
		
		JButton btnNewButton_3 = new JButton("FeedBack");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FeedBackForm p= new FeedBackForm();
				p.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(860, 79, 114, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("CGST-9%");
		lblNewLabel_4.setBounds(755, 352, 64, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_8 = new JLabel("SGST- 9%");
		lblNewLabel_8.setBounds(755, 318, 64, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		
	}
	

}
