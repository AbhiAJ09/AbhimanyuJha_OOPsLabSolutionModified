//  b)	Program to determine the department (Technical, Admin, Human Resource, Legal)

package com.greatLearning.lab;

import java.util.Scanner;

public class DetermineDepartment {
	public static void main(String [] arg) {
		Scanner aj= new Scanner (System.in);
		System.out.println("Please select the following department");
		System.out.println("Press 1 --->  If you're from Technical Department");
		System.out.println("Press 2 --->  If you're from Admin Department");
		System.out.println("Press 3 --->  If you're from Human Resource Department");
		System.out.println("Press 4 --->  If you're from Legal Department");
		int input=aj.nextInt();
		switch (input){
		case 1:
			System.out.println("Based on your input, you are from Technical Department");
			break;
		case 2:
			System.out.println("Based on your input, you are from Admin Department");
			break;
		case 3:
			System.out.println("Based on your input, you are from Human Resource Department");
			break;
		case 4:
			System.out.println("Based on your input, you are from Legal Department");
			break;
		default:
			System.out.println("error! \n you have entered an invalid input");
		}
}

}

//other methods for determining department

/*class A{
void get_department() {
	Scanner aj=new Scanner (System.in);
	System.out.println ("please enter your department in which you are working");
	String department=aj.next();
	System.out.println("You're from "+department+" department");
	}
}
public class DetermineDepartment {
	public static void main(String [] arg) {
		A obj=new A();
		obj.get_department();
		
	}
}
*/

/*import java.util.Scanner;
public class Determine_department {
	 
	public static void main (String [] arg) {
		Scanner sc=new Scanner (System.in);
		System.out.println ("please enter your department in which you are working");
		String department=sc.next();
			switch (department) {
			case "Technical":
					System.out.println("You're working in " + department +" department");
				break;
			case "technical":
					System.out.println("You're working in " + department +" department");
				break;
			case "Admin":
					System.out.println("You're working in " + department +" department");
break;
case "admin":
	System.out.println("You're working in " + department +" department");
break;
case "Human Resource":
	System.out.println("You're working in " + department +" department");
break;
case "human resource":
	System.out.println("You're working in " + department +" department");
break;
case "hr":
	System.out.println("You're working in " + department +" department");
break;
case "HR":
	System.out.println("You're working in " + department +" department");
break;
case "Legal":
	System.out.println("You're working in " + department +" department");
break;
case "legal":
	System.out.println("You're working in " + department +" department");
break;
default:
System.out.println("error! \n Deparment " + department +" not found");
}				
}
}
*/