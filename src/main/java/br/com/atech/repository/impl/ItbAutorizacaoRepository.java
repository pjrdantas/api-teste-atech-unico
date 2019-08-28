package br.com.atech.repository.impl;

import java.util.List;

import br.com.atech.dto.AutorizacaoDTO;



public interface ItbAutorizacaoRepository {
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	List<AutorizacaoDTO> getReturn() throws Exception, Throwable;

}
