package tk.tsg100.launchpadAPI.utils;

import tk.tsg100.launchpadAPI.Color;
import tk.tsg100.launchpadAPI.SendMidi;

public class TopRow {

    public static void change(int id, Color color){

        int value;

        switch (id){
            case(0):
                value = 0x68;
                break;
            case(1):
                value = 0x69;
                break;
            case(2):
                value = 0x6a;
                break;
            case(3):
                value = 0x6b;
                break;
            case(4):
                value = 0x6c;
                break;
            case(5):
                value = 0x6d;
                break;
            case(6):
                value = 0x6e;
                break;
            default:
                value = 0x6f;
                break;

        }

        SendMidi.send(0xB0, value, color.getCode());

    }

}
