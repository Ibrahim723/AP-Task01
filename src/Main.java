import java.util.Scanner;
import java.util.LinkedList;


public class Main {
	
	static LinkedList<Customer> customers = new LinkedList<Customer>();
	
	static void displayAllCustomers()
	{
		for(int i=0;i<customers.size();i++)
			customers.get(i).display();
	}
	
	public static void main(String[] args) 
	{
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		int choice; 
		do 
		{
			System.out.println("--------------------- ACCOUNT MANAGEMENT SYSTEM ---------------------");
			System.out.println("");
	        System.out.println("Select the required option:");
	        System.out.println("Press 1 to OPEN a new account");
	        System.out.println("Press 2 to CLOSE an existing account");
	        System.out.println("Press 3 to change the interest rate for all Savings accounts");
	        System.out.println("Press 4 to Login an account");
	        System.out.println("Press 5 for to view all account deductions");
	        System.out.println("Press 6 to Add a new customer");
	        System.out.println("Press 0 to EXIT");
			System.out.println("---------------------------------------------------------------------");
			
			choice = scanner.nextInt();
			scanner.nextLine();
			if(choice<0 || choice>6) 
			{
				System.out.println("Invalid option selected! Please choose a correct option...");
				System.out.println("");
			}
	        if(choice == 1) 
	        {
	        	int account_type = 0;
	        	do 
	        	{
					System.out.println("--------------------- NEW ACCOUNT WINDOW ---------------------");
					System.out.println("");
					System.out.println("Press 1 to open a SAVINGS account or Press 2 to open a CHECKING account");
					System.out.println("--------------------------------------------------------------");
					System.out.println("");
					account_type = scanner.nextInt();
					scanner.nextLine();
					if(account_type<1 || account_type>2)
					{
						System.out.println("Invalid option selected! Please choose a correct option...");
						System.out.println("");
					}
	        	}while(account_type<1 || account_type>2);
	        	System.out.println("Enter the phone number of the customer");
				String number;
	        	number = scanner.nextLine();
				int i;
				boolean check = false;
				for(i=0;i<customers.size();i++)
				{
					if(customers.get(i).getNumber().equals(number))
					{
						System.out.println("Customer Found!");
						check = true;
						break;
					}
					
				}
				if(check == false) 
				{
					System.out.println("Customer not found...");
					System.out.println("Enter a correct number");
					continue;
				}
				if(account_type==1) 
				{
					if(customers.get(i).getSavings() == true)
					{
						System.out.println("This customer already has a savings account.");
						System.out.println("A customer can open a single savings account...");
					}
					else
					{
						double balance = 0;
						System.out.println("Enter the starting balance of the account");
						balance = scanner.nextDouble();
						scanner.nextLine();
						customers.get(i).setSavings(true);
						Savings saving_account = new Savings(balance,true);
						customers.get(i).setSavingsAccount(saving_account); 
						System.out.println("Savings account opened!");
					}
				}
				if(account_type==2) 
				{
					if(customers.get(i).getChecking() == true)
					{
						System.out.println("This customer already has a checking account.");
						System.out.println("A customer can open a single checking account...");
					}
					else
					{
						double balance = 0;
						System.out.println("Enter the starting balance of the account");
						balance = scanner.nextDouble();
						scanner.nextLine();
						customers.get(i).setChecking(true);
						Checking checking_account = new Checking(balance,true);
						customers.get(i).setCheckingAccount(checking_account); 
						System.out.println("Checking account opened!");
					}
				}
				
	        }
	        else if(choice == 2)
	        {
	        	int account_type = 0;
	        	do 
	        	{
					System.out.println("--------------------- ACCOUNT  CLOSING WINDOW ---------------------");
					System.out.println("");
					System.out.println("Press 1 to close a SAVINGS account or Press 2 to close a CHECKING account");
					System.out.println("--------------------------------------------------------------");
					System.out.println("");
					account_type = scanner.nextInt();
					scanner.nextLine();
					if(account_type<1 || account_type>2)
					{
						System.out.println("Invalid option selected! Please choose a correct option...");
						System.out.println("");
					}
	        	}while(account_type<1 || account_type>2);
	        	System.out.println("Enter the phone number of the customer");
				String number;
	        	number = scanner.nextLine();
				int i;
				boolean check = false;
				for(i=0;i<customers.size();i++)
				{
					if(customers.get(i).getNumber().equals(number))
					{
						System.out.println("Customer Found!");
						check = true;
						break;
					}
					
				}
				if(check == false) 
				{
					System.out.println("Customer not found...");
					System.out.println("Enter a correct number");
					continue;
				}
				if(account_type == 1) 
				{
					if(customers.get(i).getSavings() == false)
					{
						System.out.println("This customer has no savings account.");
						System.out.println("Account cannot be closed...");
					}
					else
					{
						customers.get(i).setSavings(false);
						customers.get(i).setSavingsAccount(null);
						System.out.println("Savings account closed!");
					}
				}
				if(account_type==2) 
				{
					if(customers.get(i).getChecking() == false)
					{
						System.out.println("This customer has no checking account.");
						System.out.println("Account cannot be closed...");
					}
					else
					{
						customers.get(i).setChecking(false);
						customers.get(i).setCheckingAccount(null);
						System.out.println("Checking account closed!");
					}
				}
				
	        }
	        else if(choice == 3)
	        {
	        	double i;
	        	do 
	        	{
		        	System.out.println("Enter the required interest rate in percentage.");
		        	i = scanner.nextDouble();
	        		if(i >= 0 && i<= 100)
	        			Savings.setInterestRate(i);
	        		else System.out.println("Please enter a correct value (between 0 and 100)");
	        	}while(i<0 || i>100);
	        	
	        }
	        else if(choice == 4)
	        {
	        	System.out.println("Enter your Account Number to login");
				String number;
	        	number = scanner.nextLine();
				int i;
				boolean check = false;
				boolean type = false;
				for(i=0;i<customers.size();i++)
				{
					if(customers.get(i).getSavingAccount().account_number.contentEquals(number))
					{
						System.out.println("Savings Account Logged in!");
						check = true;
						type = true;
						break;
					}
					else if(customers.get(i).getCheckingAccount().account_number.contentEquals(number))
					{
						System.out.println("Checking Account Logged in!");
						check = true;
						type = false;
						break;
					}
					
				}
				if(check == false) 
				{
					System.out.println("Account not found...");
					System.out.println("Enter a correct account number");
					continue;
				}
				else
				{
					int option;
					do
					{
						System.out.println("---------------------------------------------------");
						System.out.println("Select an option from the following:");
					   	System.out.println("Enter 1 to deposit amount in your account");
					 	System.out.println("Enter 2 to withdraw from your account"); 			
			 		    System.out.println("Enter 3 to check balance of your account");
			 		    System.out.println("Enter 4 to print statement of your account");
			 		    System.out.println("Enter 5 to transfer amount to another account");
			 		    System.out.println("Enter 6 to calculate zakat for your account(Savings)");
			 		   System.out.println("Enter 7 to calculate interest for your account(Savings)");
			 		    System.out.println("---------------------------------------------------");
			 		    option =  scanner.nextInt();
			 		    scanner.nextLine();
			 		    if(option<1 || option>7)
			 		    {
			 		    	System.out.println("Invalid option selected...");
			 		    	System.out.println("Enter a correct option from the menu");
			 		    }
					}while(option<1 || option>7);
					if(option == 1)
					{
						double deposit;
						System.out.println("Enter amount to be deposited");
						deposit = scanner.nextDouble();
						scanner.nextLine();
						if(type == true)
						{
							customers.get(i).getSavingAccount().makeDeposit(deposit);
						}
						else
						{
							customers.get(i).getCheckingAccount().makeDeposit(deposit);
						}
					}
					else if(option == 2)
					{
						double withdraw;
						System.out.println("Enter amount to be withdrawn");
						withdraw = scanner.nextDouble();
						scanner.nextLine();
						if(type == true)
						{
							if(withdraw <= customers.get(i).getSavingAccount().getBalance())
							{
								customers.get(i).getSavingAccount().makeWithdrawal(withdraw);
							}
							else 
							{
								System.out.println("Transaction failed...");
								System.out.println("Withdraw amount cannot greater than current balance");
								
							}
						}
						else
						{
							if(withdraw <= customers.get(i).getCheckingAccount().getBalance())
							{
								customers.get(i).getCheckingAccount().makeWithdrawal(withdraw); 
							}
							else 
							{
								System.out.println("Transaction failed...");
								System.out.println("Withdraw amount cannot greater than current balance");
								
							}
						}
					}
					else if(option == 3)
					{
						if(type == true)
							System.out.println( "Balance: " + customers.get(i).getSavingAccount().getBalance() );
						else System.out.println( "Balance: " + customers.get(i).getCheckingAccount().getBalance() );
					}
					else if(option == 4)
					{
						//Print Statement
						//if(type == true)
							
						//else;
					}
					else if(option == 5)
					{
						//Transfer ammount
						//if(type == true)
							
						//else;
					}
					else if(option == 6)
					{
						if(type == true)
						{
							customers.get(i).getSavingAccount().calculateZakat();
						}
						else
						{
							System.out.println("This is a checking account...");
							System.out.println("Zakat is only applicable on savings account...");
						}
					}
					else if(option == 7)
					{
						if(type == true)
						{
							customers.get(i).getSavingAccount().calculateInterest();
						}
						else
						{
							System.out.println("This is a checking account...");
							System.out.println("Interest is only applicable on savings account...");
						}
					}
					
				}
	        }
	        else if(choice == 6) 
	        {
	        	String name = "";
			    String address ="";
			   	String number = "";
				System.out.println("--------------------- NEW CUSTOMER WINDOW ---------------------");
				System.out.println("Enter the name of the customer");
				name = scanner.nextLine();
				System.out.println("Enter the address of the customer");
				address = scanner.nextLine();
				System.out.println("Enter the phone number of the customer");
				number = scanner.nextLine(); 
				Customer a = new Customer(name,address,number);
				customers.add(a);
				a.display();
	        }
	        displayAllCustomers();
		}while(choice!=0);
		scanner.close();
	}	
}
