/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Empresa_TO;
import co.com.salavirtual.persistencia.dao.impl.EmpresaDAOImpl;
import co.com.salavirtual.servicio.ConsultarEmpresas;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author cesar
 */
@Stateless
@Path("/consultarEmpresas")
public class ConsultarEmpresasImpl implements ConsultarEmpresas {

    @GET
    @Produces({"application/json"})
    @Override
    public List<Empresa_TO> consultarEmpresas() throws Exception {

        EmpresaDAOImpl empresaDAO = new EmpresaDAOImpl();
        List<Empresa_TO> empresas = new ArrayList<>();
        empresas = empresaDAO.consultarEmpresas();
        return empresas;
    }

}
