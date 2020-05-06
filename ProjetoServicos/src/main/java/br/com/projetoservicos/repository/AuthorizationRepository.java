package br.com.projetoservicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetoservicos.model.Authorization;

@Repository
public interface AuthorizationRepository extends JpaRepository<Authorization, Long> {

}
