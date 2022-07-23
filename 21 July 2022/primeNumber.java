class primeNumber
{
	public static void main (String args[])
	{
		int num=18,coef=0;
			for(int i=1;i<=num;i++)
			{
			 if(num%i==0)
			 {
				coef++;
			
			 }
			}
		
	if(coef==2)
		{
		System.out.println(num+" is prime ");
		}
		 else
		 {
			 System.out.println(num +"is not prime");
		 }
			 
	}


}