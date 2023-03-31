package dao;
import org.springframework.stereotype.Component;
@Component
public class Souris implements Usb {
    @Override
    public int read() {
        System.out.println("I am a mouse");
        return (int) (Math.random()*10);
    }
}
