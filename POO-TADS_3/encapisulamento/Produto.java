package encapisulamento;

/*  Elabore uma classe denominada Produto. A classe será utilizada para
representar objetos do tipo produto e deverá possuir as seguintes
características:
a) Os seguintes atributos privados: nome (string), quantidadeEstoque (int),
quantidadeMinima (int), custo (float) e lucro (float).*/

public class Produto{
    
    private String nome;
    private int quantidadeEstoque;
    private int quantidadeMinima;
    private float custo;
    private float lucro;

    public Produto( ){ }

//Um construtor para inicializar quantidadeMinima e lucro.

    public Produto(String nome, int quantidadeMinima, float lucro, float custo) {
        this.nome = nome;
        this.quantidadeMinima = quantidadeMinima;
        this.lucro = lucro;
        this.custo = custo;
    }


//Métodos de acesso ge para todos atributos.

    public Produto(String string, float f, float g) {
      
    }

    public String getNome() {
        return this.nome;
    }
    public int getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }
    public int getQuantidadeMinima() {
        return this.quantidadeMinima;
    }
    public float getLucro() {
        return this.lucro;
    }
    public float getCusto() {
        return this.custo;
    }




//metodos de acesso set para os atributos: nome, quantidadeMinima e lucro.

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

/*Um método público denominado verificarPrecoVenda, o qual retorna o 
resultado do cálculo de venda: (custo + custo * lucro / 100);*/

    public float verificarPrecoVenda( ){
        return (this.custo + this.custo )* this.lucro / 100;
    } 
    
  
/*Um método público denominado comprarProduto, o qual recebe como
argumento a quantidade comprada e o valor de custo. O método deverá
atualizar a quantidade em estoque e custo a cada compra. */

    
    public void comprarProduto( int qtdComprada, float custo){
        this.quantidadeEstoque += qtdComprada;
        this.custo = custo;
    }
/* Um método denominado venderProduto que recebe como argumento a
quantidade vendida. Note que se não tiver quantidade suficiente, o método
deverá retornar falso, caso contrário deve retornar verdadeiro e atualizar a
quantidade em estoque.  */
 
 public boolean venderProduto( int qtdVendida){
        if( qtdVendida <= this.quantidadeEstoque){
            this.quantidadeEstoque -= qtdVendida;
            return true;
        } 
         return false;

    }
/*Um método denominado verificarEstoque, o qual retorna a quantidade
que deverá ser comprada do produto, levando-se em consideração a
quantidadeMinima e a quantidadeEstoque.*/

  public int verificarEstoque(){
    if (this.quantidadeEstoque < this.quantidadeMinima) {
      return this.quantidadeMinima - this.quantidadeEstoque;
    }
    return 0;
  }
    
}
