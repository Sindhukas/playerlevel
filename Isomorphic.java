package Playcode;

import java.io.*;
import java.util.*;

public class Isomorphic {
	static int size=256;
	public static boolean areiso(String str1, String str2){
		int m=str1.length();
		int n=str2.length();
		if(m!=n){
			return false;
		}
		Boolean[] mark= new Boolean[size];
		Arrays.fill(mark, Boolean.FALSE);
		
		int[] map=new int[size];
		Arrays.fill(map, -1);
		
		for(int i=0;i<n;i++){
			if(map[str1.charAt(i)]==-1){
				if(mark[str2.charAt(i)]==true){
					return false;
				}
				mark[str2.charAt(i)]=true;
				map[str1.charAt(i)]=str2.charAt(i);
			}
			else if(map[str1.charAt(i)]!=str2.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		boolean res=areiso("egg","add");
		System.out.println(res);
		res=areiso("foo","bar");
		System.out.println(res);
	}

}
