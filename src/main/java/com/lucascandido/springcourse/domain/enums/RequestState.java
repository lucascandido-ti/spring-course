package com.lucascandido.springcourse.domain.enums;

public enum RequestState {
	
	OPEN(1, "Open"),
	IN_PROGESS(2, "In Progess"),
	CLOSE(3, "Close");
	
	private int cod;
	private String descricao;
	
	private RequestState(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static RequestState ToEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(RequestState x: RequestState.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("ID Inválido: " + cod);
	}
}
