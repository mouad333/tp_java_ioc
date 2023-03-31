package metier;

import dao.IDAO;

public class MetierImpl implements IMetier{

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
