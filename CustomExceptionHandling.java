// Example for throw keyword


//Q. How do you define your own checked and unchecked Exception(Custom Exception)
/* Ans: To define our own checked Exception we have to write a class which extends Exception class.
 * To define our own unchecked Exception we have to write a class which extends RuntimeException class  */




import java.util.Scanner;

class BalanceException extends RuntimeException
{
	@Override
	public String toString()
	{
		return "transaction rejected due to No Balance";
	}
}



public class CustomExceptionHandling
{
	public static void main(String[] args)
	{
		double balance =5000;
		double amtWithdraw;
		Scanner sc = new Scanner(System.in);
		System.out.println("How much money do you want to withdraw?");
		amtWithdraw = sc.nextDouble();
		
		try
		{
			if(amtWithdraw > balance)
				throw new BalanceException();
			balance= balance -amtWithdraw;
			System.out.println("transaction accepted");
			System.out.println("remaining balance is "+balance);
		}
		catch(BalanceException ar)
		{
			System.out.println(ar);
		}
	}
}