package br.com.atech.repository;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.atech.dto.VendaDTO;
import br.com.atech.repository.impl.ItbVendaRepository;


@Transactional
@Repository
public class TbVendaRepository implements ItbVendaRepository{
	
	
	private static final Logger log = LoggerFactory.getLogger(TbVendaRepository.class);
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public void addVenda(VendaDTO vendaDTO) throws Exception, Throwable {
		log.info("INICIANDO A GRAVAÇÃO DE Venda - TbVendaRepository");
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("  INSERT INTO ");
		sql.append("  tb_venda (");
		sql.append("  tb_venda_bandeira_cartao, ");
		sql.append("  tb_venda_codigo_cliente, ");
		sql.append("  tb_venda_codigo_compra, ");
		sql.append("  tb_venda_data_hora_compra, ");
		sql.append("  tb_venda_data_lote, ");
		sql.append("  tb_venda_lote, ");
		sql.append("  tb_venda_numero_cartao, ");
		sql.append("  tb_venda_portador_cartao, ");
		sql.append("  tb_venda_validade_cartao, ");
		sql.append("  tb_venda_valor_compra) ");
		sql.append("  values (:id, :tbVendaBandeiraCartao, :tbVendaCodigoCliente, :tbVendaCodigoCompra, "
				+ ":tbVendaDataHoraCompra, :tbVendaDataLote. :tbVendaLote, :tbVendaNumeroCartao, "
				+ ":tbVendaPortadorCartao, :tbVendaValidadeCartao, :tbVendaValorCompra)");
		
		SqlParameterSource params = new MapSqlParameterSource()
				.addValue("tb_venda_bandeira_cartao", vendaDTO.getVendaBandeiraCartao())
				.addValue("tb_venda_codigo_cliente", vendaDTO.getVendaBandeiraCartao())
				.addValue("tb_venda_codigo_compra", vendaDTO.getVendaBandeiraCartao())
				.addValue("tb_venda_data_hora_compra", vendaDTO.getVendaBandeiraCartao())
				.addValue("tb_venda_data_lote", vendaDTO.getVendaBandeiraCartao())
				.addValue("tb_venda_lote", vendaDTO.getVendaBandeiraCartao())
				.addValue("tb_venda_numero_cartao", vendaDTO.getVendaBandeiraCartao())
				.addValue("tb_venda_portador_cartao", vendaDTO.getVendaBandeiraCartao())
				.addValue("tb_venda_validade_cartao", vendaDTO.getVendaBandeiraCartao())
				.addValue("tb_venda_valor_compra", vendaDTO.getVendaBandeiraCartao());
		
		try {
			jdbcTemplate.update(sql.toString(), params);
			log.info("GRAVANDO VENDA - TbVendaRepository");
		} catch (Exception e) {
			log.error("ERRO AO GRAVAR A VENDA - TbVendaRepository: ", e);
			
		}
						
		
	}

}
