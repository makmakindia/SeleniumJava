package javaOOPS;

public class j03JavaStringReverserPolindroStr {

	public static void main(String[] args) {
		
		
		String str1="ArunurA";
		String temp="";
		
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.println(str1.charAt(i));
			temp+=str1.charAt(i);
			
		}
		

		if(temp.equals(str1)) {
			System.out.println(str1+" is polindrome....!");
		}
		else {
			System.out.println(str1+" Reverse String is  "+temp);
		}
	}

}
