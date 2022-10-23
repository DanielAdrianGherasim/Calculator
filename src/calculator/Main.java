package calculator;

import java.awt.EventQueue;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		System.out.println(calculator.addition(2, 3));
		
		System.out.println(calculator.substration(2, 3));
		
		System.out.println(calculator.multiply(2, 3));
		
		System.out.println(calculator.divide(2, 0));
		
		System.out.println(calculator.divide(2, 1));
		
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
}	
