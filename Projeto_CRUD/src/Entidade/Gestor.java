package Entidade;

import java.util.Date;

public class Gestor {

	private String nome;
	private long matricula;
	private Date data_nascimento;
	private String setor;

	public Gestor() {

	}

//	Gestor(String nome, long matricula, Date data_nascimento, String setor){
////		this.nome = nome;
////		this.matricula = matricula;
////		this.data_nascimento = data_nascimento;
////		this.setor = setor;
//	}
//
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String apresentar() {
		return getNome();
	}
}
