import java.util.Scanner;

public class BoaspraticasWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Você gosta de futebol: true/false ");
        boolean futebol = input.nextBoolean();
        input.nextLine();
        // Se NÃO gosta de futebol, entra aqui, dá o adeus e o 'return' para o programa.
        if (!futebol) {
            System.out.println("Não é do seu interesse esportivo então, adeus!!");
            return;
        }

// Se o cara gostasse de futebol, o Java simplesmente ignorava o IF acima
// e passava direto para o 'while' aqui embaixo, sem precisar de chaves de ELSE!
        while (true) {
            System.out.println("Você prefere qual time do Estado Paulista: ");
            String seutime = input.nextLine();

            if (seutime.equalsIgnoreCase("Corinthians")) {
                System.out.println("Boa guerreiro, tem bom gosto!");
                break;
            } else {
                System.out.println("Time errado, meu amigo! Vou dar mais uma chance.");
            }
        }
    }
}
