package Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
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

public class ExceluploadData {

 /*   public static void getData() throws IOException {
        FileInputStream fis = new FileInputStream("/Users/kelvinvictor/Downloads/download.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rows = sheet.iterator();
        for (int i =0;i<sheet.getPhysicalNumberOfRows();i++){
            Row row = rows.next();
            for (int j =0; j<row.getLastCellNum();j++){
                Iterator<Cell> cells = row.cellIterator();
                Cell cell = cells.next();
                if (cell.getCellType() == CellType.STRING){
                    System.out.println(cell.getStringCellValue());
                }
                else {
                    System.out.println(NumberToTextConverter.toText(cell.getNumericCellValue()));
                }
            }
        }

    } */

    public static List<Integer> getrowno(String celldata) throws IOException {
        List<Integer> rowcol = new ArrayList<Integer>();
        String cellvalue = null;
        int rownum = 0;
        int column = 0;
        FileInputStream fis = new FileInputStream("/Users/kelvinvictor/Downloads/download.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
            rownum = row.getRowNum();
            System.out.println(rownum);
            for (Cell cell : row) {
                column = cell.getColumnIndex();
                System.out.println(column);
                String type = cell.getCellType().toString();
                System.out.println(type);
                switch (cell.getCellType()){
                    case STRING:
                        cellvalue = cell.getStringCellValue();
                    case NUMERIC:
                        cellvalue = NumberToTextConverter.toText(cell.getNumericCellValue());
                    default:
                        System.out.println("unsupported cell type");
                }
                if (cellvalue.equalsIgnoreCase(celldata)) {
                    rownum = cell.getRow().getRowNum();
                }
            }
        }
        rowcol.add(rownum);
        rowcol.add(column);
        return rowcol;
    }
}
