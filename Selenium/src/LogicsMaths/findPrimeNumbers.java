package LogicsMaths;

// Prime Number divides itself and 1 


public class findPrimeNumbers {
	
	// 2 is lowest prime number 

	public static boolean isPrimeNumber(int prime) {
		
		if(prime<=1) {
			return false;
		}
		for(int i=2; i<prime;i++) {
		 if(prime % i == 0) {
			 return false;
	
		}
		}
		return true;
		
		
	}
	public static void getPrimenums(int p) {
		for(int j=1;j<=p;j++) {
			if(isPrimeNumber(j))
					{
				System.out.println(""+j);
			}
			}
			
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("10 is prime ? "+isPrimeNumber(10));
	System.out.println("10 is prime ? "+isPrimeNumber(11));
	System.out.println("10 is prime ? "+isPrimeNumber(4));
	getPrimenums(20);
	
	
	}

}
