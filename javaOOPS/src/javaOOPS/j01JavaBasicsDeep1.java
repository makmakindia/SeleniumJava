package javaOOPS;

public class j01JavaBasicsDeep1 {

	public static void main(String[] args) {
	
		
	int a[]= {2,5,8,7,4};
	int sum=0;
	

	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		sum+=a[i];
		
		if(a[i]==7) {
			break;
		}
		
	}

	System.out.println("Sum of array elements : "+sum);
	}

}
