import java.util.Scanner;

public class DesafioTaxaEntrega {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos Km's você irá percorrer: ");
        int distancia = input.nextInt();

        boolean chuva = false;
        double preco_distancia = 0;

        if (distancia <= 5) {
            preco_distancia = 5;
        } else if (distancia <= 10) {
            preco_distancia = 8;
        } else {
            preco_distancia = 10;
        }

        if (chuva) { // Não precisa de '== true', o boolean já se resolve sozinho
            preco_distancia += 2.0;
            System.out.println("Valor total é: " + preco_distancia);
            } else {
            System.out.println("Valor total é: " + preco_distancia);
        }
    }
}


