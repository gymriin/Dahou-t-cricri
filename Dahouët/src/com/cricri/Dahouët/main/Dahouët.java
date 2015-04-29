package com.cricri.Dahouët.main;

import java.awt.EventQueue;

import com.cricri.Dahouët.ui.DahouetUI;

public class Dahouët {
	private DahouetUI uiPrinc;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {

					Dahouët app = new Dahouët();
					app.uiPrinc.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	public Dahouët() {
		initialisationFrames();
	}

	private void initialisationFrames() {
		uiPrinc = new DahouetUI();
		uiPrinc.setVisible(false);
	}

}
