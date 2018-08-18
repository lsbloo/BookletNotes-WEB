package com.bookletnotes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="livros")
public class Livros {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	
	
	@NotNull
	@Length(min=4,max=15,message="Tamanho do Livro nao pode ser maior que 15 digitos")
	private String nomeLivro;
	
	@NotNull
	@Length(min=4,max=15,message="Codigo  do Livro nao pode ser maior que 15 digitos")
	private String codigoLivro;
	@NotNull
	@Length(min=4,max=15,message="Nome do Autor do Livro nao pode ser maior que 15 digitos")
	private String autorLivro;
	@NotNull
	@Length(min=4,max=15,message="Ano de Lançamento do Livro nao pode ser maior que 15 digitos")
	private String anoLançamento;
	@NotNull
	@Length(min=4,max=15,message="Editora do Livro nao pode ser maior que 15 digitos")
	private String editoraLivro;
	
	
	
	
	public String getCodigoLivro() {
		return codigoLivro;
	}
	public void setCodigoLivro(String codigoLivro) {
		this.codigoLivro = codigoLivro;
	}
	public String getAutorLivro() {
		return autorLivro;
	}
	public void setAutorLivro(String autorLivro) {
		this.autorLivro = autorLivro;
	}
	public String getAnoLançamento() {
		return anoLançamento;
	}
	public void setAnoLançamento(String anoLançamento) {
		this.anoLançamento = anoLançamento;
	}
	public String getEditoraLivro() {
		return editoraLivro;
	}
	public void setEditoraLivro(String editoraLivro) {
		this.editoraLivro = editoraLivro;
	}
	

}
