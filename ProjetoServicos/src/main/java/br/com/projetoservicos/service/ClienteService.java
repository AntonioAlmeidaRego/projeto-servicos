package br.com.projetoservicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoservicos.model.Cliente;
import br.com.projetoservicos.repository.ClienteRepository;
import br.com.projetoservicos.util.ServiceUtil;

@Service
public class ClienteService implements ServiceUtil<Cliente> {
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public void save(Cliente entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void update(Cliente entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Cliente> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Cliente> findAllOrderByIdCres() {
		return null;
	}

	@Override
	public List<Cliente> findAllOrderByIdDesc() {
		return null;
	}

	@Override
	public List<Cliente> findAllOrderByIdCresLimit(Long limit) {
		return null;
	}

	@Override
	public List<Cliente> findAllOrderByIdDescLimit(Long limit) {
		return null;
	}

	@Override
	public Cliente getOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public Cliente getLast(Long id) {
		return null;
	}

}
