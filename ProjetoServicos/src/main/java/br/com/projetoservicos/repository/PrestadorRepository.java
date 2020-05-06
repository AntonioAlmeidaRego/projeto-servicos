package br.com.projetoservicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoservicos.model.Prestador;

@Repository
public interface PrestadorRepository extends JpaRepository<Prestador, Long> {

}
