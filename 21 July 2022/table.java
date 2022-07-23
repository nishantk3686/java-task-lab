//*write a java program to print tables
import java.util.Scanner;
class table
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of table :");
	int num = sc.nextInt();
	System.out.println("Set the limit upto :");
	int limit= sc.nextInt();

	for(int i=1;i<=limit;i++)
	{
		System.out.print(num+" x "+i+" = ");
		int tabl = num*i;
		System.out.println(tabl);	
	}
}
}