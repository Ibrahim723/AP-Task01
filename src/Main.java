import java.util.Scanner;



import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.FileWriter;   // Import the FileWriter class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


//Driver Class
class Main{

   
   static void menu(){
	   
      //Drawing the menu
      System.out.println("--------------------- WELCOME TO THE ACCOUNT MANAGEMENT SYSTEM ---------------------");
      System.out.println("");
      System.out.println("Press 1 to OPEN a new account");
      System.out.println("Press 2 to CLOSE an account");
      System.out.println("Press 3 to LOGIN to your account");
      System.out.println("Press 4 to change the Interest rate for all saving accounts");
      System.out.println("Press 5 to display ALL ACCOUNT AND BANK DETAILS");
      System.out.println("Press 6 to display ALL ACCOUNT DEDUCTIONS ALONG WITH ACCOUNT DETAILS");
      System.out.println("Press 7 to enter data for a NEW Customer");
      System.out.println("Press 0 to EXIT");
      System.out.println("");
      System.out.println("------------------------------------------------------------------------------------");
   }
   
   static int unique_saving_number() {
	   int account_number = 100000;
	   boolean check = true;
	   LinkedList<String> file_data = new LinkedList<>();
	   System.out.println("Getting an account number for you...");
	   try {
		   File file_object = new File("accounts.txt");
		   Scanner reader_object = new Scanner(file_object);
		   while (reader_object.hasNextLine()) {
			   file_data.add(reader_object.nextLine());
		   }
		   String number = "";
		   String line = "";
		   int seperator_counter = 0;
		   for(int i=0;i<file_data.size();i++){
			   line = file_data.get(i);
			   for(int j=0;j<line.length();j++) {
				   if(line.charAt(j) == '|')
					   seperator_counter++;
				   if(seperator_counter == 1) {
					   for(int k =j+1;line.charAt(k)!='|';k++) {
						   
						   number += line.charAt(k);
					   }
					   break;
				   }
			   }
			   if(account_number == Integer.parseInt(number)) {
				   check = false;
				   account_number++;
			   }
			   else{

			   }
			   number = "";
			   seperator_counter = 0;
		   }
		   //System.out.println(check);
		   //System.out.println(account_number);
		   return account_number;
	   }
	   catch (FileNotFoundException e) {
		   System.out.println("An error occurred. Please try again");
		   e.printStackTrace();
	   }
	   return account_number;
   }
   
   static int unique_checking_number() {
	   int account_number = 200000;
	   boolean check = true;
	   LinkedList<String> file_data = new LinkedList<>();
	   System.out.println("Getting an account number for you...");
	   try {
		   File file_object = new File("accounts.txt");
		   Scanner reader_object = new Scanner(file_object);
		   while (reader_object.hasNextLine()) {
			   file_data.add(reader_object.nextLine());
		   }
		   String number = "";
		   String line = "";
		   int seperator_counter = 0;
		   for(int i=0;i<file_data.size();i++){
			   line = file_data.get(i);
			   for(int j=0;j<line.length();j++) {
				   if(line.charAt(j) == '|')
					   seperator_counter++;
				   if(seperator_counter == 1) {
					   for(int k =j+1;line.charAt(k)!='|';k++) {
						   
						   number += line.charAt(k);
					   }
					   break;
				   }
			   }
			   if(account_number == Integer.parseInt(number)) {
				   check = false;
				   account_number++;
			   }
			   else{

			   }
			   number = "";
			   seperator_counter = 0;
		   }
		   return account_number;
	   }
	   catch (FileNotFoundException e) {
		   System.out.println("An error occurred. Please try again");
		   e.printStackTrace();
	   }
	   return account_number;
   }
   
