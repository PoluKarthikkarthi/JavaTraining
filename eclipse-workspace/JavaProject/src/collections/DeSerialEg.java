package collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class DeSerialEg
{
	public static void main(String[] aaa) throws IOException
	{
		try{
		
	
		FileInputStream fis = new FileInputStream("C:\\Users\\kpolu\\eclipse-workspace\\JavaProject\\src\\collections\\karthik.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee emp = (Employee)ois.readObject();
		System.out.println("DeSerilized from file dedalus.txt");
		System.out.println(emp.getEno());
		System.out.println(emp.getEname());
//		ois.close();
//		fis.close();
		throw new FileNotFoundException();
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println("No file");
		}
		catch(ClassNotFoundException cnf)
		{
			System.out.println("No Emp class");
		}

	}
}

















