package br.com.atech.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.atech.dto.AutorizacaoDTO;
import br.com.atech.repository.impl.ItbAutorizacaoRepository;
import br.com.atech.service.impl.ItbAutorizacaoService;

@Service
public class TbAutorizacaoService implements ItbAutorizacaoService {
	
	private static final Logger log = LoggerFactory.getLogger(TbAutorizacaoService.class);
	
	
	@Autowired
	private ItbAutorizacaoRepository autorizacaoRepository;

	@Override
	public List<AutorizacaoDTO> getReturn() throws Exception, Throwable {
		log.info("PREPARANDO RETORNO DE AUTORIZACAO - AutorizacaoController.java");
		return autorizacaoRepository.getReturn();
	}

}
