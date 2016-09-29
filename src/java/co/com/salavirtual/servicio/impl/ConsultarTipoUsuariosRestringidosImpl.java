/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Tipo_Usuario_TO;
import co.com.salavirtual.persistencia.dao.TipoUsuarioDAO;
import co.com.salavirtual.persistencia.dao.impl.TipoUsuarioDAOImpl;
import co.com.salavirtual.servicio.ConsultarTipoUsuarios;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author VaioDevelopment
 */

@Stateless
@Path("/consultarTipoUsuariosRestringidos")
public class ConsultarTipoUsuariosRestringidosImpl implements ConsultarTipoUsuarios{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Tipo_Usuario_TO> consultaTipoUsuarios() throws Exception {
        TipoUsuarioDAO tipoUsuarioDAO = new TipoUsuarioDAOImpl();
        List<Tipo_Usuario_TO> tipoUsuarios = new ArrayList<>();
        tipoUsuarios = tipoUsuarioDAO.consultarTipoUsuariosRestringidos();
        return tipoUsuarios;
    }
    
}
