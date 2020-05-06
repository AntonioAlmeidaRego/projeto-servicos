package br.com.projetoservicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.projetoservicos.model.ValidatePrestador;
import br.com.projetoservicos.repository.ValidatePrestadorRepository;
import br.com.projetoservicos.util.ServiceUtil;

@Repository
public class ValidatePrestadorService implements ServiceUtil<ValidatePrestador> {
	@Autowired
	private ValidatePrestadorRepository repository;
	
	@Override
	public void save(ValidatePrestador entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void update(ValidatePrestador entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<ValidatePrestador> findAll() {
		return repository.findAll();
	}

	@Override
	public List<ValidatePrestador> findAllOrderByIdCres() {
		return null;
	}

	@Override
	public List<ValidatePrestador> findAllOrderByIdDesc() {
		return null;
	}

	@Override
	public List<ValidatePrestador> findAllOrderByIdCresLimit(Long limit) {
		return null;
	}

	@Override
	public List<ValidatePrestador> findAllOrderByIdDescLimit(Long limit) {
		return null;
	}

	@Override
	public ValidatePrestador getOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public ValidatePrestador getLast(Long id) {
		return null;
	}

}
