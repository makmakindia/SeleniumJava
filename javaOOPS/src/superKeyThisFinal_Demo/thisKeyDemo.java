package superKeyThisFinal_Demo;

public class thisKeyDemo {
			
	int a=2;
	
	public void getdata() {
		int a=3;
		System.out.println(a);
		System.out.println(this.a); // this current class and scope lies at class level
		// sum of global and local variables 
		System.out.println(a+this.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisKeyDemo tkd1=new thisKeyDemo();
		tkd1.getdata();

	}

}
