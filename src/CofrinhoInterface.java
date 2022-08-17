import java.io.IOException;
import java.util.Scanner;

public class CofrinhoInterface {
    static Scanner sc = new Scanner(System.in);
    static Cofrinho cofrinho = new Cofrinho();

    public static void main(String[] args) {
        boolean br = true;
        while(br){
            System.out.printf("Qtd. de moedas: %d \nValor em reais: %.2f\n", cofrinho.getQtdadeMoedas(), cofrinho.getValorTotalReais());
            System.out.printf("Qual operação gostaria de executar?\n1- Inserir moeda\n2- Retirar moeda\n3- Sair\n");
            int operacao = sc.nextInt();

            switch (operacao){
                case 1:
                    insereMoeda();
                    break;
                case 2:
                    if (cofrinho.getQtdadeMoedas() > 0) {
                        cofrinho.retira();
                    } else {
                        System.out.println("Seu cofrinho já está vazio :(");
                    }
                    break;
                case 3:
                    br = false;
                    break;
            }
        }
    }

    private static void insereMoeda(){
        System.out.print("Qual o valor da moeda que gostaria de inserir?\n1- Um real\n2- Cinquenta centavos\n3- Vinte e cinco centavos\n4- Dez centavos\n5- Cinco centavos\n6- Um centavo\n0- VOLTAR\n");
        int operacao = sc.nextInt();

        switch (operacao){
            case 1:
                cofrinho.insere(new Moeda(NomeMoeda.UmReal));
                break;
            case 2:
                cofrinho.insere(new Moeda(NomeMoeda.Cinquenta));
                break;
            case 3:
                cofrinho.insere(new Moeda(NomeMoeda.VinteCinco));
                break;
            case 4:
                cofrinho.insere(new Moeda(NomeMoeda.Dez));
                break;
            case 5:
                cofrinho.insere(new Moeda(NomeMoeda.Cinco));
                break;
            case 6:
                cofrinho.insere(new Moeda(NomeMoeda.Um));
                break;
            case 0:
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operacao);
        }
    }
}
