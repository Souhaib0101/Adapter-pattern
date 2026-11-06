package net.montaki.computer;

public class SuperVP implements Vga, Hdmi {
    @Override
    public void view(byte[] data) {
        System.out.println("SuperVP (HDMI): " + new String(data));
    }

    @Override
    public void print(String text) {
        System.out.println("SuperVP (VGA): " + text);
    }
}