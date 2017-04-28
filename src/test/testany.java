package test;

import java.text.DecimalFormat;
import java.util.Random;

class Parent{
	Parent(){
		System.out.println("Parent()");
	}
}
class SubParent extends Parent{
	SubParent(){
		System.out.println("SubParent()");
	}
}
public class testany extends SubParent{

	testany(){
		System.out.println("Subroutine()");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testany t = new testany();
	}

}
