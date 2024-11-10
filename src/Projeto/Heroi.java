package Projeto;


    public class Heroi {
        private String nome;
        private int experiencia;

        // Construtor da classe Heroi
        public Heroi(String nome, int experiencia) {
            this.nome = nome;
            this.experiencia = experiencia;
        }

        // Método para calcular o nível do herói com base na experiência
        public String calcularNivel() {
            String nivel;

            if (experiencia < 1000) {
                nivel = "Ferro";
            } else if (experiencia >= 1001 && experiencia <= 2000) {
                nivel = "Bronze";
            } else if (experiencia >= 2001 && experiencia <= 5000) {
                nivel = "Prata";
            } else if (experiencia >= 5001 && experiencia <= 7000) {
                nivel = "Ouro";
            } else if (experiencia >= 7001 && experiencia <= 8000) {
                nivel = "Platina";
            } else if (experiencia >= 8001 && experiencia <= 9000) {
                nivel = "Ascendente";
            } else if (experiencia >= 9001 && experiencia <= 10000) {
                nivel = "Imortal";
            } else {
                nivel = "Radiante";
            }

            return nivel;
        }

        // Método para exibir as informações do herói
        public void exibirInformacoes() {
            String nivel = calcularNivel();
            System.out.println("O Herói de nome " + nome + " está no nível de " + nivel);
        }
    }

