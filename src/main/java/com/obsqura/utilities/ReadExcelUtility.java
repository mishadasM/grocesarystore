package com.obsqura.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.obsqura.constants.Constants;
import models.Person;

public class ReadExcelUtility {

	
	public static List<Person> ReadDataFromExcel() {
		 List<Person> dataList = new ArrayList<>();
		try {
            FileInputStream fileInputStream = new FileInputStream(Constants.Excel_datasheet);
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            Sheet sheet = workbook.getSheetAt(0);
            int lastRowNum = sheet.getLastRowNum();
            for (int rowIndex = 1; rowIndex <=lastRowNum; rowIndex++) { 
                Row row = sheet.getRow(rowIndex);

                int phone = (int) row.getCell(0).getNumericCellValue();
                String email = row.getCell(1).getStringCellValue();
                String address = row.getCell(2).getStringCellValue();
                String deliveryTime = row.getCell(3).getStringCellValue();
                int deliveryCharge = (int) row.getCell(4).getNumericCellValue();

                Person person = new Person(phone, email, address, deliveryTime, deliveryCharge);
                
                dataList.add(person);
                
              
            }

            workbook.close();
            fileInputStream.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
		return dataList;
    }
}








