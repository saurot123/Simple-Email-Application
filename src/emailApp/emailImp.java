package emailApp;

import java.util.Scanner;

public class emailImp {
	private String firstName;
	private String lastName;
	private String email;
	private String department;
	private String password;
	private String alternateEmail;
	private String companyDomain="xyz.com";
	private int mailboxCapacity=500;
	private int defaultPasswordlength=8;
	
	public emailImp(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	//	System.out.println("Email Created: " + this.firstName + " "+ this.lastName );
		
		this.department = getDepartment();
	//	System.out.println("Department: "+ this.department);
		
		this.password = getpassword(defaultPasswordlength);
		//System.out.println("Password:"+this.password);
		
		email = firstName.toLowerCase() +"." + lastName.toLowerCase()+"@"+department.toLowerCase()+"."+companyDomain;
		//System.out.println("Email:"+email);
	}
	private String getDepartment() {
		
		System.out.println("Enter Department Code:\n1.Sales\n2.Development\n3.Accounts");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "Development";}
		else if(depChoice==3) {return "Accounts";}
		
		return "";
	}
	private String getpassword(int length) {
		
		String passwordSet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&";
		
		char []password = new char[length];
		for(int i=0;i<length;i++) {
			int random = (int) (Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	public void setmailBoxCapacity(int length) {
		this.mailboxCapacity=length;
	}
	public void alternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	public void resetPassword(String Password) {
		this.password=Password;
	}
	public int getmailCapacity(int length) {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword(){
		return password;
	}
	
	public void showInfo() {
		System.out.println("First Name: " + firstName +"\nlast Name: " + lastName +"\nDepartment: " + department + "\nEmail Address: "+ email + "\nMail Box Capacity: " +mailboxCapacity);
	}
	
	
}
