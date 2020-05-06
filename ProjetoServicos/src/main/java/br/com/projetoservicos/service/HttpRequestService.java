package br.com.projetoservicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoservicos.model.HttpRequest;
import br.com.projetoservicos.repository.HttpRequestRepository;
import br.com.projetoservicos.util.ServiceUtil;

@Service
public class HttpRequestService implements ServiceUtil<HttpRequest> {
	@Autowired
	private HttpRequestRepository repository;
	
	@Override
	public void save(HttpRequest entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void update(HttpRequest entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<HttpRequest> findAll() {
		return repository.findAll();
	}

	@Override
	public List<HttpRequest> findAllOrderByIdCres() {
		return null;
	}

	@Override
	public List<HttpRequest> findAllOrderByIdDesc() {
		return null;
	}

	@Override
	public List<HttpRequest> findAllOrderByIdCresLimit(Long limit) {
		return null;
	}

	@Override
	public List<HttpRequest> findAllOrderByIdDescLimit(Long limit) {
		return null;
	}

	@Override
	public HttpRequest getOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public HttpRequest getLast(Long id) {
		return null;
	}

}
