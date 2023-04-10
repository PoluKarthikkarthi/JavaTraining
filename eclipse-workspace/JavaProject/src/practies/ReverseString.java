package practies;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		
		String name = sc.nextLine();
		String nstr = "";
		char ch;
		
		for(int i=0; i<name.length(); i++) {
			ch = name.charAt(i); 
	        nstr = ch + nstr; 
		}
		System.out.println("result :" + "   " + nstr);	
	}

}
