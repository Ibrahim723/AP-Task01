
public class Checking extends Accounts
{
	private int transactions;
	Checking(double b, boolean t) 
	{
		super(b, t);
		transactions = 0;
	}
	void display()
	{
		System.out.println("---- Checking Account ----");
		System.out.println("Account Number: " + this.account_number);
		System.out.println("Balance: " + this.balance);
		System.out.println("Date created: " + this.date_created);
		System.out.println("Time created: " + this.time_created);
	}
	
	double getBalance()
	{
		return this.balance;
	}
	
	void setBalance(double b)
	{
		this.balance = b;
	}
	void makeDeposit(double d)
	{
		this.setBalance(this.getBalance()+d);
		this.transactions++;
		this.checkTransactionFee();
	}
	void makeWithdrawal(double w)
	{
		this.setBalance(this.getBalance()-w);
		this.transactions++;
		this.checkTransactionFee();
	}
	void checkTransactionFee()
	{
		if(this.transactions > 2)
		{
			System.out.println("Your monthly transaction limit has exceeded...");
			System.out.println("Transactions done this month: " + this.transactions);
			System.out.println("Transaction fee: 10 Rs" );
			System.out.println("Deducting transaction fee from balance..." );
			this.setBalance(this.getBalance() - 10);
			System.out.println("New balance: " + this.getBalance());
		}
	}
}
