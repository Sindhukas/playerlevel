package Playcode;

import java.util.Scanner;

public class Swap {
	   public static void main(String args[]) 
	     {
		   	 Scanner s=new Scanner(System.in);
		   	 System.out.println("Enter the string:");
	         String name=s.nextLine();
	         int len=name.length();
	         char[] c = name.toCharArray();
	         for(int i=0;i<len-1;i=i+2)
	         {
	             char temp= c[i];
	             c[i]=c[i+1];
	             c[i+1]=temp;
	         }

	         System.out.println("Swapped string is: ");
	         System.out.println(c);

	    }
}
