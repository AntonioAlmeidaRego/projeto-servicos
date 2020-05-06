package br.com.projetoservicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoservicos.model.Avaliação;
import br.com.projetoservicos.repository.AvaliacaoRepository;
import br.com.projetoservicos.util.ServiceUtil;

@Service
public class AvaliacaoService implements ServiceUtil<Avaliação> {
	@Autowired
	private AvaliacaoRepository repository;

	@Override
	public void save(Avaliação entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void update(Avaliação entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Avaliação> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Avaliação> findAllOrderByIdCres() {
		return null;
	}

	@Override
	public List<Avaliação> findAllOrderByIdDesc() {
		return null;
	}

	@Override
	public List<Avaliação> findAllOrderByIdCresLimit(Long limit) {
		return null;
	}

	@Override
	public List<Avaliação> findAllOrderByIdDescLimit(Long limit) {
		return null;
	}

	@Override
	public Avaliação getOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public Avaliação getLast(Long id) {
		return null;
	}
	
}
