package br.com.projetoservicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoservicos.model.ValidatePrestador;

@Repository
public interface ValidatePrestadorRepository extends JpaRepository<ValidatePrestador, Long> {

}
