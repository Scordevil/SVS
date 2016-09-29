/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;


import co.com.salavirtual.persistencia.dao.UsuarioDAO;
import co.com.salavirtual.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.salavirtual.servicio.EditarUsuario;
import co.com.salavirtual.servicio.QuitarAcceso;
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
@Path("/quitarAcceso")
public class QuitarAccesoImpl implements QuitarAcceso {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int quitarAcceso(@QueryParam("idUsuario") int idUsuario) throws Exception {

        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
        return usuarioDAO.quitarAcceso(idUsuario);
    }
}
