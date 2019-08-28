package br.com.atech.dto;

import java.math.BigDecimal;

public class AutorizacaoDTO {
	
	
	private Long       id;
	private Long       tbAutorizacaoCodigoRetorno;
	private Long       tbAutorizacaoAutorizacao;
	private String     tbAutorizacaoDataHora;
	private String     tbAutorizacaoCartao;
	private BigDecimal tbAutorizacaoValor;
	private String     tbAutorizacaoCodigoCliente;
	private String     tbAutorizacaoCodigoCompra;
	
	
	public AutorizacaoDTO() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTbAutorizacaoCodigoRetorno() {
		return tbAutorizacaoCodigoRetorno;
	}
	public void setTbAutorizacaoCodigoRetorno(Long tbAutorizacaoCodigoRetorno) {
		this.tbAutorizacaoCodigoRetorno = tbAutorizacaoCodigoRetorno;
	}
	public Long getTbAutorizacaoAutorizacao() {
		return tbAutorizacaoAutorizacao;
	}
	public void setTbAutorizacaoAutorizacao(Long tbAutorizacaoAutorizacao) {
		this.tbAutorizacaoAutorizacao = tbAutorizacaoAutorizacao;
	}
	public String getTbAutorizacaoDataHora() {
		return tbAutorizacaoDataHora;
	}
	public void setTbAutorizacaoDataHora(String tbAutorizacaoDataHora) {
		this.tbAutorizacaoDataHora = tbAutorizacaoDataHora;
	}
	public String getTbAutorizacaoCartao() {
		return tbAutorizacaoCartao;
	}
	public void setTbAutorizacaoCartao(String tbAutorizacaoCartao) {
		this.tbAutorizacaoCartao = tbAutorizacaoCartao;
	}
	public BigDecimal getTbAutorizacaoValor() {
		return tbAutorizacaoValor;
	}
	public void setTbAutorizacaoValor(BigDecimal tbAutorizacaoValor) {
		this.tbAutorizacaoValor = tbAutorizacaoValor;
	}
	public String getTbAutorizacaoCodigoCliente() {
		return tbAutorizacaoCodigoCliente;
	}
	public void setTbAutorizacaoCodigoCliente(String tbAutorizacaoCodigoCliente) {
		this.tbAutorizacaoCodigoCliente = tbAutorizacaoCodigoCliente;
	}
	public String getTbAutorizacaoCodigoCompra() {
		return tbAutorizacaoCodigoCompra;
	}
	public void setTbAutorizacaoCodigoCompra(String tbAutorizacaoCodigoCompra) {
		this.tbAutorizacaoCodigoCompra = tbAutorizacaoCodigoCompra;
	}
	
	
	

}
