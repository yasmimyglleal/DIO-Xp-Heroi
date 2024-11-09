package Projeto;
import java.util.Scanner;

public class CreatorWarrior{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos herois deseja criar? ");
        for (int i = sc.nextInt(); i > 0; i--) {
            sc.nextLine(); // Limpar buffer

            System.out.print("Nome do heroi: ");
            String nome = sc.nextLine();

            System.out.print("XP inicial: ");
            Heroi warrior = new Heroi(nome, sc.nextInt());

            System.out.println(" o heroi de nome " + warrior.getNome() + " esta no nivel " + warrior.getNivelheroi());
        }

        sc.close();
    }
}





