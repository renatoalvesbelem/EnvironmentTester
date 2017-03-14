package br.com.database.model;

import br.com.constant.DatabaseType;
import br.com.ssh.model.HostServer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlRootElement(name = "hostdatabase")
public class HostDatabase {
    private HostServer hostServerApplication;
    private DatabaseType databaseType;
    private List<Database> databaseName;


    public HostServer getHostServerApplication() {
        return hostServerApplication;
    }

    @XmlElement(name = "hostserverapplication")
    public void setHostServerApplication(HostServer hostServerApplication) {
        this.hostServerApplication = hostServerApplication;
    }

    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    @XmlElement(name = "databasetype")
    public void setDatabaseType(DatabaseType databaseType) {
        this.databaseType = databaseType;
    }


    public List<Database> getDatabaseName() {
        return databaseName;
    }

    @XmlElement(name = "database")
    public void setDatabaseName(List<Database> databaseName) {
        this.databaseName = databaseName;
    }
}
