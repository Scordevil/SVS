/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Pedido_TO;
import co.com.salavirtual.persistencia.dao.impl.PedidoDAOImpl;
import co.com.salavirtual.servicio.ConsultarPedido;
import co.com.salavirtual.servicio.ConsultarPedidoPorIdYNombre;
import co.com.salavirtual.servicio.ConsultarPedidosPorId;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author Desarrollo_Planit
 */
@Stateless
@Path("/consultarPedidoPorIdYNombre")
public class ConsultarPedidoPorIdYNombreImpl implements ConsultarPedidoPorIdYNombre {

    @GET
    @Produces({"application/json"})
    @Override
    public Pedido_TO consultarPedidoPorIdYNombre(@QueryParam("idUsuario") int idUsuario, @QueryParam("nombreHijo") String nombreHijo) throws Exception {
        PedidoDAOImpl pedidoDao = new PedidoDAOImpl();
        return pedidoDao.consultarPedidoPorIdYNombre(idUsuario, nombreHijo);
    }

}
