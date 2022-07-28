/*Program to get transpose of a matrix
   By Nishant Kumar
*/
import java.util.Scanner;
class transposeMatrix
{
public static void main(String args[])
{
	int i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the rows for your matrix.");
	int row = sc.nextInt();			//Input for rows of Matrix.
	System.out.println("Enter the columns of your matrix");
	int col = sc.nextInt();		//Input for columns of matrix
	int arr[][] = new int[row][col];
	System.out.println("--Enter the elements for matrix--");
	for(i=0;i<row;i++)
	{  
		for(j=0;j<col;j++)
		{
			arr[i][j] = sc.nextInt();			//Input of elements of matrix
		}
	}
	System.out.println("Given matrix elements ");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)	
		{
			System.out.print(arr[i][j]+" ");	//Printing the elements of matrix
		}
		System.out.println(" ");			//Printing space 
	}
	changeArray(row,col,arr);
	sc.close();				//Scanner object closed.
}
public static void changeArray(int len,int size,int brr[][])
{
	int m,n;
	System.out.println("---Result of Transpose of your matrix----");
	for(m=0;m<len;m++)
	{
		for(n=0;n<size;n++)
		{
			System.out.print(brr[n][m]+" ");			//Doing Transpose of entered matrix.
		}
		System.out.println(" ");					//Printing space 
}
}
}