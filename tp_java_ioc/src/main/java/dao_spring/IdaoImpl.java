    package dao_spring;
    import org.springframework.stereotype.Component;
    @Component
    public class IdaoImpl implements IDAO {
        @Override
        public double getData() {
            System.out.println("version base de donnée");
            double data = 23.45;
            return data;
        }
    }
