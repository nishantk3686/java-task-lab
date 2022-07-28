/*
Program to Display Bank details of a Account holder
 by Nishant Kumar
 */

import java.util.Scanner;
class Bank              						      //It's my main class
{
public static void main(String args[])
{
	int amount=4000,accountNumber=2287410,accountBalance=15600;
	String customerName="Nishant Kumar";             //Name of the account holder
	Scanner sc = new Scanner(System.in);
	customerDetails customer1 = new customerDetails();				
	customer1.createAccount(accountNumber,customerName,accountBalance);		//Method called from customerDetails class.
	customer1.getAmount();
	customer1.depositAmount(amount);
	customer1.getAmount();
	customer1.withdrawAmount(amount);
	customer1.getAmount();
	customerDetails customer2 = new customerDetails();
	sc.close();
}
}			//1st class ends here.

class customerDetails     //Starting of 2nd class
{
	private int accNumber;                //here I have decleared 3 Instance variables.
	private String accHolderName;
	private int accBalance;
    public void createAccount(int accountNumber, String customerName, int accountBalance)
{
	accNumber = accountNumber;             //Details of the account holder are stored here
	accHolderName = customerName;        
	accBalance = accountBalance;
}
public void depositAmount(int amount)		//In this method we are depositing the amount to customer's account
{	
	System.out.println("If You are depositing. "+amount);		
	accBalance += amount;
}
public void withdrawAmount(int Amount)		//In this method we are withdrawing the customer's required amount from his account.	
{
	System.out.println("If You are withdrawing "+Amount); 	
 	accBalance -= Amount;									
	
}
public void getAmount()			//this method we are displaying the customer account details.
			
{
	System.out.println(accHolderName+" You Have "+accBalance+" in Your Savings Account");
}
}