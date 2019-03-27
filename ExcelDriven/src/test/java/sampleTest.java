import java.io.IOException;
import java.util.ArrayList;

public class sampleTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println("-------Arun ---------------");
			excelDataDrivenDemo d=new excelDataDrivenDemo();
			ArrayList data=d.getExcelTestCaseData("add profiles");
			System.out.println(data.get(0));
			System.out.println(data.get(1));
			System.out.println(data.get(2));
			System.out.println(data.get(3));

			System.out.println("-------Rahul ---------------");
		dataDriven d1=new dataDriven();
		
		ArrayList data1=d1.getData("Add Profiles");
		System.out.println(data1.get(0));
		System.out.println(data1.get(1));
		System.out.println(data1.get(2));
		System.out.println(data1.get(3));
		
	}

}
