/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio;

import co.com.salavirtual.modelo.dto.Tipo_Usuario_TO;

/**
 *
 * @author VaioDevelopment
 */
public interface ConsultarTipoUsuario {
    
    public Tipo_Usuario_TO consultaTipoUsuario(int idTipoUsuario, String nombre) throws Exception;
    
}
