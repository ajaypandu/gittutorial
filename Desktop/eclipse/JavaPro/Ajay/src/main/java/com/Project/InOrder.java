package com.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;

public class InOrder {

	private JFrame frame;
	private JTextField txtManchuria;       
	
	public double  Manchuria=50;                               //
	public double FriedRice=50;
	public double  CheeseBalls=60;                               //
	public double AlooTikki=70;
	public double  SpringRolls=55;                               //
	public double BabyCorn=65;
	public double  Noodles=80;                               //
	public double Biryani=100;
	public double  Roti=10;                               //
	public double Naan=20;
	public double  Pulav=100;                               //
	public double GulabJamun=30;
	public double IceCream=30;
	public double Cake=30;
			//
	private JCheckBox chckbxFriedRice;
	private JTextField txtFriedRice;
	private JLabel lblIndianMenu;
	private JLabel lblNewLabel;
	private JCheckBox chckbxCheeseBalls;
	private JTextField txtCheeseBalls;
	private JCheckBox chckbxSpringRolls;
	private JCheckBox chckbxAlooTikki;
	private JTextField txtSpringRolls;
	private JTextField txtAlooTikki;
	private JCheckBox chckbxBabyCorn;
	private JTextField txtBabyCorn;
	private JLabel lblNewLabel_1;
	private JCheckBox chckbxNoodles;
	private JTextField txtNoodles;
	private JCheckBox chckbxBiryani;
	private JTextField txtBiryani;
	private JCheckBox chckbxRoti;
	private JTextField txtRoti;
	private JCheckBox chckbxNaan;
	private JTextField txtNaan;
	private JCheckBox chckbxPulav;
	private JTextField txtPulav;
	private JLabel lblNewLabel_2;
	private JCheckBox chckbxGulabJamun;
	private JTextField txtGulabJamun;
	private JCheckBox chckbxIceCream;
	private JTextField txtIceCream;
	private JCheckBox chckbxCake;
	private JTextField txtCake;
	private JButton btnReset;
	public String Manager;
	public  String Server;
	public  String LineCook;
	private JLabel lblNewLabel_3;
	public JLabel lblManager;
	private JLabel lblNewLabel_5;
	public JLabel lblServer;
	private JLabel label;
	private JLabel lblNewLabel_4;
	private JLabel lblLineCook;
	private JLabel lblSGST;
	private JLabel lblCGST;
	private JLabel lblCost;

