package Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelDataReader {

    public static List<String> getData(String testcaseName) throws IOException {
        List<String> data = new ArrayList<String>();
        FileInputStream fis = new FileInputStream("/Users/kelvinvictor/Downloads/Test patients with Appts.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet =null;
        for (int i =0;i<workbook.getNumberOfSheets();i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase("CTSIM")){
                sheet = workbook.getSheetAt(i);
            }
        }
        Iterator<Row> rows = sheet.iterator();
        while (rows.hasNext()){
            Row row = rows.next();
            if (row.getCell(0).getStringCellValue().equalsIgnoreCase(testcaseName)){
                Iterator<Cell> cells = row.cellIterator();
                while (cells.hasNext()){
                    Cell cell = cells.next();
                    if (cell.getCellType() == CellType.STRING){
                        data.add(cell.getStringCellValue());
                    }
                    else {
                        data.add(NumberToTextConverter.toText(cell.getNumericCellValue()));
                    }
                }
            }
        }
        return data;
    }
}
