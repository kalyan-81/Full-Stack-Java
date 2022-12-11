import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) 
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number  to check prime or not: ");
		num = sc.nextInt();
		sc.close();
		
		boolean foundFact=true;
		if(num ==1 || num==0)
			foundFact =false;
		
		for(int i=2;i<num; i++)
		{
			if(num%i == 0)
			{
				foundFact = false;
			    break;
			}
		}
		
		if(foundFact)
			System.out.println("prime");
		else
			System.out.println("not prime");
		
		
		

	}

}
