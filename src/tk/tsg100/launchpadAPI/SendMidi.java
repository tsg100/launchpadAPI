package tk.tsg100.launchpadAPI;

import javax.sound.midi.*;

public class SendMidi {

    public static void send(int command, int data1, int data2){
        MidiDevice device;
        MidiDevice.Info[] devices = MidiSystem.getMidiDeviceInfo();

        for(int i = 0; i < devices.length; i++){
            if(devices[i].getDescription().equalsIgnoreCase("External MIDI Port")){ //select device
                try {
                    device = MidiSystem.getMidiDevice(devices[i]);

                    device.open(); //open device

                    Receiver receiver = device.getReceiver(); //prepare sender
                    MidiMessage message;

                    //0x90 = note on (set color on pad X)
                    message = new ShortMessage(0x90, 0, data1, data2); //prepare message
                    long timestamp = -1;
                    receiver.send(message, timestamp); //send message

                    receiver.close();
                    device.close(); //close everything

                    break; //exit loop
                } catch (MidiUnavailableException | InvalidMidiDataException e) {
                    e.printStackTrace();
                }


            }
        }
    }

    //Only use if launchpad isn't listed as External MIDI Port
    public static void sendPort(int command, int data1, int data2, String deviceDescription){
        MidiDevice device;
        MidiDevice.Info[] devices = MidiSystem.getMidiDeviceInfo();

        for(int i = 0; i < devices.length; i++){
            if(devices[i].getDescription().equalsIgnoreCase(deviceDescription)){ //select device
                try {
                    device = MidiSystem.getMidiDevice(devices[i]);

                    device.open(); //open device

                    Receiver receiver = device.getReceiver(); //prepare sender
                    MidiMessage message;

                    //0x90 = note on (set color on pad X)
                    message = new ShortMessage(0x90, 0, data1, data2); //prepare message
                    long timestamp = -1;
                    receiver.send(message, timestamp); //send message

                    receiver.close();
                    device.close(); //close everything

                    break; //exit loop
                } catch (MidiUnavailableException | InvalidMidiDataException e) {
                    e.printStackTrace();
                }


            }
        }
    }
 }

