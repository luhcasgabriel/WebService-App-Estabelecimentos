package App.Class.DAO;

//Classe DAO Usuario
import App.Class.Model.Pedido;
import App.Class.Model.Usuario;
import App.Class.Model.Produto;
import App.DataBase.Database;
import java.sql.ResultSet;
import javafx.scene.control.Alert;

//Responsável pela conexão com o banco de dados
//Autores: 
//         Lucas Gabriel,
//         Nicollas Ramires
//         Braian Maidame
//         João Marcelo
public class UsuarioDAO {

    public Pedido teste(Usuario dados) {

        Usuario usuario = new Usuario();
        Pedido pedido = new Pedido();
        Produto produto = new Produto();
        int id_usuario = 0;
        try {

            Database base = new Database();

            String sql = "INSERT INTO usuario(nome,login,senha) VALUES(?,?,MD5(?))";

            dados.setNome("hary");
            dados.setEmail("lucas");
            dados.setSenha("123");

            base.setQuerySql(sql);
            base.setQueryParameter().setString(1, dados.getNome());
            base.setQueryParameter().setString(2, dados.getEmail());
            base.setQueryParameter().setString(3, dados.getSenha());
            System.out.println("cheguei aqui antes do primeiro result" + dados.getNome());
            base.preStatement.executeUpdate();
            ResultSet resultado = base.preStatement.getGeneratedKeys();
            boolean verifica = false;
            if (resultado.first()) {
                id_usuario = resultado.getInt(1);
                System.out.println("cheguei aqui dentro do primeiro result" + dados.getNome());
                verifica = true;

            }

            if (verifica==true) {
                            System.out.println("cheguei aqui dentro do verifica true" + dados.getNome());

                Database base2 = new Database();
                String sql2 = "SELECT * FROM usuario AS u "
                        + "WHERE u.id_usuario = ?";
                            System.out.println("cheguei aqui depois do primeiro select" + dados.getNome());

                base2.setQuerySql(sql2);
                base2.setQueryParameter().setInt(1, id_usuario);
                ResultSet resultado2 = base2.setQueryParameter().executeQuery();
                            System.out.println("cheguei aqui depois do result do primeri select = id user " + id_usuario);
                
                if (resultado2.first()) {
                    
                    usuario.setNome(resultado2.getString("u.nome"));
                    usuario.setEmail(resultado2.getString("u.login"));
                    usuario.setId_usuario(resultado2.getInt("u.id_usuario"));
                    pedido.setUsuario(usuario);


            System.out.println("cheguei aqui depois do segundo result pegando pedido" + pedido.getUsuario().getNome());
                }
            }

            if (pedido.getUsuario().getId_usuario() != 0) {
                System.out.println("cheguei aqui antes do select fudido  egando pedido" + pedido.getUsuario().getNome());

                Database base3 = new Database();
                String sql3 = "SELECT * FROM usuario AS u "
                        + "INNER JOIN pedido AS p ON p.id_usuario = u.id_usuario "
                        + "INNER JOIN pedido_produto AS pp ON pp.id_pedido = p.id_pedido "
                        + "INNER JOIN produto as pr ON pr.id_produto = pp.id_produto "
                        + "INNER JOIN tipo_produto AS tp ON tp.id_tipo = pr.id_tipo "
                        + "INNER JOIN status AS s ON s.id_status = pp.id_status "
                        + "WHERE u.id_usuario = ?";
                System.out.println("cheguei aqui depois do select fudido  egando pedido" + pedido.getUsuario().getNome());

                base3.setQuerySql(sql3);
                base3.setQueryParameter().setInt(1, id_usuario);
                ResultSet resultado3 = base.setQueryParameter().executeQuery();
                if (resultado3.first()) {

                    usuario.setNome(resultado3.getString("u.nome"));
                    usuario.setEmail(resultado3.getString("u.email"));
                    usuario.setId_usuario(resultado3.getInt("u.id_usuario"));
                    pedido.setId_pedido(resultado3.getInt("p.id_usuario"));
                    pedido.setUsuario(usuario);
             System.out.println("cheguei aqui depois do select fudido e do result set  pegando pedido" + pedido.getUsuario().getNome());


                }

            }
        } catch (Exception e) {
            System.out.println("ERRO EM USUARIO DAO INSERIR " + e);

        }

        return pedido;
    }
    
    public int inserirUsuario(Usuario dados) {

        Usuario usuario = new Usuario();
        Pedido pedido = new Pedido();
        Produto produto = new Produto();
        int id_usuario = 0;
        try {
            System.out.println("cheguei aqui");
            Database base = new Database();

            String sql = "INSERT INTO usuario(nome,login,senha,telefone) VALUES(?,?,MD5(?),?)";

            dados.setNome("boris");
            dados.setEmail("lucas");
            dados.setSenha("123");
            dados.setTelefone("985335336");
            
            System.out.println("passei aqui");
            base.setQuerySql(sql);
            base.setQueryParameter().setString(1, dados.getNome());
            base.setQueryParameter().setString(2, dados.getEmail());
            base.setQueryParameter().setString(3, dados.getSenha());
            base.setQueryParameter().setString(4, dados.getTelefone());
            
            base.preStatement.executeUpdate();
            ResultSet resultado = base.preStatement.getGeneratedKeys();
            
            boolean verifica = false;
            if (resultado.first()) {
                id_usuario = resultado.getInt(1);
                verifica = true;

            }
            base.close();
        } catch (Exception e) {
            System.out.println("ERRO EM USUARIO DAO INSERIR " + e);
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setHeaderText("seu cu");
        }

        return id_usuario;
    }

    
}
