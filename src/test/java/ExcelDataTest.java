import Utils.ExcelDataReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class ExcelDataTest {

    @Test (dataProvider = "excelData")
    public void getExcelData(){

    }


    @DataProvider
    public Object[][] excelData() throws IOException {
        List<String> data = ExcelDataReader.getData("English_both");
        Object[][] dataset = {new String[]{data.get(0)}};
        return dataset;
    }
}
