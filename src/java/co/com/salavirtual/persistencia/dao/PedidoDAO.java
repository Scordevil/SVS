/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao;

import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.modelo.dto.Pedido_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import java.util.List;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad
 * Usuario
 *
 * @author Gustavo Cardenas
 */
public interface PedidoDAO {

    public List<Pedido_TO> consultarPedidosPorId(int idUsuario) throws Exception;

    public Pedido_TO consultarPedido(int idPedido) throws Exception;

    public int registrarPedido(Pedido_TO pedido) throws Exception;
    
     public int editarPedido(Pedido_TO pedido) throws Exception;
    
    public List<Inventario_TO> consultarMasSeleccionados(int idEmpresa) throws Exception;

}
