package tk.tsg100.launchpadAPI.utils;

import tk.tsg100.launchpadAPI.Color;
import tk.tsg100.launchpadAPI.SendMidi;

public class Full {

    public static void fullOn(Color color){

        for(int i = 0; i<120; i++){
            SendMidi.send(0x90, i, color.getCode());
        }
        for(int i = 0; i<7; i++){
            TopRow.change(i, color);
        }

    }

}
