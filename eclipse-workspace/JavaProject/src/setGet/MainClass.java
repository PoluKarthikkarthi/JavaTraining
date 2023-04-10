package setGet;

import java.util.Scanner;


import practies.EmployeController;
import practies.Employee;
import practies.firstClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ep = new Employee(12345,"qwert");
		String choice;
		Scanner sc = new Scanner(System.in); 
		 
//		 int empolyeeID = ep.getId();
		 
//		 String empolyeeName = ep.setEname(sc.next());
//		 
//		 System.out.println("enter the employee name " + empolyeeName);
//		System.out.println("enter the employee id " + empolyeeID);
//		System.out.println(ep.getEid());
//		
//		System.out.println(ep.getEmpName());
//		System.out.println(ep);
//		
		EmployeController method = new EmployeController();
		method.addEmployee();
//		
//		firstClass fc = new firstClass();
		
		
		
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			int ch =sc.nextInt();
			switch (ch) {
				case 1: method.addEmployee();
				break;
				default:
						System.out.println("Enter right choice");
						break;
					
				}
			System.out.println("Do u want to continue Y or y");
			choice= sc.next();	
		}
	}
	
	
//model view controller


