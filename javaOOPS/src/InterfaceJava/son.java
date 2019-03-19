package InterfaceJava;

public class son extends grandFather{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		son s= new son();
		s.city();
		System.out.println(s.i);	//variable declared in grandfather class
		
	}
	
	public void someActivity() {
		System.out.println("Some activity ....!");
	}

}
