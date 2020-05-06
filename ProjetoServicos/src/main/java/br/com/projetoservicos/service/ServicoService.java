package br.com.projetoservicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoservicos.model.Servico;
import br.com.projetoservicos.repository.ServicoRepository;
import br.com.projetoservicos.util.ServiceUtil;

@Service
public class ServicoService implements ServiceUtil<Servico> {
	@Autowired
	private ServicoRepository repository;

	@Override
	public void save(Servico entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void update(Servico entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Servico> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Servico> findAllOrderByIdCres() {
		return null;
	}

	@Override
	public List<Servico> findAllOrderByIdDesc() {
		return null;
	}

	@Override
	public List<Servico> findAllOrderByIdCresLimit(Long limit) {
		return null;
	}

	@Override
	public List<Servico> findAllOrderByIdDescLimit(Long limit) {
		return null;
	}

	@Override
	public Servico getOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public Servico getLast(Long id) {
		return null;
	}
	
}
