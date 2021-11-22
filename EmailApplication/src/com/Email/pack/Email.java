package com.Email.pack;

import java.util.Scanner;

public class Email {
	
private String firstName;
private String lastName;
private String officialMail;
private String defaultPassword;
private String newPassword;
private String department;
private int NewPassword;
private String alternateEmail;

public int pLength=8;
private int mailboxCapacity;



 

public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getOfficialMail() {
	return officialMail;
}


public void setOfficialMail(String officialMail) {
	this.officialMail = officialMail;
}




//Generating constructors, get and setter to set first name and last name

public Email() {
	
	Scanner s1= new Scanner(System.in);
	
	
	// sets the first name 
	System.out.println("Enter first name of new Employee");
	String fN =s1.nextLine();
	setFirstName(fN)	; 												
	this.firstName= getFirstName();
	
	
		// sets the last name
		System.out.println("\nEnter Last name");
		String lN =s1.nextLine();
		setLastName(lN)	; 												
		this.lastName = getLastName();	
	
		
	System.out.println("\n--------------request captured--------------\n");
	
	
	
			System.out.println("Creating email  for: "+firstName+" "+lastName+"\n"); 		// fetches the first and last name
	
	
				
			  	// refer Method body to check  how department is set
				this.department = setDepartment(); 
				System.out.println("\nSelected dept. = "+department);
				
				
				
				
				System.out.println("\nYour email id is: "+mail());
				
				
				
				//refer Method body to check  how default password is generated
				System.out.println("Default password is : "+defPass()+"\n");
				
				
				
		
											}


	


// Setting department

private String setDepartment()
	{
		System.out.println("Choose dept. id from the list to set department");
		System.out.println("Select :\n1: for Developer\n2: for DBA\n3: for Finance-Accounting\n4: for HelpDesk\n5: for Medical\n");
	
				Scanner s2 = new Scanner(System.in);
				int dept = s2.nextInt();
	
				if (dept==1) {return "-dev";}
				else if (dept==2) {return "-dba";}
				else if (dept==3) {return "-FnA";}
				else if (dept==4) {return "-hdesk";}
				else if (dept==5) {return "-med";}
				else { System.out.println("Incorrect dept. id entered >> restart");		
						return "Incorrect choice";}
		 
			  }
	
	
	

//Generate defaultPassword at random

public String defPass()
	{

		String Pset="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@-#$_";
		char[] arr = new char[pLength];
		
		
			for (int i=0;i<pLength;i++) 
			{	
				int rand = (int) (Math.random()*Pset.length());					
				arr[i]=Pset.charAt(rand);
						}
			
			this.defaultPassword = new String(arr);
			return defaultPassword;
					
					}



//new company Mail address

public String mail()
{
	
	this.officialMail =firstName+"."+lastName+department+"@company.com";
	return officialMail;
}


/*

// Set mailbox capacity
public void setMailboxCapacity(int capacity)
{this.mailboxCapacity=capacity;	}

public int getMailboxCapacity ()
{	return mailboxCapacity;}



// Set alternate email
public void setAlternateEmail(String altmail)
{this.alternateEmail=altmail;	}

public String getAlternateEmail ()
{	return alternateEmail;}



// Set new password 

public void setNewPassword(String pass)
{this.newPassword=pass;	}

public String getNewPassword()
{	return newPassword;}


*/

public void employeeInfo ()
{
	System.out.println("Employee Name: "+getFirstName()+" "+getLastName());
	System.out.println("Employee official email is: "+officialMail);

	
}



}






