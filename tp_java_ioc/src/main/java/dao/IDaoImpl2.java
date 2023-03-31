package dao;

public class IDaoImpl2 implements IDAO{
    @Override
    public double getData() {
        System.out.println("version web service");
        double data = 15.30;
        return data;
    }
}
