package candidatura;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salariobase = 2000.0;
		if(salariobase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		} else if(salariobase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		}else {
			System.out.println("AGUARDANDO PARA O CANDIDATO");
		}
		
	}

}
