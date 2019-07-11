package com.lucascandido.springcourse.domain.enums;

public enum Role {
	ADMINISTRATOR(1, "Administrator"),
	AGENT(2, "Agent");
	
	private int cod;
	private String descricao;
	
	private Role(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static Role ToEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(Role x: Role.values()){
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("ID Inválido: " + cod);
	}
}
