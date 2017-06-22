package Playcode;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args){
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int s1=s.nextInt();
		System.out.println("Enter the last number:");
		int s2=s.nextInt();
		System.out.println("The prime numbers are:");
		for(int i=s1;i<=s2;i++){
			boolean isPrime=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime){
					count++;
					System.out.println(i);
			}
		}
		System.out.println("the count is:"+ count);	
	}
}
