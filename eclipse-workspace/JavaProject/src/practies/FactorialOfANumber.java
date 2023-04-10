package practies;

import java.util.Scanner;

public class FactorialOfANumber {
	
	static int fact(int n) {
		int output;
		if(n==1)
			return 1;
		
		output = fact(n-1)* n;
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialOfANumber fon = new FactorialOfANumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		
		int enterNumber = sc.nextInt();
		int result = fon.fact(enterNumber);
		
		System.out.println("factorial result:" + "  "+ result);
		
	}

}
