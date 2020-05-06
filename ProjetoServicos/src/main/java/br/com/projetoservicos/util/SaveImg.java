package br.com.projetoservicos.util;

import org.springframework.web.multipart.MultipartFile;

public interface SaveImg <T extends Object>{
	public void saveImg(MultipartFile file, T entity);
}
