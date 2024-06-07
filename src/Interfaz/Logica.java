package Interfaz;

import javax.swing.JTextField;

public class Logica {
	
	//Limpiar el input
	public void clean(JTextField input){
		input.setText("0");
	}
	
	//Poner los numeros correspondientes en el input
	public void setNumber(JTextField input, String number){
		if(input.getText().equals("0") || input.getText().equals("Error") || input.getText().equals("Cannot divide by Zero")){
			input.setText("");
			input.setText(number);
		}
		else{
			String currentText = input.getText();
			input.setText(currentText + number);
		}
	}
	
	//Poner un punto
	public void setDot(JTextField input){
			String currentText = input.getText();
			input.setText(currentText + ".");
	}
	
	//Guardar un numero para hacer la operacion despues
	public float saveNumber(JTextField input){
		String number = input.getText();
		float num = Float.parseFloat(number);
		input.setText("");
		return num;
	}

	//Realizar la operacion
	public void operation(JTextField input, float a, float b, char operation){
		float result;
		String r;
		if(operation == '+'){
			result = a+b;
			r = Float.toString(result);
			input.setText("");
			input.setText(r);
		}
		else if(operation == '-'){
			result = a-b;
			r = Float.toString(result);
			input.setText("");
			input.setText(r);
		}
		else if(operation == '*'){
			result = a*b;
			r = Float.toString(result);
			input.setText("");
			input.setText(r);
		}
		else if(operation == '/'){
			if(b!=0){
			result = a/b;
			r = Float.toString(result);
			input.setText("");
			input.setText(r);
			}
			else
				input.setText("Cannot divide by Zero");
		}
	}

}
