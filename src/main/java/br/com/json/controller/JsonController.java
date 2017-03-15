package br.com.json.controller;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JsonController {
    private final String objectJson;
    private final File file;
    private Object objectXMLFilled = null;

    public JsonController(Object objectXML, String pathXml) {
        objectJson = objectXML.getClass().getCanonicalName();
        file = new File(pathXml);
    }


    public Object instanceObjectParsed() {
        try {
            FileReader fileReader = new FileReader(file);
            objectXMLFilled = new Gson().fromJson(fileReader, Class.forName(objectJson));
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objectXMLFilled;
    }

}
