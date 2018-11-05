package com.algaworks.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.festa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
