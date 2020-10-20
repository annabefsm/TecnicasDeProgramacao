package model;

import java.time.LocalDate;

public class Usuario {
		private String nome;
		private String sexo;
		private String endereco;
		private String telefone;
		private LocalDate dataNascimento;
		private String cpf;
		
		public Usuario(){};
		public Usuario(String nome,String sexo,String endereco,String telefone,LocalDate dataNascimento,String cpf) {
			this.nome = nome;
			this.sexo = sexo;
			this.endereco = endereco;
			this.telefone = telefone;
			this.dataNascimento = dataNascimento;
			this.cpf = cpf;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public LocalDate getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(LocalDate dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public void setCpf(String cpf){
			this.cpf = cpf;
		}
		public String getCpf() {
			return cpf;
		}
		
		public void printarUsuario() {
			// TODO Auto-generated method stub
			System.out.println("Nome: " + this.nome);
			System.out.println("Sexo: " + this.sexo);
			System.out.println("Endere�o : " + this.endereco);
			System.out.println("Telefone : " + this.telefone);
			System.out.println("Data de nascimento : " + this.dataNascimento);
			System.out.println("CPF : " + this.cpf);
			System.out.println(" \n");
		}
}
//update
public class principal {
	public static void main (String[]args) {
		Entregador entregador= new Entregador();
		entregador= setarDadosEntregador();
		entregador= printarEntregador();
		
	}
	public static Entregador setarDadosEntregador() {
		Entregador entregador= new Entregador();
		Scanner scan= new Scanner(System.in);
		System.out.println("Digite o nome do entregador:");
		entregador.setNome(scan.nextLine());
		System.out.println("Digite um endereço:");
		entregador.setEndereco(scan.next());
		System.out.println("Digite o telefone:");
		entregador.setTelefone(scan.next());
		System.out.println(" \n");
		return entregador;
	}
	public static Entregador printarEntregador() {
		// TODO Auto-generated method stub
		Entregador entregador= new Entregador();
		System.out.println("Os dados do entregador são:");
		System.out.println("Nome: " +entregador.getNome());
		System.out.println("Endereço:" +entregador.getEndereco());
		System.out.println("Telefone: " +entregador.getTelefone());
		System.out.println(" \n");
		return entregador;
	}
}

