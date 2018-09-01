
package App.Class.Controllers;

//Classe Controller Pedido

import App.Class.DAO.PedidoDAO;
import App.Class.Model.Pedido;
import App.Class.Model.Pedido_Produto;
import App.Class.Model.Usuario;

//Responsável pela lógica de negócio da aplicação

//Autores: 
//         Lucas Gabriel,
//         Nicollas Ramires
//         Braian Maidame
//         João Marcelo

public class PedidoController {
    
    
    public boolean inserirPedido(Pedido_Produto dadosPedido, Usuario usuario){
        
        boolean retorno = new PedidoDAO().inserirPedido(dadosPedido,usuario);
        return retorno;
    }
    
    
    public boolean inserirPedidoNovoTabelaPedido_Produto(Pedido_Produto dadosPedido){
        
        boolean retorno = new PedidoDAO().InserirUmNovoPedidoTabelaPedido_Produto(dadosPedido);
        return retorno;
    }
    
    
}
