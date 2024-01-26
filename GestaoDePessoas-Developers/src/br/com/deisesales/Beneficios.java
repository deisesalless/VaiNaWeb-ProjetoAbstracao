package br.com.deisesales;

public interface Beneficios {
	
	public void calcularFGTS(double salario);
	
	public void calcular13salario(double salario);
	
	public void calcularValeTransporte(int diasTrabalhados, double valorPassagem);
	
	public void calcularValeRefeicao(int diasUteis, double valorDia);
	
	public void calcularValeAlimentacao(int diasUteis, double valorDia);
	
	public void calcularFerias(int quantidadeDias, double salario);
	
	public void calcularAumentoSalario(int porcentagem, double salario);

}
