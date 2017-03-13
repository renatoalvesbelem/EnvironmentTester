import br.com.xml.model.Host;
import com.google.gson.Gson;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ComoSistemaSouCapazDeLerJson {
    private Host createJson, hostJSON;
    String absolutePath = "d://host.json";
    Gson gson = new Gson();

    @Before
    public void makeXMLWithValues() throws IOException {
        createJson = new Host();
        createJson.setHostName("192.168.225.140");
        createJson.setName("renato");
        createJson.setPassword("1234564");
        String jsonInString = gson.toJson(createJson);
        FileWriter    file =  new FileWriter(absolutePath,false);
            file.write(jsonInString);
    file.close();
    }

    @Test
    public void readAndInstanceateObject() {

        String jsonInString = gson.toJson(createJson);
        System.out.print(jsonInString);
    }

    @After
    public void validateValues() {
//        Assert.assertEquals(createXML.getHostName(), hostXML.getHostName());
//        Assert.assertEquals(createXML.getName(), hostXML.getName());
//        Assert.assertEquals(createXML.getPassword(), hostXML.getPassword());
//        new File(absolutePath).delete();
//        Assert.assertEquals(false, new File(absolutePath).exists());*/
    }
}