/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.persistencia.dao.UsuarioDAO;
import co.com.salavirtual.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.salavirtual.servicio.EliminarUsuario;
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
@Path("/eliminarUsuario")
public class EliminarUsuarioImpl implements EliminarUsuario {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int eliminarUsuario(@QueryParam("idUsuario") int idUsuario) throws Exception {
        Usuario_TO usuario = new Usuario_TO(idUsuario);
        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
        return usuarioDAO.eliminarUsuario(usuario);
    }
}
