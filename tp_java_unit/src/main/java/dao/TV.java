package dao;

public class TV implements HDMI{
    @Override
    public void print(byte[] data) {
        String str=new String(data);
        System.out.println(" TV : "+ str);

    }
}
