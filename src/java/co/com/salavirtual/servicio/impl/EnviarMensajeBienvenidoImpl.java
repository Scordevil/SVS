/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.persistencia.dao.impl.CorreoDAOImpl;
import co.com.salavirtual.servicio.EnviarMensajeBienvenido;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author SISTEMAS
 */
@Stateless
@Path("/enviarMensajeBienvenido")
public class EnviarMensajeBienvenidoImpl implements EnviarMensajeBienvenido {

    @Override
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int enviarMensajeBienvenido() throws Exception {

        CorreoDAOImpl correoDAO = new CorreoDAOImpl();
        
        return correoDAO.enviarMensajeBienvenido();

       }

}
