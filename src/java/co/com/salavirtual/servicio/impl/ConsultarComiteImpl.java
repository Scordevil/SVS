/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Comite_TO;
import co.com.salavirtual.persistencia.dao.ComiteDAO;
import co.com.salavirtual.persistencia.dao.impl.ComiteDAOImpl;
import co.com.salavirtual.servicio.ConsultarComite;
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
@Path("/consultarComite")
public class ConsultarComiteImpl implements ConsultarComite{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Comite_TO consultarComite(@QueryParam("idComite") int idComite, @QueryParam("nombre") String nombre) throws Exception {
        Comite_TO comite = new Comite_TO(idComite);
        comite.setNombre(nombre);
        ComiteDAO comiteDAO = new ComiteDAOImpl();
        return comiteDAO.consultarComite(comite);
    }
    
}
