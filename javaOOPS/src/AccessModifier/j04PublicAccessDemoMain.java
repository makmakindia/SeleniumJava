package AccessModifier;

import AccessDemoDefaultPkg.j04PublicAccessDemo;

public class j04PublicAccessDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		j04PublicAccessDemo pb=new j04PublicAccessDemo();
		System.out.println("Public variable i from other pkg : "+pb.p);
		pb.msg();
		
	}

}
