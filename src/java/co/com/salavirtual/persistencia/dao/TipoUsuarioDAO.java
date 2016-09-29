/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao;

import co.com.salavirtual.modelo.dto.Tipo_Usuario_TO;
import java.util.List;

/**
 *
 * @author VaioDevelopment
 */
public interface TipoUsuarioDAO {
    
    public Tipo_Usuario_TO consultarTipoUsuario(Tipo_Usuario_TO tipo) throws Exception;
    
    public List<Tipo_Usuario_TO> consultarTipoUsuarios() throws Exception;
    
    public List<Tipo_Usuario_TO> consultarTipoUsuariosRestringidos() throws Exception;
    
}
