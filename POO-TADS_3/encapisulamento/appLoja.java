package encapisulamento;

public class appLoja{
    public static void main(String[] args) {

// criar um objeto do tipo Produto

        Produto p1 = new Produto("Coca-cola", 10, 5,2);

// mostrar A os dados do produto no terminal

        System.out.println("Produto: " + p1.getNome());
        System.out.println("Custo: " + p1.getCusto());
        System.out.println("Quantidade no Estoque: " + p1.getQuantidadeEstoque());
      

// comprar alguns produtos

        p1.comprarProduto(5,  3);
        

        System.out.println("Quantidade após compra: " + p1.getQuantidadeEstoque());

// vender alguns produtos;

        if (p1.venderProduto(3)) {

            System.out.println("Venda realizada com sucesso!");
            System.out.println("Quantidade após venda: " + p1.getQuantidadeEstoque());
            System.out.println("Preço de venda: " + p1.verificarPrecoVenda());
        } else {

            System.out.println("Não foi possível realizar a venda. Quantidade insuficiente.");
        }

//mostrar a quantidade em estoque

        System.out.println("Quantidade após venda: " + p1.getQuantidadeEstoque());


   
    }
}