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
 * @author VaioDevelopment
 */
public interface ConsultarUsuariosEmpresaLike {
    
    public List<Usuario_TO> consultarUsuariosEmpresaLike(int idEmpresa , String nombre) throws Exception;
    
}
