//Program to use parameterized constructor of class Employee, to pass firstName, lastName.

package com.greatLearning.lab;

class Employee1{
	private String Name, Last_Name;
	Employee1(String Name, String Last_Name){
		this.Name=Name;
		this.Last_Name=Last_Name;
		System.out.println(Name+ " "+ Last_Name);
	}
}

public class Employee {
	public static void main (String [] arg) {
		Employee1 obj =new Employee1("Abhimanyu" , "Jha");
	}

}
