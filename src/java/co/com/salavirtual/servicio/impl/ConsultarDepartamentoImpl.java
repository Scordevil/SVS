/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Departamento_TO;
import co.com.salavirtual.persistencia.dao.DepartamentoDAO;
import co.com.salavirtual.persistencia.dao.impl.DepartamentoDAOImpl;
import co.com.salavirtual.servicio.ConsultarDepartamento;
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
@Path("/consultarDepartamento")
public class ConsultarDepartamentoImpl implements ConsultarDepartamento{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Departamento_TO consultarDepartamento(@QueryParam("idDepartamento") int idDepartamento,@QueryParam("nombre") String nombre) throws Exception {
        Departamento_TO departamento = new Departamento_TO(idDepartamento);
        departamento.setNombre(nombre);
        DepartamentoDAO departamentoDAO = new DepartamentoDAOImpl();
        return departamentoDAO.consultarDepartamento(departamento);
    }
    
}
