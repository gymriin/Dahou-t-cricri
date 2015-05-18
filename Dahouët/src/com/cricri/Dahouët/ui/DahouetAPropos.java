package com.cricri.Dahouët.ui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DahouetAPropos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public DahouetAPropos() {
		setTitle("A propos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnOk.setBounds(162, 198, 80, 31);

		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnOk);

		JLabel DahouëtAPropos = new JLabel(
				"<html>Dahou\u00EBt enregistrement de voiliers<br>(c) Christophe PEREZ 2015<br>Version 1.0");
		DahouëtAPropos.setBounds(161, 74, 145, 99);
		DahouëtAPropos.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(DahouëtAPropos, BorderLayout.CENTER);

	}

}
