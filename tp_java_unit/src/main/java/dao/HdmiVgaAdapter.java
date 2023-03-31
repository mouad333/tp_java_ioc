package dao;

public class HdmiVgaAdapter implements  Vga{

    private HDMI hdmi;

    public HdmiVgaAdapter(HDMI hdmi){
        this.hdmi=hdmi;
    }
    @Override
    public void print(String message) {
        byte[] by=message.getBytes();
        hdmi.print(by);
    }
}
