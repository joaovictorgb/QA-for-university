package Administrativa;

import java.util.ArrayList;

public class Administrativa {
    ArrayList<Reuniao> reunioesAgendadas = new ArrayList<Reuniao>();
    ArrayList<Entrevista> entrevistasAgendadas = new ArrayList<Entrevista>();

    public Administrativa() {
        // Agendar reunioes ficticias
        for (int i = 0; i < 5; i++) {
            this.reunioesAgendadas.add(new Reuniao());
        }

        // Criar entrevistas ficticias
        for (int i = 0; i < 5; i++) {
            this.entrevistasAgendadas.add(new Entrevista());
        }
    }

    public String obterReunioesAgendadas() {
        String reunioes = "\nReuniões agendadas com a diretoria: \n";

        for (Reuniao reuniao : this.reunioesAgendadas) {
            reunioes += "-> " + reuniao.getData() + "\n";
        }

        return reunioes;
    }

    public String obterEntrevistas() {
        String entrevistas = "\nEntrevistas agendadas: \n";

        for (Entrevista entrevista : this.entrevistasAgendadas) {
            entrevistas += "-> Candidato " + entrevista.getCandidato() + " em " + entrevista.getData() + "\n";
        }

        return entrevistas;
    }
}
