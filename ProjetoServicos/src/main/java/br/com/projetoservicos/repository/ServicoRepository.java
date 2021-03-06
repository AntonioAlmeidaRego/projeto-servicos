package br.com.projetoservicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoservicos.model.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {

}
