package Logica;

import javax.swing.JTextField;

public class Logica {
	
	//Limpiar el input
	public void clean(JTextField input){
		input.setText("0");
	}
	
	//Poner los numeros correspondientes en el input
	public void setNumber(JTextField input, String number){
	    String currentText = input.getText();
	    if (currentText.equals("0") || currentText.equals("Error") || currentText.equals("Cannot divide by Zero")) {
	        input.setText(number);
	    } else {
	        input.setText(currentText + number);
	    }
	}

	//Poner un punto
	public void setDot(JTextField input){
			String currentText = input.getText();
			input.setText(currentText + ".");
	}
	
	//Guardar un numero para hacer la operacion despues (Validacion para que no ponga mas de un punto)
	public float saveNumber(JTextField input){
		String number = input.getText();
		float num = 0; 

		try{
			num = Float.parseFloat(number);
			input.setText("");
		}
		catch(NumberFormatException e){
			input.setText("Error");
		}
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
