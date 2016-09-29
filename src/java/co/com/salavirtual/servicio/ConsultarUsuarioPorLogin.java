/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio;

import co.com.salavirtual.modelo.dto.Usuario_TO;


/**
 *
 * @author Desarrollo_Planit
 */
public interface ConsultarUsuarioPorLogin {
    
    public Usuario_TO consultarUsuarioPorLogin(String usuario) throws Exception;
}
