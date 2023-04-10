package collections;
import static java.lang.Math.*;

import java.util.ArrayList;


public class CreateArray {
	static int num1;
	
	int num2;
	String name = "i am karthik";
	
	static {
		System.out.println("static block 1");
		num1 = 66;
	}
	static {
		System.out.println("static block 2");
		num1 = 90;
	}
	{
		System.out.println("non static block number");
		num2 = 99;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		ArrayList ar = new ArrayList();
		ar.add(5);
		ar.add(2);
		ar.add(3);
//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}
//		for(int i :array) {
//			System.out.println(i);
//		}
		System.out.println(ar);
		CreateArray ca = new CreateArray();
		System.out.println(num1);
		System.out.println(ca.num2);
		System.out.println("name "+ ca.name);
		System.out.println("is equals "+ ca.equals(ca));
		System.out.println("length method" + ca.name.length());
		
		//Mutable 
		StringBuffer demo1 = new StringBuffer("Good");
		System.out.println(demo1.hashCode());
		System.out.println(demo1);
		demo1.append(" Afternoon");
		System.out.println(demo1);
		System.out.println(demo1.hashCode());
		
		//Immutable
		
		StringBuilder demo2 = new StringBuilder("Good");
		System.out.println(demo2.hashCode());
		System.out.println(demo2);
		demo2.append(" Evening");
		System.out.println(demo2);
		System.out.println(demo2.hashCode());
		
	}

	

}
