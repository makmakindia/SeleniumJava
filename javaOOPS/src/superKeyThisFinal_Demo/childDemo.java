package superKeyThisFinal_Demo;

import javaOOPS.AccessModifierScope;

public class childDemo extends parentDemo {

	
		String Name="Mannepula";
		public childDemo() {
			super();
			
			System.out.println("I'm child class constructor....!");
		}
		
		public void getStringData() {
			System.out.println(Name);
			System.out.println(super.Name);
		}
		
		public void getData() {
			super.getData();
			System.out.println("getData method in ChildDemo");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	childDemo cd=new childDemo();
		cd.getStringData();
		cd.getData();
		
		AccessModifierScope pkgimpdemo=new AccessModifierScope();
		pkgimpdemo.justPrintsyso("Import pkg sample ...");
		
	}

}
