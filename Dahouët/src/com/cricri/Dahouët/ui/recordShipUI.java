package com.cricri.Dahouët.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import com.cricri.Dahouët.DAO.ClasseDAO;
import com.cricri.Dahouët.DAO.ProprioDAO;
import com.cricri.Dahouët.DAO.SerieDAO;

public class recordShipUI extends JFrame {

	public static JComboBox<String> cmbSerie = new JComboBox<String>();
	public static JComboBox<String> cmbClasse = new JComboBox<String>();
	public static JComboBox<String> nomProprio = new JComboBox<String>();
	private JPanel contentPane;
	private JTextField textField;
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
		// ma comboBox est déclarée tout en haut pour pouvoir être utilisée dans DAO
		nomProprio = new JComboBox<String>();
		ProprioDAO.nomPro();
		
		contentPane.add(nomProprio, "cell 5 0,growx");

		JButton btnAjouter = new JButton("Ajouter");
		contentPane.add(btnAjouter, "cell 7 0");
		// action sur le bouton ajouter
		btnAjouter.addActionListener(new ActionListener() {

			// Action sur le A Propos
			public void actionPerformed(ActionEvent e) {
				OwnerUI owner = new OwnerUI();
				owner.setVisible(true);
			}
		});

		JLabel lblNewLabel_1 = new JLabel("Nom Voilier");
		contentPane.add(lblNewLabel_1, "cell 2 2");

		textField = new JTextField();
		contentPane.add(textField, "cell 5 2,growx");
		textField.setColumns(10);

		JLabel lblSerie = new JLabel("Serie");
		contentPane.add(lblSerie, "cell 2 4");
		// ma comboBox est déclarée tout en haut pour pouvoir être utilisée dans DAO
		cmbSerie = new JComboBox<String>();
		// remplissage de la comboBox à partir de la DAO via SerieDAO
		SerieDAO.Serie();

		contentPane.add(cmbSerie, "cell 5 4,growx");

		JLabel lblClasse = new JLabel("Classe");
		contentPane.add(lblClasse, "cell 2 6");

		cmbClasse = new JComboBox<String>();
		cmbSerie.addItemListener(new ItemListener() {
			// remplissage de la comboBox suivant choix de la cmbSerie
			public void itemStateChanged(ItemEvent e) {
				String choix = stringSerie();

				switch (choix) {
				case "Habitables":

					cmbClasse.removeAllItems();
					ClasseDAO.Classe(1);
					break;

				case "Quillards de sport":

					cmbClasse.removeAllItems();
					ClasseDAO.Classe(2);
					break;
				}
			}
		});

		contentPane.add(cmbClasse, "cell 5 6,growx");

		JLabel lblCoefficient = new JLabel("Coefficient");
		contentPane.add(lblCoefficient, "cell 2 8");

		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 5 8,growx");
		textField_1.setColumns(10);

		JButton btnNewButton = new JButton("Enregistrer");
		contentPane.add(btnNewButton, "cell 4 10");
	}

	// récupération de la String dans mon comboBox serie
	public String stringSerie() {
		return (String) this.cmbSerie.getSelectedItem();
	}
}
