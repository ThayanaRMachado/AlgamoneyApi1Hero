package com.example.algamoneyapi1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoneyapi1.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
