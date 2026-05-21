
import java.util.Scanner;

public class FolhadePagamento {


        public static void main(String[] args) {
            System.out.println("FOLHA DE PAGAMENTO DE 5 FUNCIONÁRIOS:");
            double total_a_pagar = 0;
            Scanner input = new Scanner(System.in);

            int qtd_func = 5;


            for(int i = 0; i < qtd_func; i++){
                System.out.println("Quanto é o seu salário: ");
                double salario = input.nextDouble();
                 total_a_pagar = total_a_pagar + salario;
            }
            System.out.printf("O valor total a ser pago para todos os funcionários: R$ %.2f\n ", total_a_pagar);
        }

}
