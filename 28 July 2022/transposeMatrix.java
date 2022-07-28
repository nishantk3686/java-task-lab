/*Program to get transpose of a matrix
 by Nishant Kumar
 */
import java.util.Scanner;
class transposeMatrix
{
public static void main(String args[])
{
	int i,j;
	Scanner br = new Scanner(System.in);
	System.out.println("Enter the rows for your matrix.");
	int row = br.nextInt();			//Input for rows of Matrix.
	System.out.println("Enter the columns for your matrix.");
	int col = br.nextInt();		//Input for columns of matrix.
	int arr[][] = new int[row][col];
	System.out.println("----Enter the elements for your matrix----");
	for(i=0;i<row;i++)
	{  
		for(j=0;j<col;j++)
		{
			arr[i][j] = br.nextInt();			//input for elements of matrix
		}
	}
	System.out.println("Matrix elements entered by you are");
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)	
		{
			System.out.print(arr[i][j]+" ");	//Printing the elements of matrix 
		}
		System.out.println(" ");			//Adding some space 
	}
	changeArray(row,col,arr);
	br.close();				//Scanner object closed.
}
public static void changeArray(int len,int size,int brr[][])
{
	int m,n;
	System.out.println("----Here is the Transpose of your matrix----");
	for(m=0;m<len;m++)
	{
		for(n=0;n<size;n++)
		{
			System.out.print(brr[n][m]+" ");			//Performing Transpose of entered matrix.
		}
		System.out.println(" ");					//Adding space 
	}
}
}