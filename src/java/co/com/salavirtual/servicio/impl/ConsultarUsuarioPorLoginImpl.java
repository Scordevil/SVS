/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.persistencia.dao.UsuarioDAO;
import co.com.salavirtual.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.salavirtual.servicio.ConsultarUsuarioPorLogin;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author Desarrollo_Planit
 */
@Stateless
@Path("/consultarUsuarioPorLogin")
public class ConsultarUsuarioPorLoginImpl implements ConsultarUsuarioPorLogin {

    @GET
    @Produces({"application/json"})
    @Override
    public Usuario_TO consultarUsuarioPorLogin(@QueryParam("usuario") String usuario) throws Exception {
        Usuario_TO user = new Usuario_TO();
        user.setUsuario(usuario);
        UsuarioDAO usuarioDao = new UsuarioDAOImpl();
        return usuarioDao.consultarUsuarioPorLogin(user);
    }
}
