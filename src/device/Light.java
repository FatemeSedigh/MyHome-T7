package device;

import protocol.Protocol;

public class Light extends Device {
    private int brightness;

    public Light(String name, Protocol protocol) {
        super(name, protocol);
        this.brightness = 50;
    }



}
