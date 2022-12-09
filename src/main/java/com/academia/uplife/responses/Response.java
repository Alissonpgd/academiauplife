package com.academia.uplife.responses;

import java.util.List;

public class Response<T> {

	private T data;
	private List<String> erros;
	
	/*Construtor*/
	public Response(T data) {
		this.data = data;
	}

	public Response(List<String> erros) {
		this.erros = erros;
	}

    /*Getters and Setters*/
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<String> getErros() {
		return erros;
	}

	public void setErros(List<String> erros) {
		this.erros = erros;
	}
	
}
