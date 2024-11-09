package Projeto;

public class Heroi {
    private String nome;
    private int xp;
    private String nivelheroi;

    // Construtor de Heroi
    public Heroi(String nome, int xp) {
        this.nome = nome;
        this.xp = xp;
        this.nivelheroi = qualorankdexp();
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getXp() {
        return xp;
    }

    public String getNivelheroi() {
        return nivelheroi;
    }

    // Método para determinar o rank de XP
    private String qualorankdexp() {
        if (xp < 1000) {
            return "Ferro";
        } else if (xp <= 2000) {
            return "Bronze";
        } else if (xp <= 5000) {
            return "Prata";
        } else if (xp <= 7000) {
            return "Ouro";
        } else if (xp <= 8000) {
            return "Platina";
        } else if (xp <= 9000) {
            return "Ascendente";
        } else if (xp <= 10000) {
            return "Imortal";
        } else {
            return "Radiante";
        }
    }
}

