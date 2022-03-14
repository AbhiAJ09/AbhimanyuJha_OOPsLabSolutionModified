//program to generate password

package com.greatLearning.lab;
import java.util.*;

class createPassword{
	//creating method to get password
	static char[] genPassword(int len)
    {
        System.out.print("generated password is : ");
        
        //adding word librabry whose combination can be used to genrate password
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";
        String values = Capital_chars + Small_chars + numbers + symbols;
          Random rndm_method = new Random();
          
          char[] password = new char[len];
    
          for (int i = 0; i < len; i++)
          {
              password[i] =
                values.charAt(rndm_method.nextInt(values.length()));
    
          }
          return password;
      }
  	
  }


public class GeneratePassword {
	public static void main (String [] arg) {
		//setting password limit
		int length =8;
		
		createPassword obj =new createPassword();
		
		//printing password using method described below
		System.out.println(obj.genPassword(length));
	}

}
