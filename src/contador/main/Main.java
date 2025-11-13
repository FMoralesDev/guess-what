package contador.main;
import contador.sistema.Cadastro;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        Cadastro meuCadastro = new Cadastro();

        int opcao;

        do {
            System.out.println("GRAÇAS A DEUS VOCÊ VOLTOU!");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Verificar Saldo ");
            System.out.println("3 -  Sair");
            opcao = scn.nextInt();
            switch(opcao) {
                case 1:
                System.out.println("Digite o valor adicional: ");
                double valorDigitado = scn.nextDouble();
                meuCadastro.adicionar(valorDigitado);
                System.out.println("Valor adicionado com sucesso!");
                break;

                case 2:
                System.out.println("Guardado: " + meuCadastro.getValorGuardado());
                break;

                case 3:
                System.out.println("Até logo!");
                break;

                default:
                System.out.println("Opção Inválida!");
                break;
            }
        } while(opcao != 3);
        scn.close();
    }
}
