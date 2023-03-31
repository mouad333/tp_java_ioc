package presentation;

import metier.UniteCentrale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAnnotation {
    public static void main(String[] args) {
        ApplicationContext springContext=new AnnotationConfigApplicationContext("dao","metier");
        UniteCentrale uc=springContext.getBean(UniteCentrale.class);
        uc.printData("Welcome Everybody");
        System.out.println(uc.readData());
    }
}
