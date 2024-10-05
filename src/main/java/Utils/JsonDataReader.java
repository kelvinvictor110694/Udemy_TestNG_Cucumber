package Utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class JsonDataReader{

   public static List<HashMap<String, String>> getJsonData() throws IOException {
        //Convert the json file to String
        String filepath = FileUtils.readFileToString(new File(System.getProperty("user.dir") + "/src/main/resources/data.json"));
        //Use Object mapper to convert String to List using JacksonBind
        ObjectMapper objmp = new ObjectMapper();
        List<HashMap<String,String>> data = objmp.readValue(filepath, new TypeReference<List<HashMap<String,String>>>() {
        });
        return data;
    }




}
