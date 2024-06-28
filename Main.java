import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        boolean continuar;

        do {
            Produto produto = new Produto();

            System.out.println("insira o codigo do produto");
            String codigo = leia.nextLine();
            produto.setCodigo(codigo);

            System.out.println("Insira a descricao do produto");
            String descriçãao = leia.nextLine();
            produto.setDescricao(descriçãao);

            System.out.println("Insira o preco de compra");
            double precoCompra = leia.nextDouble();
            produto.setPrecoDeCompra(precoCompra);

            System.out.println("Insira o preco de venda");
            double precoVenda = leia.nextDouble();
            produto.setPrecoDeVenda(precoVenda);

            System.out.println("Insira o status do produto");
            String status = leia.nextLine();
            produto.setStatusDoProduto(status);

            listaDeProdutos.add(produto);

            System.out.println();
            System.out.println("voce deseja continuar? Digite 1 para sair");
            String resposta = leia.nextLine();

            if (resposta.equals("sim")) {
                continuar = true;
            }else{
                continuar = false;
            }

        } while (continuar);

        for(int posicao = 0; posicao < listaDeProdutos.size(); posicao++) {
            System.out.println(listaDeProdutos.get(posicao));

        }
    }

}
