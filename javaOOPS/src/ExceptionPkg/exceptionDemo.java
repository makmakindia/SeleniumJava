package ExceptionPkg;

public class exceptionDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exceptionDemo obj=new exceptionDemo();
		int i=4;
		int b=7;
		int c=0;
		
		try {
			int k=b/c;
		
		String str1="Arun";
	
		//System.out.println(k);
		// System.out.println(str1.charAt(5));
		str1=null;
		System.out.println(str1.length());
		
		}
		catch(ArithmeticException ate) {
			System.out.println("ArithmeticException Error : reset c value > 0  "+ate.getMessage());
		}
		catch(IndexOutOfBoundsException iobe) {
			System.out.println("str1 string Index Out of Range Error - "+iobe.getMessage());
			
		}
		catch(NullPointerException ne) {
			System.out.println("str1 value is NULL, throwing NULL Pointer error - "+ne);
		}
		catch(Exception e) {
			System.out.println("C is deviding with zero - reinitialize c value with > 0  "+e.getMessage());
		}
		finally {
			System.out.println("Finally block");
		}
		
	}

}
