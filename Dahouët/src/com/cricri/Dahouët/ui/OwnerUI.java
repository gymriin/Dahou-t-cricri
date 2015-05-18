package com.cricri.Dahouët.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import com.cricri.Dahouët.Controller.controls;

public class OwnerUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField champNom;
	public static JTextField champAdress;
	private JTextField champAddress;
	private JTextField champMail;
	public static JComboBox<String> champClub;

	public OwnerUI() {
		setTitle("Propri\u00E9taire");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 426, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("",
				"[][][][][][][grow][grow][][grow]",
				"[][][][][][][][][][][grow][]"));

		JLabel lblNewLabel = new JLabel("Nom");
		contentPane.add(lblNewLabel, "cell 2 0");

		champNom = new JTextField();
		contentPane.add(champNom, "cell 6 0,growx");
		champNom.setColumns(10);

		JLabel lblAdresse = new JLabel("Adresse");
		contentPane.add(lblAdresse, "cell 2 2");

		champAdress = new JTextField();
		contentPane.add(champAdress, "cell 6 2,growx");
		champAdress.setColumns(10);

		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone");
		contentPane.add(lblTlphone, "cell 2 4");

		champAddress = new JTextField();
		contentPane.add(champAddress, "cell 6 4,growx");
		champAddress.setColumns(10);

		JLabel lblMail = new JLabel("Mail");
		contentPane.add(lblMail, "cell 2 8");

		champMail = new JTextField();
		contentPane.add(champMail, "cell 6 8,growx");
		champMail.setColumns(10);

		JLabel lblClub = new JLabel("Club");
		contentPane.add(lblClub, "cell 2 10");

		champClub = new JComboBox<>();
		controls.remplirListClub();
		contentPane.add(champClub, "cell 6 10,growx");

		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					controls.saveProprio();
				} catch (Exception e) {
					e.printStackTrace();
					throw new RuntimeException();
				}
				messSauvegarde message = new messSauvegarde();
				message.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnEnregistrer, "cell 4 11");
	}

}
