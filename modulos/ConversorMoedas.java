
import java.util.Scanner;

public class ConversorMoedas {




    public static double converter( double valor_reais, double taxa_cambio) {
        return valor_reais / taxa_cambio;
    }
         static void main (){

            Scanner input = new Scanner(System.in);


            System.out.println("Conversor de Moedas");
            System.out.println("Digite o valor que você quer converter: ");
            double valor_reais = input.nextDouble();
            System.out.println("Digite a taxa de câmbio: ");
            double taxa_cambio = input.nextDouble();

            double result = converter(valor_reais, taxa_cambio);
            System.out.println("O valor convertido é: " + result);
        }

}