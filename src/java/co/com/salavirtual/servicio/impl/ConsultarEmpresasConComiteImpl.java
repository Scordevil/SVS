/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Empresa_TO;
import co.com.salavirtual.persistencia.dao.EmpresaDAO;
import co.com.salavirtual.persistencia.dao.impl.EmpresaDAOImpl;
import co.com.salavirtual.servicio.ConsultarEmpresasConComite;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author CristianCamilo
 */
@Stateless
@Path("/consultarEmpresasConComite")
public class ConsultarEmpresasConComiteImpl implements ConsultarEmpresasConComite{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Empresa_TO> consultarEmpresasConComite() throws Exception {
        EmpresaDAO empresaDAO = new EmpresaDAOImpl();
        return empresaDAO.consultarEmpresasConComite();
    }
    
}
