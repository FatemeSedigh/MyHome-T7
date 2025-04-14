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



}
