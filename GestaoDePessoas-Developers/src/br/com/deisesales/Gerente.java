package br.com.deisesales;

public class Gerente {

	private Colaborador colaborador = new Colaborador();
	
	public Gerente() {}

	public Gerente(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	
	public String visualizar() {
		StringBuilder texto = new StringBuilder();
		texto.append("\nClasse Gerente" + "\n");
		texto.append(colaborador.visualizar());
		return texto.toString();
	}
	
	
}
