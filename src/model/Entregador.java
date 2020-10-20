package model;

import java.time.LocalDate;

public class Entregador extends Usuario{
	private int identificacao;

	public Entregador(
		String _nome,
		String _sexo,
		String _endereco,
		String _telefone,
		LocalDate _dataNascimento,
		String _cpf, 
		int identificacao
	){
		super( _nome, _sexo, _endereco, _telefone, _dataNascimento, _cpf);
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
