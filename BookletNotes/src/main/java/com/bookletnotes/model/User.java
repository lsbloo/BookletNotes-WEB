package com.bookletnotes.model;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="usuarios")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(columnDefinition="text")
	@NotNull
	@Length(min=2,max=30,message="O nome não pode ser maior que 30 caracteres")
	private String nome;
	
	@Column(columnDefinition="text")
	@NotNull
	@Length(min=11, max=30, message="CPF não pode ser maior que 30 caracteres")
	private String cpf;
	
	@Column(columnDefinition="text")
	@NotNull
	@Length(min=1, max=40, message="Endereço não pode ser maior que 40 caracteres")
	private String endereco;
	@Column(columnDefinition="text")
	@NotNull
	@Length(min=2,max=20,message="Password não pode ser maior que 20 digitos")
	private String password;
	@Column(columnDefinition="text")
	@NotNull
	@Length(min=10,max=30,message="Email não pode ser maior que 30 digitos")
	private String email;
	@Column(columnDefinition="text")
	@NotNull
	@Length(min=5,max=20,message="Email não pode ser maior que 30 digitos")
	private String login;
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//@OneToOne
	//private List<Livros> livros;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	

}
