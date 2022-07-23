// write a java program to print sum of odd numbers upto N

import java.util.Scanner;
class sumOfOddNumbers
{
 public static void main(String args[])
 {
  int v=0,i,sum=0;  //Initialization
  Scanner sc = new Scanner(System.in); //scanner function
  System.out.println("Enter the number to print sum upto:- "); 
  v = sc.nextInt();  // Taking the input from the user
  for(i=2;i<=v;i++)  // Checking the condition
  {
   if(i%2!=0)
   {
    sum+=i;
   }
  }
 System.out.println(sum);  //Output
 }
}