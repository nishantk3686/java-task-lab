import java.util.Scanner;

class patternReverse
{

public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Set the Limit for pattern :");
	int limit = sc.nextInt();
		for(int i=limit;i>=1;i--)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print('*');
		}
	System.out.println("");
	}

}

}