	/**
	 * Launch the application.
	 */
	public void NewScreen() {    
		 
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				
					InOrder window = new InOrder(Manager, Server, LineCook);
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
	public InOrder(String a1,String a2,String a3) {
		Manager=a1;
		Server=a2;
		LineCook=a3;
		initialize();
		{
			
			
		}
	}

	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				
				
				
				txtManchuria.setEnabled(false);txtManchuria.setText("0");
				txtFriedRice.setEnabled(false);txtFriedRice.setText("0");
				txtSpringRolls.setEnabled(false); txtSpringRolls.setText("0");                                    //
				txtCheeseBalls.setEnabled(false);txtCheeseBalls.setText("0"); 
				txtAlooTikki.setEnabled(false); txtAlooTikki.setText("0"); 
				txtBabyCorn.setEnabled(false);txtBabyCorn.setText("0"); 
				txtNoodles.setEnabled(false);txtNoodles.setText("0"); 
				txtBiryani.setEnabled(false);txtBiryani.setText("0"); 
				txtRoti.setEnabled(false);txtRoti.setText("0"); 
				txtNaan.setEnabled(false);txtNaan.setText("0"); 
				txtPulav.setEnabled(false);txtPulav.setText("0"); 
				txtGulabJamun.setEnabled(false);txtGulabJamun.setText("0"); 
				txtIceCream.setEnabled(false);txtIceCream.setText("0"); 
				txtCake.setEnabled(false);txtCake.setText("0"); 
				
			//	lblManager.setText(Manager);
				
				
				
			}
			
		});
		frame.setBounds(0,0,1000,450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
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
				}                                                                //
				
			}
		});
		chckbxManchuria.setBounds(16, 116, 97, 23);
		frame.getContentPane().add(chckbxManchuria);
		
		txtManchuria = new JTextField();
		txtManchuria.setText("0");
		txtManchuria.setBounds(117, 117, 32, 20);
		frame.getContentPane().add(txtManchuria);
		txtManchuria.setColumns(10);
		
		JButton btnCost = new JButton("Total");
		btnCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double mCost=Manchuria*Double.parseDouble(txtManchuria.getText());                     // 	
				double frCost=FriedRice*Double.parseDouble(txtFriedRice.getText());
				double sCost=SpringRolls*Double.parseDouble(txtSpringRolls.getText());                     // 	
				double chCost=CheeseBalls*Double.parseDouble(txtCheeseBalls.getText());
				double aCost=AlooTikki*Double.parseDouble(txtAlooTikki.getText());                     // 	
				double brCost=BabyCorn*Double.parseDouble(txtBabyCorn.getText());
				double nCost=Noodles*Double.parseDouble(txtNoodles.getText());                     // 	
				double birCost=Biryani*Double.parseDouble(txtBiryani.getText());
				double rCost=Roti*Double.parseDouble(txtRoti.getText());                     // 	
				double narCost=Naan*Double.parseDouble(txtNaan.getText());
				double pCost=Pulav*Double.parseDouble(txtPulav.getText());                     // 	
				double gCost=GulabJamun*Double.parseDouble(txtGulabJamun.getText());
				double iCost=IceCream*Double.parseDouble(txtIceCream.getText());                    	
				double caCost=Cake*Double.parseDouble(txtCake.getText());
				
				
				double Total= mCost+frCost+ sCost+chCost+aCost+brCost+nCost+birCost+rCost+narCost+ pCost+gCost+iCost+caCost;
				double tax=((Total*9)/100);
				String SGST= String.format("Rs %.2f", tax);
						
				lblSGST.setText(SGST);
				lblCGST.setText(SGST);
				
				
				String T= String.format("Rs %.2f", Total+tax+tax);
				 	 
				 
				
				lblCost.setText(T);//
			}
		});
		btnCost.setBounds(761, 377, 79, 23);
		frame.getContentPane().add(btnCost);
		
		chckbxFriedRice = new JCheckBox("FriedRice");
		chckbxFriedRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(chckbxFriedRice.isSelected())                                               //
				{
					txtFriedRice.setEnabled(true);
					txtFriedRice.setText("0");
					txtFriedRice.requestFocus();
				}
				else
				{
					txtFriedRice.setEnabled(false);
					txtFriedRice.setText("");
				}                                                                                 //
			}
		});
		chckbxFriedRice.setBounds(16, 252, 97, 23);
		frame.getContentPane().add(chckbxFriedRice);
		
		txtFriedRice = new JTextField();
		txtFriedRice.setText("0");
		txtFriedRice.setBounds(117, 253, 32, 20);
		frame.getContentPane().add(txtFriedRice);
		txtFriedRice.setColumns(10);
		
		lblIndianMenu = new JLabel("INDIAN MENU");
		lblIndianMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblIndianMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIndianMenu.setBounds(406, -18, 197, 58);
		frame.getContentPane().add(lblIndianMenu);
		
		lblNewLabel = new JLabel("STARTERS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(16, 79, 97, 14);
		frame.getContentPane().add(lblNewLabel);
		
		chckbxCheeseBalls = new JCheckBox("CheeseBalls");
		chckbxCheeseBalls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCheeseBalls.isSelected())                                //
				{
					txtCheeseBalls.setEnabled(true);
					txtCheeseBalls.setText("0");
					txtCheeseBalls.requestFocus();
				}
				else
				{
					txtCheeseBalls.setEnabled(false);
					txtCheeseBalls.setText("");
				}                                                                //
				
				
				
				
			}
		});
		chckbxCheeseBalls.setBounds(172, 116, 104, 23);
		frame.getContentPane().add(chckbxCheeseBalls);
		
		txtCheeseBalls = new JTextField();
		txtCheeseBalls.setText("0");
		txtCheeseBalls.setBounds(277, 117, 32, 20);
		frame.getContentPane().add(txtCheeseBalls);
		txtCheeseBalls.setColumns(10);
		
		chckbxSpringRolls = new JCheckBox("SpringRolls");
		chckbxSpringRolls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxSpringRolls.isSelected())                                               //
				{
					txtSpringRolls.setEnabled(true);
					txtSpringRolls.setText("0");
					txtSpringRolls.requestFocus();
				}
				else
				{
					txtSpringRolls.setEnabled(false);
					txtSpringRolls.setText("");
				}        
				
				
				
			}
		});
		chckbxSpringRolls.setBounds(350, 116, 100, 23);
		frame.getContentPane().add(chckbxSpringRolls);
		
		chckbxAlooTikki = new JCheckBox("AlooTikki");
		chckbxAlooTikki.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAlooTikki.isSelected())                                //
				{
					txtAlooTikki.setEnabled(true);
					txtAlooTikki.setText("0");
					txtAlooTikki.requestFocus();
				}
				else
				{
					txtAlooTikki.setEnabled(false);
					txtAlooTikki.setText("");
				}                                                                //
			}
		});
		chckbxAlooTikki.setBounds(535, 116, 86, 23);
		frame.getContentPane().add(chckbxAlooTikki);
		
		txtSpringRolls = new JTextField();
		txtSpringRolls.setText("0");
		txtSpringRolls.setBounds(456, 117, 32, 20);
		frame.getContentPane().add(txtSpringRolls);
		txtSpringRolls.setColumns(10);
		
		txtAlooTikki = new JTextField();
		txtAlooTikki.setText("0");
		txtAlooTikki.setBounds(623, 117, 32, 20);
		frame.getContentPane().add(txtAlooTikki);
		txtAlooTikki.setColumns(10);
		
		chckbxBabyCorn = new JCheckBox("BabyCorn");
		chckbxBabyCorn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBabyCorn.isSelected())                                //
				{
					txtBabyCorn.setEnabled(true);
					txtBabyCorn.setText("0");
					txtBabyCorn.requestFocus();
				}
				else
				{
					txtBabyCorn.setEnabled(false);
					txtBabyCorn.setText("");
				}                                                                //
				
				
			}
		});
		chckbxBabyCorn.setBounds(701, 116, 97, 23);
		frame.getContentPane().add(chckbxBabyCorn);
		
		txtBabyCorn = new JTextField();
		txtBabyCorn.setText("0");
		txtBabyCorn.setBounds(818, 117, 32, 20);
		frame.getContentPane().add(txtBabyCorn);
		txtBabyCorn.setColumns(10);
		
		lblNewLabel_1 = new JLabel("MAIN COURSE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(16, 202, 133, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		chckbxNoodles = new JCheckBox("Noodles");
		chckbxNoodles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNoodles.isSelected())                                //
				{
					txtNoodles.setEnabled(true);
					txtNoodles.setText("0");
					txtNoodles.requestFocus();
				}
				else
				{
					txtNoodles.setEnabled(false);
					txtNoodles.setText("");
				}                                                                //
			}
		});
		chckbxNoodles.setBounds(172, 252, 86, 23);
		frame.getContentPane().add(chckbxNoodles);
		
		txtNoodles = new JTextField();
		txtNoodles.setText("0");
		txtNoodles.setBounds(264, 253, 32, 20);
		frame.getContentPane().add(txtNoodles);
		txtNoodles.setColumns(10);
		
		chckbxBiryani = new JCheckBox("Biryani");
		chckbxBiryani.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBiryani.isSelected())                                //
				{
					txtBiryani.setEnabled(true);
					txtBiryani.setText("0");
					txtBiryani.requestFocus();
				}
				else
				{
					txtBiryani.setEnabled(false);
					txtBiryani.setText("");
				}                                                                //
			}
		});
		chckbxBiryani.setBounds(350, 252, 75, 23);
		frame.getContentPane().add(chckbxBiryani);
		
		txtBiryani = new JTextField();
		txtBiryani.setText("0");
		txtBiryani.setBounds(433, 253, 32, 20);
		frame.getContentPane().add(txtBiryani);
		txtBiryani.setColumns(10);
		
		chckbxRoti = new JCheckBox("Roti");
		chckbxRoti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRoti.isSelected())                                //
				{
					txtRoti.setEnabled(true);
					txtRoti.setText("0");
					txtRoti.requestFocus();
				}
				else
				{
					txtRoti.setEnabled(false);
					txtRoti.setText("");
				}                                                                //
			}
		});
		chckbxRoti.setBounds(514, 252, 51, 23);
		frame.getContentPane().add(chckbxRoti);
		
		txtRoti = new JTextField();
		txtRoti.setText("0");
		txtRoti.setBounds(571, 253, 32, 20);
		frame.getContentPane().add(txtRoti);
		txtRoti.setColumns(10);
		
		chckbxNaan = new JCheckBox("Naan");
		chckbxNaan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNaan.isSelected())                                //
				{
					txtNaan.setEnabled(true);
					txtNaan.setText("0");
					txtNaan.requestFocus();
				}
				else
				{
					txtNaan.setEnabled(false);
					txtNaan.setText("");
				}                                                                //
				
			}
		});
		chckbxNaan.setBounds(648, 252, 63, 23);
		frame.getContentPane().add(chckbxNaan);
		
		txtNaan = new JTextField();
		txtNaan.setText("0");
		txtNaan.setBounds(712, 253, 32, 20);
		frame.getContentPane().add(txtNaan);
		txtNaan.setColumns(10);
		
		chckbxPulav = new JCheckBox("Pulav");
		chckbxPulav.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPulav.isSelected())                                //
				{
					txtPulav.setEnabled(true);
					txtPulav.setText("0");
					txtPulav.requestFocus();
				}
				else
				{
					txtPulav.setEnabled(false);
					txtPulav.setText("");
				}                                                                //
			}
		});
		chckbxPulav.setBounds(782, 252, 68, 23);
		frame.getContentPane().add(chckbxPulav);
		
		txtPulav = new JTextField();
		txtPulav.setText("0");
		txtPulav.setBounds(856, 253, 32, 20);
		frame.getContentPane().add(txtPulav);
		txtPulav.setColumns(10);
		
		lblNewLabel_2 = new JLabel("DESERTS");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(16, 303, 86, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		chckbxGulabJamun = new JCheckBox("GulabJamun");
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
					}                                                                //
			}
		});
		chckbxGulabJamun.setBounds(16, 338, 109, 23);
		frame.getContentPane().add(chckbxGulabJamun);
		
		txtGulabJamun = new JTextField();
		txtGulabJamun.setText("0");
		txtGulabJamun.setBounds(134, 339, 32, 20);
		frame.getContentPane().add(txtGulabJamun);
		txtGulabJamun.setColumns(10);
		
		chckbxIceCream = new JCheckBox("IceCream");
		chckbxIceCream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxIceCream.isSelected())                                //
				{
					txtIceCream.setEnabled(true);
					txtIceCream.setText("0");
					txtIceCream.requestFocus();
				}
				else
				{
					txtIceCream.setEnabled(false);
					txtIceCream.setText("");
				}                                                                //
			}
		});
		chckbxIceCream.setBounds(184, 338, 86, 23);
		frame.getContentPane().add(chckbxIceCream);
		
		txtIceCream = new JTextField();
		txtIceCream.setText("0");
		txtIceCream.setBounds(277, 339, 32, 20);
		frame.getContentPane().add(txtIceCream);
		txtIceCream.setColumns(10);
		
		chckbxCake = new JCheckBox("Cake");
		chckbxCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCake.isSelected())                                //
				{
					txtCake.setEnabled(true);
					txtCake.setText("0");
					txtCake.requestFocus();
				}
				else
				{
					txtCake.setEnabled(false);
					txtCake.setText("");
				}                                                                //
			}
		});
		chckbxCake.setBounds(350, 339, 63, 23);
		frame.getContentPane().add(chckbxCake);
		
		txtCake = new JTextField();
		txtCake.setText("0");
		txtCake.setBounds(418, 339, 32, 20);
		frame.getContentPane().add(txtCake);
		txtCake.setColumns(10);
		
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtManchuria.setText(null);
				txtSpringRolls.setText(null);
				txtBabyCorn.setText(null);
				txtBiryani.setText(null);
				txtFriedRice.setText(null);
				txtIceCream.setText(null);
				
				txtCheeseBalls.setText(null);
				txtNoodles.setText(null);
				txtRoti.setText(null);
				txtNaan.setText(null);
				txtPulav.setText(null);
				txtGulabJamun.setText(null);
				txtAlooTikki.setText(null);
				txtCake.setText(null);
				lblSGST.setText(null);
				lblCGST.setText(null);
				lblCost.setText(null);
				
				
				chckbxManchuria.setSelected(false);				
				chckbxSpringRolls.setSelected(false);
				chckbxBabyCorn.setSelected(false);
				chckbxBiryani.setSelected(false);
				chckbxFriedRice.setSelected(false);
				chckbxIceCream.setSelected(false);
								
				chckbxCheeseBalls.setSelected(false);
				chckbxNoodles.setSelected(false);
				chckbxRoti.setSelected(false);
				chckbxNaan.setSelected(false);
				chckbxPulav.setSelected(false);
				chckbxAlooTikki.setSelected(false);
				chckbxCake.setSelected(false);
				chckbxGulabJamun.setSelected(false);
						
				
				
				
			}
		});
		btnReset.setBounds(856, 40, 104, 23);
		frame.getContentPane().add(btnReset);
		
		lblNewLabel_3 = new JLabel("Manager :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(27, 41, 75, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		lblManager = new JLabel("New label");
		lblManager.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblManager.setBounds(94, 46, 72, 14);
		frame.getContentPane().add(lblManager);
		lblManager.setText(Manager);
		
		
		lblNewLabel_5 = new JLabel("Server :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(219, 41, 57, 23);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblServer = new JLabel("New label");
		lblServer.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblServer.setBounds(277, 46, 79, 14);
		frame.getContentPane().add(lblServer);
		lblServer.setText(Server);
		
		label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(406, 47, 46, 14);
		frame.getContentPane().add(label);
		
		lblNewLabel_4 = new JLabel("LineCook :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(416, 43, 63, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		lblLineCook = new JLabel("New label");
		lblLineCook.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLineCook.setBounds(481, 47, 84, 14);
		frame.getContentPane().add(lblLineCook);
		lblLineCook.setText(LineCook);
		
		JLabel lblNewLabel_6 = new JLabel("SGST- 9%");
		lblNewLabel_6.setBounds(761, 315, 79, 23);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("CGST-9%");
		lblNewLabel_7.setBounds(761, 343, 79, 23);
		frame.getContentPane().add(lblNewLabel_7);
		
		lblSGST = new JLabel("");
		lblSGST.setBounds(871, 315, 82, 14);
		frame.getContentPane().add(lblSGST);
		
		lblCGST = new JLabel("");
		lblCGST.setBounds(871, 338, 82, 14);
		frame.getContentPane().add(lblCGST);
		
		JButton btnFeedback = new JButton("FeedBack");
		btnFeedback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				FeedBackForm p= new FeedBackForm();
				p.setVisible(true);
			}
		});
		btnFeedback.setBounds(856, 77, 104, 23);
		frame.getContentPane().add(btnFeedback);
		
		lblCost = new JLabel("");
		lblCost.setBounds(871, 382, 75, 18);
		frame.getContentPane().add(lblCost);
	}
}
