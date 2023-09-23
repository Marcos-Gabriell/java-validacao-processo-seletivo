package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        selecaoCandidatos(); // Chame o método de seleção de candidatos no main()
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FRABRICIO", "MIRELA", "DANIELA", "JOAO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            candidatoAtual++; 
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0); // Correção nos valores
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0; // Correção na variável nomeada salariobase para salarioBase
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("AGUARDANDO PARA O CANDIDATO");
        }
    }
}
