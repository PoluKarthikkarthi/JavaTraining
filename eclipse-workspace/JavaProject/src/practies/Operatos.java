package practies;

import java.util.Scanner;

public class Operatos {
	
//1)Write a Java program to perform basic Calculator operations.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Numbers");
		int firstNumber = sc.nextInt();
		
		System.out.println("Enter the Second Numbers");
		int secondNumber = sc.nextInt();
		
		int result = 0 ;
		System.out.println("Select the oparetor:(+, -, /, %, *)");
		char operator = sc.next().charAt(0);
		
		switch(operator) {
			case '+' :
				result = firstNumber + secondNumber;
				break;
			case '-' :
				result = firstNumber - secondNumber;
				break;
			case '/' :
				result = firstNumber / secondNumber;
				break;
			case '%' :
				result = firstNumber % secondNumber;
				break;
			case '*' :
				result = firstNumber * secondNumber;
				break;
			default:
				System.out.println("Enter the value is wronge error");
				break;	
		}
		System.out.println("result" + "   " + result);
	}
}
