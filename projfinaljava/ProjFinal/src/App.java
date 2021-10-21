import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner texto = new Scanner(System.in);
        String email, senha, modelo, cor, resposta;
        double tamanho;
        int codigo;

        System.out.println("Informe o email: ");
        email = texto.nextLine();

        System.out.println("Informe a senha: ");
        senha = texto.nextLine();

        System.out.println("Seja bem vindo\n" + email);
        System.out.println("Esses são os modelos disponiveis: \n" + "codigo 1=Air Force 1\n" + "codigo 2=Air Max Plus\n"
                + "codigo 3=Air Max 97\n" + "Para comprar um tenis digite o codigo: ");
        codigo = texto.nextInt();
        if (codigo >= 1) {
            System.out.println("O Air Force 1 foi adicionado ao carrinho de compras");
        } else if (codigo >= 2) {
            System.out.println("O Air Force Plus foi adicionado ao carrinho de compras");
        } else if (codigo >= 3) {
            System.out.println("O Air Max 97 foi adicionado ao carrinho de compras");
        }
        if (codigo >= 1) {
            System.out.println("Carrinho de compras: Air force 1\n" + "Deseja confirmar a compra?\n");
        }
        if (codigo >= 2) {
            System.out.println("Carrinho de compras: Air Max Plus\n" + "Deseja confirmar a compra?\n");
        } else if (codigo >= 3) {
            System.out.println("Carrinho de compras: Air Max 97\n" + "Deseja confirmar a compra?\n");
        }
        System.out.println("Para confirmar a compra digite s\n " + "Para cancelar a compra digite n:");
        resposta = texto.nextLine();
        if (resposta.equals("s")) {
            System.out.println("Parabéns " + email + " seu pedido foi realizado com sucesso!");
        }
        if (resposta.equals("n")) {
            System.out.println(email + " seu pedido foi cancelado!");
        }
    }
}