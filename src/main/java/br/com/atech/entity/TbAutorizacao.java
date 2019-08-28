package br.com.atech.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the tb_autorizacao database table.
 * 
 */
@Entity
@Table(name="tb_autorizacao")
public class TbAutorizacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="tb_autorizacao_autorizacao")
	private int tbAutorizacaoAutorizacao;

	@Column(name="tb_autorizacao_cartao")
	private String tbAutorizacaoCartao;

	@Column(name="tb_autorizacao_codigo_cliente")
	private String tbAutorizacaoCodigoCliente;
	
	@Column(name="tb_autorizacao_codigo_compra")
	private String tbAutorizacaoCodigoCompra;

	@Column(name="tb_autorizacao_codigo_retorno")
	private int tbAutorizacaoCodigoRetorno;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_autorizacao_data_hora")
	private Date tbAutorizacaoDataHora;

	@Column(name="tb_autorizacao_valor")
	private BigDecimal tbAutorizacaoValor;

	public TbAutorizacao() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTbAutorizacaoAutorizacao() {
		return tbAutorizacaoAutorizacao;
	}

	public void setTbAutorizacaoAutorizacao(int tbAutorizacaoAutorizacao) {
		this.tbAutorizacaoAutorizacao = tbAutorizacaoAutorizacao;
	}

	public String getTbAutorizacaoCartao() {
		return tbAutorizacaoCartao;
	}

	public void setTbAutorizacaoCartao(String tbAutorizacaoCartao) {
		this.tbAutorizacaoCartao = tbAutorizacaoCartao;
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

	public int getTbAutorizacaoCodigoRetorno() {
		return tbAutorizacaoCodigoRetorno;
	}

	public void setTbAutorizacaoCodigoRetorno(int tbAutorizacaoCodigoRetorno) {
		this.tbAutorizacaoCodigoRetorno = tbAutorizacaoCodigoRetorno;
	}

	public Date getTbAutorizacaoDataHora() {
		return tbAutorizacaoDataHora;
	}

	public void setTbAutorizacaoDataHora(Date tbAutorizacaoDataHora) {
		this.tbAutorizacaoDataHora = tbAutorizacaoDataHora;
	}

	public BigDecimal getTbAutorizacaoValor() {
		return tbAutorizacaoValor;
	}

	public void setTbAutorizacaoValor(BigDecimal tbAutorizacaoValor) {
		this.tbAutorizacaoValor = tbAutorizacaoValor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}