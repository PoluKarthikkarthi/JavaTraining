package collections;
 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import abstractClass.UserNotFoundException;

class ExceptionHandling {
	
	public ExceptionHandling() {
		System.out.println("constructor expection");
	}
	
	public static void main(String[] args) throws IOException
	{
		// *****Exception Handing with try and catch ******
		
//		try{
//		int x=0;
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		
//		System.out.println("Enter x:");
//		x= Integer.parseInt(br.readLine());
//		System.out.println("Enter y:");
//		String y= String.valueOf(br.readLine());
//		String z=x+y;
//
//		System.out.println("Z :" +z);
//		}
//		//****if we know the exception we can give directly like below code
////		catch(NumberFormatException  nfe){
////			System.out.println("Number form exce" + "         .."+ nfe);
////			//nfe.printStackTrace();
////		}
//		catch(Exception ex){
//			System.out.println("except"+ "------------------"+ ex);
//			//nfe.printStackTrace();
//		}
//		finally
//		{
//			System.out.println("Finally");
//		}
		
		//**** exception handling with throw and throws
		try {
			String uName = null;
			String Password = null;
				
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			uName = br.readLine();
			Password= br.readLine();
			if(uName.equals("Polu Karthik") && Password.equals("12345")) {
				System.out.println("sucessfully");
			}
			else{
				throw new UserNotFoundException();
			
			}
		}
		catch(UserNotFoundException unf)
		{
			System.out.println(unf);
		}
	}

}