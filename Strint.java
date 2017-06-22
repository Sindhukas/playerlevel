package Playcode;

import java.util.Scanner;

public class Strint {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.nextLine();
		int x=Integer.parseInt(str);
		System.out.println("The converted string is:" + x);
		
	}
}
