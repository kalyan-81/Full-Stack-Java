//Program to print half pyramid using alphabets
public class HalfPyramidUsingChar 
{

	public static void main(String[] args) 
	{
		int Ascii=65;// the ASCII value of A =65;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)Ascii+" ");
			}
			Ascii++;
		   System.out.println();
		   
		}

	}

}
