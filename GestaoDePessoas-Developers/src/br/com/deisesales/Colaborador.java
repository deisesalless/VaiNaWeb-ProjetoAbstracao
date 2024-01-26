package br.com.deisesales;

import java.time.LocalDate;

public class Colaborador extends PessoaFisica implements Beneficios {

	private Integer matricula;
	private Character genero;
	private String senioridade;
	private String habilidadeTecnica;
	private double salario;
	private LocalDate dataDemissao;
	
	public Colaborador() {}

	public Colaborador(String nome, String sobrenome, String cpf, Integer matricula, Character genero,
			String senioridade, String habilidadeTecnica, double salario) {
		super(nome, sobrenome, cpf);
		this.matricula = matricula;
		this.genero = genero;
		this.senioridade = senioridade;
		this.habilidadeTecnica = habilidadeTecnica;
		this.salario = salario;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Character getGenero() {
		return genero;
	}

	public void setGenero(Character genero) {
		this.genero = genero;
	}

	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}

	public String getHabilidadeTecnica() {
		return habilidadeTecnica;
	}

	public void setHabilidadeTecnica(String habilidadeTecnica) {
		this.habilidadeTecnica = habilidadeTecnica;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDataDemissao() {
		return dataDemissao;
	}

	public void setDataDemissao(LocalDate dataDemissao) {
		this.dataDemissao = dataDemissao;
	}

	@Override
	public String visualizar() {
		StringBuilder texto = new StringBuilder();
		super.visualizar();
		texto.append("Matricula: " + this.matricula + "\n");
		texto.append("Habilidade Técnica: " + this.habilidadeTecnica + "\n");
		texto.append("Genêro: " + this.genero + "\n");
		texto.append("Senioridade: " + this.senioridade + "\n");
		texto.append("Salario: " + this.salario + "\n");
		
		return texto.toString();
	}

	@Override
	public void calcularFGTS(double salario) {
		double contribuicao = salario * 0.8;
		System.out.println("O valor de contribuição do FGTS é de R$ " + contribuicao);
		
	}

	@Override
	public void calcular13salario(double salario) {
		double parcela1;
		double parcela2;
		
		parcela1 = salario / 2;
		parcela2 =  parcela1 - (parcela1 * 0.10);
		
		System.out.println("O valor da 1° parcela do salário é: " + parcela1 + "\n"
		+ "O valor da 2° parcela é: " + parcela2);
		
	}

	@Override
	public void calcularValeTransporte(int diasTrabalhados, double valorPassagem) {
		double vale = valorPassagem * diasTrabalhados;
		System.out.println("O valor do vale transporte é de R$ " + vale);
		
	}

	@Override
	public void calcularValeRefeicao(int diasUteis, double valorDia) {
		double vale = diasUteis * valorDia;
		System.out.println("O valor do vale refeição é de R$ " + vale);
		
	}

	@Override
	public void calcularValeAlimentacao(int diasUteis, double valorDia) {
		double vale = diasUteis * valorDia;
		System.out.println("O valor do vale alimentação é de R$ " + vale);
		
	}

	@Override
	public void calcularFerias(int quantidadeDias, double salario) {
		double salarioPorDia = salario / 30;
		double valorFerias = quantidadeDias * salarioPorDia;
		System.out.println("O valor das suas férias é de R$ " + valorFerias);
		
	}

	@Override
	public void calcularAumentoSalario(int porcentagem, double salario) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
