package Administrativa;

import java.util.Date;
import java.util.Random;

public class Entrevista {
    private Date data;
    private String candidato;

    public Entrevista() {
        this.data = new Date();
        this.candidato = gerarNomeCandidato();
    }

    private String gerarNomeCandidato() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int indice = random.nextInt(letras.length());
            char letra = letras.charAt(indice);
            resultado.append(letra);
        }

        return resultado.toString();
    }

    public Date getData() {
        return this.data;
    }

    public String getCandidato() {
        return this.candidato;
    }
}
