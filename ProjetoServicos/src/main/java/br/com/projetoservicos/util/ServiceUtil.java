package br.com.projetoservicos.util;

import java.util.List;

public interface ServiceUtil <T extends Object>{
	public void save(T entity);
	public void update(T entity);
	public void deleteById(Long id);
	public List<T> findAll();
	public List<T> findAllOrderByIdCres();
	public List<T> findAllOrderByIdDesc();
	public List<T> findAllOrderByIdCresLimit(Long limit);
	public List<T> findAllOrderByIdDescLimit(Long limit);
	public T getOne(Long id);
	public T getLast(Long id);
}
