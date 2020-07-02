package tk.tsg100.launchpadAPI.utils;

import tk.tsg100.launchpadAPI.SendMidi;

public class Flash {

    public static void startFlash(){ SendMidi.send(0xB0, 0x0, 0x28); }
        //leave all lights on after stopping to flash
    public static void stopOn(){
        SendMidi.send(0xB0, 0x0 ,0x20);
    }
        //turn all lights of after stopping to flash
    public static void stopOff(){
        SendMidi.send(0xB0, 0x0, 0x21);
    }
}
