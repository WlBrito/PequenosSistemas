package menus;

import controllers.controlemusicas.ControleDeEstoque;
import entity.Produto;
import java.util.Scanner;

public class MenuProduto {

    public static void menuProdutoCentral() {
        System.out.println("Informe a operação que deseja realizar: "
                + "\n1 - Adicionar novo produto " + "\n2- Remover Produto"
                + "\n3 - Atualizar Produto" + "\n4 - Listar todos produtos" + "\n5 - Sair" + "\nR:");
    }

    public void menuP() {
        int operador = 0;
        ControleDeEstoque controleDeEstoque = new ControleDeEstoque();
        Scanner leitorP = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);
        String codigoP;
        do {
            menuProdutoCentral();
            int resposta = leitorP.nextInt();

            switch (resposta) {
                case 1:
                    Produto p = new Produto();
                    p.fill();
                    controleDeEstoque.adicionarProduto(p);
                    break;
                case 2:
                    System.out.println("Informe o codigo do produto a ser removido: ");
                    codigoP = leitor2.next();
                    controleDeEstoque.removerProduto(codigoP);
                    break;
                case 3:
                    System.out.println("Informe o codigo do produto a ser att:");
                    codigoP = leitor2.next();
                    System.out.println("Informe a quantidade no estoque: ");
                    int qtdE = leitorP.nextInt();
                    controleDeEstoque.atualizarQuantidade(codigoP, qtdE);
                    break;
                case 4:
                    System.out.println("Produtos no estoque:");
                    controleDeEstoque.listarProdutos();
                    break;
                case 5:
                    operador = 1;
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.flush();
        } while (operador == 0);
    }
}
