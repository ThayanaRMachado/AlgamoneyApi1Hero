package com.example.algamoneyapi1.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.algamoneyapi1.model.Lancamento;
import com.example.algamoneyapi1.repository.filter.LancamentoFilter;
import com.example.algamoneyapi1.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);//Pode-se filtrar e paginar
}
