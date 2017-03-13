import br.com.xml.controller.JaxbController;
import br.com.xml.model.Host;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class ComoSistemaSouCapazDeLerXML {
    private Host createXML, hostXML;
    String absolutePath = "d://host.xml";

    @Before
    public void makeXMLWithValues() {
        createXML = new Host();
        createXML.setHostName("192.168.225.140");
        createXML.setName("renato");
        createXML.setPassword("1234564");
        new XMLCreator().createXML(createXML);
    }

    @Test
    public void readAndInstanceateObject() {
        hostXML = (Host) new JaxbController(new Host(),absolutePath).instanceObjectParsed();
    }

    @After
    public void validateValues() {
        Assert.assertEquals(createXML.getHostName(), hostXML.getHostName());
        Assert.assertEquals(createXML.getName(), hostXML.getName());
        Assert.assertEquals(createXML.getPassword(), hostXML.getPassword());
        new File(absolutePath).delete();
        Assert.assertEquals(false, new File(absolutePath).exists());
    }
}