
//Program to print half pyramid a using numbers



import java.util.Scanner;

public class HalfPyramidUsingNum 
{

	public static void main(String[] args) 
	
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of rows in the pattern:");
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
