package br.org.generation.sistemaalunos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //indica que a classe aluno é uma entidade armazenável em banco 
@Table(name="tbl_aluno") //associo explicitamente o nome da tabela que armazena
public class Aluno {
	
	@Column(name = "ra") // defino que o atributo agora é uma coluno da tabela
	@Id // esse atributo é chave-primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // indica que RA é auto_gerado pelo banco de dados
	private int ra;
	@Column(name="email",length = 100, unique = true)//indicamos o email e o tamanho da coluna e o unique faz com que só aceito emails únicos
	private String email;
	@Column(name="nome",length = 100)
	private String nome;
	@Column(name="telefone",length = 20)
	private String telefone;
	
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
