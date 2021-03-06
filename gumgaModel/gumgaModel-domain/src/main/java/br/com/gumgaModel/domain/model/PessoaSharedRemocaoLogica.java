package br.com.gumgaModel.domain.model;
import io.gumga.domain.GumgaModel; //TODO RETIRAR OS IMPORTS DESNECESSÁRIOS
import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.GumgaMultitenancy;
import java.io.Serializable;
import java.util.*;
import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.*;
import io.gumga.domain.domains.*;
import io.gumga.domain.logicaldelete.GumgaSharedLDModel;
import org.hibernate.envers.Audited;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Columns;

@GumgaMultitenancy
@Audited
@Entity(name = "PessoaSharedRemocaoLogica")
@Table(name = "PessoaSharedRemocaoLogica", indexes = {
    @Index(name = "PessoaSharedRemocaoLogica_gum_oi", columnList = "oi")
})
@SequenceGenerator(name = GumgaModel.SEQ_NAME, sequenceName = "SEQ_PessoaSharedRemocaoLogicaId")
public class PessoaSharedRemocaoLogica extends GumgaSharedLDModel<Long> {


    @Column(name = "nome")
	private String nome;
    @Column(name = "idade")
	private Integer idade;
    @Column(name = "altura")
	private Double altura;
    @Column(name = "peso")
	private Double peso;

    public PessoaSharedRemocaoLogica() {}

	public PessoaSharedRemocaoLogica(String nome, Integer idade, Double altura, Double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return this.idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return this.altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getPeso() {
		return this.peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
}
