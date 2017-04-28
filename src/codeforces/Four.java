package codeforces;

import java.util.Scanner;

public class Four {

	static long a;
	static long b;
	static long xx;
	static long yy;
	static char[] op = new char[150];
	static long[] X = new long[150];
	static long[] Y = new long[150];
	static boolean run(long x,long y){
		long temp_x = a - x;
		long temp_y = b - y;
		if(xx==0){
			if(yy==0){
				if(temp_x==0&&temp_y==0)
					return true;
				else
					return false;
			}else{
				if(temp_y%yy==0){
					if(temp_y/yy>0&&temp_x ==0 )
						return true;
					else 
						return false;
				}else
					return false;
			}
		}else{
			if(yy==0){
				if(temp_x%xx==0){
					if(temp_x/xx>0&&temp_y==0)
						return true;
					else 
						return false;
				}
				else
					return false;
			}else{
				if(temp_x%xx==0&&temp_y%yy==0){
					if(temp_x/xx>=0&&temp_y/yy>=0&&temp_x/xx==temp_y/yy)
						return true;
					else 
						return false;
				}else
					return false;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		
		op = in.next().toCharArray();
		int length_op = op.length;
		long x = 0;
		long y = 0;
		for(int i = 0;i < length_op;i ++){
			switch(op[i]){
				case 'U':
					y++;
					break;
				case 'D':
					y--;
					break;
				case 'R':
					x++;
					break;
				case 'L':
					x--;
					break;				
			}
			X[i] = x;
			Y[i] = y;
		}
		xx = X[length_op - 1];
		yy = Y[length_op - 1];
		boolean flag = false;
		for(int i = 0;i < length_op;i ++){
			if(run(X[i],Y[i])){
				flag = true;
				break;
			}else
				continue;
		}
		if(a==0&&b==0)
			flag = true;
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
