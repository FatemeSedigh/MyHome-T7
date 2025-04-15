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
}
