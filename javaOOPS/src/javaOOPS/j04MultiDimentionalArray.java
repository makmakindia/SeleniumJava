package javaOOPS;

public class j04MultiDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		int m[][]= {{2,3,4},{1,1,5},{7,2,4}};
		int min=m[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) {
				System.out.println(m[i][j]);
			 if(m[i][j]<min) {
				 min=m[i][j];
			 }
			}
		}
		System.out.println("Minium value in array : "+min);
		*/
		
		
/*		int m[][]= {{2,3,4},{1,1,5},{7,2,4}};
		int max=m[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) {
				
				System.out.println("array value : "+m[i][j]);
			if(m[i][j]>max) {
				max=m[i][j];
			}
			}
			}
		
		System.out.println("Maximum value in array : "+max);*/
		/* 
		 2 3 4 
		 1 4 5 
		 7 2 0
 
		 * */
		int m[][]= {{2,4,4},{1,4,5},{20,10,7}};
		int min=m[0][0];
		int cmin=0;
		int maxval=0;
		
//for(int a1=0;a1<3;a1++) {
//	for(int a2=0;a2<3;a2++) {
//		System.out.print(m[a1][a2]+"     ");
//	}
//	System.out.println("");
//}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++) {
				
				System.out.print(m[i][j]+"      ");
			if(m[i][j]<min) {
				min=m[i][j];
				cmin=j;
								
			}
			}
			System.out.println(" ");
			}
		
		
		

	for(int k=0; k<3; k++) {
		 // System.out.println(" k: "+k+"cmin: "+cmin+" matrix val : "+m[k][cmin]);
		
		if(m[k][cmin]>min) {
			
			maxval=m[k][cmin];
			
		}
	
		System.out.println("-----------"+(cmin+1)+"column values -----------------------"+m[k][cmin]);
	}
	System.out.println("Minimum  value in array   : "+min);
	System.out.println("minmum number column is : "+(cmin+1));
	System.out.println("Max value in "+(cmin+1)+" column is : "+maxval);
	}
}
