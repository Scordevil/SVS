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
import co.com.salavirtual.servicio.ConsultarComitesPorUsuario;
import java.util.ArrayList;
import java.util.List;
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
@Path("/consultarComitesPorUsuario")
public class ConsultarComitesPorUsuarioImpl implements ConsultarComitesPorUsuario {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Comite_TO> consultarComitesPorUsuario(@QueryParam("idUsuario") int idUsuario) throws Exception {
    
        List<Comite_TO> comites = new ArrayList<>();
        ComiteDAOImpl comiteDAO = new ComiteDAOImpl();
        return comiteDAO.consultarComitesPorUsuario(idUsuario);
    }

}
