package Data;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class jsonDataReader {

  public String searchWord;

  public  void jsonReader(String  arb) throws IOException, ParseException {
//    File srcFile = new File("./src\\test\\resources\\search_" + System.getProperty("language") + ".json") ;

    File srcFile = new File("./src\\test\\resources\\search_"+arb+".json") ;
    JSONParser parser = new JSONParser();
    JSONObject jsonObject = (JSONObject) parser.parse((new FileReader(srcFile)));
    searchWord =(String) jsonObject.get("searchWord");

  }






}
