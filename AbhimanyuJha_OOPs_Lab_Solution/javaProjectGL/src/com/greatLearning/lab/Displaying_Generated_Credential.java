//Program to display generated credentials

package com.greatLearning.lab;

public class Displaying_Generated_Credential {
	public static void main (String [] arg) {
		//setting password limit
		int length =8;
		
		createPassword obj =new createPassword();
		
		//printing password using method described below
		System.out.println(obj.genPassword(length));
	}

}
