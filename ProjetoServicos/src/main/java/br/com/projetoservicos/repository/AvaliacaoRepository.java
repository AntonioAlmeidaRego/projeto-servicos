package br.com.projetoservicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoservicos.model.Avaliação;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliação, Long> {

}
