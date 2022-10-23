package calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MyWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	List<Double> numbers = new ArrayList<>();
	List<String> operations = new ArrayList<>();
	Calculator calculator = new Calculator();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWindow frame = new MyWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 303, 306);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btnNewButton.setBounds(25, 87, 51, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btnNewButton_1.setBounds(86, 87, 51, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btnNewButton_9.setBounds(147, 87, 51, 34);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("6");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btnNewButton_9_1.setBounds(147, 132, 51, 34);
		contentPane.add(btnNewButton_9_1);
		
		JButton btnNewButton_1_1 = new JButton("5");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btnNewButton_1_1.setBounds(86, 132, 51, 34);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btnNewButton_2.setBounds(25, 132, 51, 34);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_9_2 = new JButton("3");
		btnNewButton_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		btnNewButton_9_2.setBounds(147, 177, 51, 34);
		contentPane.add(btnNewButton_9_2);
		
		JButton btnNewButton_1_2 = new JButton("2");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				textField.setText(textField.getText() + "2");

			}
		});
		btnNewButton_1_2.setBounds(86, 177, 51, 34);
		contentPane.add(btnNewButton_1_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");

			}
		});
		btnNewButton_3.setBounds(25, 177, 51, 34);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_9_2_1 = new JButton(".");
		btnNewButton_9_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnNewButton_9_2_1.setBounds(147, 222, 51, 34);
		contentPane.add(btnNewButton_9_2_1);
		
		JButton btnNewButton_1_2_1 = new JButton("0");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btnNewButton_1_2_1.setBounds(86, 222, 51, 34);
		contentPane.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_9_3 = new JButton("/");
		btnNewButton_9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "/");
				operations.add("/");
			}
		});
		btnNewButton_9_3.setBounds(213, 87, 51, 34);
		contentPane.add(btnNewButton_9_3);
		
		JButton btnNewButton_9_1_1 = new JButton("*");
		btnNewButton_9_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
				operations.add("*");

			}
		});
		btnNewButton_9_1_1.setBounds(213, 132, 51, 34);
		contentPane.add(btnNewButton_9_1_1);
		
		JButton btnNewButton_9_2_2 = new JButton("-");
		btnNewButton_9_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "-");
				operations.add("-");
			}
		});
		btnNewButton_9_2_2.setBounds(213, 177, 51, 34);
		contentPane.add(btnNewButton_9_2_2);
		
		JButton btnNewButton_9_2_1_1 = new JButton("+");
		btnNewButton_9_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "+");
				operations.add("+");
			}
		});
		btnNewButton_9_2_1_1.setBounds(213, 222, 51, 34);
		contentPane.add(btnNewButton_9_2_1_1);
		
		JButton btnNewButton_3_1 = new JButton("=");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] results=textField.getText().split("[-+*/]");
				Arrays.asList(results).stream().forEach(string -> numbers.add(Double.parseDouble(string)));
				
				Result result = calculte(textField.getText());
				
				if(result.isValid()) {
					textField.setText(textField.getText() + "=" + result);
				}
				else {
					textField.setText(result.getMessage());
				}
			}
		});
		btnNewButton_3_1.setForeground(Color.RED);
		btnNewButton_3_1.setBounds(25, 222, 51, 34);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_9_2_1_2 = new JButton("C");
		btnNewButton_9_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				numbers = new ArrayList<>();
				operations = new ArrayList<>();
			}
		});
		btnNewButton_9_2_1_2.setBounds(213, 29, 51, 34);
		contentPane.add(btnNewButton_9_2_1_2);
		
		textField = new JTextField();
		textField.setBounds(25, 26, 173, 40);
		contentPane.add(textField);
		textField.setColumns(10);
	}
	
	public Result calculte(String input) {
		if(operations.stream().anyMatch(input::contains)) {
			try {
				operations.forEach(op -> {
					Double num1 = numbers.get(0);
					Double num2 = numbers.get(1);
					numbers.remove(0);
					Result result = cal(num1, num2, op);
					if(result.isValid()) {
						numbers.set(0, result.getValue());
					}
					
					else throw new IllegalArgumentException(result.getMessage());
			});
			} catch(IllegalArgumentException e) {
				return new Result(e.getMessage());
			}
			
			return new Result(numbers.get(0));
		}
		return new Result(input);
	}
	
	public Result cal(Double num1, Double num2, String operation)
	{
		switch(operation) {
		case "+":
			return new Result(calculator.addition(num1,  num2));
			
		case "-":
			return new Result(calculator.substration(num1,  num2));
			
		case "*":
			return new Result(calculator.multiply(num1,  num2));
			
		case "/":
			return new Result(calculator.divide(num1,  num2));
		}
		
		return new Result("Operatie nedefinita");
		
	}
}
