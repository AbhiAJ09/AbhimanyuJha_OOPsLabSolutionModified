//f)program to create a separate CredentialService which will have generatePassword, generateEmailAddress, & showCredentials method

package com.greatLearning.lab;
import java.util.*;


public class CredentialService {
	//declaring variable to be used
	String name, lastName, department, company;
	
	//creating method to generate email address
	void generateEmailAddress (String name, String lastName){
		this.name=name;
		this.lastName=lastName;
		{
			Scanner aj=new Scanner (System.in);
			System.out.println("enter your department name");
			department=aj.next ();
			System.out.println("enter your company name");
			company =aj.next();
		}
		System.out.println("Your email address is: "+name+lastName+"@"+department+"."+company+".com");
	}
	
	//Creating method to generate password
	char[] password (int size) {
        System.out.print("Your password is : ");

        //adding word librabry whose combination can be used to genrate password
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
        String pass = Capital_chars + Small_chars + numbers + symbols;
        Random rndm_method = new Random();
  
        char[] password = new char[size];

        for (int i = 0; i < size; i++)
        {
            password[i] = pass.charAt(rndm_method.nextInt(pass.length()));
  
        }
        return password;		
	}
	
	//creating method to display password
	void displayCredential(){
		int length=8;
		System.out.print(password(length));
	}
	
	//Creating main method to run above programs code
	public static void main(String [] arg) {
		String a, b;
		System.out.println("Enter first name");
		Scanner abhi=new Scanner(System.in);
		a=abhi.next();  
		System.out.println("Enter last name");
		b=abhi.next();
		CredentialService obj=new CredentialService();
		obj.generateEmailAddress(a, b);
		obj.displayCredential();
	}
}
