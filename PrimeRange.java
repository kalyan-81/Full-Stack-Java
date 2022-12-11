import java.util.Scanner;

public class PrimeRange 
{

	public static void main(String[] args) 
	{
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("start from : ");
		n1=sc.nextInt();
		System.out.println("end at: ");
		n2=sc.nextInt();
		sc.close();
		
			while(n1<=n2)
			{
				int fact=0;
				for(int i=1;i<=n2;i++)
				{
			      if(n1%i==0)
				    fact=fact+1;
		          
		      
			    }
				if(fact==2)
				       System.out.print(n1+ " ");
				n1=n1+1;
		   
		   }

	}

}
