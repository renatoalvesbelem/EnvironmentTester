import br.com.json.controller.JsonController;
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
    private final String absolutePath = "d://host.json";

    @Before
    public void makeXMLWithValues() throws IOException {
        createJson = new Host();
        createJson.setHostName("192.168.225.140");
        createJson.setName("renato");
        createJson.setPassword("1234564");
        String jsonInString = new Gson().toJson(createJson);
        FileWriter file = new FileWriter(absolutePath, false);
        file.write(jsonInString);
        file.close();

    }

    @Test
    public void readAndInstanceObject() {
        hostJSON = (Host) new JsonController(new Host(), absolutePath).instanceObjectParsed();

    }

    @After
    public void validateValues() {
        Assert.assertEquals(createJson.getHostName(), hostJSON.getHostName());
        Assert.assertEquals(createJson.getName(), hostJSON.getName());
        Assert.assertEquals(createJson.getPassword(), hostJSON.getPassword());
        Assert.assertEquals(true, new File(absolutePath).delete() );
    }
}