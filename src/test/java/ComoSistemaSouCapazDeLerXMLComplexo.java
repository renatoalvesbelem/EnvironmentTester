import br.com.constant.DatabaseType;
import br.com.database.model.Database;
import br.com.database.model.HostDatabase;
import br.com.ssh.model.HostServer;
import br.com.xml.controller.JaxbController;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ComoSistemaSouCapazDeLerXMLComplexo {
    private HostDatabase createXML, hostXML;
    private final String absolutePath = "d://host.xml";
    List<Database> databases;
    HostServer hostServer = new HostServer();

    @Before
    public void makeXMLWithValues() {
        createXML = new HostDatabase();
        Database database = new Database();
        database.setDatabaseName("192.168.225.1");
        database.setDatabasePassword("12345678");
        database.setDatabaseUser("renato");
        Database database2 = new Database();
        database2.setDatabaseName("192.168.225.1");
        database2.setDatabasePassword("12345678");
        database2.setDatabaseUser("renato");

        databases = new ArrayList<Database>();
        databases.add(database);
        databases.add(database2);
        createXML.setDatabaseName(databases);

        createXML.setDatabaseType(DatabaseType.ORACLE);

        hostServer.setHostName("192.168.225.0");
        hostServer.setName("renatohost");
        hostServer.setPassword("123");

        createXML.setHostServerApplication(hostServer);

        new XMLCreator().createXML(createXML);
    }

    @Test
    public void readAndInstanceObject() {
        hostXML = (HostDatabase) new JaxbController(new HostDatabase(), absolutePath).instanceObjectParsed();
    }

    @After
    public void validateValues() {

    }
}