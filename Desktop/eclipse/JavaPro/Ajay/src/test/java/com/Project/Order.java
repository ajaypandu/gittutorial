package com.Project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class Order extends JFrame {

	private JPanel contentPane;
	private JTextField txtManchuria;
	private JTextField txtSpringRolls;
	private JTextField textField;
	private JTextField txtBabyCorn;
	private JTextField txtVegBiryani;
	private JTextField txtVegFriedRice;
	private JTextField txtIceCreams;
	private JTextField txtcost;
	
	double Manchuria = 100;
	double SpringRolls = 150;
	double BabyCorn = 140;
	double VegBiryani=100;
	double VegFriedRice=120;
	double IceCreams=50;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order frame = new Order();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, -2, 414, 50);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxManchuria = new JCheckBox("Manchuria");
		chckbxManchuria.setBounds(10, 73, 75, 23);
		contentPane.add(chckbxManchuria);
		
		JCheckBox chckbxSpringrolls = new JCheckBox("SpringRolls");
		chckbxSpringrolls.setBounds(140, 73, 82, 23);
		contentPane.add(chckbxSpringrolls);
		
		JCheckBox chckbxBabycorn = new JCheckBox("BabyCorn");
		chckbxBabycorn.setBounds(266, 73, 75, 23);
		contentPane.add(chckbxBabycorn);
		
		JLabel lblMainCourse = new JLabel("MAIN COURSE");
		lblMainCourse.setBounds(10, 103, 75, 23);
		contentPane.add(lblMainCourse);
		
		JCheckBox chckbxVegBiryani = new JCheckBox("Veg Biryani");
		chckbxVegBiryani.setBounds(10, 124, 82, 23);
		contentPane.add(chckbxVegBiryani);
		
		JCheckBox chckbxVegFriedRice = new JCheckBox("Veg Fried Rice");
		chckbxVegFriedRice.setBounds(125, 124, 97, 23);
		contentPane.add(chckbxVegFriedRice);
		
		JCheckBox chckbxIceCreams = new JCheckBox("Ice Creams");
		chckbxIceCreams.setBounds(10, 185, 97, 23);
		contentPane.add(chckbxIceCreams);
		
		JButton btnBill = new JButton("Bill");
		btnBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double M =Manchuria * Double.parseDouble(txtManchuria.getText());
				double S =SpringRolls * Double.parseDouble(txtSpringRolls.getText());
				double B =BabyCorn * Double.parseDouble(txtBabyCorn.getText());
				double VB =VegBiryani * Double.parseDouble(txtVegBiryani.getText());
				double VFR =VegFriedRice * Double.parseDouble(txtVegFriedRice.getText());
				double IC =IceCreams * Double.parseDouble(txtIceCreams.getText());

				double sum= M+S+B+VB+VFR+IC;
				
				String C =String.format(" $ %.2f",sum);
				txtcost.setText(C);
				
				
				
				
				
				
				
			 
			}
		});
		btnBill.setBounds(335, 185, 89, 23);
		contentPane.add(btnBill);
		
		JLabel lblNewLabel_1 = new JLabel("STARTER");
		lblNewLabel_1.setBounds(10, 44, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DESERT");
		lblNewLabel_2.setBounds(10, 164, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				txtManchuria.setText(null);
				txtSpringRolls.setText(null);
				txtBabyCorn.setText(null);
				txtVegBiryani.setText(null);
				txtVegFriedRice.setText(null);
				txtIceCreams.setText(null);
				txtcost.setText(null);
				
				
				
				chckbxManchuria.setSelected(false);				
				chckbxSpringrolls.setSelected(false);
				chckbxBabycorn.setSelected(false);
				chckbxVegBiryani.setSelected(false);
				chckbxVegFriedRice.setSelected(false);
				chckbxIceCreams.setSelected(false);
							
				
				
			}
		});
		btnReset.setBounds(10, 227, 89, 23);
		contentPane.add(btnReset);
		
		txtManchuria = new JTextField();
		txtManchuria.setBounds(82, 74, 31, 20);
		contentPane.add(txtManchuria);
		txtManchuria.setColumns(10);
		
		txtSpringRolls = new JTextField();
		txtSpringRolls.setBounds(214, 74, 31, 20);
		contentPane.add(txtSpringRolls);
		txtSpringRolls.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(214, 74, 31, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtBabyCorn = new JTextField();
		txtBabyCorn.setBounds(338, 74, 31, 20);
		contentPane.add(txtBabyCorn);
		txtBabyCorn.setColumns(10);
		
		txtVegBiryani = new JTextField();
		txtVegBiryani.setBounds(88, 125, 25, 20);
		contentPane.add(txtVegBiryani);
		txtVegBiryani.setColumns(10);
		
		txtVegFriedRice = new JTextField();
		txtVegFriedRice.setBounds(214, 125, 31, 20);
		contentPane.add(txtVegFriedRice);
		txtVegFriedRice.setColumns(10);
		
		txtIceCreams = new JTextField();
		txtIceCreams.setBounds(113, 186, 25, 20);
		contentPane.add(txtIceCreams);
		txtIceCreams.setColumns(10);
		
		JLabel lblCost = new JLabel("cost =");
		lblCost.setBounds(298, 231, 31, 14);
		contentPane.add(lblCost);
		
		txtcost = new JTextField();
		txtcost.setBounds(338, 228, 86, 20);
		contentPane.add(txtcost);
		txtcost.setColumns(10);
		
		
		
	}
}
