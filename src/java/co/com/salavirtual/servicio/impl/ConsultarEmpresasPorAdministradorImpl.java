/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Empresa_TO;
import co.com.salavirtual.persistencia.dao.impl.EmpresaDAOImpl;
import co.com.salavirtual.servicio.ConsultarEmpresas;
import co.com.salavirtual.servicio.ConsultarEmpresasPorAdministrador;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author cesar
 */
@Stateless
@Path("/consultarEmpresasPorAdministrador")
public class ConsultarEmpresasPorAdministradorImpl implements ConsultarEmpresasPorAdministrador {

    @GET
    @Produces({"application/json"})
    @Override
    public List<Empresa_TO> consultarEmpresasPorAdministrador(@QueryParam("idUsuario") int idUsuario) throws Exception {

        EmpresaDAOImpl empresaDAO = new EmpresaDAOImpl();
        List<Empresa_TO> empresas = new ArrayList<>();
        empresas = empresaDAO.consultarEmpresasPorAdministrador(idUsuario);
        return empresas;
    }

}
