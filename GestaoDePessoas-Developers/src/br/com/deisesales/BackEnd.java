package br.com.deisesales;

public class BackEnd extends Colaborador {

	private Colaborador colaborador = new Colaborador();
	
	public BackEnd() {}

	public BackEnd(Colaborador colaborador) {
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
		texto.append("\nClasse Back-End" + "\n");
		texto.append(colaborador.visualizar());
		return texto.toString();
	}
	
}
