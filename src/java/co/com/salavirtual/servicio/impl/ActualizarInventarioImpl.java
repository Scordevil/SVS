/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.persistencia.dao.impl.JugueteDAOImpl;
import co.com.salavirtual.servicio.ActualizarInventario;
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
@Path("/ActualizarInventario")
public class ActualizarInventarioImpl implements ActualizarInventario {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int actualizarInventario(@QueryParam("idInventario") int idInventario,@QueryParam("cantidad") int cantidad) throws Exception {

        JugueteDAOImpl inventarioDAO = new JugueteDAOImpl();
        Inventario_TO inventario = new Inventario_TO(idInventario, cantidad);
        int resultado = 0;
        resultado = inventarioDAO.ActualizarInventario(inventario);
        return resultado;
    }

}

