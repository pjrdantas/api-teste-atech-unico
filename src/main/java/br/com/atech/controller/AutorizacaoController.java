package br.com.atech.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.atech.dto.AutorizacaoDTO;
import br.com.atech.service.impl.ItbAutorizacaoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/service")
public class AutorizacaoController {
	
	private static final Logger log = LoggerFactory.getLogger(AutorizacaoController.class);
	
	@Autowired
	private ItbAutorizacaoService autorizacaoService;
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 * @throws Throwable
	 */
	@RequestMapping(value = "/autorizacaoLote", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<AutorizacaoDTO> consultar() throws Exception, Throwable {
		log.info("PREPARANDO RETORNO DE AUTORIZACAO - AutorizacaoController.java");
		return this.autorizacaoService.getReturn();
	}

}
