package com.paramerasation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelSheet {

	public static void main(String[] args) {
		public class ReadExcelSheet {

			public static void main(String[] args) throws EncryptedDocumentException, IOException {
				
			
					FileInputStream fileInputStream = new FileInputStream("D:\\Software\\my.xlsx");
				
		          Sheet sh = (Sheet) WorkbookFactory.create(fileInputStream).getSheet("login");
		          
		          String uname = sh.getRow(0).getCell(1).getStringCellValue();
		          System.out.println(uname);
              
		          for(int i=0; i<sh.getLastRowNum(); i++ )
		          {
		        	 int lastCellNum = sh.getRow(i).getLastCellNum();
		        	 for(int j=0; j<lastCellNum; j++ )
		        	 {
		        		 CellType ctype = sh.getRow(i).getCell(j).getCellType();
		        		 String values = " ";
		        		 double intValue = 0;
		        		 if(ctype.toString().equalsIgnoreCase("String"))
		        			 values = sh.getRow(i).getCell(j).getStringCellValue();
		        		 else
		        			 intValues = sh.getRow(i).getCell(j).getNumericCellValue();
		        				 System.out.println(values);
		        				 System.out.println(intValues);
		        				 )
		        			 
		        	 }
		          }
			}

		}

	}

}
