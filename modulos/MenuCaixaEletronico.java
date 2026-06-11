import java.util.Scanner;

public class MenuCaixaEletronico {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // solicitará a resposta do usuário


        //Variavel que vai guardar nosso valor informado pelo usuário
        double valor_na_conta = 0;
        // APRENDIZADO : JAMAIS UTILIZE SCANNER OU PRINT FORA DO WHILE OU IRÁ MOSTRAR NO TERMINAL MILHARES DE VEZES O ERRO
        // laço que vai fazer o cliente verificar saldo, depositar e so sairá deste menu se ele escolher 3 - SAIR.
        while (true) {
            System.out.println("CAIXA ELETRÔNICO! SIGA AS INTRUÇÕES ABAIXO.");
            System.out.println("1 - VERIFICAR SALDO");
            System.out.println("2 - DEPOSITAR");
            System.out.println("3 - SAIR");
            int op1 = input.nextInt();
        if (op1 == 1) { // Condição de escolha do usuário
                System.out.println("VALOR TOTAL DA SUA CONTA É DE: R$" + valor_na_conta);
        } else if (op1 == 2) {
                System.out.println("Digite o valor que deseja depositar: ");
                double deposito = input.nextDouble();
                valor_na_conta = valor_na_conta + deposito;
        } else if (op1 == 3) {
                System.out.println("FINALIZAMOS O ATENDIMENTO POR AQUI!!");
                break;
        } else { // Se for escolhido outro numero além das 3 opções, ele retorna ao menu e pede para digitar o numero correto.
                System.out.println("NAO EXISTE ESTA OPÇÃO, RETORNE AO MENU E DIGITE O NUMERO INFORMADO");

            }


        }

    }
}
