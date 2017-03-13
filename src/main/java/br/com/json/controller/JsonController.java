package br.com.json.controller;

import br.com.xml.model.Host;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;

public class JsonController {


    JsonController(Object className, String pathXml) throws IOException {
        Gson gson = new Gson();

        Host hostXML = gson.fromJson(new FileReader("D:\\file.json"), Host.class);
    }


    public static void main(String args[]) throws IOException {
        new JsonController(new Object(),"");

    }

}
