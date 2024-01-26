package br.com.deisesales;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class PessoaFisica extends Contratacao implements GestaoDePessoas {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	
	public PessoaFisica() {}

	public PessoaFisica(String modalidade, Boolean status, LocalDate dataAdmissao, String nome, String sobrenome, String cpf) {
		super(modalidade, status, dataAdmissao);
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public PessoaFisica(String nome, String sobrenome, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String visualizar() {
		StringBuilder texto = new StringBuilder();
		texto.append("Pessoa Física: " + nome + " " + sobrenome);
		texto.append("CPF: " + cpf);
		
		return texto.toString();
	}


	@Override
	public void vincularProfissional() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome do novo funcionário: ");
		this.nome = entrada.next();
		System.out.println("Informe o sobrenome do novo funcionário: ");
		this.sobrenome = entrada.next();
		System.out.println("Informe o CPF do novo funcionário: ");
		this.cpf = entrada.next();
		System.out.println("Novo colaborador " + getNome() + " " + getSobrenome() + " com CPF "
		+ getCpf() + ", iniciado processo de vinculado ao sistema.");
		entrada.close();
	}


	@Override
	public void desvincularProfissional(PessoaFisica funcionario,LocalDate dataDemissao) {
		System.out.println("Desligamento do Funcionario: " + funcionario.getNome() + " " + funcionario.getSobrenome());
		System.out.println("CPF: " + funcionario.cpf);
		System.out.println("Data do desligamento: " + dataDemissao);
	}



	@Override
	public void calcularSalario(double valorHora, int horaTrabalhada) {
		double salario = (valorHora * horaTrabalhada) * 30;
		System.out.println("O salário com base nas horas trabalhadas é de R$ " + salario);
		
	}
	
	

}
