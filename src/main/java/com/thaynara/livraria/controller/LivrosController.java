package com.thaynara.livraria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.thaynara.livraria.models.Livros;
import com.thaynara.livraria.service.LivrosService;




@RestController
@RequestMapping("/livros")
public class LivrosController {
    private LivrosService livrosService;

    public LivrosController(LivrosService livrosService) {
        this.livrosService = livrosService;
    }

@GetMapping
public List<Livros> listarTodos() {
    return livrosService.listarTodos();
}

@PostMapping 
public Livros salvar(@RequestBody Livros livros) {
    return livrosService.salvar(livros);
}


@PutMapping("/{id}")
public Livros livros(@PathVariable Long id, @RequestBody Livros livros) {
    return livrosService.atualizar(id, livros);
}

@DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
    livrosService.deletar(id);
}
    
}
