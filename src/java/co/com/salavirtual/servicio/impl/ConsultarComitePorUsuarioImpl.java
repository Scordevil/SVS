/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Comite_TO;
import co.com.salavirtual.persistencia.dao.ComiteDAO;
import co.com.salavirtual.persistencia.dao.impl.ComiteDAOImpl;
import co.com.salavirtual.servicio.ConsultarComitePorUsuario;
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
@Path("/consultarComitePorUsuario")
public class ConsultarComitePorUsuarioImpl implements ConsultarComitePorUsuario {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int consultarComitePorUsuario(@QueryParam("idUsuario") int idUsuario) throws Exception {
    
        ComiteDAO comiteDAO = new ComiteDAOImpl();
        return comiteDAO.consultarComitePorUsuario(idUsuario);
    }

}
