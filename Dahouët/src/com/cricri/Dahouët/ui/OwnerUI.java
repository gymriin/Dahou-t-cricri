package com.cricri.Dahouët.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class OwnerUI extends JFrame {

	private JPanel contentPane;
	private JTextField champNom;
	private JTextField textField_1;
	private JTextField champAddress;
	private JTextField champMail;
	private JTextField champClub;

	
	public OwnerUI() {
		setTitle("Propri\u00E9taire");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 426, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][grow][][grow]", "[][][][][][][][][][grow][]"));
		
		JLabel lblNewLabel = new JLabel("Nom");
		contentPane.add(lblNewLabel, "cell 2 0");
		
		champNom = new JTextField();
		contentPane.add(champNom, "cell 6 0,growx");
		champNom.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		contentPane.add(lblAdresse, "cell 2 2");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 6 2,growx");
		textField_1.setColumns(10);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone");
		contentPane.add(lblTlphone, "cell 2 4");
		
		champAddress = new JTextField();
		contentPane.add(champAddress, "cell 6 5,growx");
		champAddress.setColumns(10);
		
		JLabel lblMail = new JLabel("Mail");
		contentPane.add(lblMail, "cell 2 7");
		
		champMail = new JTextField();
		contentPane.add(champMail, "cell 6 7,growx");
		champMail.setColumns(10);
		
		JLabel lblClub = new JLabel("Club");
		contentPane.add(lblClub, "cell 2 9");
		
		champClub = new JTextField();
		contentPane.add(champClub, "cell 6 9,growx");
		champClub.setColumns(10);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		contentPane.add(btnEnregistrer, "cell 4 10");
	}

}
