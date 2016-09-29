/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Ciudad_TO;
import co.com.salavirtual.modelo.dto.Departamento_TO;
import co.com.salavirtual.modelo.dto.Empresa_TO;
import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.modelo.dto.Pedido_TO;
import co.com.salavirtual.modelo.dto.Tipo_Usuario_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.persistencia.dao.PedidoDAO;
import co.com.salavirtual.persistencia.dao.UsuarioDAO;
import co.com.salavirtual.persistencia.dao.impl.PedidoDAOImpl;
import co.com.salavirtual.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.salavirtual.servicio.EditarPedido;
import co.com.salavirtual.servicio.EditarUsuario;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author VaioDevelopment
 */
@Stateless
@Path("/editarPedido")
public class EditarPedidoImpl implements EditarPedido{

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int editarPedido(@QueryParam("idInventario") int idInventario, @QueryParam("idPedido") int idPedido) throws Exception {
    
        Pedido_TO pedido = new Pedido_TO(idPedido, idInventario);
        PedidoDAOImpl usuarioDAO = new PedidoDAOImpl();
        return usuarioDAO.editarPedido(pedido);
    }    
}
