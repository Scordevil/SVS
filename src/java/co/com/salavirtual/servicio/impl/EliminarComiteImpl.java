/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.persistencia.dao.impl.ComiteDAOImpl;
import co.com.salavirtual.servicio.EliminarComite;
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
@Path("/eliminarComite")
public class EliminarComiteImpl implements EliminarComite {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int eliminarComite(@QueryParam("idComite") int idComite) throws Exception {

        ComiteDAOImpl comiteDAO = new ComiteDAOImpl();
        int resultado = 0;
        resultado = comiteDAO.eliminarComite(idComite);
        return resultado;
    }

}
