package net.montaki.adapter;


import net.montaki.computer.Hdmi;
import net.montaki.computer.Tv;
import net.montaki.computer.Vga;

public class HdmiVgaAdaptateur implements Vga {
    private Hdmi hdmi;
    @Override
    public void print(String message) {
        hdmi.view(message.getBytes());
    }

    public void setHdmi(Tv tv) {
        this.hdmi = tv;
    }
}