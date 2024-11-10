package Projeto;
import java.util.Scanner;
import Projeto.*;
    public class XpHeroi {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            // Pergunta quantos heróis o usuário deseja criar
            System.out.print("Quantos heróis você quer criar? ");
            int quantidadeHerois = scan.nextInt();
            scan.nextLine(); // Limpa o buffer

            // Laço para criar a quantidade de heróis desejada
            for (int i = 0; i < quantidadeHerois; i++) {
                System.out.println("\nCriando herói " + (i + 1) + ":");

                // Leitura do nome e da experiência
                System.out.print("Digite o nome do herói: ");
                String nome = scan.nextLine();

                System.out.print("Digite a experiência do herói: ");
                int experiencia = scan.nextInt();
                scan.nextLine(); // Limpa o buffer

                // Criação do objeto Heroi
                Heroi heroi = new Heroi(nome, experiencia);

                // Exibe as informações do herói
                heroi.exibirInformacoes();
            }

            scan.close();
        }
    }

