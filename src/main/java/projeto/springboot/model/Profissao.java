package projeto.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profissao {
	
	@Id
	private Long id;
	
	private String nomeProfissao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProfissao() {
		return nomeProfissao;
	}

	public void setNomeProfissao(String nomeProfissao) {
		this.nomeProfissao = nomeProfissao;
	}
	
	
}
