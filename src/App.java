import java.util.Scanner;
import model.Usuario;
import model.Produto;
import model.Fornecedor;
import model.Entregador;

public class App {
    
    public static void main(String[] args) throws Exception {
        Usuario user = new Usuario();
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome do usuario");
        user.setNome(scan.nextLine());
        user.printaUsuario();
    }
}
//import java.util.Scanner;

import model.Entregador;

public class principal {
	public void main (String[]args) {
		Entregador entregador= new Entregador();
		entregador= setarDadosEntregador();
		
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
	public void printarPessoa(Entregador entregador) {
		// TODO Auto-generated method stub
		System.out.println("Os dados do entregador são:");
		System.out.println("Nome: " +entregador.getNome());
		System.out.println("Endereço" +entregador.getEndereco());
		System.out.println("Telefone: " +entregador.getTelefone());
		System.out.println(" \n");
	}
}
