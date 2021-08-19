package com.authenticates.authenticates.vo;

import java.math.BigDecimal;

public class IngredienteVO {

	private Long id;
	private String nome;
	private BigDecimal preco;

	public IngredienteVO() {
	}

	public IngredienteVO(Long id, String nome, BigDecimal preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	public IngredienteVO(String nome, BigDecimal preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
