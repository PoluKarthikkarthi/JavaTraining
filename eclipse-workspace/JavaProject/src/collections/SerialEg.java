package collections;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
         private int eno;
	 private String ename;
		 
	 public Employee()
	 {		 
		 System.out.println("From Employee Constructor");
	 }
	 public Employee(int eno,String ename)
	 {		 
		this.eno =eno;
		this.ename = ename;
	 }
	 public void setEno(int eno)
	 {
		 this.eno=eno;
	 }
	 public int getEno()
	 {
		 return eno;
	 }
	 public void setEname(String ename)
	 {
		 this.ename=ename;
	 }
	 public String getEname()
	 {
		 return ename;
	 }		 
	
	public String toString()
	 {
		 return "Employee  [ " + this.eno +"  " + this.ename+  "--------------"+ "  ]";
	 }
}
class SerialEg
{
	public static void main(String[] aaa) throws IOException
	{
		try{
		Employee emp = new Employee(19000128,"Polu Karthik");
	
		FileOutputStream fos = new FileOutputStream("C:\\Users\\kpolu\\eclipse-workspace\\JavaProject\\src\\collections\\karthik.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp);
		System.out.println("Serilized to file dedalus.txt");
		oos.close();
		fos.close();
		throw new FileNotFoundException();
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println("No file");
		}
	}
}

















