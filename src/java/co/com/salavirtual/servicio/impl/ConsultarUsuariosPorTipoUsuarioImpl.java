/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Tipo_Usuario_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.persistencia.dao.UsuarioDAO;
import co.com.salavirtual.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.salavirtual.servicio.ConsultarUsuariosPorTipoUsuario;
import java.util.List;
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
@Path("/consultarUsuariosSegunTipoUsuario")
public class ConsultarUsuariosPorTipoUsuarioImpl implements ConsultarUsuariosPorTipoUsuario{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Usuario_TO> consultarUsuariosPorTipoUsuario(@QueryParam("idTipoUsuario") int idTipoUsuario) throws Exception {
        Tipo_Usuario_TO tipo = new Tipo_Usuario_TO(idTipoUsuario);
        UsuarioDAO usuarioDAO = new UsuarioDAOImpl();
        return usuarioDAO.consultarUsuariosPorTipoUsuario(tipo);
    }    
}
