package br.com.deisesales;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		
		Colaborador colaborador = new Colaborador();
		colaborador.vincularProfissional();
		
		colaborador.setNome("Lidia");
		colaborador.setSobrenome("Oliveira");
		colaborador.setCpf("123");
		colaborador.desvincularProfissional(colaborador, hoje);
		
		colaborador.calcularSalario(18, 8);
		
		Colaborador jordan = new Colaborador("Jordan", "Oliveira", "123", 33, 'm', "junior", "JS", 3500.7);
		FrontEnd front = new FrontEnd(jordan);
		System.out.println(front.visualizar());
		
		Colaborador deise = new Colaborador("Deise", "Sales", "456", 34, 'f', "junior", "Java", 3500.7);
		deise.setCpf("789");
		BackEnd back = new BackEnd(deise);
		System.out.println(back.visualizar());


	}

}
