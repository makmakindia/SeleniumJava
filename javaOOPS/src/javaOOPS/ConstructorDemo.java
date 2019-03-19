package javaOOPS;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("I'm in the constuctor.....!");
	}
	
	public ConstructorDemo(int a,int b) {
		System.out.println("I'm in the parameterized constuctor.....!");
	}
	
	public ConstructorDemo(String str1) {
		System.out.println("I'm in the String parameterized constuctor.....!"+str1);
	}
	
	public void getData1() {
		System.out.println("getData............!");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorDemo cd=new ConstructorDemo(); // Default constructor
		ConstructorDemo cd1=new ConstructorDemo(4,5);//Parameterized constructor
		ConstructorDemo cd2=new ConstructorDemo("Hello Arun");//String Constructor 
		cd.getData1();
		
		
	}

}
