package TrabalhoFinal;

import java.util.List;
import java.util.Scanner;

public class Principal {
    private static Arquivo arquivo = new Arquivo("produtos");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner pra n dar ruim

            switch (opcao) {
                case 1:
                    cadastrarProduto(scanner);
                    break;
                case 2:
                    alterarPrecoProduto(scanner);
                    break;
                case 3:
                    excluirProduto(scanner);
                    break;
                case 4:
                	mostrarProdutos();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("---- Menu ----");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Alterar preço de produto");
        System.out.println("3 - Excluir produto");
        System.out.println("4 - Listar Produtos");
        System.out.println("5 - Sair do sistema");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarProduto(Scanner scanner) {
        System.out.println("Cadastro de Produto");

        System.out.print("Código: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();

        System.out.print("Preço de Custo: ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Preço de Venda: ");
        double precoVenda = scanner.nextDouble();

        System.out.print("Estoque Disponível: ");
        int estoque = scanner.nextInt();

        Produto novoProduto = new Produto(codigo, descricao, precoCusto, precoVenda, estoque);
        arquivo.gravarArquivo(novoProduto);
    }

    private static void alterarPrecoProduto(Scanner scanner) {
    
        List<Produto> produtos = arquivo.lerArquivo();
        listarProdutos(produtos);

        System.out.print("Digite o código do produto que deseja alterar: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Produto produtoSelecionado = null; // inicia em null pois nenhum foi selecionado
        for (Produto p : produtos) { //percorre 
            if (p.getCodigo() == codigo) { //se o codigo selecionado for encontrado no for
                produtoSelecionado = p; //poe o valor do for em produtoSelecionado
                break;
            }
        }

        if (produtoSelecionado != null) {
            System.out.print("Novo Preço de Venda: ");
            double novoPrecoVenda = scanner.nextDouble();

            produtoSelecionado = new Produto(produtoSelecionado.getCodigo(), produtoSelecionado.getDescricao(),
                    produtoSelecionado.getPrecoCusto(), novoPrecoVenda, produtoSelecionado.getEstoque()); //produtoSelecionado vai receber as informacoes 

            // Atualizar arquivo com o produto alterado
            arquivo.atualizarArquivo(produtos);
            System.out.println("Preço de venda do produto atualizado com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void excluirProduto(Scanner scanner) {
        System.out.println("Exclusão de Produto");

        List<Produto> produtos = arquivo.lerArquivo();
        listarProdutos(produtos);

        System.out.print("Digite o código do produto que deseja excluir: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        boolean produtoEncontrado = false; // inicia em false pois nenhum foi selecionado
        for (Produto p : produtos) { //percorre 
            if (p.getCodigo() == codigo) { //se o codigo selecionado for encontrado no for
                produtos.remove(p);
                produtoEncontrado = true;
                arquivo.atualizarArquivo(produtos);
                System.out.println("Produto excluído com sucesso.");
                break;
            }
        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void listarProdutos(List<Produto> produtos) { //metodo geral usado nos outros, somente para listar os produtos
        System.out.println("---- Produtos ----");
        for (Produto p : produtos) {
            System.out.println("Código: " + p.getCodigo() +
                               ", Descrição: " + p.getDescricao() +
                               ", Preço de Venda: " + p.getPrecoVenda() +
                               ", Estoque: " + p.getEstoque());
        }
    }
    
    private static void mostrarProdutos() {
        List<Produto> produtos = arquivo.lerArquivo(); // leio o arquivo 
        if (produtos.isEmpty()) { // se n tiver produtos
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("---- Produtos Cadastrados ----");
            for (Produto p : produtos) {
                System.out.println("Código: " + p.getCodigo() +
                                   ", Descrição: " + p.getDescricao() +
                                   ", Preço de Venda: " + p.getPrecoVenda() +
                                   ", Estoque: " + p.getEstoque());
            }
        }
    }
}
