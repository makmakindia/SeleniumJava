package PkgDemo2;

import PkgDemo1.demo1ClassS1;

public class demo2ClassS2 {
	
	public void demo2Method1() {
		System.out.println("demo2Method1....!");
	}
	
	public void demo2Method2() {
		System.out.println("demo2Method2....!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo1ClassS1 dc=new demo1ClassS1();
		dc.demo1Method1();
		dc.demo1Method2();
		demo2ClassS2 dc2=new demo2ClassS2();
		dc2.demo2Method1();
		dc2.demo2Method2();
		
		
		
	}



}
