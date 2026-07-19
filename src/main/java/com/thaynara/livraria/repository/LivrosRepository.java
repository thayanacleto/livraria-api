package com.thaynara.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thaynara.livraria.models.Livros;

public interface LivrosRepository extends JpaRepository<Livros, Long>{
    
}
