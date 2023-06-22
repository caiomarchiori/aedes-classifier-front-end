package main;

import java.awt.EventQueue;
import java.io.IOException;
import java.util.ArrayList;

import controller.ItemController;
import persistencia.CreateSequentialFile;
import persistencia.ReadSequentialFile;
import view.MenuView;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView frame = new MenuView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
