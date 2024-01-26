package br.com.deisesales;

public class FrontEnd {
	
	private Colaborador colaborador = new Colaborador();
	
	public FrontEnd() {}

	public FrontEnd(Colaborador colaborador) {
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
		texto.append("\nClasse Front-End" + "\n");
		texto.append(colaborador.visualizar());
		return texto.toString();
	}
	
	

}
