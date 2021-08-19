package com.authenticates.authenticates.vo;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class LancheVO {

	private Long id;
	private String nome;
	private BigDecimal preco;
	private List<IngredienteVO> ingredientes = new ArrayList<>();
	private boolean personalizado;

	public LancheVO() {

	}

	public LancheVO(Long id, String nome, List<IngredienteVO> ingredientes, boolean personalizado, BigDecimal preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.ingredientes = ingredientes;
		this.personalizado = personalizado;
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

	public List<IngredienteVO> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<IngredienteVO> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public boolean isPersonalizado() {
		return personalizado;
	}

	public void setPersonalizado(boolean personalizado) {
		this.personalizado = personalizado;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
