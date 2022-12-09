package com.academia.uplife.services;

import java.util.List;

import com.academia.uplife.documents.Aluno;


public interface AlunoService {
	
	List <Aluno> listarTodos();
	
	Aluno listaPorId(String id);
	
	Aluno cadastrar(Aluno aluno);
	
	Aluno atualizar(Aluno aluno);
	
	void remover(String id);
	
}
