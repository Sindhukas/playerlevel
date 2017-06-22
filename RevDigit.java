package Playcode;

import java.util.Scanner;

public class RevDigit {
	public static void main(String[] args){
		int ori,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numerals:");
		ori=s.nextInt();
		while(ori!=0){
			rev=rev*10;
			rev=rev+ ori%10;
			ori=ori/10;
		}
		System.out.println("The reversed string is:" + rev);
	}
	
}
