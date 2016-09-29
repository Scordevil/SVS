/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Tipo_Usuario_TO;
import co.com.salavirtual.persistencia.dao.TipoUsuarioDAO;
import co.com.salavirtual.persistencia.dao.impl.TipoUsuarioDAOImpl;
import co.com.salavirtual.servicio.ConsultarTipoUsuario;
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
@Path("/consultarTipoUsuario")
public class ConsultarTipoUsuarioImpl implements ConsultarTipoUsuario{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Tipo_Usuario_TO consultaTipoUsuario(@QueryParam("idTipoUsuario") int idTipoUsuario, @QueryParam("nombre") String nombre) throws Exception {
        TipoUsuarioDAO tipoUsuarioDAO = new TipoUsuarioDAOImpl();
        Tipo_Usuario_TO tipo = new Tipo_Usuario_TO(idTipoUsuario);
        tipo.setNombre(nombre);
        
        return tipoUsuarioDAO.consultarTipoUsuario(tipo);
    }
    
}
