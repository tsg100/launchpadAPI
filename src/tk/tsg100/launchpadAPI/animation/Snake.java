package tk.tsg100.launchpadAPI.animation;

import tk.tsg100.launchpadAPI.Color;
import tk.tsg100.launchpadAPI.SendMidi;

public class Snake {

    public static void snake(Color color){
        //TODO: More efficient method.
        //While writing this I lost all hope in my skills
        for(int i = 0; i<8; i++){
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
        for(int i = 64; i<72; i++){
            SendMidi.send(0x90, i, color.getCode());
        }
        for(int i = 88; i > 80; i--){
            SendMidi.send(0x90,i, color.getCode());
        }
        for(int i = 96; i<104; i++){
            SendMidi.send(0x90, i, color.getCode());
        }
        for(int i = 120; i > 112; i--){
            SendMidi.send(0x90,i, color.getCode());
        }
    }
}
