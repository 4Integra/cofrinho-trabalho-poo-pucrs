import java.util.ArrayList;

public class Cofrinho {

    private ArrayList<Moeda> moedas = new ArrayList<Moeda>();
    private int capacidade;

    public Cofrinho(){
        this.capacidade = 100;
    }

    public Cofrinho(int capacidade){
        this.capacidade = capacidade;
    }


    public boolean insere(Moeda moeda){
        int qtdMoedas = moedas.size();
        if (qtdMoedas < capacidade){
            moedas.add(moeda);
            return true;
        }else{
            return false;
        }
    }

    public Moeda retira(){
        if (moedas.size()==0){
            return null;
        } else {
            return moedas.remove(moedas.size()-1);
        }
    }

    public int getQtdadeMoedas(){
        return moedas.size();
    }

    public int getQtdadeMoedasTipo(NomeMoeda nomeMoeda){
        int tipoCount = 0;

        for (Moeda moeda : moedas) {
            if (moeda.getNomeMoeda().equals(nomeMoeda)) {
                tipoCount++;
            }
        }
        return tipoCount;
    }

    public int getValorTotalCentavos(){
        int somaCentavos = 0;
        for(Moeda moeda : moedas){
            somaCentavos += moeda.getValorCentavos();
        }
        return somaCentavos;
    }

    public double getValorTotalReais(){
        double somaReais = 0;
        for (Moeda moeda : moedas){
            somaReais += moeda.getValorReais();
        }
        return somaReais;
    }
}
