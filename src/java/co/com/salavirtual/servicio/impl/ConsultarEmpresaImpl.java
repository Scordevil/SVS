/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Empresa_TO;
import co.com.salavirtual.persistencia.dao.EmpresaDAO;
import co.com.salavirtual.persistencia.dao.impl.EmpresaDAOImpl;
import co.com.salavirtual.servicio.ConsultarEmpresa;
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
@Path("/consultarEmpresa")
public class ConsultarEmpresaImpl implements ConsultarEmpresa{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public Empresa_TO consultarEmpresa(@QueryParam("idEmpresa") int idEmpresa, @QueryParam("nombre") String nombre) throws Exception {
        EmpresaDAO empresaDAO = new EmpresaDAOImpl();
        return  empresaDAO.consultarEmpresa(idEmpresa, nombre);
    }
    
}
