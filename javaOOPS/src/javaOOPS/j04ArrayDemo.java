package javaOOPS;

public class j04ArrayDemo {

	public static void main(String[] args) {
		
		
		int a[]=new int[5]; // declaration of array
		
		a[0]=7; // Initializing array 
		a[1]=1;
		a[2]=5;
		a[3]=3;
		a[4]=4;
		//Retrieve array data 
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		int b[] = {10,20,40,50}; //Declaration + initialization are in same line
		for(int j=0;j<b.length;j++) {
			System.out.println("......................."+b[j]);
		}

	}

}
