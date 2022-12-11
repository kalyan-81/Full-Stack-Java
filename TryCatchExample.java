// Exception: Exception is a runtime error. To handle the errors java provides 5 keywords:
//try
//catch
//throw
//throws
//finally

import java.io.*;
public class TryCatchExample {

	public static void main(String[] args) 
	{
		// try block should contain code which can throw exceptions
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.println("Enter your name");
			String str = br.readLine();
			System.out.println("Enter your age");
			int age = Integer.parseInt(br.readLine());
			System.out.println("Name="+str);
			System.out.println("Age="+age);
		}
		//catch block must appear immediately after below try block and it meant for catching 
		//the Exceptions and handling the error message
		catch(IOException ie)// IOException is the className
		{
			System.out.println(ie);
		}
		

	}

}
