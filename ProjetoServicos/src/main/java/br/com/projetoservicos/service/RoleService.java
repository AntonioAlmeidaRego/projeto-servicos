package br.com.projetoservicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoservicos.model.Role;
import br.com.projetoservicos.repository.RoleRepository;
import br.com.projetoservicos.util.ServiceUtil;

@Service
public class RoleService implements ServiceUtil<Role> {
	@Autowired
	private RoleRepository repository;
	
	@Override
	public void save(Role entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void update(Role entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Role> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Role> findAllOrderByIdCres() {
		return null;
	}

	@Override
	public List<Role> findAllOrderByIdDesc() {
		return null;
	}

	@Override
	public List<Role> findAllOrderByIdCresLimit(Long limit) {
		return null;
	}

	@Override
	public List<Role> findAllOrderByIdDescLimit(Long limit) {
		return null;
	}

	@Override
	public Role getOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public Role getLast(Long id) {
		return null;
	}

}
