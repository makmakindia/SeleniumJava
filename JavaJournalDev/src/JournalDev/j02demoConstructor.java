package JournalDev;

import java.util.Scanner;

public class j02demoConstructor {

	static int i;
	public j02demoConstructor(){
		i=10;
		System.out.println("No args constructor ");
	}
	public j02demoConstructor(String Name) {
		System.out.println(Name);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		j02demoConstructor m=new j02demoConstructor("Arun");
		System.out.println(" i : "+i);
		String str= sc.nextLine();
				//"Hello Arun, Welcome to the world of Java";
		String[] str1=str.split(" ");
		System.out.println(str.toCharArray());
		//System.out.println(str.split("[,]"));
		System.out.println("--------------------------------------------");
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}
		
		

	}

}