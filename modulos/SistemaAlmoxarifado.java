import  java.util.Scanner;
import  java.util.ArrayList;

public class SistemaAlmoxarifado {


        public static void main(String[] args) {
            System.out.println("BEM VINDO AO ALMOXARIFADO!!");
            Scanner input = new Scanner(System.in);
            System.out.println("Quantos materiais você deseja cadastrar? ");
            int qtd_materiais = input.nextInt();

            ArrayList<String> lista_material = new ArrayList<String>();

            for (int i = 0; i < qtd_materiais; i++) {
                System.out.println("Digite o nome do material: ");
                String material = input.next();

                lista_material.add(material);

                System.out.println("Material cadastrado com sucesso! O estoque está desta forma: " + lista_material);



            }
        }
}
