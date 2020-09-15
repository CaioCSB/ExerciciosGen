package org.generation.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name= "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 2, max = 100)
	private String nome;
	
	@NotNull
	@Size(min = 3, max = 11)
	private String usuario;
	
	@NotNull
	@Size(min = 6, max = 20)
	private String senha;

	public String getSenha() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUsuario() {
		// TODO Auto-generated method stub
		return null;
}

	public void setSenha(String senhaEncoder) {
		// TODO Auto-generated method stub
		
	}

	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
