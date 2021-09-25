
public class Savings extends Accounts
{
	static double interest_rate = 0.10;
	
	static void setInterestRate(double i)
	{
		interest_rate = i;
		System.out.println("Interest rate for all accounts is changed to " + interest_rate + "%");
	}
	
	Savings(double b, boolean t) 
	{
		super(b, t);
	}

	void display()
	{
		System.out.println("---- Savings Account ----");
		System.out.println("Account Number: " + this.account_number);
		System.out.println("Balance: " + this.balance);
		System.out.println("Interest rate: " + interest_rate*100);
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
	}
	void makeWithdrawal(double w)
	{
		this.setBalance(this.getBalance()-w);
	}
	void calculateInterest()
	{
		double interest;
		interest = this.getBalance() * interest_rate;
		System.out.println("Calculating interest for this account...");
		System.out.println("Interest:" + interest);
	}
	void calculateZakat()
	{
		
		System.out.println("Calculating interest for this account...");
		if(this.getBalance() >= 20000)
		{
			double zakat;
			zakat = (this.getBalance()*2.5)/100;
			System.out.println("Zakat:" + zakat);
		}
		else
		{
			System.out.println("Your balance is less than 20,000...");
			System.out.println("Zakat is only applicable on savings accounts having a balance greater than or equal to 20,000");
		}
	}
}
