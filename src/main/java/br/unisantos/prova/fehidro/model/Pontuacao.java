package br.unisantos.prova.fehidro.model;

public class Pontuacao {
	private Long id;
	private String titulo;
	private Integer pontos;
	private Boolean obrigatoria;

	public Pontuacao() {
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

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public Boolean getObrigatoria() {
		return obrigatoria;
	}

	public void setObrigatoria(Boolean obrigatoria) {
		this.obrigatoria = obrigatoria;
	}
	
}
