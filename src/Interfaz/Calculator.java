package Interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setResizable(false);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton cleanBtn = new JButton("C");
		cleanBtn.setBounds(12, 70, 97, 25);
		contentPane.add(cleanBtn);
		
		JButton divideBtn = new JButton("/");
		divideBtn.setBounds(121, 70, 97, 25);
		contentPane.add(divideBtn);
		
		JButton multiplyBtn = new JButton("*");
		multiplyBtn.setBounds(230, 70, 97, 25);
		contentPane.add(multiplyBtn);
		
		JButton minusBtn = new JButton("-");
		minusBtn.setBounds(335, 70, 97, 63);
		contentPane.add(minusBtn);
		
		JButton number1Btn = new JButton("1");
		number1Btn.setBounds(12, 108, 97, 25);
		contentPane.add(number1Btn);
		
		JButton number4Btn = new JButton("4");
		number4Btn.setBounds(12, 146, 97, 25);
		contentPane.add(number4Btn);
		
		JButton number7Btn = new JButton("7");
		number7Btn.setBounds(12, 184, 97, 25);
		contentPane.add(number7Btn);
		
		JButton number0Btn = new JButton("0");
		number0Btn.setBounds(12, 228, 206, 25);
		contentPane.add(number0Btn);
		
		JButton number2Btn = new JButton("2");
		number2Btn.setBounds(121, 108, 97, 25);
		contentPane.add(number2Btn);
		
		JButton number5Btn = new JButton("5");
		number5Btn.setBounds(121, 146, 97, 25);
		contentPane.add(number5Btn);
		
		JButton number3Btn = new JButton("3");
		number3Btn.setBounds(230, 108, 97, 25);
		contentPane.add(number3Btn);
		
		JButton number6Btn = new JButton("6");
		number6Btn.setBounds(230, 146, 97, 25);
		contentPane.add(number6Btn);
		
		JButton number8Btn = new JButton("8");
		number8Btn.setBounds(121, 184, 97, 25);
		contentPane.add(number8Btn);
		
		JButton number9Btn = new JButton("9");
		number9Btn.setBounds(230, 184, 97, 25);
		contentPane.add(number9Btn);
		
		JButton plusBtn = new JButton("+");
		plusBtn.setBounds(335, 146, 97, 63);
		contentPane.add(plusBtn);
		
		JButton equalsBtn = new JButton("=");
		equalsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		equalsBtn.setBounds(230, 228, 206, 25);
		contentPane.add(equalsBtn);
		
		textField = new JTextField();
		textField.setBounds(12, 13, 420, 44);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
