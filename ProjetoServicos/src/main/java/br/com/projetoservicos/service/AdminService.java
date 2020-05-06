package br.com.projetoservicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoservicos.model.Admin;
import br.com.projetoservicos.repository.AdminRepository;
import br.com.projetoservicos.util.ServiceUtil;

@Service
public class AdminService implements ServiceUtil<Admin>{
	@Autowired
	private AdminRepository repository;
	
	@Override
	public void save(Admin entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void update(Admin entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Admin> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Admin> findAllOrderByIdCres() {
		return null;
	}

	@Override
	public List<Admin> findAllOrderByIdDesc() {
		return null;
	}

	@Override
	public List<Admin> findAllOrderByIdCresLimit(Long limit) {
		return null;
	}

	@Override
	public List<Admin> findAllOrderByIdDescLimit(Long limit) {
		return null;
	}

	@Override
	public Admin getOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public Admin getLast(Long id) {
		return null;
	}

}
