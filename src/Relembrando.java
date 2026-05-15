import java.util.Scanner;

 public static void main(String[] args) {
        System.out.println("Hello World");

        Scanner leitor = new Scanner(System.in);

     System.out.println("Digite a nota do 1 Trimestre:");
        float nota1 = leitor.nextFloat();
     System.out.println("Digite a nota do 2 Trimestre:");
        float nota2 = leitor.nextFloat();
     System.out.println("Digite a nota do 3 Trimestre:");
        float nota3 = leitor.nextFloat();

    float media = (nota1 + nota2 + nota3) / 3;
    System.out.println("A média é: " + media);

    if (media <= 5) {
        System.out.println("Por conta disso, Reprovado");
    } else if (media < 6.9) {
        System.out.println("Dito isso, Recuperação. Te vejo no Natal hahaha");
    } else {
            System.out.println("Aprovado com sucesso!!");
        }
     }



