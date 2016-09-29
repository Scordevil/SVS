/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Pedido_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.persistencia.dao.impl.PedidoDAOImpl;
import co.com.salavirtual.servicio.RegistrarPedido;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Gustavo Cardenas
 */
@Stateless
@Path("/registrarPedido")
public class RegistrarPedidoImpl implements RegistrarPedido {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int registrarPedido(@QueryParam("idUsuario") int idUsuario,
            @QueryParam("nombre")String nombre, @QueryParam("edad")int edad, 
            @QueryParam("sexo")String sexo,@QueryParam("idInventario")int idInventario ) throws Exception {

        Pedido_TO ped = new Pedido_TO(new Usuario_TO(idUsuario), nombre, edad, sexo, idInventario);
        PedidoDAOImpl pedidoDao = new PedidoDAOImpl();
        return pedidoDao.registrarPedido(ped);
    }

}
