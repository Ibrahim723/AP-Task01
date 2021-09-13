import java.util.LinkedList;

class Customer{
	
	//Static Attributes
	private static int count = 0;
	private static LinkedList<Integer> account_numbers = new LinkedList<Integer>();
	//Class Attributes
	private String name;
	private String address;
	private String phone_number;
	private boolean savings;
	private boolean checking;
	Account accounts[];
   //Member Functions
   Customer(String name,String address,String phone_number)
   {
	   this.name = name;
	   this.address = address;
	   this.phone_number = phone_number;
	   this.savings = false;
	   this.checking = false;
	   accounts = new Account[2];
	   accounts[0] = null; //saving account
	   accounts[1] = null; //checking account
   }
}
