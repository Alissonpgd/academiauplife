package com.academia.uplife.respositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.academia.uplife.documents.Aluno;

import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends MongoRepository<Aluno, String> {

}

