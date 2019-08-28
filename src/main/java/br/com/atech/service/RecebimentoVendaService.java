package br.com.atech.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.atech.dto.RecebimentoVendaDTO;
import br.com.atech.dto.VendaDTO;
import br.com.atech.service.impl.IRecebimentoVendaService;
import br.com.atech.service.impl.IVendaService;


@Service
public class RecebimentoVendaService implements IRecebimentoVendaService {
	
	private static final Logger log = LoggerFactory.getLogger(RecebimentoVendaService.class);

	
	
	private VendaDTO vendaDTO = new VendaDTO();
	
	@Autowired
	private IVendaService vendaService;
	
	
	
	@Override
	public void insert(List<RecebimentoVendaDTO> recebimentoVendaDTO) throws Exception, Throwable {
		log.info("RECEBENDO O LOTE - RecebimentoVendaService");
		
		
				
		for(int i=0; i > recebimentoVendaDTO.size() ; i++) {
			
			vendaDTO.setVendaLote(recebimentoVendaDTO.get(i).getRecebimentoVendaLote());
			vendaDTO.setVendaDataLote(recebimentoVendaDTO.get(i).getRecebimentoVendaDataLote());
			vendaDTO.setVendaCodigoCliente(recebimentoVendaDTO.get(i).getRecebimentoVendaCodigoCliente());
			vendaDTO.setVendaNumeroCartao(recebimentoVendaDTO.get(i).getRecebimentoVendaNumeroCartao());
			vendaDTO.setVendaBandeiraCartao(recebimentoVendaDTO.get(i).getRecebimentoVendaBandeiraCartao());
			vendaDTO.setVendaPortadorCartao(recebimentoVendaDTO.get(i).getRecebimentoVendaPortadorCartao());
			vendaDTO.setVendaValidadeCartao(recebimentoVendaDTO.get(i).getRecebimentoVendaValidadeCartao());
			vendaDTO.setVendaCodigoCompra(recebimentoVendaDTO.get(i).getRecebimentoVendaCodigoCompra());
			vendaDTO.setVendaDataHoraCompra(recebimentoVendaDTO.get(i).getRecebimentoVendaDataHoraCompra());
			vendaDTO.setVendaValorCompra(recebimentoVendaDTO.get(i).getRecebimentoVendaValorCompra());
						
			this.vendaService.insert(vendaDTO);
		
			
		}		
	}
}
