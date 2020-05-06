package br.com.projetoservicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoservicos.model.Authorization;
import br.com.projetoservicos.repository.AuthorizationRepository;
import br.com.projetoservicos.util.ServiceUtil;

@Service
public class AuthorizationService implements ServiceUtil<Authorization> {
	@Autowired
	private AuthorizationRepository repository;
	
	@Override
	public void save(Authorization entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void update(Authorization entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Authorization> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Authorization> findAllOrderByIdCres() {
		return null;
	}

	@Override
	public List<Authorization> findAllOrderByIdDesc() {
		return null;
	}

	@Override
	public List<Authorization> findAllOrderByIdCresLimit(Long limit) {
		return null;
	}

	@Override
	public List<Authorization> findAllOrderByIdDescLimit(Long limit) {
		return null;
	}

	@Override
	public Authorization getOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public Authorization getLast(Long id) {
		return null;
	}

}
