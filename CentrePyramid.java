
public class CentrePyramid 
{

	public static void main(String[] args) 
	
	{
		//upper triangle
		
		for(int i=1;i<=5;i++)// rows
		{
			for(int j=1;j<=5-i;j++) // column spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) // column stars
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		// down triangle
		
		for(int i=1;i<=5;i++)// rows
		{
			for(int j=1;j<=i;j++) // column spaces
			{
				System.out.print(" "); 
			}
			for(int k=1;k<=5-i;k++) // column stars
			{
				System.out.print(" *");
			}
			System.out.println();
		}

	}

}
