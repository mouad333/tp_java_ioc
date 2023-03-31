package presentation;

import dao.IDAO;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String DaoClassName = scanner.nextLine();
        Class cDao = Class.forName(DaoClassName);
        IDAO dao= (IDAO) cDao.getConstructor().newInstance();//new daoImpl();
        System.out.println(dao.getData());

        String metierClass = scanner.nextLine();
        Class mClass = Class.forName(metierClass);
        IMetier iMetier  = (IMetier) mClass.getConstructor().newInstance();
        Method setDao = (Method) mClass.getDeclaredMethod("setIdao", IDAO.class).invoke(iMetier,dao);
        System.out.println(iMetier.calcule());
    }
}
