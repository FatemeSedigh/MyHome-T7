package device;

import protocol.Protocol;

public class Device {

    protected String name;
    protected String status;
    protected Protocol protocol;

    public Device ( name, status, protocol){
        this.name = name;
        this.status = "off";
        this.protocol = protocol;
    }

    public String getName(){
        return name;
    }

    public String getStatus (){
        return status;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setStatus(){
        this.status = status;
    }

    public abstract String getDeviceInfo();

}
