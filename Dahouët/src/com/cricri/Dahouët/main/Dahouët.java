package com.cricri.Dahou�t.main;

import java.awt.EventQueue;

import com.cricri.Dahou�t.ui.DahouetUI;

public class Dahou�t {
	private DahouetUI uiPrinc;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {

					Dahou�t app = new Dahou�t();
					app.uiPrinc.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});
	}

	public Dahou�t() {
		initialisationFrames();
	}

	private void initialisationFrames() {
		uiPrinc = new DahouetUI();
		uiPrinc.setVisible(false);
	}

}
