package com.cricri.Dahouët.ui;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import net.miginfocom.swing.MigLayout;

public class DahouetUI extends JFrame {
	static Image fondEcran;
	private static final long serialVersionUID = 1L;

	public DahouetUI() {
		getContentPane().setLayout(new MigLayout("", "[grow]", "[grow]"));

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("G\u00E9n\u00E9ral");
		menuBar.add(mnNewMenu);

		// enregistrement
		JMenuItem mntmEnregistrementVoilier = new JMenuItem(
				"Enregistrement Voilier");
		mnNewMenu.add(mntmEnregistrementVoilier);
		mntmEnregistrementVoilier.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				recordShipUI enregistrement = new recordShipUI();
				enregistrement.setVisible(true);
			}
		});

		// quitter
		JMenuItem Quitter = new JMenuItem("Quitter");
		mnNewMenu.add(Quitter);
		mnNewMenu.add(Quitter);
		Quitter.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		JMenu mnNewMenu_1 = new JMenu("?");
		menuBar.add(mnNewMenu_1);

		JMenuItem AProposde = new JMenuItem("A Propos de ...");
		mnNewMenu_1.add(AProposde);
		AProposde.addActionListener(new ActionListener() {

			// Action sur le A Propos
			public void actionPerformed(ActionEvent e) {
				DahouetAPropos aPropos = new DahouetAPropos();
				aPropos.setVisible(true);
			}
		});

		enableEvents(AWTEvent.WINDOW_EVENT_MASK);

		initiate();

	}

	private void initiate() {

		setTitle("Dahou\u00EBt enregistrement de voilier");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 485);
		getContentPane().setLayout(new MigLayout("", "[grow]", "[grow]"));
		ImagePanel imagePanel = new ImagePanel(Toolkit.getDefaultToolkit()
				.getImage(DahouetUI.class.getResource("/Libs/Voiliers.jpg")));
		getContentPane().add(imagePanel, "cell 0 0,grow");

	}

	@SuppressWarnings("unused")
	private static void addPopup(final Component component,
			final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
