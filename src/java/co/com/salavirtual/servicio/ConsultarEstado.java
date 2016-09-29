/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio;

import co.com.salavirtual.modelo.dto.Estado_TO;

/**
 *
 * @author CristianCamilo
 */
public interface ConsultarEstado {
 
    public Estado_TO consultarEstado(int idEstado, String nombre) throws Exception;
    
}
