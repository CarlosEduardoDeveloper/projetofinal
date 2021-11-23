package br.com.jogodasorte.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lance {
	
	@Id
	@GeneratedValue
	private Integer id;
	private Integer numAleatorio;
	private Integer v1;
	private Integer v2;
	private Integer v3;
	private boolean acertei;
	@Column
	private String descricao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumAleatorio() {
		return numAleatorio;
	}
	public void setNumAleatorio(Integer numAleatorio) {
		this.numAleatorio = numAleatorio;
	}
	public Integer getV1() {
		return v1;
	}
	public void setV1(Integer v1) {
		this.v1 = v1;
	}
	public Integer getV2() {
		return v2;
	}
	public void setV2(Integer v2) {
		this.v2 = v2;
	}
	public Integer getV3() {
		return v3;
	}
	public void setV3(Integer v3) {
		this.v3 = v3;
	}
	public boolean getAcertei() {
		return acertei;
	}
	public void setAcertei(boolean acertei) {
		this.acertei = acertei;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}