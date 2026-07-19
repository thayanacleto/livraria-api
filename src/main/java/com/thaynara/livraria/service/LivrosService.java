package com.thaynara.livraria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.thaynara.livraria.models.Livros;
import com.thaynara.livraria.repository.LivrosRepository;

@Service
public class LivrosService {
    private LivrosRepository livrosRepository;

    public LivrosService(LivrosRepository livrosRepository) {
        this.livrosRepository = livrosRepository;
    }

    public List<Livros> listarTodos(){
        return livrosRepository.findAll();
    }

    public Livros salvar(Livros livros){
        return livrosRepository.save(livros);
    }
    public Livros atualizar(Long id, Livros livros){
        livros.setId(id);
        return livrosRepository.save(livros);
    }

    public void deletar(Long id){
        livrosRepository.deleteById(id);
    }
    
}
