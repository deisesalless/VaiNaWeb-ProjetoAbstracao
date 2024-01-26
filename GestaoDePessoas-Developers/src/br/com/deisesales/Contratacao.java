package br.com.deisesales;

import java.time.LocalDate;

public abstract class Contratacao {
	
	private String modalidade;
	private Boolean status = true;
	private LocalDate dataAdmissao;
	
	public Contratacao() {}

	public Contratacao(String modalidade, Boolean status, LocalDate dataAdmissao) {
		super();
		this.modalidade = modalidade;
		this.status = status;
		this.dataAdmissao = dataAdmissao;
	}


	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}


	
}
