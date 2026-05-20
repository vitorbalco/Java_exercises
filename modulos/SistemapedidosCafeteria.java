
import java.util.Scanner;

public class SistemapedidosCafeteria {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos itens você deseja: ");
        int qtd_itens = input.nextInt();

        double valorTotal = 0.0;

        for (int i = 0; i < qtd_itens; i++) {

            System.out.println("Quais itens você deseja: CAFÉ - 1 ; PAO NA CHAPA - 2; SUCO NATURAL - 3: ");
            int itens = input.nextInt();

            if (itens == 1) {
                valorTotal = valorTotal + 5.90;
            } else if (itens == 2) {
                valorTotal = valorTotal + 3;
            } else if (itens == 3) {
                valorTotal = valorTotal + 8.49;
            } else {
                System.out.println("Não temos mais no estoque.");
            }
        }
        System.out.println("O senhor é cadastrado aqui na cafeteria? :  SIM/NAO");
        String cadastrado = input.next();

            if (cadastrado.equalsIgnoreCase("Sim")) {
            System.out.printf("O senhor recebeu um desconto de 10%%, portanto, o valor final é : R$ %.2f%n", valorTotal - (valorTotal * 0.10));
            } else {
            System.out.println("O valor final é: " + valorTotal);
         }
    }
}
