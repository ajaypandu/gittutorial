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

public class ItOrder {

	private JFrame frame;
	private JTextField txtCapreseSalad;
	private JTextField txtBagnaCauda;
	private JTextField txtBasilSalad;
	private JTextField txtBeetrootRisotto;
	private JTextField txtChickenScallopini;
	private JTextField txtPorkMarsala;
	private JTextField txtBrodetto;
	private JTextField txtBraisedChuckRoast;
	private JTextField txtBombolone;
	private JTextField txtAmaretti;
	private JTextField txtPanettone;
	public String Manager;
	public  String Server;
	public  String LineCook;
	
	
	public double  CapreseSalad=50;                               //
	public double BagnaCauda=50;
	public double  BasilSalad=60;                               //
	public double BeetrootRisotto=70;
	public double  ChickenScallopini=55;                               //
	public double PorkMarsala=65;
	public double  Brodetto=80;                               //
	public double BraisedChuckRoast=100;
	public double  Bombolone=10;                               //
	public double Amaretti=20;
	public double  Panettone=100;                               //
	
	

	/**
	 * Launch the application.
	 */
	public  void NewScreen2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ItOrder window = new ItOrder(Manager, Server, LineCook);
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
	public ItOrder(String a1,String a2,String a3) {
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
				txtCapreseSalad.setEnabled(false);txtCapreseSalad.setText("0");
				txtBagnaCauda.setEnabled(false);txtBagnaCauda.setText("0");
				txtBasilSalad.setEnabled(false);txtBasilSalad.setText("0");        //
				txtBeetrootRisotto.setEnabled(false);txtBeetrootRisotto.setText("0");
				txtChickenScallopini.setEnabled(false);txtChickenScallopini.setText("0");
				txtPorkMarsala.setEnabled(false);txtPorkMarsala.setText("0");
				txtBrodetto.setEnabled(false);txtBrodetto.setText("0");
				txtBraisedChuckRoast.setEnabled(false);txtBraisedChuckRoast.setText("0");
				txtBombolone.setEnabled(false);txtBombolone.setText("0");
				txtAmaretti.setEnabled(false);txtAmaretti.setText("0");
				txtPanettone.setEnabled(false);txtPanettone.setText("0");
				
			}
		});
		frame.setBounds(0, 0, 1000, 450);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ITALIAN MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(417, 11, 152, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("STARTERS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(10, 76, 111, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblSGST = new JLabel(" ");
		lblSGST.setBounds(885, 326, 67, 19);
		frame.getContentPane().add(lblSGST);
		
		JLabel lblCGST = new JLabel("");
		lblCGST.setBounds(885, 357, 67, 14);
		frame.getContentPane().add(lblCGST);
		
		JLabel lblCost = new JLabel("");
		lblCost.setBounds(895, 386, 57, 14);
		frame.getContentPane().add(lblCost);
		
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
				}                                                                //
				
				
			}
		});
		chckbxCapreseSalad.setBounds(10, 131, 111, 23);
		frame.getContentPane().add(chckbxCapreseSalad);
		
		txtCapreseSalad = new JTextField();
		txtCapreseSalad.setBounds(130, 132, 32, 20);
		frame.getContentPane().add(txtCapreseSalad);
		txtCapreseSalad.setColumns(10);
		
		JCheckBox chckbxBagnaCauda = new JCheckBox("BagnaCauda");
		chckbxBagnaCauda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBagnaCauda.isSelected())                                //
				{
					txtBagnaCauda.setEnabled(true);
					txtBagnaCauda.setText("0");
					txtBagnaCauda.requestFocus();
				}
				else
				{
					txtBagnaCauda.setEnabled(false);
					txtBagnaCauda.setText("");
				}                  
			}
		});
		chckbxBagnaCauda.setBounds(258, 131, 97, 23);
		frame.getContentPane().add(chckbxBagnaCauda);
		
		txtBagnaCauda = new JTextField();
		txtBagnaCauda.setBounds(361, 132, 32, 20);
		frame.getContentPane().add(txtBagnaCauda);
		txtBagnaCauda.setColumns(10);
		
		JCheckBox chckbxBasilSalad = new JCheckBox("BasilSalad");
		chckbxBasilSalad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBasilSalad.isSelected())                                //
				{
					txtBasilSalad.setEnabled(true);
					txtBasilSalad.setText("0");
					txtBasilSalad.requestFocus();
				}
				else
				{
					txtBasilSalad.setEnabled(false);
					txtBasilSalad.setText("");
				}                  
			}
		});
		chckbxBasilSalad.setBounds(510, 131, 97, 23);
		frame.getContentPane().add(chckbxBasilSalad);
		
		txtBasilSalad = new JTextField();
		txtBasilSalad.setBounds(607, 132, 32, 20);
		frame.getContentPane().add(txtBasilSalad);
		txtBasilSalad.setColumns(10);
		
		JCheckBox chckbxBeetrootRisotto = new JCheckBox("BeetrootRisotto");
		chckbxBeetrootRisotto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBeetrootRisotto.isSelected())                                //
				{
					txtBeetrootRisotto.setEnabled(true);
					txtBeetrootRisotto.setText("0");
					txtBeetrootRisotto.requestFocus();
				}
				else
				{
					txtBeetrootRisotto.setEnabled(false);
					txtBeetrootRisotto.setText("");
				}                  
				
				
			}
		});
		chckbxBeetrootRisotto.setBounds(733, 131, 125, 23);
		frame.getContentPane().add(chckbxBeetrootRisotto);
		
		txtBeetrootRisotto = new JTextField();
		txtBeetrootRisotto.setBounds(868, 132, 32, 20);
		frame.getContentPane().add(txtBeetrootRisotto);
		txtBeetrootRisotto.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("MAIN COURSE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(10, 198, 125, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
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
		chckbxChickenScallopini.setBounds(10, 240, 136, 23);
		frame.getContentPane().add(chckbxChickenScallopini);
		
		txtChickenScallopini = new JTextField();
		txtChickenScallopini.setBounds(152, 241, 32, 20);
		frame.getContentPane().add(txtChickenScallopini);
		txtChickenScallopini.setColumns(10);
		
		JCheckBox chckbxPorkMarsala = new JCheckBox("PorkMarsala");
		chckbxPorkMarsala.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxPorkMarsala.isSelected())                                //
				{
					txtPorkMarsala.setEnabled(true);
					txtPorkMarsala.setText("0");
					txtPorkMarsala.requestFocus();
				}
				else
				{
					txtPorkMarsala.setEnabled(false);
					txtPorkMarsala.setText("");
				}                  
			}
		});
		chckbxPorkMarsala.setBounds(258, 240, 111, 23);
		frame.getContentPane().add(chckbxPorkMarsala);
		
		txtPorkMarsala = new JTextField();
		txtPorkMarsala.setBounds(374, 241, 32, 20);
		frame.getContentPane().add(txtPorkMarsala);
		txtPorkMarsala.setColumns(10);
		
		JCheckBox chckbxBrodetto = new JCheckBox("Brodetto");
		chckbxBrodetto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBrodetto.isSelected())                                //
				{
					txtBrodetto.setEnabled(true);
					txtBrodetto.setText("0");
					txtBrodetto.requestFocus();
				}
				else
				{
					txtBrodetto.setEnabled(false);
					txtBrodetto.setText("");
				}                  
			}
		});
		chckbxBrodetto.setBounds(472, 240, 97, 23);
		frame.getContentPane().add(chckbxBrodetto);
		
		txtBrodetto = new JTextField();
		txtBrodetto.setBounds(575, 241, 32, 20);
		frame.getContentPane().add(txtBrodetto);
		txtBrodetto.setColumns(10);
		
		JCheckBox chckbxBraisedChuckRoast = new JCheckBox("BraisedChuckRoast");
		chckbxBraisedChuckRoast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBraisedChuckRoast.isSelected())                                //
				{
					txtBraisedChuckRoast.setEnabled(true);
					txtBraisedChuckRoast.setText("0");
					txtBraisedChuckRoast.requestFocus();
				}
				else
				{
					txtBraisedChuckRoast.setEnabled(false);
					txtBraisedChuckRoast.setText("");
				}                  
			}
		});
		chckbxBraisedChuckRoast.setBounds(672, 240, 152, 23);
		frame.getContentPane().add(chckbxBraisedChuckRoast);
		
		txtBraisedChuckRoast = new JTextField();
		txtBraisedChuckRoast.setBounds(836, 241, 32, 20);
		frame.getContentPane().add(txtBraisedChuckRoast);
		txtBraisedChuckRoast.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DESERT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 280, 97, 25);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chckbxBombolone = new JCheckBox("Bombolone");
		chckbxBombolone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBombolone.isSelected())                                //
				{
					txtBombolone.setEnabled(true);
					txtBombolone.setText("0");
					txtBombolone.requestFocus();
				}
				else
				{
					txtBombolone.setEnabled(false);
					txtBombolone.setText("");
				}                  
			}
		});
		chckbxBombolone.setBounds(10, 312, 97, 23);
		frame.getContentPane().add(chckbxBombolone);
		
		txtBombolone = new JTextField();
		txtBombolone.setBounds(113, 313, 32, 20);
		frame.getContentPane().add(txtBombolone);
		txtBombolone.setColumns(10);
		
		JCheckBox chckbxAmaretti = new JCheckBox("Amaretti");
		chckbxAmaretti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxAmaretti.isSelected())                                //
				{
					txtAmaretti.setEnabled(true);
					txtAmaretti.setText("0");
					txtAmaretti.requestFocus();
				}
				else
				{
					txtAmaretti.setEnabled(false);
					txtAmaretti.setText("");
				}                  
			}
		});
		chckbxAmaretti.setBounds(258, 312, 97, 23);
		frame.getContentPane().add(chckbxAmaretti);
		
		txtAmaretti = new JTextField();
		txtAmaretti.setBounds(361, 313, 32, 20);
		frame.getContentPane().add(txtAmaretti);
		txtAmaretti.setColumns(10);
		
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
		chckbxPanettone.setBounds(472, 312, 97, 23);
		frame.getContentPane().add(chckbxPanettone);
		
		txtPanettone = new JTextField();
		txtPanettone.setBounds(575, 313, 32, 20);
		frame.getContentPane().add(txtPanettone);
		txtPanettone.setColumns(10);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCapreseSalad.setText(null);
				txtBagnaCauda.setText(null);
				txtBasilSalad.setText(null);
				txtBeetrootRisotto.setText(null);
				txtChickenScallopini.setText(null);
				txtPorkMarsala.setText(null);
				txtBrodetto.setText(null);
				txtBraisedChuckRoast.setText(null);
				txtBombolone.setText(null);
				txtPanettone.setText(null);
				txtAmaretti.setText(null);
				
				
				
				chckbxCapreseSalad.setSelected(false);				
				chckbxBagnaCauda.setSelected(false);
				chckbxBasilSalad.setSelected(false);
				chckbxBeetrootRisotto.setSelected(false);
				chckbxChickenScallopini.setSelected(false);
				chckbxPorkMarsala.setSelected(false);								
				chckbxBrodetto.setSelected(false);
				chckbxBraisedChuckRoast.setSelected(false);
				chckbxBombolone.setSelected(false);
				chckbxPanettone.setSelected(false);
				chckbxAmaretti.setSelected(false);
				
			}
		});
		btnNewButton.setBounds(856, 51, 118, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("Manager");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(28, 41, 67, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblManager = new JLabel("New label");
		lblManager.setBounds(116, 41, 46, 14);
		frame.getContentPane().add(lblManager);
		lblManager.setText(Manager);
		
		JLabel lblNewLabel_6 = new JLabel("Server");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(314, 41, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblServer = new JLabel("New label");
		lblServer.setBounds(417, 41, 46, 14);
		frame.getContentPane().add(lblServer);
		lblServer.setText(Server);
		
		JLabel lblNewLabel_7 = new JLabel("LineCook");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_7.setBounds(607, 41, 60, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblLineCook = new JLabel("New label");
		lblLineCook.setBounds(711, 41, 67, 14);
		frame.getContentPane().add(lblLineCook);
		lblLineCook.setText(LineCook);
		
		JButton btnNewButton_1 = new JButton("Total");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double mCost=CapreseSalad*Double.parseDouble(txtCapreseSalad.getText());                     // 	
				double frCost=BagnaCauda*Double.parseDouble(txtBagnaCauda.getText());
				double sCost=BasilSalad*Double.parseDouble(txtBasilSalad.getText());                     // 	
				double chCost=BeetrootRisotto*Double.parseDouble(txtBeetrootRisotto.getText());
				double aCost=ChickenScallopini*Double.parseDouble(txtChickenScallopini.getText());                     // 	
				double brCost=PorkMarsala*Double.parseDouble(txtPorkMarsala.getText());
				double nCost=Brodetto*Double.parseDouble(txtBrodetto.getText());                     // 	
				double birCost=BraisedChuckRoast*Double.parseDouble(txtBraisedChuckRoast.getText());
				double rCost=Bombolone*Double.parseDouble(txtBombolone.getText());                     // 	
				double narCost=Amaretti*Double.parseDouble(txtAmaretti.getText());
				double pCost=Panettone*Double.parseDouble(txtPanettone.getText());                     // 	
				
				
				double Total= mCost+frCost+ sCost+chCost+aCost+brCost+nCost+birCost+rCost+narCost+ pCost;
				double tax=((Total*9)/100);
				String SGST= String.format("Rs %.2f", tax);
				
					lblCGST.setText(SGST);
					lblSGST.setText(SGST);
				 
				String T= String.format("Rs %.2f", Total+tax+tax);
				 	 
				 lblCost.setText(T);
				                                 
			}
		});
		btnNewButton_1.setBounds(779, 382, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("FeedBack");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				FeedBackForm p= new FeedBackForm();
				p.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(856, 79, 118, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblSgst = new JLabel("SGST-9%");
		lblSgst.setBounds(779, 326, 67, 25);
		frame.getContentPane().add(lblSgst);
		
		JLabel lblCgst = new JLabel("CGST-9%");
		lblCgst.setBounds(779, 357, 56, 14);
		frame.getContentPane().add(lblCgst);
		
		
	}

}
