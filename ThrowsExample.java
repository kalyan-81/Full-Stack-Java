// example for throws 

/*throws keyword must appear at the header of a method. it is used to 
declare one or more checked exceptions at the header of a method.*/

import java.io.*;
public class ThrowsExample 
{
	public static void takeInput() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String str = br.readLine();
		System.out.println("Enter your age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Name="+str);
		System.out.println("Age="+age);
		
	}
	

	public static void main(String[] args) 
	{
		
		
		try
		{
			takeInput();
			
		}
		catch(IOException ie)
		{
			System.out.println(ie);
		}

	}

}
