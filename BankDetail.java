//Create a class named Bank_Account with data memebers accountNo, userName, email, accountType and accountBalance, Also create methods getAccountDetails() and displayAccountDetails()

import java.util.Scanner;

class Bank_Account{

String actNo;
String username;
String email;
String acttype;
double balance;

 public void getDisplayActDetails(){
	  Scanner sc = new Scanner(System.in);
      System.out.println("enter a username=");
      username=sc.nextLine();

	  System.out.println("enter a email adrees=");
	  email=sc.nextLine();

	  System.out.println("enter a account type=");
	  acttype=sc.nextLine();

	  System.out.println("enter a account number=");
	  actNo=sc.nextLine();

	  System.out.println("enter a balance=");
	  balance=sc.nextDouble();
}

  public void DisplayActDetails()
	{
	System.out.println("-----Account Details-----");

	System.out.println("username      ="+username);
	System.out.println("account number="+actNo);
	System.out.println("email adress  ="+email);
	System.out.println("Account Type  ="+acttype);
	System.out.println("Balance       ="+balance);
	}
}


public class BankDetail{
	public static void main(String[] args) {
		Bank_Account jv = new Bank_Account();

		jv.getDisplayActDetails();
		jv.DisplayActDetails();
	}
}