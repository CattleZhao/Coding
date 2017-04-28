package codeforces;

import java.util.Scanner;

public class Two {
	static char[] arr = new char[100000];
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = input.nextInt();
		int b = input.nextInt();
		String str = input.next();
		arr = str.toCharArray();
		if(arr[a-1]==arr[b-1]){
			System.out.println(0);
		}else{
			System.out.println(Math.abs((arr[a-1]-arr[b-1])));
		}
	}
}
