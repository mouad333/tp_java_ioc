package presentation;

import metier.UniteCentrale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresXML {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("AplicationContext.xml");
        UniteCentrale uc=context.getBean(UniteCentrale.class);
        uc.printData("Welcome");
        System.out.println(uc.readData());
    }
}
