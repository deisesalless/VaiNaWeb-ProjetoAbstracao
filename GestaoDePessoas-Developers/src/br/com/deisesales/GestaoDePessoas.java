package br.com.deisesales;

import java.time.LocalDate;

public interface GestaoDePessoas {
	
	public void vincularProfissional();
	public void desvincularProfissional(PessoaFisica funcionario, LocalDate dataDemissao);
	public void calcularSalario(double valorHora, int horaTrabalhada);
}
