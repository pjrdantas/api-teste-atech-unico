package br.com.atech.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.atech.dto.AutorizacaoDTO;
import br.com.atech.repository.impl.ItbAutorizacaoRepository;


@Transactional
@Repository
public class TbAutorizacaoRepository implements ItbAutorizacaoRepository {
	
	private static final Logger log = LoggerFactory.getLogger(TbAutorizacaoRepository.class);

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	
	final static StringBuilder sqlSelectPrincipal = new StringBuilder()
			.append("  SELECT DISTINCT ")
			.append("  id,")
			.append("  tb_autorizacao_autorizacao, ")
			.append("  tb_autorizacao_cartao, ")
			.append("  tb_autorizacao_codigo_cliente, ")
			.append("  tb_autorizacao_codigo_retorno, ")
			.append("  tb_autorizacao_data_hora, ")
			.append("  tb_autorizacao_valor ")
			.append("  FROM tb_autorizacao ");
	
	private List<AutorizacaoDTO>  devolveListaObjetos(StringBuilder sql, SqlParameterSource params) throws Exception, Throwable {
		return jdbcTemplate.query(sql.toString(), params, (rs, i) -> {
			
			AutorizacaoDTO autorizacaoDTO = new AutorizacaoDTO();
			
			autorizacaoDTO.setId(rs.getLong("id"));
			autorizacaoDTO.setTbAutorizacaoAutorizacao(rs.getLong("tb_autorizacao_autorizacao"));
			autorizacaoDTO.setTbAutorizacaoCartao(rs.getString("tb_autorizacao_cartao"));
			autorizacaoDTO.setTbAutorizacaoCodigoCliente(rs.getString("tb_autorizacao_codigo_cliente"));
			autorizacaoDTO.setTbAutorizacaoCodigoRetorno(rs.getLong("tb_autorizacao_codigo_retorno"));
			autorizacaoDTO.setTbAutorizacaoDataHora(rs.getString("tb_autorizacao_codigo_cliente"));
			autorizacaoDTO.setTbAutorizacaoValor(rs.getBigDecimal("tb_autorizacao_valor"));
			
			return autorizacaoDTO;
		});
	}

	@Override
	public List<AutorizacaoDTO> getReturn() throws Exception, Throwable {
		log.info("LISTANDO EXTRATO - TbExtratoRepository");
		StringBuilder sql = new StringBuilder(sqlSelectPrincipal).append(" order by tb_autorizacao_data_hora ");
		return devolveListaObjetos(sql, null);
	}

}
