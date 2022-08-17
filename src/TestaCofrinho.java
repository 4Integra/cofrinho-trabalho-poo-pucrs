public class TestaCofrinho {
    private static Moeda moedaFactory(int valor){
        switch(valor){
            case 100: return new Moeda(NomeMoeda.UmReal);
            case 50: return new Moeda(NomeMoeda.Cinquenta);
            case 25: return new Moeda(NomeMoeda.VinteCinco);
            case 10: return new Moeda(NomeMoeda.Dez);
            case 5: return new Moeda(NomeMoeda.Cinco);
            case 1: return new Moeda(NomeMoeda.Um);
            default: return null;
        }
    }

    public static void main(String[] args){
        Cofrinho cofrinho = new Cofrinho();

        for (int i : new int[]{100, 50, 25, 10, 5, 1, 100, 50, 25, 10}) {
            cofrinho.insere(moedaFactory(i));
        }

        int mostraQtd = cofrinho.getQtdadeMoedas();
        int mostraUmReal = cofrinho.getQtdadeMoedasTipo(NomeMoeda.UmReal);
        int mostraCinquenta = cofrinho.getQtdadeMoedasTipo(NomeMoeda.Cinquenta);
        int valorCentavos = cofrinho.getValorTotalCentavos();
        double valorReais = cofrinho.getValorTotalReais();

        System.out.println("Moedas armazenadas:"+ mostraQtd);
        System.out.println("Moedas de um real armazenadas:"+ mostraUmReal);
        System.out.println("Moedas de cinquenta centavos armazenadas:"+ mostraCinquenta);
        System.out.println("Valor armazenado (em centavos):"+ valorCentavos);
        System.out.printf("Valor armazenado (em reais):%.2f\n", valorReais);

        cofrinho.retira();
        cofrinho.retira();

        int valorTotal = cofrinho.getValorTotalCentavos();

        System.out.println("Valor total em centavos (após retirada de duas moedas):"+ valorTotal);

    }
}
