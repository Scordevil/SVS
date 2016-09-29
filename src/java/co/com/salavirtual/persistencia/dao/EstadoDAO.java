/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao;

import co.com.salavirtual.modelo.dto.Estado_TO;

/**
 *
 * @author CristianCamilo
 */
public interface EstadoDAO {
    
    public Estado_TO consultarEstado(Estado_TO estado) throws Exception;
    
}
