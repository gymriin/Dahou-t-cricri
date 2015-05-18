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

public class recordShipUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JComboBox<String> cmbSerie = new JComboBox<>();
	public static JComboBox<String> cmbClasse = new JComboBox<>();
	public static JComboBox<String> nomProprio = new JComboBox<>();
	private JPanel contentPane;
	public static JTextField nomVoil;
	private JTextField textField_1;

	public recordShipUI() {
		setTitle("Enregistrement");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 489, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][grow][][][grow]",
				"[][][][][][][][][][][]"));

		JLabel lblNewLabel = new JLabel("Nom Propri\u00E9taire");
		contentPane.add(lblNewLabel, "cell 2 0");
		// ma comboBox est déclarée tout en haut pour pouvoir être utilisée dans
		// DAO
		nomProprio = new JComboBox<String>();
		controls.fillProp();

		contentPane.add(nomProprio, "cell 5 0,growx");

		JButton btnAjouter = new JButton("Ajouter");
		contentPane.add(btnAjouter, "cell 7 0");
		// action sur le bouton ajouter
		btnAjouter.addActionListener(new ActionListener() {

			// Action sur le A Propos
			public void actionPerformed(ActionEvent e) {
				OwnerUI owner = new OwnerUI();
				owner.setVisible(true);
				dispose();
			}
		});

		JLabel lblNewLabel_1 = new JLabel("Nom Voilier");
		contentPane.add(lblNewLabel_1, "cell 2 2");

		nomVoil = new JTextField();
		contentPane.add(nomVoil, "cell 5 2,growx");
		nomVoil.setColumns(10);

		JLabel lblSerie = new JLabel("Serie");
		contentPane.add(lblSerie, "cell 2 4");

		cmbSerie = new JComboBox<>();
		cmbSerie.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				cmbSerie.getSelectedItem().toString();

				cmbClasse.removeAllItems();
				String nomSerie = (String) cmbSerie.getSelectedItem();

				controls.fillClasse(nomSerie);
			}
		});
		controls.fillListSerie();

		contentPane.add(cmbSerie, "cell 5 4,growx");

		JLabel lblClasse = new JLabel("Classe");
		contentPane.add(lblClasse, "cell 2 6");

		cmbClasse = new JComboBox<>();
		String nomSerie = (String) cmbSerie.getSelectedItem();

		controls.fillClasse(nomSerie);

		contentPane.add(cmbClasse, "cell 5 6,growx");

		JLabel lblCoefficient = new JLabel("Coefficient");
		contentPane.add(lblCoefficient, "cell 2 8");

		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 5 8,growx");
		textField_1.setColumns(10);

		JButton save = new JButton("Enregistrer");
		contentPane.add(save, "cell 4 10");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					controls.saveVoilier();
				} catch (Exception e) {
					e.printStackTrace();
					throw new RuntimeException();
				}
				messSauvegarde message = new messSauvegarde();
				message.setVisible(true);
				dispose();
			}
		});
		save.setEnabled(true);
	}

}
