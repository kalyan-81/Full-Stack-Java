// example for finally keyword

/* finally: finally block must appear either below catch block or below try block.
code written inside finally block will be executed always */

public class FinallyExample 
{

	public static void main(String[] args) 
	
	{
		int a =20;
		int b=0;
		int res;
		
		try
		{
			res=a/b;
		}
		catch(ArithmeticException ae )
		{
			System.out.println(ae);
		}
		
		finally// first this block will execute if there is an exception and if we dont handle it.
		{
			System.out.println("this is independent and always executed");
		}
	}

}
