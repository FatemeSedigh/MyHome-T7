package rules;

import device.Device;

public class Rule {
    private Device device;
    private String time;
    private String action;

    public Rule(Device device, String time,String action){
        this.device = device;
        this.time = time;
        this.action = action;
    }

    public Device getDevice(){
        return device;
    }

    public String getTime(){
        return time;
    }

    public String getAction(){
        return action;
    }
}
