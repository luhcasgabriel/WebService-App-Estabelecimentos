
package App.Class.Controllers;

//Classe Controller Usuario

import App.Class.DAO.UsuarioDAO;
import App.Class.Model.Pedido;
import App.Class.Model.Usuario;

//Responsável pela lógica de negócio da aplicação

//Autores: 
//         Lucas Gabriel,
//         Nicollas Ramires
//         Braian Maidame
//         João Marcelo
public class UsuarioController {
    
    
    public int inserirUsuario(Usuario usuario){
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        int retorno = usuarioDao.inserirUsuario(usuario);
    
    
        return retorno;
    }
    
    
    
}
