/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Departamento_TO;
import co.com.salavirtual.persistencia.dao.DepartamentoDAO;
import co.com.salavirtual.persistencia.dao.impl.DepartamentoDAOImpl;
import co.com.salavirtual.servicio.ConsultarDepartamentos;
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
@Path("/consultarDepartamentos")
public class ConsultarDepartamentosImpl implements ConsultarDepartamentos{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Departamento_TO> consultarDepartamentos() throws Exception {
        DepartamentoDAO departamentoDao = new DepartamentoDAOImpl();
        return departamentoDao.consultarDepartamentos();
    }
    
}
