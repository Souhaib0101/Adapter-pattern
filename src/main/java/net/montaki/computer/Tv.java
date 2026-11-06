package net.montaki.computer;


public class Tv implements Hdmi {
    @Override
    public void view(byte[] data) {
        System.out.println("TV (HDMI): " + new String(data));
    }
}