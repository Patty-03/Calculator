package Interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import Interfaz.Logica;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;


public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	Logica l1 = new Logica();
	char operation;
	float n1 = 0, n2 =0 ;
	private JButton multiplyBtn;
	private JButton divideBtn;
	private JButton minusBtn;
	private JButton plusBtn;
	private JButton equalsBtn;
	private JButton cleanBtn;
	private JButton number1Btn;
	private JButton number2Btn;
	private JButton number3Btn;
	private JButton number4Btn;
	private JButton number5Btn;
	private JButton number6Btn;
	private JButton number7Btn;
	private JButton number8Btn;
	private JButton number9Btn;
	private JButton number0Btn;
	private JButton dotBtn;

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
		setBounds(100, 100, 480, 535);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("window"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		input = new JTextField();
		input.setText("0");
		input.setEditable(false);
		input.setForeground(UIManager.getColor("text"));
		input.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
		input.setBackground(new Color(153, 153, 204));
		input.setBounds(12, 44, 450, 84);
		contentPane.add(input);
		input.setColumns(10);
		
		cleanBtn = new JButton("C");
		cleanBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				cleanBtn.setBackground(new Color(100, 210, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				cleanBtn.setBackground(new Color(51, 204, 255));
			}
		});
		cleanBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cleanBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.clean(input);
			}
		});
		cleanBtn.setForeground(UIManager.getColor("text"));
		cleanBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		cleanBtn.setBorder(null);
		cleanBtn.setBackground(new Color(51, 204, 255));
		cleanBtn.setBounds(12, 145, 97, 50);
		contentPane.add(cleanBtn);
		
		divideBtn = new JButton("/");
		divideBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		divideBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				divideBtn.setBackground(new Color(255, 0, 90));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				divideBtn.setBackground(new Color(255, 0, 153));
			}
		});
		divideBtn.setForeground(UIManager.getColor("text"));
		divideBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		divideBtn.setBorder(null);
		divideBtn.setBackground(new Color(255, 0, 153));
		divideBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = l1.saveNumber(input);
				operation = '/';
			}
		});
		divideBtn.setBounds(121, 145, 97, 50);
		contentPane.add(divideBtn);
		
		multiplyBtn = new JButton("X");
		multiplyBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		multiplyBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				multiplyBtn.setBackground(new Color(255, 0, 90));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				multiplyBtn.setBackground(new Color(255, 0, 153));
			}
		});
		multiplyBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = l1.saveNumber(input);
				operation = '*';}
		});
		multiplyBtn.setForeground(UIManager.getColor("text"));
		multiplyBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		multiplyBtn.setBorder(null);
		multiplyBtn.setBackground(new Color(255, 0, 153));
		multiplyBtn.setBounds(230, 145, 97, 50);
		contentPane.add(multiplyBtn);
		
		minusBtn = new JButton("-");
		minusBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		minusBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				minusBtn.setBackground(new Color(255, 0, 90));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				minusBtn.setBackground(new Color(255, 0, 153));
			}
		});
		minusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = l1.saveNumber(input);
				operation = '-';
			}
		});
		minusBtn.setForeground(UIManager.getColor("text"));
		minusBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		minusBtn.setBorder(null);
		minusBtn.setBackground(new Color(255, 0, 153));
		minusBtn.setBounds(339, 145, 123, 115);
		contentPane.add(minusBtn);
		
		number1Btn = new JButton("1");
		number1Btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				number1Btn.setBackground(new Color(200, 153, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				number1Btn.setBackground(new Color(153, 153, 204));
			}
		});
		number1Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setNumber(input, "1");
			}
		});
		number1Btn.setForeground(UIManager.getColor("text"));
		number1Btn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		number1Btn.setBorderPainted(false);
		number1Btn.setBorder(null);
		number1Btn.setBackground(new Color(153, 153, 204));
		number1Btn.setBounds(12, 208, 97, 52);
		contentPane.add(number1Btn);
		
		number4Btn = new JButton("4");
		number4Btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				number4Btn.setBackground(new Color(200, 153, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				number4Btn.setBackground(new Color(153, 153, 204));
			}
		});
		number4Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number4Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setNumber(input, "4");
			}
		});
		number4Btn.setForeground(UIManager.getColor("text"));
		number4Btn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		number4Btn.setBorder(null);
		number4Btn.setBackground(new Color(153, 153, 204));
		number4Btn.setBounds(12, 273, 97, 52);
		contentPane.add(number4Btn);
		
		number7Btn = new JButton("7");
		number7Btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				number7Btn.setBackground(new Color(200, 153, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				number7Btn.setBackground(new Color(153, 153, 204));
			}
		});
		number7Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number7Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setNumber(input, "7");
			}
		});
		number7Btn.setForeground(UIManager.getColor("text"));
		number7Btn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		number7Btn.setBorder(null);
		number7Btn.setBackground(new Color(153, 153, 204));
		number7Btn.setBounds(12, 338, 97, 52);
		contentPane.add(number7Btn);
		
		number0Btn = new JButton("0");
		number0Btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				number0Btn.setBackground(new Color(200, 153, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				number0Btn.setBackground(new Color(153, 153, 204));
			}
		});
		number0Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number0Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setNumber(input, "0");
			}
		});
		number0Btn.setForeground(UIManager.getColor("text"));
		number0Btn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		number0Btn.setBorder(null);
		number0Btn.setBackground(new Color(153, 153, 204));
		number0Btn.setBounds(12, 403, 206, 84);
		contentPane.add(number0Btn);
		
		number2Btn = new JButton("2");
		number2Btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				number2Btn.setBackground(new Color(200, 153, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				number2Btn.setBackground(new Color(153, 153, 204));
			}
		});
		number2Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setNumber(input, "2");
			}
		});
		number2Btn.setForeground(UIManager.getColor("text"));
		number2Btn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		number2Btn.setBorder(null);
		number2Btn.setBackground(new Color(153, 153, 204));
		number2Btn.setBounds(121, 208, 97, 52);
		contentPane.add(number2Btn);
		
		number5Btn = new JButton("5");
		number5Btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				number5Btn.setBackground(new Color(200, 153, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				number5Btn.setBackground(new Color(153, 153, 204));
			}
		});
		number5Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number5Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setNumber(input, "5");
			}
		});
		number5Btn.setForeground(UIManager.getColor("text"));
		number5Btn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		number5Btn.setBorder(null);
		number5Btn.setBackground(new Color(153, 153, 204));
		number5Btn.setBounds(121, 273, 97, 52);
		contentPane.add(number5Btn);
		
		number3Btn = new JButton("3");
		number3Btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				number3Btn.setBackground(new Color(200, 153, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				number3Btn.setBackground(new Color(153, 153, 204));
			}
		});
		number3Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setNumber(input, "3");
			}
		});
		number3Btn.setForeground(UIManager.getColor("text"));
		number3Btn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		number3Btn.setBorder(null);
		number3Btn.setBackground(new Color(153, 153, 204));
		number3Btn.setBounds(230, 208, 97, 52);
		contentPane.add(number3Btn);
		
		number6Btn = new JButton("6");
		number6Btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				number6Btn.setBackground(new Color(200, 153, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				number6Btn.setBackground(new Color(153, 153, 204));
			}
		});
		number6Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number6Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setNumber(input, "6");
			}
		});
		number6Btn.setForeground(UIManager.getColor("text"));
		number6Btn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		number6Btn.setBorder(null);
		number6Btn.setBackground(new Color(153, 153, 204));
		number6Btn.setBounds(230, 273, 97, 52);
		contentPane.add(number6Btn);
		
		number8Btn = new JButton("8");
		number8Btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				number8Btn.setBackground(new Color(200, 153, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				number8Btn.setBackground(new Color(153, 153, 204));
			}
		});
		number8Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number8Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setNumber(input, "8");
			}
		});
		number8Btn.setForeground(UIManager.getColor("text"));
		number8Btn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		number8Btn.setBorder(null);
		number8Btn.setBackground(new Color(153, 153, 204));
		number8Btn.setBounds(121, 338, 97, 52);
		contentPane.add(number8Btn);
		
		number9Btn = new JButton("9");
		number9Btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				number9Btn.setBackground(new Color(200, 153, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				number9Btn.setBackground(new Color(153, 153, 204));
			}
		});
		number9Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		number9Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setNumber(input, "9");
			}
		});
		number9Btn.setForeground(UIManager.getColor("text"));
		number9Btn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		number9Btn.setBorder(null);
		number9Btn.setBackground(new Color(153, 153, 204));
		number9Btn.setBounds(230, 338, 97, 52);
		contentPane.add(number9Btn);
		
		plusBtn = new JButton("+");
		plusBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		plusBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				plusBtn.setBackground(new Color(255, 0, 90));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				plusBtn.setBackground(new Color(255, 0, 153));
			}
		});
		plusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n1 = l1.saveNumber(input);
				operation = '+';
			}
		});
		plusBtn.setForeground(UIManager.getColor("text"));
		plusBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		plusBtn.setBorder(null);
		plusBtn.setBackground(new Color(255, 0, 153));
		plusBtn.setBounds(339, 275, 123, 115);
		contentPane.add(plusBtn);
		
		equalsBtn = new JButton("=");
		equalsBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				equalsBtn.setBackground(new Color(100, 210, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				equalsBtn.setBackground(new Color(51, 204, 255));
			}
		});
		equalsBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		equalsBtn.setForeground(UIManager.getColor("text"));
		equalsBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
		equalsBtn.setBorder(null);
		equalsBtn.setBackground(new Color(51, 204, 255));
		equalsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n2 = l1.saveNumber(input);
				l1.operation(input, n1, n2, operation);
			}
		});
		equalsBtn.setBounds(339, 403, 123, 84);
		contentPane.add(equalsBtn);
		
		
		JLabel lblCalculator = new JLabel("Calculator");
		lblCalculator.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		lblCalculator.setBounds(188, 13, 103, 27);
		contentPane.add(lblCalculator);
		
		dotBtn = new JButton(".");
		dotBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				dotBtn.setBackground(new Color(200, 153, 204));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				dotBtn.setBackground(new Color(153, 153, 204));
			}
		});
		dotBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dotBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setDot(input);
			}
		});
		dotBtn.setForeground(Color.WHITE);
		dotBtn.setFont(new Font("Segoe UI Semibold", Font.BOLD, 40));
		dotBtn.setBorder(null);
		dotBtn.setBackground(new Color(153, 153, 204));
		dotBtn.setBounds(230, 403, 97, 84);
		contentPane.add(dotBtn);
	}
}
