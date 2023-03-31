package metier_spring;

import dao_spring.IDAO;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class MetierImpl implements IMetier{
    @Autowired
    private IDAO idao;

    @Override
    public double calcule() {
        double data = idao.getData();
        return data * 12;
    }

    public void setIdao(IDAO idao) {
        this.idao = idao;
    }
}
