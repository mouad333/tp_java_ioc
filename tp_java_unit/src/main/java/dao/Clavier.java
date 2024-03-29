package dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Clavier implements Usb{

    @Override
    public int read() {
        System.out.println("I am a keyboard");
        return (int) (Math.random()*20);
    }
}
