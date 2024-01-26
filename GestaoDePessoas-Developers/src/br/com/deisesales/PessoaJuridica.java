package br.com.deisesales;

import java.time.LocalDate;

public class PessoaJuridica extends Contratacao implements Beneficios {
	
	private String razaoSocial;
	private String cnpj;
	
	public PessoaJuridica() {}
	
	
	public PessoaJuridica(String modalidade, Boolean status, LocalDate dataAdmissao, String razaoSocial, String cnpj) {
		super(modalidade, status, dataAdmissao);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String visualizar() {
		StringBuilder texto = new StringBuilder();
		texto.append("Pessoa Jurídica: " + this.razaoSocial);
		texto.append("CNPJ: " + this.cnpj);
		
		return texto.toString();
	}


	@Override
	public void calcularFGTS(double salario) {
		System.out.println("Pessoa Jurídica não tem direito a FGTS");
	}


	@Override
	public void calcular13salario(double salario) {
		System.out.println("Pessoa Jurídica não tem direito ao 13° salário");
	}


	@Override
	public void calcularValeTransporte(int diasTrabalhados, double valorPassagem) {
		System.out.println("Pessoa Jurídica não tem direito ao vale transporte");
	}


	@Override
	public void calcularValeRefeicao(int diasUteis, double valorDia) {
		System.out.println("Pessoa Jurídica não tem direito ao vale refeição");
	}


	@Override
	public void calcularValeAlimentacao(int diasUteis, double valorDia) {
		System.out.println("Pessoa Jurídica não tem direito ao vale alimentação");
		
	}

	@Override
	public void calcularAumentoSalario(int porcentagem, double salario) {
		double novoSalario = salario * (porcentagem / 100);
		System.out.println("Novo salario com aumento: " + novoSalario);
	}


	@Override
	public void calcularFerias(int quantidadeDias, double salario) {
		System.out.println("Pessoa Jurídica não tem direito a férias");
		
	}
}
