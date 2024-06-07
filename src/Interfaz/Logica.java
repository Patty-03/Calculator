package Interfaz;

import javax.swing.JTextField;

public class Logica {
	
	public void clean(JTextField input){
		input.setText("");
	}
	
	public void setNumber(JTextField input, String number){
		String currentText = input.getText();
		input.setText(currentText + number);
	}
	
	public void suma(float a, float b, JTextField input){
		input.setText("");
		float suma = a + b;	
		input.setText(suma+"");
	}

}
