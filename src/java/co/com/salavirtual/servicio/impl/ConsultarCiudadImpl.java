/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Ciudad_TO;
import co.com.salavirtual.persistencia.dao.CiudadDAO;
import co.com.salavirtual.persistencia.dao.impl.CiudadDAOImpl;
import co.com.salavirtual.servicio.ConsultarCiudad;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author VaioDevelopment
 */
@Stateless
@Path("/consultarCiudad")
public class ConsultarCiudadImpl implements ConsultarCiudad {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Ciudad_TO consultarCiudad(@QueryParam("idCiudad") int idCiudad, @QueryParam("nombre") String nombre) throws Exception {
        Ciudad_TO ciudad = new Ciudad_TO(idCiudad);
        ciudad.setNombre(nombre);
        CiudadDAO ciudadDAO = new CiudadDAOImpl();
        return ciudadDAO.consultarCiudad(ciudad);
    }
}
