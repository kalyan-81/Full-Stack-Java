import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int first=0;
		int second =1;
		int fib;
		System.out.println("Enter the number of elements to be fibonacci series: ");
		Scanner num =new Scanner(System.in);
		int n = num.nextInt();
		num.close();
		
		System.out.print("the fibonacci series "+ first + " "+ second+" ");
		
		for(int i=0;i<n;i++)
		{
			
			fib =first+second;
			first =second;
			second=fib;
			System.out.print(fib+" ");
			
		}

	}

}
