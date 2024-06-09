package Logica;

import java.awt.EventQueue;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.*;


import Interfaz.Calculator;

public class Main {

	public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
