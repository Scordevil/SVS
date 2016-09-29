/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.persistencia.dao.impl.VotacionDAOImpl;
import co.com.salavirtual.servicio.ValidarVotacionPorUsuario;
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
@Path("/validarVotacionPorUsuario")
public class ValidarVotacionPorUsuarioImpl implements ValidarVotacionPorUsuario {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int validarVotacionPorUsuario(@QueryParam("idUsuario") int idUsuario) throws Exception {

        VotacionDAOImpl votaciones = new VotacionDAOImpl();
        int resultado = 0;
        resultado = votaciones.validarVotacionPorUsuario(idUsuario);
        return resultado;
    }

}
