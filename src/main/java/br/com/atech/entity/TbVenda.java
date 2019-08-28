package br.com.atech.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the tb_venda database table.
 * 
 */
@Entity
@Table(name="tb_venda")
public class TbVenda implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="tb_venda_bandeira_cartao", nullable=false, length=45)
	private String tbVendaBandeiraCartao;

	@Column(name="tb_venda_codigo_cliente", nullable=false, length=45)
	private String tbVendaCodigoCliente;

	@Column(name="tb_venda_codigo_compra", nullable=false, length=45)
	private String tbVendaCodigoCompra;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_venda_data_hora_compra", nullable=false)
	private Date tbVendaDataHoraCompra;

	@Temporal(TemporalType.DATE)
	@Column(name="tb_venda_data_lote", nullable=false)
	private Date tbVendaDataLote;

	@Column(name="tb_venda_lote", nullable=false, length=45)
	private String tbVendaLote;

	@Column(name="tb_venda_numero_cartao", nullable=false, length=45)
	private String tbVendaNumeroCartao;

	@Column(name="tb_venda_portador_cartao", nullable=false, length=45)
	private String tbVendaPortadorCartao;

	@Column(name="tb_venda_validade_cartao", nullable=false, length=45)
	private String tbVendaValidadeCartao;

	@Column(name="tb_venda_valor_compra", nullable=false, precision=10, scale=2)
	private BigDecimal tbVendaValorCompra;

	public TbVenda() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTbVendaBandeiraCartao() {
		return this.tbVendaBandeiraCartao;
	}

	public void setTbVendaBandeiraCartao(String tbVendaBandeiraCartao) {
		this.tbVendaBandeiraCartao = tbVendaBandeiraCartao;
	}

	public String getTbVendaCodigoCliente() {
		return this.tbVendaCodigoCliente;
	}

	public void setTbVendaCodigoCliente(String tbVendaCodigoCliente) {
		this.tbVendaCodigoCliente = tbVendaCodigoCliente;
	}

	public String getTbVendaCodigoCompra() {
		return this.tbVendaCodigoCompra;
	}

	public void setTbVendaCodigoCompra(String tbVendaCodigoCompra) {
		this.tbVendaCodigoCompra = tbVendaCodigoCompra;
	}

	public Date getTbVendaDataHoraCompra() {
		return this.tbVendaDataHoraCompra;
	}

	public void setTbVendaDataHoraCompra(Date tbVendaDataHoraCompra) {
		this.tbVendaDataHoraCompra = tbVendaDataHoraCompra;
	}

	public Date getTbVendaDataLote() {
		return this.tbVendaDataLote;
	}

	public void setTbVendaDataLote(Date tbVendaDataLote) {
		this.tbVendaDataLote = tbVendaDataLote;
	}

	public String getTbVendaLote() {
		return this.tbVendaLote;
	}

	public void setTbVendaLote(String tbVendaLote) {
		this.tbVendaLote = tbVendaLote;
	}

	public String getTbVendaNumeroCartao() {
		return this.tbVendaNumeroCartao;
	}

	public void setTbVendaNumeroCartao(String tbVendaNumeroCartao) {
		this.tbVendaNumeroCartao = tbVendaNumeroCartao;
	}

	public String getTbVendaPortadorCartao() {
		return this.tbVendaPortadorCartao;
	}

	public void setTbVendaPortadorCartao(String tbVendaPortadorCartao) {
		this.tbVendaPortadorCartao = tbVendaPortadorCartao;
	}

	public String getTbVendaValidadeCartao() {
		return this.tbVendaValidadeCartao;
	}

	public void setTbVendaValidadeCartao(String tbVendaValidadeCartao) {
		this.tbVendaValidadeCartao = tbVendaValidadeCartao;
	}

	public BigDecimal getTbVendaValorCompra() {
		return this.tbVendaValorCompra;
	}

	public void setTbVendaValorCompra(BigDecimal tbVendaValorCompra) {
		this.tbVendaValorCompra = tbVendaValorCompra;
	}

}