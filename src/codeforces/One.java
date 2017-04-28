package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class One {
	
	static int convert(long l){
		StringBuffer sb = new StringBuffer();
		while(l>0){
			int num =(int) l%10;
			if(num%2 == 0){
				sb.insert(0, "0");
			}else{
				sb.insert(0, "1");
			}
			l = l / 10;
		}
		return Integer.parseInt(sb.toString(),2);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int[] array = new int[1000006];
		Scanner input=new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0;i < n;i++){
			String a = input.next();
			String b = input.next();
			switch(a){
				case "+":
					array[convert(Long.parseLong(b))]++;
					break;
				case "-":
					array[convert(Long.parseLong(b))]--;
					break;
				case "?":
					System.out.println(array[(int)Long.parseLong(b,2)]);
			}
			
		}
		
	}

}
