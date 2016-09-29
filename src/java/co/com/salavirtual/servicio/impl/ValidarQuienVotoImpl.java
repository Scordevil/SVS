/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.persistencia.dao.impl.VotacionDAOImpl;
import co.com.salavirtual.servicio.ValidarQuienVoto;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author kira
 */
@Stateless
@Path("/validarQuienVoto")
public class ValidarQuienVotoImpl implements ValidarQuienVoto{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Usuario_TO> validarQuienVoto(@QueryParam("idComite") int idComite) throws Exception {
        VotacionDAOImpl votacionDAO = new VotacionDAOImpl();
        return votacionDAO.validarQuienVoto(idComite);
    }
    
}
