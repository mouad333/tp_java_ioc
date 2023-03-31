package dao;

public class VideoProjecteur implements  Vga{
    @Override
    public void print(String msg) {
        System.out.println("Video Projector: " +msg);
    }
}
