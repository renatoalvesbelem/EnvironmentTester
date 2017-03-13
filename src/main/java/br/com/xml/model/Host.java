package br.com.xml.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "hostxml")
public class Host {
    private String hostName;
    private String name;
    private String password;

    public String getHostName() {
        return hostName;
    }

    @XmlElement(name = "hostname")
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getName() {
        return name;
    }

   @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

   @XmlElement(name = "password")
    public void setPassword(String password) {
        this.password = password;
    }
}
