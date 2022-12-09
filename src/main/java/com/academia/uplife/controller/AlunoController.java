package com.academia.uplife.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.academia.uplife.documents.Aluno;
import com.academia.uplife.responses.Response;
import com.academia.uplife.services.AlunoService;

// import com.academia.uplife.documents.Aluno;
// import com.academia.uplife.respositories.AlunoRepository;

@Controller
// @RequestMapping(path="/login")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping("/")
    public String login(){
        return "login";
    } 

    @GetMapping("/alunos")
    public ResponseEntity<Response<List<Aluno>>>listarTodos(){
        return ResponseEntity.ok(new Response<List<Aluno>> (this.alunoService.listarTodos()));
    }
    
    @GetMapping(path = "/alunos/{id}")
    public ResponseEntity<Response<Aluno>>listarPorId(@PathVariable(name = "id")String id){
        return ResponseEntity.ok(new Response<Aluno>(this.alunoService.listaPorId(id)));
    }

    @PostMapping(path = "/alunos")
    public ResponseEntity<Response<Aluno>>cadastrar( @RequestBody Aluno aluno, BindingResult result){
        if (result.hasErrors()){
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Aluno>(erros));
        }

        return ResponseEntity.ok(new Response<Aluno>(this.alunoService.cadastrar(aluno)));
    }

    @PutMapping(path = "/alunos/{id}")
    public ResponseEntity<Response<Aluno>>atualizar(@PathVariable(name = "id")String id, @RequestBody Aluno aluno, BindingResult result){
        if (result.hasErrors()){
            List<String> erros = new ArrayList<String>();
            result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
            return ResponseEntity.badRequest().body(new Response<Aluno>(erros));
        }
        aluno.setId(id);
        return ResponseEntity.ok(new Response<Aluno>(this.alunoService.atualizar(aluno)));
    }

    @DeleteMapping(path = "/alunos/{id}")
    public ResponseEntity<Response<Integer>>remover(@PathVariable(name = "id")String id){
        this.alunoService.remover(id);
        return ResponseEntity.ok(new Response<>(1));
    }

} 

    

