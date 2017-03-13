package br.com.ssh.model;

public class Host {
    private String hostName;
    private String user;
    private String passswd;


    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassswd() {
        return passswd;
    }

    public void setPassswd(String passswd) {
        this.passswd = passswd;
    }
}
