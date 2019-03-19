package AccessModifier;

import AccessDemoDefaultPkg.j03ProtectedAccessDemo;
// With the help of inheritence using extend keyword 
public class j03ProtectedAccessDemoMain extends j03ProtectedAccessDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		j03ProtectedAccessDemoMain pr=new j03ProtectedAccessDemoMain();
		System.out.println("Able to call the other pkg protected method using inheritence using extend keyword");
		pr.msg();
		
	}

}
