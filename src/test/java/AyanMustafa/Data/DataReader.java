package AyanMustafa.Data;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.bind.api.impl.NameConverter;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class DataReader {
    public List<HashMap<String, String>> getJsonDataToMap() throws IOException {
        //read json to String
       String jsonContent=FileUtils.readFileToString(new File("C:\\desktop\\SeleniumFrameworkDesign\\src\\test\\java\\AyanMustafa\\Data\\PurchaseOrder.json"),
         StandardCharsets.UTF_8);


        // String to HashMap using jackson DataBind library
        ObjectMapper mapper=new ObjectMapper();
        List<HashMap<String,String >>data= mapper.readValue(jsonContent, new TypeReference<List<HashMap<String,String>>>() {
        });
        return data;
    }
}
