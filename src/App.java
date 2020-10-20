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
