package tk.tsg100.launchpadAPI.animation;

import tk.tsg100.launchpadAPI.SendMidi;
import tk.tsg100.launchpadAPI.utils.RandomColor;

public class FullRandom {

    public static void fullRandomColor(){
//TODO: Maybe exclude all nums which arend in a launchpad (Maybe better performance time?)
        for(int i = 0; i<120; i++){
            SendMidi.send(0x90, i, RandomColor.getRandomColor().getCode());
        }

    }

}
