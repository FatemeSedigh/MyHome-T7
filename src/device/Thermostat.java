package device;

import protocol.Protocol;

public class Thermostat extends Device {
    public int temperature;

    public Thermostat (String name, Protocol protocol){
        super(name, protocol);
        this.temperature = 20;
    }

    public int getTemperature(){
        return temperature;
    }

    public int setTemperature(){
        this.temperature = temperature;
    }


}
