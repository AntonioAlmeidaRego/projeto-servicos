package br.com.projetoservicos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetoservicos.model.Qualificacao;
import br.com.projetoservicos.repository.QualificacaoRepository;
import br.com.projetoservicos.util.ServiceUtil;

@Service
public class QualificacaoService implements ServiceUtil<Qualificacao> {
	@Autowired
	private QualificacaoRepository repository;
	
	@Override
	public void save(Qualificacao entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void update(Qualificacao entity) {
		repository.saveAndFlush(entity);
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<Qualificacao> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Qualificacao> findAllOrderByIdCres() {
		return null;
	}

	@Override
	public List<Qualificacao> findAllOrderByIdDesc() {
		return null;
	}

	@Override
	public List<Qualificacao> findAllOrderByIdCresLimit(Long limit) {
		return null;
	}

	@Override
	public List<Qualificacao> findAllOrderByIdDescLimit(Long limit) {
		return null;
	}

	@Override
	public Qualificacao getOne(Long id) {
		return repository.getOne(id);
	}

	@Override
	public Qualificacao getLast(Long id) {
		return null;
	}

}
