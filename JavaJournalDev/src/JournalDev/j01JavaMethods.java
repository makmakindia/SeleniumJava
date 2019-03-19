package JournalDev;

public class j01JavaMethods {
	
	public void msgHello() {
		System.out.println("msgHello method....!");
	}
	public void demoMethod() {
		System.out.println("demoMethod...!");
	}
	
	public int add2numebrs(int num1, int num2) {
		return num1+num2;
	}
	
	public void print(String s) {
		System.out.println(s);
	}
	public void  print(String s1,int times) {
		for(int i=0; i<times;i++) {
		print(s1); // calling method in another method
		}
	}
	
	public int devide(int x, int y) throws IllegalArgumentException {
		if(y==0) throw new IllegalArgumentException("Can not devide by 0 ");
		return x/y;
	}

	public static void main(String[] args) {
		
		j01JavaMethods method = new j01JavaMethods();
		
		method.msgHello();
		method.demoMethod();
		int sum = method.add2numebrs(10, 20);
		System.out.println(sum);
		method.print("DemoStringfor Print");
		method.print("Arun", 5);
		System.out.println(method.devide(20, 10));

	}

}
