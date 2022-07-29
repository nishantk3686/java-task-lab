// Program to show use of ladder for loop 
class labledFor
{
public static void main(String args[])
{

	int i,j;
	outer: //label for outer loop
	for(i=1;i<=3;i++)
	{
		inner: //label for inner loop
		for(j=1;j<=3;j++) 
		{
			if(i==2 && j==2) // check the condition for 2 2 
			{
				continue inner; //loop will print except number 2 2
			}	
			else
			{
				System.out.println(i+" "+j);
			}
		}
	}

}

}