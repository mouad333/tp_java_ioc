package presentation_spring;

import metier_spring.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presAnnotation {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("dao_spring","metier_spring");
        IMetier metier=  context.getBean(IMetier.class);
        System.out.println(metier.calcule());
    }
}
