package tk.tsg100.launchpadAPI.animation;

import tk.tsg100.launchpadAPI.Color;
import tk.tsg100.launchpadAPI.Launchpad;
import tk.tsg100.launchpadAPI.SendMidi;

public class Snake {

    public static void snake(Color color){

        for(int i = 0; i<7; i++){
            SendMidi.send(0x90, i, color.getCode());
        }
        for(int i = 24; i > 16; i--){
            SendMidi.send(0x90,i, color.getCode());
        }
        for(int i = 32; i<40; i++){
            SendMidi.send(0x90, i, color.getCode());
        }
        for(int i = 56; i > 48; i--){
            SendMidi.send(0x90,i, color.getCode());
        }

    }

}
