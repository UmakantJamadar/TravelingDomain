package com.paramerasation;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
			FileInputStream fileInputStream = new FileInputStream("D:\\Software\\my.xlsx");
		
          Sheet sh = (Sheet) WorkbookFactory.create(fileInputStream).getSheet("login");
          
          String uname = sh.getRow(0).getCell(1).getStringCellValue();

	}

}