   public static void main(String[] args) {
 	  try {
		  
		  System.out.println("Trying to create file customers.txt:");
		  File file_object = new File("customers.txt");
		  if (file_object.createNewFile()) {
			  
			  System.out.println("File created.");
		  }
		  else { 
			 
			  System.out.println("File already exists.");
		  }
	  } 
	  catch (IOException e) {
		  
		  System.out.println("An error occurred: customers.txt was not created.");
		  e.printStackTrace();
	  }
 	  
 	  try {
		  
		  System.out.println("Trying to create file accounts.txt:");
		  File file_object = new File("accounts.txt");
		  if (file_object.createNewFile()) {
			  
			  System.out.println("File created.");
		  }
		  else { 
			 
			  System.out.println("File already exists.");
		  }
	  } 
	  catch (IOException e) {
		  
		  System.out.println("An error occurred: accounts.txt was not created.");
		  e.printStackTrace();
	  }
 	  try {
		  
		  System.out.println("Trying to create file transactions.txt:");
		  File file_object = new File("transactions.txt");
		  if (file_object.createNewFile()) {
			  
			  System.out.println("File created.");
		  }
		  else { 
			 
			  System.out.println("File already exists.");
		  }
	  } 
	  catch (IOException e) {
		  
		  System.out.println("An error occurred: transactions.txt was not created.");
		  e.printStackTrace();
	  }
 	  try {
		  
		  System.out.println("Trying to create file deductions.txt:");
		  File file_object = new File("deductions.txt");
		  if (file_object.createNewFile()) {
			  
			  System.out.println("File created.");
		  }
		  else { 
			 
			  System.out.println("File already exists.");
		  }
	  } 
	  catch (IOException e) {
		  
		  System.out.println("An error occurred: deductions.txt was not created.");
		  e.printStackTrace();
	  }
 	  try {
		  
		  System.out.println("Trying to create file interest.txt:");
		  File file_object = new File("interest.txt");
		  if (file_object.createNewFile()) {
			  
			  System.out.println("File created.");
		  }
		  else { 
			 
			  System.out.println("File already exists.");
		  }
	  } 
	  catch (IOException e) {
		  
		  System.out.println("An error occurred: interest.txt was not created.");
		  e.printStackTrace();
	  }
 	  
 	  try {
		  
		  System.out.println("Trying to create file interest.txt:");
		  File file_object = new File("interest.txt");
		  if (file_object.createNewFile()) {
			  
			  System.out.println("File created.");
			  String t = "17";
			  FileWriter fw = new FileWriter(file_object);
			  fw.write(t);
			  System.out.println("");
			  fw.write(System.lineSeparator()); 
			  fw.close();
		  }
		  else { 
			 
			  System.out.println("File already exists.");
		  }
	  } 
	  catch (IOException e) {
		  
		  System.out.println("An error occurred: interest.txt was not created.");
		  e.printStackTrace();
	  }
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("");
	  System.out.println("");
	  
      menu();
      int choice;
      Scanner scanner = new Scanner(System.in);
      do {
    	  
    	  choice = scanner.nextInt();
    	  if(choice<0 || choice>7){
    		  
			  System.out.println("Invalid option selected.");
			  System.out.println("Press 1 return to main menu or press any other key to exit.");
			  choice = scanner.nextInt();
			  if(choice == 1) {
				  
				  System.out.println("");
				  System.out.println("");
				  System.out.println("");
				  System.out.println("");
				  menu();
				  choice = -1;
			  }
			  else {
				  
				  System.out.println("");
				  System.out.println("");
				  System.out.println("");
				  System.out.println("");
		    	  System.out.println("THANKYOU FOR USING OUR SYSTEM :D");
				  System.out.println("");
		    	  System.out.println("-------------------------------------------");
		    	  System.out.println("SHUTTING DOWN THE SYSTEM...");
		    	  System.out.println("-------------------------------------------");
		    	  System.exit(0);
			  }

    	  }
      } while(choice<0 || choice>7);
      
      if(choice == 0){
    	  
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");
    	  System.out.println("THANKYOU FOR USING OUR SYSTEM :D");
		  System.out.println("");
    	  System.out.println("-------------------------------------------");
    	  System.out.println("SHUTTING DOWN THE SYSTEM...");
    	  System.out.println("-------------------------------------------");
    	  System.exit(0);
      }
      else if(choice == 1){
    	  
    	  System.out.println("Enter the phone number of the existing customer to open an account");
    	  String phone_number;
    	  boolean check = false;
		  phone_number = scanner.next(); 
		  try {
			  
			  System.out.println("Searching phone number for a existing customer");
			  File file_object = new File("customers.txt");
			  Scanner reader_object = new Scanner(file_object);
			  int seperator_counter = 0;
			  String number = "";
			  String line = "";
			  while (reader_object.hasNextLine()) {
				  String lines = reader_object.nextLine();
				  for(int i=0;lines.charAt(i)!='\0';i++) {
					  
					  if(lines.charAt(i) == '|')
						  seperator_counter++;
					  if(seperator_counter == 2) {
						  for(int j =i+1;lines.charAt(j)!='|';j++) {
							  
							  number += lines.charAt(j);
						  }
						  //System.out.println(number);
						  break;
					  }
				  }
				  if(phone_number.equals(number))
				  {
					  check = true;
					  line = lines;
					  break;
				  }
				  seperator_counter = 0;
				  number = "";
			  }
			  if(check == true) {
				  
				  System.out.println("Customer found!");
				  Boolean savings = null;
				  Boolean checking = null;
				  String temp_line = line;
				  seperator_counter = 0;
				  String temp = "";
				  for(int i=0;line.charAt(i)!='\0';i++) {
					  if(line.charAt(i) == '|')
						  seperator_counter++;
					  if(seperator_counter == 3) {
						  for(int j=i+1;line.charAt(j)!='|';j++) {
							  temp += line.charAt(j);
						  }
						  savings = Boolean.parseBoolean(temp);
						  break;
					  }
				  }
				  seperator_counter = 0;
				  temp = "";
				  
				  for(int i=0;line.charAt(i)!='\0';i++) {
					  if(line.charAt(i) == '|')
						  seperator_counter++;
					  if(seperator_counter == 4) {
						  for(int j=i+1;j<line.length();j++) {
							  temp += line.charAt(j);
						  }
						  checking = Boolean.parseBoolean(temp);
						  break;
					  }
				  }
				  int account_type;
				  do {
					  
					  System.out.println("Press 1 to open a SAVINGS ACCOUNT or Press 2 to open a CHECKING ACCOUNT");
					  account_type = scanner.nextInt();
					  if(account_type<1 || account_type>2) {
						  System.out.println("Invalid option selected! Please select a correct option");
					  }
				  }while(account_type<1 || account_type>2);
				  if(account_type == 1){
					  if(savings == true) {
						  System.out.println("This customer already has a savings account!");
						  System.out.println("A customer can only have a single saving aacount...");
					  }
					  else {
						  
						  System.out.println("Savings account opened!");
						  int balance = 0;
						  int account_number = unique_saving_number();
						  String date = "";
						  SimpleDateFormat formats = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
						  Date temp_date = new Date();  
						  date = formats.format(temp_date);
						  String date_created = "";
						  String time_created = "";
						  check = false;
						  for(int i=0;i<date.length();i++) {
						  	if(check == false)
						  		date_created += date.charAt(i);
						  	else time_created += date.charAt(i);
						  	if(date.charAt(i) == ' ')
						  		check = true;
						  }
						  System.out.println("---------------------------------------------------------");
						  System.out.println("Account Type: Savings");
						  System.out.println("Account Number: "+ Integer.toString(account_number));
						  System.out.println("Balance: "+"0");
						  System.out.println("Date created: "+date_created);
						  System.out.println("Time created: "+time_created);
						  System.out.println("---------------------------------------------------------");
						  
				    	  String path = System.getProperty("user.dir") + "\\accounts.txt";
				          String text = phone_number+"|"+account_number+"|"+balance+"|"+date_created+"|"+time_created+"|"+"Savings";
				          try {
				
				        	  System.out.println("Saving Data......");
				              FileWriter fw = new FileWriter(path, true);
				              fw.write(text);
				              fw.write(System.lineSeparator());
				              fw.close();
				              
				          }
				          catch(IOException e) {
				        	  System.out.println("An error occurred: Couldn't open an accout.");
				          }
				          LinkedList<String> file_data = new LinkedList<>();
				          LinkedList<String> temp_file_data = new LinkedList<>();
				          try {
				        	  file_object = new File("customers.txt");
				        	  reader_object = new Scanner(file_object);
				        	  while (reader_object.hasNextLine()) {
				        		  file_data.add(reader_object.nextLine());
				        	  }
				        	  line = "";
				        	  number = "";
				        	  seperator_counter = 0;
				        	  check = false;
				        	  for(int i=0;i<file_data.size();i++) {
				        		  line = file_data.get(i);
				        		  for(int j=0;j<line.length();j++) {
				        			  if(line.charAt(j) == '|')
				        				  seperator_counter++;
				        			  if(seperator_counter == 2) {
				        				  for(int k =j+1;line.charAt(k)!='|';k++) {    
				        					  number += line.charAt(k);
				        				  }
			        			          break;
				        			  }
				        		  }
				        		  if(phone_number.equals(number)) {
				        			  check = true;
						        	  line = "";
						        	  number = "";
						        	  seperator_counter = 0;
						        	  String change = "true";		
						        	  for(int k=0;k<file_data.size();k++) {
						        		  if(k == i) {
						        			  temp = "";
						        			    
						        			  for(int a=0;a<file_data.get(i).length();a++) {
						        				  
							        			  if(file_data.get(i).charAt(a) == '|')
							        				  seperator_counter++;
							        			  if(seperator_counter == 3) {
							        				  temp += "|";
							        				  for(int c=0;c<change.length();c++)	
							        					  temp += change.charAt(c);
							        				  for(int d=a+6;d<file_data.get(i).length();d++)	
							        					  temp += file_data.get(i).charAt(d);
							        				  break;
							        			  }
							        			  else {
							        				  
							        				  temp += file_data.get(i).charAt(a);
							        			  }
							        			  
						        			  }
						        			  temp_file_data.add(temp); 
						        			  
						        		  }
						        		  else {
						        			  temp_file_data.add(file_data.get(k)); 
						        		  }
						        		  
						        	  }
				        		  }
				        		  else {
				        			  number = "";
				        			  seperator_counter = 0;
				        		  }
				        	  }
				        		  
				        	  
				          }
				          catch (FileNotFoundException e) {
				        	  System.out.println("An error occurred. Please try again");
				        	  e.printStackTrace();
				          }
				    	  path = System.getProperty("user.dir") + "\\customers.txt";
				          try {
				              FileWriter fw = new FileWriter(path);
				              for(int k=0;k<temp_file_data.size();k++) {
					              text = temp_file_data.get(k);
				            	  fw.write(text);
					              fw.write(System.lineSeparator()); 
				              }
				              fw.close();
				          }
				          catch(IOException e) {
				        	  System.out.println("An error occurred: Couldn't add customer.");
				          }
				          
				          System.out.println("Savings Account Opened!");
					  }
				  }
				  
				  if(account_type == 2){
					  if(checking == true) {
						  System.out.println("This customer already has a checking account!");
						  System.out.println("A customer can only have a single checking aacount...");
					  }
					  else {
						  int balance = 0;
						  int account_number = unique_checking_number();
						  String date = "";
						  SimpleDateFormat formats = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
						  Date temp_date = new Date();  
						  date = formats.format(temp_date);
						  String date_created = "";
						  String time_created = "";
						  check = false;
						  for(int i=0;i<date.length();i++) {
						  	if(check == false)
						  		date_created += date.charAt(i);
						  	else time_created += date.charAt(i);
						  	if(date.charAt(i) == ' ')
						  		check = true;
						  }
						  System.out.println("---------------------------------------------------------");
						  System.out.println("Account Type: Checking");
						  System.out.println("Account Number: "+ Integer.toString(account_number));
						  System.out.println("Balance: "+"0");
						  System.out.println("Date created: "+date_created);
						  System.out.println("Time created: "+time_created);
						  System.out.println("---------------------------------------------------------");
						  
				    	  String path = System.getProperty("user.dir") + "\\accounts.txt";
				          String text = phone_number+"|"+account_number+"|"+balance+"|"+date_created+"|"+time_created+"|"+"Checking";
				          try {
				
				        	  System.out.println("Saving Data......");
				              FileWriter fw = new FileWriter(path, true);
				              fw.write(text);
				              fw.write(System.lineSeparator());
				              fw.close();
				              
				          }
				          catch(IOException e) {
				        	  System.out.println("An error occurred: Couldn't open an accout.");
				          }
				          LinkedList<String> file_data = new LinkedList<>();
				          LinkedList<String> temp_file_data = new LinkedList<>();
				          try {
				        	  file_object = new File("customers.txt");
				        	  reader_object = new Scanner(file_object);
				        	  while (reader_object.hasNextLine()) {
				        		  file_data.add(reader_object.nextLine());
				        	  }
				        	  line = "";
				        	  number = "";
				        	  seperator_counter = 0;
				        	  check = false;
				        	  for(int i=0;i<file_data.size();i++) {
				        		  line = file_data.get(i);
				        		  for(int j=0;j<line.length();j++) {
				        			  if(line.charAt(j) == '|')
				        				  seperator_counter++;
				        			  if(seperator_counter == 2) {
				        				  for(int k =j+1;line.charAt(k)!='|';k++) {    
				        					  number += line.charAt(k);
				        				  }
			        			          break;
				        			  }
				        		  }
				        		  if(phone_number.equals(number)) {
				        			  check = true;
						        	  line = "";
						        	  number = "";
						        	  seperator_counter = 0;
						        	  String change = "true";		
						        	  for(int k=0;k<file_data.size();k++) {
						        		  if(k == i) {
						        			  temp = "";
						        			    
						        			  for(int a=0;a<file_data.get(i).length();a++) {
						        				  
							        			  if(file_data.get(i).charAt(a) == '|')
							        				  seperator_counter++;
							        			  if(seperator_counter == 4) {
							        				  temp += "|";
							        				  for(int c=0;c<change.length();c++)	
							        					  temp += change.charAt(c);
							        				  break;
							        			  }
							        			  else {
							        				  
							        				  temp += file_data.get(i).charAt(a);
							        			  }
							        			  
						        			  }
						        			  temp_file_data.add(temp); 
						        			  
						        		  }
						        		  else {
						        			  temp_file_data.add(file_data.get(k)); 
						        		  }
						        		  
						        	  }
				        		  }
				        		  else {
				        			  number = "";
				        			  seperator_counter = 0;
				        		  }
				        	  }
				        		  
				        	  
				          }
				          catch (FileNotFoundException e) {
				        	  System.out.println("An error occurred. Please try again");
				        	  e.printStackTrace();
				          }
				    	  path = System.getProperty("user.dir") + "\\customers.txt";
				          try {
				              FileWriter fw = new FileWriter(path);
				              for(int k=0;k<temp_file_data.size();k++) {
					              text = temp_file_data.get(k);
				            	  fw.write(text);
					              fw.write(System.lineSeparator()); 
				              }
				              fw.close();
				          }
				          catch(IOException e) {
				        	  System.out.println("An error occurred: Couldn't add customer.");
				          }
					  
						  System.out.println("Checking account opened!");
					  }
				  }
			  }
			  else {
				  System.out.println("Customer not found...");
			  }
			  reader_object.close();
		  } 
		  catch (FileNotFoundException e) 
		  {
	        
			  System.out.println("An error occurred. Please try again");
	        e.printStackTrace();
	      }
      }
      else if(choice == 2){
    		System.out.println("Enter the phone number of the existing customer to close an account");
    		String phone_number;
    		boolean check = false;
    		phone_number = scanner.next();
    		try {
    			System.out.println("Searching phone number for a existing customer");
    			File file_object = new File("customers.txt");
    			Scanner reader_object = new Scanner(file_object);
    			int seperator_counter = 0;
    			String number = "";
    			String line = "";
    			while (reader_object.hasNextLine()) {
    				String lines = reader_object.nextLine();
    				for(int i=0;lines.charAt(i)!='\0';i++) {
    					
    					if(lines.charAt(i) == '|')
    						seperator_counter++;
    					if(seperator_counter == 2) {
    						for(int j =i+1;lines.charAt(j)!='|';j++) {
    							
    							number += lines.charAt(j);
    						}
    						//System.out.println(number);
    						break;
    					}
    				}
    				if(phone_number.equals(number))
    				{
    					
    					check = true;
    					line = lines;
    					break;
    				}
    				seperator_counter = 0;
    				number = "";
    			}
    				if(check == true) {
    					System.out.println("Customer found!");
    					Boolean savings = null;
    					Boolean checking = null;
    					String temp_line = line;
    					seperator_counter = 0;
    					String temp = "";
    					System.out.println(line);
    					for(int i=0;line.charAt(i)!='\0';i++) {
    						if(line.charAt(i) == '|')
    							seperator_counter++;
    						if(seperator_counter == 3) {
    							for(int j=i+1;line.charAt(j)!='|';j++) {
    								temp += line.charAt(j);
    							}
    							savings = Boolean.parseBoolean(temp);
    							break;
    						}
    					}
    					seperator_counter = 0;
    					temp = "";
    					
    					for(int i=0;line.charAt(i)!='\0';i++) {
    						if(line.charAt(i) == '|')
    							seperator_counter++;
    						if(seperator_counter == 4) {
    							for(int j=i+1;j<line.length();j++) {
    								temp += line.charAt(j);
    							}
    							checking = Boolean.parseBoolean(temp);
    							break;
    						}
    					}
    					int account_type;
    					do {
    						
    						System.out.println("Press 1 to close a SAVINGS ACCOUNT or Press 2 to close a CHECKING ACCOUNT");
    						account_type = scanner.nextInt();
    						if(account_type<1 || account_type>2) {
    							System.out.println("Invalid option selected! Please select a correct option");
    						}
    					}while(account_type<1 || account_type>2);
    					if(account_type == 1){
    						if(savings == false) {
    							System.out.println("This customer has no savings account");
    							System.out.println("Unable to close savings account");
    						}
    						else {
    							
    							

    							LinkedList<String> file_data = new LinkedList<>();
    							LinkedList<String> temp_file_data = new LinkedList<>();
    							try {
    								file_object = new File("customers.txt");
    								reader_object = new Scanner(file_object);
    								while (reader_object.hasNextLine()) {
    									file_data.add(reader_object.nextLine());
    								}
    								line = "";
    								number = "";
    								seperator_counter = 0;
    								check = false;
    								for(int i=0;i<file_data.size();i++) {
    									line = file_data.get(i);
    									for(int j=0;j<line.length();j++) {
    										if(line.charAt(j) == '|')
    											seperator_counter++;
    										if(seperator_counter == 2) {
    											for(int k =j+1;line.charAt(k)!='|';k++) {    
    												number += line.charAt(k);
    											}
    											break;
    										}
    									}
    									if(phone_number.equals(number)) {
    										check = true;
    										line = "";
    										number = "";
    										seperator_counter = 0;
    										String change = "false";		
    							        	  for(int k=0;k<file_data.size();k++) {
    							        		  if(k == i) {
    							        			  temp = "";
    							        			    
    							        			  for(int a=0;a<file_data.get(i).length();a++) {
    							        				  
    								        			  if(file_data.get(i).charAt(a) == '|')
    								        				  seperator_counter++;
    								        			  if(seperator_counter == 3) {
    								        				  temp += "|";
    								        				  for(int c=0;c<change.length();c++)	
    								        					  temp += change.charAt(c);
    								        				  for(int d=a+5;d<file_data.get(i).length();d++)	
    								        					  temp += file_data.get(i).charAt(d);
    								        				  break;
    								        			  }
    								        			  else {
    								        				  
    								        				  temp += file_data.get(i).charAt(a);
    								        			  }
    								        			  
    							        			  }
    							        			  temp_file_data.add(temp); 
    							        			  
    							        		  }
    							        		  else {
    							        			  temp_file_data.add(file_data.get(k)); 
    							        		  }
    							        		  
    							        	  }
    									}
    									else {
    										number = "";
    										seperator_counter = 0;
    									}
    								}
    									
    								
    							}
    							catch (FileNotFoundException e) {
    								System.out.println("An error occurred. Please try again");
    								e.printStackTrace();
    							}
    							String path = System.getProperty("user.dir") + "\\customers.txt";
    							String text = "";
    							try {
    								FileWriter fw = new FileWriter(path);
    								for(int k=0;k<temp_file_data.size();k++) {
    									text = temp_file_data.get(k);
    									fw.write(text);
    									fw.write(System.lineSeparator()); 
    								}
    								fw.close();
    							}
    							catch(IOException e) {
    								System.out.println("An error occurred: Couldn't add customer.");
    							}

    							System.out.println("Saving account closed!");
    							
    							
    						}
    					}
    					if(account_type == 2){
    						if(checking == false) {
    							System.out.println("This customer has no checking account!");
    							System.out.println("Unable to close checking account");
    						}
    						else {
    							
    							LinkedList<String> file_data = new LinkedList<>();
    							LinkedList<String> temp_file_data = new LinkedList<>();
    							try {
    								file_object = new File("customers.txt");
    								reader_object = new Scanner(file_object);
    								while (reader_object.hasNextLine()) {
    									file_data.add(reader_object.nextLine());
    								}
    								line = "";
    								number = "";
    								seperator_counter = 0;
    								check = false;
    								for(int i=0;i<file_data.size();i++) {
    									line = file_data.get(i);
    									for(int j=0;j<line.length();j++) {
    										if(line.charAt(j) == '|')
    											seperator_counter++;
    										if(seperator_counter == 2) {
    											for(int k =j+1;line.charAt(k)!='|';k++) {    
    												number += line.charAt(k);
    											}
    											break;
    										}
    									}
    									if(phone_number.equals(number)) {
    										check = true;
    										line = "";
    										number = "";
    										seperator_counter = 0;
    										String change = "false";		
    							        	  for(int k=0;k<file_data.size();k++) {
    							        		  if(k == i) {
    							        			  temp = "";
    							        			    
    							        			  for(int a=0;a<file_data.get(i).length();a++) {
    							        				  
    								        			  if(file_data.get(i).charAt(a) == '|')
    								        				  seperator_counter++;
    								        			  if(seperator_counter == 4) {
    								        				  temp += "|";
    								        				  for(int c=0;c<change.length();c++)	
    								        					  temp += change.charAt(c);
    								        				  break;
    								        			  }
    								        			  else {
    								        				  
    								        				  temp += file_data.get(i).charAt(a);
    								        			  }
    								        			  
    							        			  }
    							        			  temp_file_data.add(temp); 
    							        			  
    							        		  }
    							        		  else {
    							        			  temp_file_data.add(file_data.get(k)); 
    							        		  }
    							        		  
    							        	  }
    									}
    									else {
    										number = "";
    										seperator_counter = 0;
    									}
    								}
    									
    								
    							}
    							catch (FileNotFoundException e) {
    								System.out.println("An error occurred. Please try again");
    								e.printStackTrace();
    							}
    							String path = System.getProperty("user.dir") + "\\customers.txt";
    							String text = "";
    							try {
    								FileWriter fw = new FileWriter(path);
    								for(int k=0;k<temp_file_data.size();k++) {
    									text = temp_file_data.get(k);
    									fw.write(text);
    									fw.write(System.lineSeparator()); 
    								}
    								fw.close();
    							}
    							catch(IOException e) {
    								System.out.println("An error occurred: Couldn't add customer.");
    							}

    							System.out.println("Checking account closed!");
    						}
    						
    					}
    				}
    				else {
    					System.out.println("Customer not found...");
    				}
    				reader_object.close();
    				
    			
    		}
    		catch (FileNotFoundException e) 
    		{
    			  
    			System.out.println("An error occurred. Please try again");
    		  e.printStackTrace();
    		}
      }
      else if(choice == 3){
    		System.out.println("Enter the account number to login");
    		String account_number;
    		boolean check = false;
    		account_number = scanner.next();
    		try {
    			System.out.println("Searching for the account...");
    			File file_object = new File("accounts.txt");
    			Scanner reader_object = new Scanner(file_object);
    			int seperator_counter = 0;
    			String number = "";
    			String line = "";
    			String lines = "";
    			while (reader_object.hasNextLine()) {
    				lines = reader_object.nextLine();
    				for(int i=0;lines.charAt(i)!='\0';i++) {
    					
    					if(lines.charAt(i) == '|')
    						seperator_counter++;
    					if(seperator_counter == 1) {
    						for(int j =i+1;lines.charAt(j)!='|';j++) {
    							
    							number += lines.charAt(j);
    						}
    						break;
    					}
    				}
    				if(account_number.equals(number))
    				{
    					check = true;
    					line = lines;
    					break;
    				}
    				seperator_counter = 0;
    				number = "";
    			}
    			if(check == true) {
    				System.out.println("Account Logged In!");
    				
    				String account_type = " ";
    				String balance ="";
    				
    				line = "";
    				seperator_counter = 0;
    				for(int i=0;lines.charAt(i)!='\0';i++) {
    					
    					if(lines.charAt(i) == '|')
    						seperator_counter++;
    					if(seperator_counter == 2) {
    						for(int j =i+1;lines.charAt(j)!='|';j++) {
    							
    							balance += lines.charAt(j);
    						}
    						break;
    					}
    				}
    				
    				line = "";
    				seperator_counter = 0;
    				for(int i=0;lines.charAt(i)!='\0';i++) {
    					
    					if(lines.charAt(i) == '|')
    						seperator_counter++;
    					if(seperator_counter == 5) {
    						for(int j =i+1;j<lines.length();j++) {
    							
    							account_type += lines.charAt(j);
    						}
    						break;
    					}
    				}
    				System.out.println("---------------------------------------------------------");
    				System.out.println("Account Type: " + account_type);
				  	System.out.println("Account Number: " + account_number);
				  	System.out.println("Balance: " + balance);
				  	System.out.println("---------------------------------------------------------");
				  	
					  choice = 0;
					  do {
						  
						  System.out.println("Press 1 to deposit money");
						  System.out.println("Press 2 to withdraw money");
						  System.out.println("Press 3 to transfer money");
						  System.out.println("Press 4 to calculate zakat");
						  System.out.println("Press 5 to calculate interest");
						  choice = scanner.nextInt();
						  if(choice<1 || choice>5) {
							  System.out.println("Invalid option selected! Please select a correct option");
						  }
					  }while(choice<1 || choice>5);
					  if(choice == 1) {
			    			LinkedList<String> file_data = new LinkedList<>();
			    			LinkedList<String> temp_file_data = new LinkedList<>();
						  System.out.println("--------------------- DEPOSIT WINDOW ---------------------");
						  int amount;
						  do {
							  
							  System.out.println("Enter amount to deposit.");
							  amount = scanner.nextInt();
							  if(amount<=0) {
								  System.out.println("Wrong amoung entered! Amount must be greater than 0 ....");
							  }
						  }while(amount<=0);
						  
						  String date = "";
						  SimpleDateFormat formats = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
						  Date temp_date = new Date();  
						  date = formats.format(temp_date);
						  String date_created = "";
						  String time_created = "";
						  check = false;
						  for(int i=0;i<date.length();i++) {
						  	if(check == false)
						  		date_created += date.charAt(i);
						  	else time_created += date.charAt(i);
						  	if(date.charAt(i) == ' ')
						  		check = true;
						  }
						  String transaction = "";
						  transaction += account_number;
						  transaction += "|";
						  transaction += amount;
						  transaction += "|";
						  transaction += "Deposit";
						  transaction += "|";
						  transaction += date_created;
						  transaction += "|";
						  transaction += time_created;
				    	  String path = System.getProperty("user.dir") + "\\transactions.txt";
				          try {  
				        	  System.out.println("Transaction taking place......");
				              FileWriter fw = new FileWriter(path, true);
				              fw.write(transaction);
				              fw.write(System.lineSeparator());
				              fw.close();
				          }
				          catch(IOException e) {
				        	  System.out.println("Transaction unsuccessful...");
				          }
				    		try {
				    			file_object = new File("accounts.txt");
				    			reader_object = new Scanner(file_object);
				    		    while (reader_object.hasNextLine()) {
				    		        file_data.add(reader_object.nextLine());
				    		    }

				    			seperator_counter = 0;
				    			number = "";
				    			line = "";
				    			lines = "";
				    			check = false;
				    			
				    		    for(int i=0;i<file_data.size();i++) {
				    		        line = file_data.get(i);
				    		        for(int j=0;j<line.length();j++) {
				    		        	
				    		            if(line.charAt(j) == '|')
				    		                seperator_counter++;
				    		            if(seperator_counter == 1) {
				    		                for(int k =j+1;line.charAt(k)!='|';k++) {    
				    		                    number += line.charAt(k);
				    		                }
				    		                break;
				    		            }
				    		        }
				    		        if(account_number.equals(number)) {
				    		            number = "";
				    		            seperator_counter = 0;
				    		            balance= "";
				    		            String temp = "";
					    		        for(int j=0;j<line.length();j++) {
					    		            if(line.charAt(j) == '|')
					    		                seperator_counter++;
					    		            if(seperator_counter == 2) {
					    		                for(int k =j+1;line.charAt(k)!='|';k++) {    
					    		                    balance += line.charAt(k);
					    		                }
					    		                break;
					    		            }
					    		        }
					    		        System.out.println(account_number);
					    		        System.out.println(balance);
					    		        String new_balance = String.valueOf(Integer.parseInt(balance)+amount);
					    		        System.out.println(new_balance);
					    		        String change = new_balance;
					    		        seperator_counter = 0;
				    		              for(int k=0;k<file_data.size();k++) {
				    		                  if(k == i) {
				    		                      temp = "";
				    		                        
				    		                      for(int a=0;a<file_data.get(i).length();a++) {
				    		                          
				    		                          if(file_data.get(i).charAt(a) == '|')
				    		                              seperator_counter++;
				    		                          if(seperator_counter == 2) {
				    		                              temp += "|";
				    		                              for(int c=0;c<change.length();c++)	
				    		                                  temp += change.charAt(c);
				    		                              temp += "|";
								        				  for(int d=a+change.length();d<file_data.get(i).length();d++)	
								        					  temp += file_data.get(i).charAt(d);
								        				  System.out.println(temp);
				    		                              break;
				    		                          }
				    		                          else {
				    		                              
				    		                              temp += file_data.get(i).charAt(a);
				    		                          }
				    		                          
				    		                      }
				    		                      temp_file_data.add(temp); 
				    		                      
				    		                  }
				    		                  else {
				    		                      temp_file_data.add(file_data.get(k)); 
				    		                  }
				    		                  
				    		              }
				    		        }
				    		        else {
				    		            number = "";
				    		            seperator_counter = 0;
				    		        }
				    		    }

				    		}
				            catch (FileNotFoundException e) 
				    		{
				    		  
				    			System.out.println("An error occurred. Please try again");
				    		  e.printStackTrace();
				    		}
							path = System.getProperty("user.dir") + "\\accounts.txt";
							String text = "";
							try {
								FileWriter fw = new FileWriter(path);
								for(int k=0;k<temp_file_data.size();k++) {
									text = temp_file_data.get(k);
									fw.write(text);
									fw.write(System.lineSeparator()); 
								}
								fw.close();
							}
							catch(IOException e) {
								System.out.println("An error occcured. Please try again");
							}
						  System.out.println("Transaction successful: Deposit = "+amount);
					  }
					  else if(choice == 2) {
						  LinkedList<String> file_data = new LinkedList<>();
						  LinkedList<String> temp_file_data = new LinkedList<>();
						  System.out.println("--------------------- WITHDRAW WINDOW ---------------------");
						  int amount;
						  do {
						      
						      System.out.println("Enter amount to withdraw.");
						      amount = scanner.nextInt();
						      if(amount<=0) {
						          System.out.println("Wrong amoung entered! Amount must be greater than 0 ....");
						      }
						  }while(amount<=0);
						  String date = "";
						  SimpleDateFormat formats = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
						  Date temp_date = new Date();  
						  date = formats.format(temp_date);
						  String date_created = "";
						  String time_created = "";
						  check = false;
						  for(int i=0;i<date.length();i++) {
						  if(check == false)
						      date_created += date.charAt(i);
						  else time_created += date.charAt(i);
						  if(date.charAt(i) == ' ')
						      check = true;
						  }
						  String transaction = "";
						  transaction += account_number;
						  transaction += "|";
						  transaction += amount;
						  transaction += "|";
						  transaction += "Withdraw";
						  transaction += "|";
						  transaction += date_created;
						  transaction += "|";
						  transaction += time_created;
						  String path = System.getProperty("user.dir") + "\\transactions.txt";
						  try {  
							    System.out.println("Transaction taking place......");
							    FileWriter fw = new FileWriter(path, true);
							    fw.write(transaction);
							    fw.write(System.lineSeparator());
							    fw.close();
							}
							catch(IOException e) {
							    System.out.println("Transaction unsuccessful...");
							}
							try {
							    file_object = new File("accounts.txt");
							    reader_object = new Scanner(file_object);
							    while (reader_object.hasNextLine()) {
							        file_data.add(reader_object.nextLine());
							    }

							    seperator_counter = 0;
							    number = "";
							    line = "";
							    lines = "";
							    check = false;
							    
							    for(int i=0;i<file_data.size();i++) {
							        line = file_data.get(i);
							        for(int j=0;j<line.length();j++) {
							            
							            if(line.charAt(j) == '|')
							                seperator_counter++;
							            if(seperator_counter == 1) {
							                for(int k =j+1;line.charAt(k)!='|';k++) {    
							                    number += line.charAt(k);
							                }
							                break;
							            }
							        }
							        if(account_number.equals(number)) {
							            number = "";
							            seperator_counter = 0;
							            balance= "";
							            String temp = "";
							            for(int j=0;j<line.length();j++) {
							                if(line.charAt(j) == '|')
							                    seperator_counter++;
							                if(seperator_counter == 2) {
							                    for(int k =j+1;line.charAt(k)!='|';k++) {    
							                        balance += line.charAt(k);
							                    }
							                    break;
							                }
							            }
							            if(amount>Integer.parseInt(balance))
							            {
								            System.out.println("Invalid Transaction!");
								            System.out.println("Withdrawing ammount can't be greater than balance...");
								            System.exit(0);
							            }
							            String new_balance = String.valueOf(Integer.parseInt(balance)-amount);
							            String change = new_balance;
							            seperator_counter = 0;
							                for(int k=0;k<file_data.size();k++) {
							                    if(k == i) {
							                        temp = "";
							                        
							                        for(int a=0;a<file_data.get(i).length();a++) {
							                            
							                            if(file_data.get(i).charAt(a) == '|')
							                                seperator_counter++;
							                            if(seperator_counter == 2) {
							                                temp += "|";
							                                for(int c=0;c<change.length();c++)	
							                                    temp += change.charAt(c);
							                                temp += "|";
							                                for(int d=a+balance.length()+2;d<file_data.get(i).length();d++)	
							                                    temp += file_data.get(i).charAt(d);
							                                System.out.println(temp);
							                                break;
							                            }
							                            else {
							                                
							                                temp += file_data.get(i).charAt(a);
							                            }
							                            
							                        }
							                        temp_file_data.add(temp); 
							                        
							                    }
							                    else {
							                        temp_file_data.add(file_data.get(k)); 
							                    }
							                    
							                }
							        }
							        else {
							            number = "";
							            seperator_counter = 0;
							        }
							    }

							}
							catch (FileNotFoundException e) 
							{
							    
							    System.out.println("An error occurred. Please try again");
							    e.printStackTrace();
							}
							path = System.getProperty("user.dir") + "\\accounts.txt";
							String text = "";
							try {
							    FileWriter fw = new FileWriter(path);
							    for(int k=0;k<temp_file_data.size();k++) {
							        text = temp_file_data.get(k);
							        fw.write(text);
							        fw.write(System.lineSeparator()); 
							    }
							    fw.close();
							}
							catch(IOException e) {
							    System.out.println("An error occcured. Please try again");
							}
							System.out.println("Transaction successful: Withdraw = "+amount);
						  
					  }
					  else if(choice == 3) {
						  
					  }
					  else if(choice == 4) {
						  System.out.println("--------------------- ZAKAT CALCULATION WINDOW ---------------------");
						  try {
							    file_object = new File("accounts.txt");
							    reader_object = new Scanner(file_object);
								LinkedList<String> file_data = new LinkedList<>();
							    while (reader_object.hasNextLine()) {
							        file_data.add(reader_object.nextLine());
							    }
							    number = "";
							    line = "";
							    seperator_counter = 0;
							    for(int i=0;i<file_data.size();i++){
							        line = file_data.get(i);
							        for(int j=0;j<line.length();j++) {
							            if(line.charAt(j) == '|')
							                seperator_counter++;
							            if(seperator_counter == 1) {
							                for(int k =j+1;line.charAt(k)!='|';k++) {
							                    
							                    number += line.charAt(k);
							                }
							                break;
							            }
							        }
							        if(account_number.contentEquals(number)) {
									    balance = "";
									    seperator_counter = 0;
								        for(int j=0;j<line.length();j++) {
								            if(line.charAt(j) == '|')
								                seperator_counter++;
								            if(seperator_counter == 2) {
								                for(int k =j+1;line.charAt(k)!='|';k++) {
								                    
								                    balance += line.charAt(k);
								                }
								                break;
								            }
								        }
								        account_type = "";
								        seperator_counter = 0;
								        for(int j=0;j<line.length();j++) {
								            if(line.charAt(j) == '|')
								                seperator_counter++;
								            if(seperator_counter == 5) {
								                for(int k =j+1;k<line.length();k++) {
								                    
								                    account_type += line.charAt(k);
								                }
								                break;
								            }
								        }
								        System.out.println(account_type +" "+balance);
								        if(account_type.contentEquals("Savings")) {
								        	if(Integer.parseInt(balance)>20000) {

								        		int zakat = Integer.parseInt(balance);
								        		zakat *= 2.5;
								        		zakat /= 100;
								        		System.out.println("Your total account balance is "+ balance);
								        		System.out.println("Zakat to be deducted is "+ zakat);
								        		file_data.clear();
								        		LinkedList<String> temp_file_data = new LinkedList<>();
								        		String date = "";
								        		SimpleDateFormat formats = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
								        		Date temp_date = new Date();  
								        		date = formats.format(temp_date);
								        		String date_created = "";
								        		String time_created = "";
								        		check = false;
								        		for(int j=0;j<date.length();j++) {
								        		if(check == false)
								        			date_created += date.charAt(j);
								        		else time_created += date.charAt(j);
								        		if(date.charAt(j) == ' ')
								        			check = true;
								        		}
								        		String transaction = "";
								        		transaction += account_number;
								        		transaction += "|";
								        		transaction += String.valueOf(zakat);
								        		transaction += "|";
								        		transaction += "Zakat";
								        		transaction += "|";
								        		transaction += date_created;
								        		transaction += "|";
								        		transaction += time_created;
								        		String path = System.getProperty("user.dir") + "\\deductions.txt";
								        		try {  
								        			  System.out.println("Deducting Zakat......");
								        			  FileWriter fw = new FileWriter(path, true);
								        			  fw.write(transaction);
								        			  fw.write(System.lineSeparator());
								        			  fw.close();
								        		  }
								        		  catch(IOException e) {
								        			  System.out.println("Transaction unsuccessful...");
								        		  }
								        		  try {
								        			  file_object = new File("accounts.txt");
								        			  reader_object = new Scanner(file_object);
								        			  while (reader_object.hasNextLine()) {
								        				  file_data.add(reader_object.nextLine());
								        			  }

								        			  seperator_counter = 0;
								        			  number = "";
								        			  line = "";
								        			  lines = "";
								        			  check = false;
								        			  
								        			  for(int x=0;x<file_data.size();x++) {
								        				  line = file_data.get(x);
								        				  for(int j=0;j<line.length();j++) {
								        					  
								        					  if(line.charAt(j) == '|')
								        						  seperator_counter++;
								        					  if(seperator_counter == 1) {
								        						  for(int k =j+1;line.charAt(k)!='|';k++) {    
								        							  number += line.charAt(k);
								        						  }
								        						  break;
								        					  }
								        				  }
								        				  if(account_number.equals(number)) {
								        					  number = "";
								        					  seperator_counter = 0;
								        					  balance= "";
								        					  String temp = "";
								        					  for(int j=0;j<line.length();j++) {
								        						  if(line.charAt(j) == '|')
								        							  seperator_counter++;
								        						  if(seperator_counter == 2) {
								        							  for(int k =j+1;line.charAt(k)!='|';k++) {    
								        								  balance += line.charAt(k);
								        							  }
								        							  break;
								        						  }
								        					  }

								        					  String new_balance = String.valueOf(Integer.parseInt(balance)-zakat);
								        					  String change = new_balance;
								        					  seperator_counter = 0;
								        						  for(int k=0;k<file_data.size();k++) {
								        							  if(k == x) {
								        								  temp = "";
								        								  
								        								  for(int a=0;a<file_data.get(x).length();a++) {
								        									  
								        									  if(file_data.get(x).charAt(a) == '|')
								        										  seperator_counter++;
								        									  if(seperator_counter == 2) {
								        										  temp += "|";
								        										  for(int c=0;c<change.length();c++)	
								        											  temp += change.charAt(c);
								        										  temp += "|";
								        										  for(int d=a+balance.length()+2;d<file_data.get(i).length();d++)	
								        											  temp += file_data.get(i).charAt(d);
								        										  System.out.println(temp);
								        										  break;
								        									  }
								        									  else {
								        										  
								        										  temp += file_data.get(x).charAt(a);
								        									  }
								        									  
								        								  }
								        								  temp_file_data.add(temp); 
								        								  
								        							  }
								        							  else {
								        								  temp_file_data.add(file_data.get(k)); 
								        							  }
								        							  
								        						  }
								        				  }
								        				  else {
								        					  number = "";
								        					  seperator_counter = 0;
								        				  }
								        			  }

								        		  }
								        		  catch (FileNotFoundException e) 
								        		  {
								        			  
								        			  System.out.println("An error occurred. Please try again");
								        			  e.printStackTrace();
								        		  }
								        		  path = System.getProperty("user.dir") + "\\accounts.txt";
								        		  String text = "";
								        		  try {
								        			  FileWriter fw = new FileWriter(path);
								        			  for(int k=0;k<temp_file_data.size();k++) {
								        				  text = temp_file_data.get(k);
								        				  fw.write(text);
								        				  fw.write(System.lineSeparator()); 
								        			  }
								        			  fw.close();
								        		  }
								        		  catch(IOException e) {
								        			  System.out.println("An error occcured. Please try again");
								        		  }
								        		  System.out.println("Transaction successful: Zakat = "+zakat);
								        		
								        		
				
								        	}
								        	else {
								        		System.out.println("Balance is less than 20,000.");
								        		System.out.println("Zakat will not be applied on this account...");
								        	}
								        }
								        else {
								        	System.out.println("Zakat is only applied on Saving accounts. This is a Checking account...");
								        }
							        }
							        else{

							        }
							        number = "";
							        seperator_counter = 0;
							    }
							}
							catch (FileNotFoundException e) {
							    System.out.println("An error occurred. Please try again");
							    e.printStackTrace();
							}
					  }
					  else if(choice == 5) {
						  
                          file_object = new File("interest.txt");
                          reader_object = new Scanner(file_object);
                          int interest = Integer.parseInt(reader_object.nextLine());
                          System.out.println("Interest: "+ interest);
                          
                          System.out.println("--------------------- INTEREST CALCULATION WINDOW ---------------------");
                          LinkedList<String> file_data = new LinkedList<>();
                          LinkedList<String> temp_file_data = new LinkedList<>();
                          String new_balance = "";
					    try {
					        file_object = new File("accounts.txt");
					        reader_object = new Scanner(file_object);
                            while (reader_object.hasNextLine()) {
                                file_data.add(reader_object.nextLine());
                            }
                            number = "";
                            line = "";
                            
					        seperator_counter = 0;
					        //---------------------------------------------
						    for(int i=0;i<file_data.size();i++){
						        line = file_data.get(i);
						        for(int j=0;j<line.length();j++) {
						            if(line.charAt(j) == '|')
						                seperator_counter++;
						            if(seperator_counter == 1) {
						                for(int k =j+1;line.charAt(k)!='|';k++) {
						                    
						                    number += line.charAt(k);
						                }
						                break;
						            }
						        }
						        if(account_number.contentEquals(number)) {
								    balance = "";
								    seperator_counter = 0;
							        for(int j=0;j<line.length();j++) {
							            if(line.charAt(j) == '|')
							                seperator_counter++;
							            if(seperator_counter == 2) {
							                for(int k =j+1;line.charAt(k)!='|';k++) {
							                    
							                    balance += line.charAt(k);
							                }
							                break;
							            }
							        }
							        account_type = "";
							        seperator_counter = 0;
							        for(int j=0;j<line.length();j++) {
							            if(line.charAt(j) == '|')
							                seperator_counter++;
							            if(seperator_counter == 5) {
							                for(int k =j+1;k<line.length();k++) {
							                    
							                    account_type += line.charAt(k);
							                }
							                break;
							            }
							        }
							        if(account_type.contentEquals("Savings")) {
							        	

							        		new_balance = String.valueOf((Integer.parseInt(balance)*(interest+100))/100);
							        		String change = new_balance;
							        		seperator_counter = 0;
		                                      for(int k=0;k<file_data.size();k++) {
		                                          if(k == i) {
		                                              String temp = "";
		                                              
		                                              for(int a=0;a<file_data.get(i).length();a++) {
		                                                  
		                                                  if(file_data.get(i).charAt(a) == '|')
		                                                      seperator_counter++;
		                                                  if(seperator_counter == 2) {
		                                                      temp += "|";
		                                                      for(int c=0;c<change.length();c++)	
		                                                          temp += change.charAt(c);
		                                                      temp += "|";
		                                                      for(int d=a+balance.length()+2;d<file_data.get(i).length();d++)	
		                                                          temp += file_data.get(i).charAt(d);
		                                                     
		                                                      break;
		                                                  }
		                                                  else {
		                                                      
		                                                      temp += file_data.get(i).charAt(a);
		                                                  }
		                                                  
		                                              }
		                                              temp_file_data.add(temp); 
		                                              
		                                          }
		                                          else {
		                                              temp_file_data.add(file_data.get(k)); 
		                                          }
		                                          
		                                      }
							        
							        		
							        	

							        }
							        else {
							        	System.out.println("Interest is only applied on savings account.");
							        	System.out.println("This is a checking account.");
							        	System.exit(0);
							        }
						        }
						        else{

						        }
						        number = "";
						        seperator_counter = 0;
						    }
					        //--------------------------------------------------
					    }
					    catch (FileNotFoundException e) {
					        System.out.println("An error occurred. Please try again");
					        e.printStackTrace();
					    } String path = System.getProperty("user.dir") + "\\accounts.txt";
                        String text = "";
                        try {
                            FileWriter fw = new FileWriter(path);
                            for(int k=0;k<temp_file_data.size();k++) {
                                text = temp_file_data.get(k);
                                fw.write(text);
                                fw.write(System.lineSeparator()); 
                            }
                            fw.close();
                        }
                        catch(IOException e) {
                            System.out.println("An error occcured. Please try again");
                        }
                        System.out.println("Interest rate: "+interest+"%");
                        System.out.println("Your balance is "+balance);
                        System.out.println("Calculating interest...");
                        System.out.println("Transaction successful: Interest = "+ new_balance);

					  
					  
					    
					    
					    //------------------------------------------------------------------------------
					  }
    				
					  
					  
    			}
    			else {
    				System.out.println("Account not found...");
    			}
    			reader_object.close();
    		} 
    		catch (FileNotFoundException e) 
    		{
    		  
    			System.out.println("An error occurred. Please try again");
    		  e.printStackTrace();
    		}
      }
      else if(choice == 4){
    	  
    	  
		  String path = System.getProperty("user.dir") + "\\interest.txt";
		  String text = "";
		  try {
			  FileWriter fw = new FileWriter(path);
			  System.out.println("Enter the interest rate");
			  text = scanner.next();
			  fw.write(text);
			  System.out.println("Saving data...");
			  fw.write(System.lineSeparator()); 
			  fw.close();
		  }
		  catch(IOException e) {
			  System.out.println("An error occcured. Please try again");
		  }
		  System.out.println("Interest rate saved...");
      }
      else if(choice == 7){
    	  
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");
    	  System.out.println("--------------------- NEW CUSTOMER WINDOW ---------------------");
    	  System.out.println("");
    	  System.out.println("Enter the following customer details:");
    	  String name = "";
    	  String address = "";
    	  String phone_number = "";
    	  System.out.println("Enter the name of the customer");
    	  name = scanner.next();
    	  System.out.println("Enter the phone number of the customer");
    	  phone_number = scanner.next();
    	  scanner.nextLine();
    	  System.out.println("Enter the address of the customer");
    	  address = scanner.nextLine();
          
    	  String path = System.getProperty("user.dir") + "\\customers.txt";
          String text = name+"|"+address+"|"+phone_number+"|"+"false"+"|"+"false";

          try {
        	  
        	  System.out.println("Saving Data......");
              FileWriter fw = new FileWriter(path, true);
              fw.write(text);
              fw.write(System.lineSeparator());
              fw.close();
          }
          catch(IOException e) {
        	  System.out.println("An error occurred: Couldn't add customer.");
          }
    	  Customer customer = new Customer(name,address,phone_number);
    	  System.out.println("Customer Added!");
      }
      
   }

	
}
