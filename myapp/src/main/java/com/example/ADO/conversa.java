package com.example.ADO;
import java.util.Scanner;
import java.util.List;

public class conversa {

    private EscolhaUsuario escolhaUsuario = new EscolhaUsuario();
    private TecShop Loja = new TecShop();
    private List<Produto> carrinho;

    public void iniciarConversa() { 
        Loja.Loja();
        carrinho = Loja.carrinho;
        
        Scanner scanner = new Scanner(System.in);
        boolean continuarComprando = true;

        while (continuarComprando) {
            System.out.println("Bem-vindo à TecShop! Como posso ajudá-lo hoje?");
            System.out.println("1. Peças de computador");
            System.out.println("2. Peças de notebook");
            System.out.println("3. Periféricos");
            System.out.println("4. Memórias");

            int escolhaDepartamento = escolhaUsuario.obterEscolhaUsuario(4);

            List<Produto> produtos = null;
            switch (escolhaDepartamento) {
                case 1:
                    produtos = Loja.getPecasComputador();
                    break;
                case 2:
                    produtos = Loja.getPecasNotebook();
                    break;
                case 3:
                    produtos = Loja.getPerifericos();
                    break;
                case 4:
                    produtos = Loja.getMemorias();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;
            }

            System.out.println("Produtos disponíveis:");
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println((i + 1) + ". " + produtos.get(i).getNome() + " - R$" + produtos.get(i).getPreco());
            }

            // Aguarda a escolha do produto após exibir os disponíveis
            System.out.println("Escolha o número do produto desejado:");
            int escolhaProduto = escolhaUsuario.obterEscolhaProduto(produtos.size());
            Produto produtoEscolhido = produtos.get(escolhaProduto - 1);

            carrinho.add(produtoEscolhido);

            // Pergunta se o usuário deseja continuar comprando
            System.out.println("Deseja comprar mais alguma coisa? (Sim/Não)");
            String continuar = scanner.next();
            continuarComprando = continuar.equalsIgnoreCase("Sim");
        }

        // Continuação para o pagamento 
        System.out.println("Seu carrinho de compras:");
        double total = 0;
        for (Produto produto : carrinho) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
            total += produto.getPreco();
        }
        System.out.println("Total: R$" + total);

        // Pergunta a forma de pagamento
        System.out.println("Como você gostaria de pagar? (PIX, Cartão de Crédito, Cartão de Débito, Boleto Bancário)");
        String formaPagamento = scanner.next();
        System.out.println("Pagamento realizado com " + formaPagamento + ".");

        // Mensagem final
        System.out.println("Obrigado por comprar com a TecShop, volte sempre!");
    }
}
