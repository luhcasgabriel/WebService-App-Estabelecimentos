package App.Class.DAO;

//Classe DAO Pedido por Usuario
import App.Class.Controllers.UsuarioController;
import App.Class.Model.Estabelecimentos;
import App.Class.Model.Funcionario;
import App.Class.Model.Pedido_Produto;
import App.Class.Model.Produto;
import App.Class.Model.Usuario;
import App.DataBase.Database;
import java.sql.ResultSet;

//Responsável pela conexão com o banco de dados
//Autores: 
//         Lucas Gabriel,
//         Nicollas Ramires
//         Braian Maidame
//         João Marcelo
public class PedidoDAO {

    public boolean inserirPedido(Pedido_Produto dadosPedido, Usuario usuario) {
        boolean retorno = false;
        Produto produto = new Produto();
        Pedido_Produto pedidoProduto = new Pedido_Produto();
        Estabelecimentos estabelecimentos = new Estabelecimentos();
        Funcionario funcionario = new Funcionario();

        int id_pedido = 0;
        //chamando metodo inserir usuario 
        int id_usuario = new UsuarioController().inserirUsuario(usuario);
        int id_estabelecimento = 3;
        try {
            //inserir tabela pedido
            Database base = new Database();
            String sql_pedido = "INSERT INTO pedido(data_pedido,id_usuario,id_estabelecimento) VALUES(NOW(),?,?)";

            base.setQuerySql(sql_pedido);
            base.setQueryParameter().setInt(1, id_usuario);
            base.setQueryParameter().setInt(2, id_estabelecimento);

            base.preStatement.executeUpdate();
            ResultSet resultado = base.preStatement.getGeneratedKeys();

            if (resultado.first()) {
                id_pedido = resultado.getInt(1);
                System.out.println("id pedido" + id_pedido);
                retorno = true;
            }

        } catch (Exception e) {
            System.out.println("ERRO EM PEDIDO DAO INSERIR PEDIDO " + e);
        }

        return retorno;

    }

    public boolean InserirUmNovoPedidoTabelaPedido_Produto(Pedido_Produto dadosPedido) {
        boolean retorno = false;
        Produto produto = new Produto();
        Funcionario funcionario = new Funcionario();
        
        try {
            
        Database base = new Database();
            String sql_pedidoProduto = "INSERT INTO pedido_produto(quantidade,observacoes,id_pedido,id_produto,id_funcionario,id_status) VALUES(?,?,?,?,?,3)";
            
            
            produto.setId_produto(1);
            funcionario.setId_funcionario(1);
            dadosPedido.setQuantidade(72);
            dadosPedido.setObservações("sem cebola");
            dadosPedido.setFuncionario(funcionario);
            dadosPedido.setProduto(produto);
            
            base.setQuerySql(sql_pedidoProduto);
            base.setQueryParameter().setInt(1, dadosPedido.getQuantidade());
            base.setQueryParameter().setString(2, dadosPedido.getObservações());
            base.setQueryParameter().setInt(3, 11);
            base.setQueryParameter().setInt(4, dadosPedido.getProduto().getId_produto());
            base.setQueryParameter().setInt(5, dadosPedido.getFuncionario().getId_funcionario());
            
            
                    

            base.preStatement.executeUpdate();
            ResultSet resultado2 = base.preStatement.getGeneratedKeys();

            if (resultado2.first()) {
                
                retorno = true;
            }

        } catch (Exception e) {
            System.out.println("ERRO NA DAO PEDIDO METODO PEDIDO_PRODUTONOVO");
        }
        
        return retorno;
    }
}
