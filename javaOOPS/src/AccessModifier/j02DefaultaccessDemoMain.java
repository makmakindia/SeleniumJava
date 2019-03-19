package AccessModifier;

public class j02DefaultaccessDemoMain {

	public static void main(String[] args) {
		
		j02DefaultAccessDemoAClass d=new j02DefaultAccessDemoAClass();
		
		d.msg();
		// see pkg AccessDemoDefaultPkg
		//d.msg(); // Suggeting chnage vibility of method msg() to public out side of pkg scope
		

	}

}
