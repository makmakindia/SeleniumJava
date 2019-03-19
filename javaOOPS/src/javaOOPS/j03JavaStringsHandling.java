package javaOOPS;
// Strings class in java are auto initialized objects.
// String str1=new Strings(); same as String str1="Arunmumar";
//methods indexof ->  index value char will print, , substring -> print substring from 8 location 
// charAt -- prints char value at 8
public class j03JavaStringsHandling {

	public static void main(String[] args) {
	
		
		String str1="Payment $100 paid";
		
		System.out.println(str1.charAt(8)); //charAt index place
		
		String str2="Payments $100 paid";
		System.out.println(str2.indexOf("$"));
		System.out.println(str1.substring(8));
	}

}
