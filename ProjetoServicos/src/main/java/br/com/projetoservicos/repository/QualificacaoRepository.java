package br.com.projetoservicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoservicos.model.Qualificacao;

@Repository
public interface QualificacaoRepository extends JpaRepository<Qualificacao, Long> {

}
