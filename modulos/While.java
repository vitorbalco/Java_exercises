import java.util.Scanner;

public class While {


    public static void main(String[] args) {
        System.out.println("Testando o Laço WHILE");
        Scanner input = new Scanner(System.in);

        System.out.println("Você gosta de futebol: true/false ");
        boolean futebol = input.nextBoolean();
        input.nextLine();
        if (futebol) {


            while (futebol) {
                System.out.println("Você prefere qual time do Estado Paulista: ");
                String seutime = input.nextLine();

                if (seutime.equalsIgnoreCase("Corinthians")) {
                    System.out.println("Boa guerreiro, tem bom gosto!");
                    break;
                } else {
                    System.out.println("Time errado, meu amigo! Vou dar mais uma chance.");
                }
            }
        } else {
            System.out.println("Não é do seu interesse esportivo então, adeus!!");

        }
    }
}
