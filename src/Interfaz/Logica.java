package Interfaz;

import javax.swing.JTextField;

public class Logica {
	
	public void clean(JTextField input){
		input.setText("0");
	}
	
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
	
	public int saveNumber(JTextField input){
		String number = input.getText();
		int num = Integer.parseInt(number);
		input.setText("");
		return num;
	}

	public void operation(JTextField input, int a, int b, char operation){
		int result;
		String r;
		if(operation == '+'){
			result = a+b;
			r = Integer.toString(result);
			input.setText("");
			input.setText(r);
		}
		else if(operation == '-'){
			result = a-b;
			r = Integer.toString(result);
			input.setText("");
			input.setText(r);
		}
		else if(operation == '*'){
			result = a*b;
			r = Integer.toString(result);
			input.setText("");
			input.setText(r);
		}
		else if(operation == '/'){
			if(b!=0){
			result = a/b;
			r = Integer.toString(result);
			input.setText("");
			input.setText(r);
			}
			else
				input.setText("Cannot divide by Zero");
		}
	}

}
