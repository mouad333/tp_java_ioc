package metier;

import dao.Usb;
import dao.Vga;
import org.springframework.stereotype.Component;

@Component
public class UniteCentrale {
    Vga vga;
    Usb usb;


    public UniteCentrale(Vga vga, Usb usb) {
        this.vga= vga;
        this.usb = usb;
    }
    public int readData(){

        return usb.read() ;
    }
    public void  printData(String data){
        vga.print(data);
    }
}
