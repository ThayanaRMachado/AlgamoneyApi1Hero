package com.example.algamoneyapi1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoneyapi1.model.Lancamento;
import com.example.algamoneyapi1.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
