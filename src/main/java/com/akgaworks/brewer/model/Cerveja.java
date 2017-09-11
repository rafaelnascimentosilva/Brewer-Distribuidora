package com.akgaworks.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {
	@NotBlank
	private String sku;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private String nome;
}
