import java.util.Scanner;

public class FiboRec {
	
	public static void fibRec(int count,int n1,int n2)
	
	{  
		int n = count;
		int first = n1;
		int second =n2;
		while(n>0)
		{
		  int fib= first+second;
		  first =second;
		  second=fib;
		  System.out.print(fib+" ");
		  n=n-1;
		
		}
		
		
	}

	public static void main(String[] args) 
	{
		int first=0,second=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements in fibonacci series: ");
		
		int count = sc.nextInt();
		sc.close();
		
		System.out.print( first+" "+second+" ");
		fibRec((count-2),first,second);

	}

}
