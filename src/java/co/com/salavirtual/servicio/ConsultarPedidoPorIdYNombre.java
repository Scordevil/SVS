/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio;

import co.com.salavirtual.modelo.dto.Pedido_TO;

/**
 *
 * @author Gustavo Cardenas
 */
public interface ConsultarPedidoPorIdYNombre {
    
     public Pedido_TO consultarPedidoPorIdYNombre(int idUsuario, String nombreHijo) throws Exception;
    
}
