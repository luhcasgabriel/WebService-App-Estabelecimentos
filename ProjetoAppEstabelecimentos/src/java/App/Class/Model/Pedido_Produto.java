
package App.Class.Model;

//Classe bean Pedido Produto

//Autores: 
//         Lucas Gabriel,
//         Nicollas Ramires
//         Braian Maidame
//         João Marcelo

public class Pedido_Produto {
    
    private int quantidade;
    private String observações;
    private Pedido pedido;
    private Produto produto;
    private Funcionario funcionario;

    public Pedido_Produto() {
    }

    public Pedido_Produto(int quantidade, String observações, Pedido pedido, Produto produto, Funcionario funcionario) {
        this.quantidade = quantidade;
        this.observações = observações;
        this.pedido = pedido;
        this.produto = produto;
        this.funcionario = funcionario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getObservações() {
        return observações;
    }

    public void setObservações(String observações) {
        this.observações = observações;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
    
    
}
