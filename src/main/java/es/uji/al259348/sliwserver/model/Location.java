package es.uji.al259348.sliwserver.model;

public class Location {

    private String name;
    private String configMsg;
    private String checkMsg;

    public Location() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConfigMsg() {
        return configMsg;
    }

    public void setConfigMsg(String configMsg) {
        this.configMsg = configMsg;
    }

    public String getCheckMsg() {
        return checkMsg;
    }

    public void setCheckMsg(String checkMsg) {
        this.checkMsg = checkMsg;
    }

}