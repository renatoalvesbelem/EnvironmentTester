package br.com.xml.controller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbController {
    private String objectXML;
    private File file;
    private JAXBContext jaxbContext;
    private Unmarshaller jaxbUnmarshaller;
    private Object objectXMLFilled = null;

    public JaxbController(Object className, String pathXml) {
        objectXML = className.getClass().getCanonicalName();
        file = new File(pathXml);
    }

    public Object instanceObjectParsed() {
        try {
            jaxbContext = JAXBContext.newInstance(Class.forName(objectXML));
            jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            objectXMLFilled = jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objectXMLFilled;
    }
}
