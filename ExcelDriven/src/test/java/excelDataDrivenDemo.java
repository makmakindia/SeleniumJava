import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDataDrivenDemo {

	// Scan and Identify column
	// Scan all rows and geet required cell data
	//

	public ArrayList<String> getExcelTestCaseData(String testcasename) throws IOException {
		
		ArrayList<String> a = new ArrayList<String>();
		
		FileInputStream fis = new FileInputStream("C:\\excelDemo\\demo1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		

		// get workbook sheet counts
		int sheets = workbook.getNumberOfSheets();
		// getSheetName("")
		for (int i = 0; i < sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testData")) {
				XSSFSheet sheet = workbook.getSheetAt(i);

				// Identify testcases columns in sheet scanning all columns

				Iterator<Row> rows = sheet.iterator();

				Row firstrow = rows.next();

				Iterator<Cell> ce = firstrow.cellIterator();
				int k = 0;
				int column = 0;
				while (ce.hasNext()) {

					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						column = k;

					}
					k++;
				}
				System.out.println(column);

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename)) {
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
						
							Cell c =cv.next();
							
							//a.add(cv.next().getStringCellValue());
							if(c.getCellTypeEnum()==CellType.STRING) {
								a.add(c.getStringCellValue());
								
							}
							else {
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}

						}
					}
				}

			//	System.out.println("Array Value : " + a);
			}
			

		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	}

}
