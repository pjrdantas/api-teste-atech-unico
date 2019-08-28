package br.com.atech.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.com.atech.dto.VendaDTO;
import br.com.atech.service.impl.IVendaService;


@Service
public class VendaService implements IVendaService {
	
	private static final Logger log = LoggerFactory.getLogger(VendaService.class);
	

	@Override
	public void insert(VendaDTO vendaDTO) throws Exception, Throwable {
		log.info("RECEBENDO O LOTE - RecebimentoVendaService");
		
	}	

}
