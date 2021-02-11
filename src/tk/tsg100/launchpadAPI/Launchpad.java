package tk.tsg100.launchpadAPI;

import javax.sound.midi.*;

public class Launchpad implements Receiver {

    private final Channels channel;
    private final Transmitter transmitter;
    private final Receiver receiver;
    private final LaunchpadReceiver launchpadReceiver;

    public Launchpad() throws MidiUnavailableException {
        this(Channels.C1);
    }
    public Launchpad(Channels channel) throws MidiUnavailableException {
        this(channel, null);
    }

    public Launchpad(Channels channel, LaunchpadReceiver launchpadReceiver) throws MidiUnavailableException {
        this.channel = channel;
        transmitter = MidiSystem.getTransmitter();
        receiver = MidiSystem.getReceiver();
        this.launchpadReceiver = launchpadReceiver;

        transmitter.setReceiver(this);

    }

    public Launchpad(LaunchpadReceiver launchpadReceiver) throws MidiUnavailableException {
        this(Channels.C1, launchpadReceiver);
    }

    @Override //pls dont use PLSSS :C uwu
    public void send(MidiMessage message, long timeStamp) {
        if (this.launchpadReceiver != null && message instanceof ShortMessage
                && (((ShortMessage) message).getChannel() == this.channel.channelForSystem())
                && (((ShortMessage) message).getCommand() == ShortMessage.NOTE_ON)
                && (((ShortMessage) message).getData2() > 0)) {
            this.launchpadReceiver.receive(Pad.findMidi(((ShortMessage) message).getData1()));
        }
    }


    public void set(final Pad pad, final Color color) throws InvalidMidiDataException, MidiUnavailableException {
        SendMidi.send(0x90, pad.getCode(), color.getCode());
    }

    @Override
    public void close() {
        this.receiver.close();
        this.transmitter.close();

    }
}
