/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.persistencia.dao.impl.VotacionDAOImpl;
import co.com.salavirtual.servicio.RegistrarVotacion;
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
@Path("/registrarVotaciones")
public class RegistrarVotacionImpl implements RegistrarVotacion {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int crearVotacion(@QueryParam("idUsuario") int idUsuario, @QueryParam("idInventario") int idinventario,
            @QueryParam("idComite") int idComite, @QueryParam("fechaCalificacion") String fechaCalificacion, @QueryParam("calificacion") String calificacion) throws Exception {

        VotacionDAOImpl votaciones = new VotacionDAOImpl();
        int resultado = 0;
        resultado = votaciones.crearVotacion(idUsuario, idinventario, idComite, fechaCalificacion, calificacion);
        return resultado;
    }

}
