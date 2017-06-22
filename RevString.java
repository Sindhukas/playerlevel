package Playcode;

import java.util.Scanner;
import java.util.*;

public class RevString {
	public static void main(String[] args){
		String ori,rev="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		ori=s.nextLine();
		int length=ori.length();
		for(int i=length-1;i>=0;i--){
			rev=rev+ori.charAt(i);
		}
		System.out.println("The reversed string is:" + rev);
	}
}
