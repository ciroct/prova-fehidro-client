package br.unisantos.prova.fehidro.model;

import java.util.List;

public class Criterio {
	private Long id;
	private String titulo;
	private Integer pontuacaoMaxima;
	private List<Pontuacao> pontuacoes;
	private List<Criterio> subCriterio;

	public Criterio() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getPontuacaoMaxima() {
		return pontuacaoMaxima;
	}

	public void setPontuacaoMaxima(Integer pontuacaoMaxima) {
		this.pontuacaoMaxima = pontuacaoMaxima;
	}

	public List<Pontuacao> getPontuacoes() {
		return pontuacoes;
	}

	public void setPontuacoes(List<Pontuacao> pontuacoes) {
		this.pontuacoes = pontuacoes;
	}

	public List<Criterio> getSubCriterio() {
		return subCriterio;
	}

	public void setSubCriterio(List<Criterio> subCriterio) {
		this.subCriterio = subCriterio;
	}
	
}
