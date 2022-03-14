//a)	Generating an email with the following syntax firstNamelastName@department.company.com

package com.greatLearning.lab;
import java.util.Scanner;

class Gen_email{
	//Declaring name and last name variable;
	private String name, Last_name;
    Scanner sc=new Scanner(System.in);

    //creating parametrized constructor
    Gen_email(String name, String Last_name){
		this.name=name;
		this.Last_name=Last_name;
		System.out.println("Email: "+name+Last_name+"@"+get_department()+"."+get_company()+".com");
	}

    //creating method to access department name whch can be accessed in above constructor code
    public  String get_department() {
		System.out.println ("please enter your department in which you are working");
		String department=sc.next();
		return department;
    }

    //creating method to access company name whch can be accessed in above constructor code
    public  String get_company() {
		System.out.println ("please enter your company name in which you are working");
		String company=sc.next();
		return company;
    }
}

//main class to execute code
public class Gen_emails {
	public static void main (String [] args){
		 Gen_email obj = new Gen_email ("Abhimanyu", "Jha");
	 }

}
