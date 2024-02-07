package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
		public static void main(String[] args) throws IOException {
			getRowCount();
		}
	
	public static void getRowCount() throws IOException {
		try {
			
			String Projectpath = System.getProperty("user.dir");
			XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\HP\\Downloads\\PIX_CRM_2\\Excel\\Data.xlsx"); 
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			int rowscount = sheet.getPhysicalNumberOfRows();
			System.out.println("No. of rows "+rowscount);
			
		} catch (Exception e) {
			System.out.println(e.getCause()); 
			System.out.println(e.getMessage());
			e.getStackTrace();
			
		}
		
		
		
		
	}
}
