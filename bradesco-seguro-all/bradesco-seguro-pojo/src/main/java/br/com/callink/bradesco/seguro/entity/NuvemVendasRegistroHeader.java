/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.callink.bradesco.seguro.entity;

import java.math.BigInteger;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.callink.bradesco.seguro.entity.metadata.IdentifiableEntity;

/**
 *
 * @author neppo_oldamar
 */
@Entity
@Table(name = "TB_NUVEM_VENDAS_REGISTRO_HEADER")
public class NuvemVendasRegistroHeader implements IdentifiableEntity<Long> {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "TIPO_REGISTRO")
    private String tipoRegistro;
    @Column(name = "TIPO_LAYOUT")
    private String tipoLayout;
    @Column(name = "CLIENTE")
    private String cliente;
    @Column(name = "PRODUTO")
    private String produto;
    @Column(name = "IDENTIFICACAO_CAMPANHA")
    private String identificacaoCampanha;
    @Column(name = "DATA_GERACAO")
    private String dataGeracao;
    @Column(name = "SEQUENCIAL_ARQUIVO")
    private String sequencialArquivo;
    @Column(name = "FILLER")
    private String filler;
    @Column(name = "ID_LOTE_MAILING")
    private BigInteger idLoteMailing;
    @Column(name = "SIGLA_PRODUTO")
    private String produtoSigla;
    @Column(name = "NOME_ARQUIVO")
    private String nomeArquivo;

    public NuvemVendasRegistroHeader() {
    }

    public NuvemVendasRegistroHeader(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public String getTipoLayout() {
        return tipoLayout;
    }

    public void setTipoLayout(String tipoLayout) {
        this.tipoLayout = tipoLayout;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getIdentificacaoCampanha() {
        return identificacaoCampanha;
    }

    public void setIdentificacaoCampanha(String identificacaoCampanha) {
        this.identificacaoCampanha = identificacaoCampanha;
    }

    public String getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(String dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public String getSequencialArquivo() {
        return sequencialArquivo;
    }

    public void setSequencialArquivo(String sequencialArquivo) {
        this.sequencialArquivo = sequencialArquivo;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    public BigInteger getIdLoteMailing() {
		return idLoteMailing;
	}

	public void setIdLoteMailing(BigInteger idLoteMailing) {
		this.idLoteMailing = idLoteMailing;
	}

	public String getProdutoSigla() {
		return produtoSigla;
	}

	public void setProdutoSigla(String produtoSigla) {
		this.produtoSigla = produtoSigla;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NuvemVendasRegistroHeader)) {
            return false;
        }
        NuvemVendasRegistroHeader other = (NuvemVendasRegistroHeader) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.callink.bradesco.seguro.entity.NuvemVendasRegistroHeader[ id=" + id + " ]";
    }
    
}
