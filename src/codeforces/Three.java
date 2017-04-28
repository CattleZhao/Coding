package codeforces;

import java.util.Scanner;


public class Three {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long k = in.nextLong();
		int count = 1;
		if(k%2==1){
			System.out.println(count);
		}else{
			while(k%2==0){
				k/=2;
				count++;
			}
			System.out.println(count);
		}
	}
}
