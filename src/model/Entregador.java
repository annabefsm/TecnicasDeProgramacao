package model;

import java.time.LocalDate;

public class Entregador extends Usuario{
	private int identificacao;

	public Entregador(
		String nome,
		String sexo,
		String endereco,
		String telefone,
		LocalDate dataNascimento,
		String cpf, 
		int identificacao
	){
		super(nome,sexo,endereco,telefone, dataNascimento, cpf);
		this.cpf = cpf;
		this.identificacao = identificacao;	
	}

	public int getIdentificacao() {
		return cadastro;
	}

	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	
	@Override
	public void printaEntregador() {
		super.printarPessoa();
		System.out.println("Identificacao: " + this.identificacao);
	}


}
