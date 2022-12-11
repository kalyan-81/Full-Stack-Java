
public class primeNumMeth 
{
	public static void checkPrime(int num)
	{
		int n =num;
		boolean foundFactor=true;
		if(n==1 ||n==0)
		{
			System.out.println( n+" is not prime");
		}
		
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i ==0)
				{
					foundFactor=false;
					System.out.println(n+" is not prime");
					break;
				}
			}
		
		
		  if(foundFactor)
		  {
			System.out.println(n+" is prime");
		  }
	}
}
			
		
public static void main(String[] args) {
		checkPrime(1);
		checkPrime(2);
		checkPrime(6);
		checkPrime(8);
		checkPrime(100);
		checkPrime(50);

	}

}
