package com.algaworks.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.festa.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
