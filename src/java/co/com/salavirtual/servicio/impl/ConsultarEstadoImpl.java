/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Estado_TO;
import co.com.salavirtual.persistencia.dao.EstadoDAO;
import co.com.salavirtual.persistencia.dao.impl.EstadoDAOImpl;
import co.com.salavirtual.servicio.ConsultarEstado;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author CristianCamilo
 */
@Stateless
@Path("/consultarEstado")
public class ConsultarEstadoImpl implements ConsultarEstado{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Estado_TO consultarEstado(@QueryParam("idEstado") int idEstado, @QueryParam("nombre") String nombre) throws Exception {
        Estado_TO estado = new Estado_TO(idEstado);
        estado.setNombre(nombre);
        EstadoDAO estadoDAO = new EstadoDAOImpl();
        return estadoDAO.consultarEstado(estado);
    }
    
}
