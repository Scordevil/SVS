/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio;

import co.com.salavirtual.modelo.dto.Usuario_TO;
import java.util.List;

/**
 *
 * @author CristianCamilo
 */
public interface ConsultarUsuariosPorTipoUsuario {
    
    public List<Usuario_TO> consultarUsuariosPorTipoUsuario(int idTipoUsuario) throws Exception;
}
