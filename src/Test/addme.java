package Test;

import java.util.Scanner;


public class addme  {
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("Enter your first number:");
	      int num1 = sc.nextInt();
	      
	      System.out.println("Enter your second number:");
	      int num2 = sc.nextInt();
	      
	      System.out.println(add(num1,num2));
	      
	      
	      
	   }

	   public static int add(int num1, int num2) {
		   
		   System.out.println("Your numbers are: " + num1 + ", " + num2);
		   
		   System.out.println("Total for your numbers:");
		   
		   return num1+num2;
		   
		    
	   }
	}