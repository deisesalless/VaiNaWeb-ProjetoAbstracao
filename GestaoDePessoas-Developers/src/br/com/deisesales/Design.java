package br.com.deisesales;

public class Design {

	
	private Colaborador colaborador = new Colaborador();
	
	public Design() {}

	public Design(Colaborador colaborador) {
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
		texto.append("\nClasse Design" + "\n");
		texto.append(colaborador.visualizar());
		return texto.toString();
	}
	
}
