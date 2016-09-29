/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Comite_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.persistencia.dao.UsuarioDAO;
import co.com.salavirtual.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.salavirtual.servicio.RegistrarUsuariosComite;
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
@Path("/registrarUsuariosComite")
public class RegistrarUsuariosComiteImpl implements RegistrarUsuariosComite {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int registrarUsuariosComite(@QueryParam("idUsuario") int idUsuario, @QueryParam("idComite") int idComite) throws Exception {
        Usuario_TO usuario = new Usuario_TO(idUsuario);
        Comite_TO comite = new Comite_TO(idComite);
        UsuarioDAO usuarioDao = new UsuarioDAOImpl();
        return usuarioDao.RegistrarUsuariosComite(usuario, comite);
    }

}
