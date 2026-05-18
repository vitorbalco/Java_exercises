
import java.util.Scanner;

public class ConversorTemperatura {

                // 1. A FUNÇÃO (Em Java, chamamos de Método)
                public static double converterCparaF(double celsius) {
                    return (celsius * 9 / 5) + 32;
                }

                // 2. O PROGRAMA PRINCIPAL (O método main é por onde o Java começa a rodar)
                public static void main(String[] args) {
                    // Criando o objeto "scanner" para conseguir ler o que o usuário digita
                    Scanner scanner = new Scanner(System.in);

                    // Exibir " Conversor de Temperatura "
                    System.out.println("--- Conversor de Temperatura ---");

                    // Exibir "Digite a temperatura em Celsius:"
                    System.out.print("Digite a temperatura em Celsius: ");

                    // c = ler do usuário (usamos double para permitir números quebrados, ex: 25.5)
                    double c = scanner.nextDouble();

                    // f = converterCparaF(c)
                    double f = converterCparaF(c);

                    // Exibir "Temperatura em °F: " + f + " °F"
                    System.out.println("Temperatura em °F: " + f + " °F");

                    // Fechando o scanner por boa prática
                    scanner.close();
                }
            }




