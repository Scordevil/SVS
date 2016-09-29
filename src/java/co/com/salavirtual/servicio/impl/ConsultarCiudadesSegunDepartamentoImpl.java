/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Ciudad_TO;
import co.com.salavirtual.modelo.dto.Departamento_TO;
import co.com.salavirtual.persistencia.dao.CiudadDAO;
import co.com.salavirtual.persistencia.dao.impl.CiudadDAOImpl;
import co.com.salavirtual.servicio.ConsultarCiudadesSegunDepartamento;
import java.util.List;
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
@Path("/consultarCiudadesSegunDepartamento")
public class ConsultarCiudadesSegunDepartamentoImpl implements ConsultarCiudadesSegunDepartamento{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Ciudad_TO> consultarCiudadesSegunDepartamento(@QueryParam("idDepartamento") int idDepartamento) throws Exception {
        Departamento_TO departamento = new Departamento_TO(idDepartamento);
        CiudadDAO ciudadDAO = new CiudadDAOImpl();
        return ciudadDAO.consultarCiudadesSegunDepartamento(departamento);
    }
    
}
