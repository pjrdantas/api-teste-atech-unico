package br.com.atech.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.atech.dto.RecebimentoVendaDTO;
import br.com.atech.service.impl.IRecebimentoVendaService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/service")
public class RecebimentoVendaController {
	
	private static final Logger log = LoggerFactory.getLogger(RecebimentoVendaController.class);
	
	@Autowired
	private IRecebimentoVendaService recebimentoVendaService;
	
	
	
	@RequestMapping(value = "/recebimentoVenda", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody  Object salvarLista(@RequestBody List<RecebimentoVendaDTO> recebimentoVendaDTO) throws Exception, Throwable {

		log.info("RECEBENDO O LOTE DE SOLICITAÇÕES PARA AUTORIZAÇÃO - RecebimentoVendaController");

		try {
			this.recebimentoVendaService.insert(recebimentoVendaDTO);
			return null;
		} catch (Exception e) {
			log.error("OCORREU UM ERRO AO TENTAR GRAVAR O LOTE" + e.getMessage());
			return e.getMessage();
		}
	}

}
