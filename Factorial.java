package Playcode;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args){
		int i,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		for(i=1;i<=num;i++){
			fact=fact*i;
		}
		System.out.println("The Factorial is:" + fact);
	}

}
