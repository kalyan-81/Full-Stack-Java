

//Program to print half pyramid using *


import java.util.Scanner;

public class RightTriangleStar 
{

	public static void main(String[] args) 
	{
		System.out.println("number of rows: ");
		Scanner sc =new Scanner(System.in);
		int rows=sc.nextInt();
		sc.close();
		for(int i=0;i<rows;i++)
		 {
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
		
		    System.out.println();
		

	}

	}
}
