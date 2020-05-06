package br.com.projetoservicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoservicos.model.Prestador;
import br.com.projetoservicos.repository.PrestadorRepository;
import br.com.projetoservicos.util.ServiceUtil;

@Service
public class PrestadorService implements ServiceUtil<Prestador> {
	@Autowired
	private PrestadorRepository repository;

	@Override
	public void save(Prestador entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void update(Prestador entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Prestador> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Prestador> findAllOrderByIdCres() {
		return null;
	}

	@Override
	public List<Prestador> findAllOrderByIdDesc() {
		return null;
	}

	@Override
	public List<Prestador> findAllOrderByIdCresLimit(Long limit) {
		return null;
	}

	@Override
	public List<Prestador> findAllOrderByIdDescLimit(Long limit) {
		return null;
	}

	@Override
	public Prestador getOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public Prestador getLast(Long id) {
		return null;
	}

}
