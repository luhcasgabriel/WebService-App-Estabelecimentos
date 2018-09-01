/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.Class.WebService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

//Classe WebService Usuario
//Responsável pelo envio e recebimento de dados entre aplicações

//Autores: 
//         Lucas Gabriel,
//         Nicollas Ramires
//         Braian Maidame
//         João Marcelo

@WebService(serviceName = "UsuarioWS")
public class UsuarioWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
