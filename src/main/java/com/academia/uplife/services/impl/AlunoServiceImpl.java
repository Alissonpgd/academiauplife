package com.academia.uplife.services.impl;

import java.util.List;

import com.academia.uplife.documents.Aluno;

import com.academia.uplife.respositories.AlunoRepository;
import com.academia.uplife.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.academia.uplife.documents.Aluno;

// import com.academia.uplife.services.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;

	@Override
	public List<Aluno> listarTodos() {
		return this.alunoRepository.findAll();
	}

	@Override
	public Aluno listaPorId(String id) {
		return this.alunoRepository.findById(id).orElse(null);
	}

	@Override
	public Aluno cadastrar(Aluno aluno) {
		return this.alunoRepository.save(aluno);
	}

	@Override
	public Aluno atualizar(Aluno aluno) {
		return this.alunoRepository.save(aluno);
	}

	@Override
	public void remover(String id) {
		this.alunoRepository.deleteById(id);

	}

}
