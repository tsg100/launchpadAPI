package tk.tsg100.launchpadAPI.utils;

import tk.tsg100.launchpadAPI.SendMidi;


public class Commands {

    public static void reset(){
        SendMidi.send(0xB0, 0x0, 0x0);
    }

    public static void allYellow(int value){ //full yellow 0=low 1=mid 2=max

        switch (value){
            case(0):
                SendMidi.send(0xB0, 0x0, 0x7D);
                break;
            case(1):
                SendMidi.send(0xB0, 0x0, 0x7E);
                break;
            default:
                SendMidi.send(0xB0, 0x0, 0x7F);
                break;
        }

    }

}
