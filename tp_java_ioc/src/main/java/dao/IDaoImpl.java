package dao;

public class IDaoImpl implements IDAO{
    @Override
    public double getData() {
        System.out.println("version base de donnée");
        double data = 23.45;
        return data;
    }
}
