/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.persistencia.dao.impl.EmpresaDAOImpl;
import co.com.salavirtual.servicio.EditarEmpresas;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Gustavo Cardenas
 */
@Stateless
@Path("/editarEmpresas")
public class EditarEmpresasImpl implements EditarEmpresas {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int editarEmpresas(@QueryParam("idEmpresas") int idEmpresas,@QueryParam("idUsuario") int idUsuario, @QueryParam("nombre") String nombre,
            @QueryParam("direccion") String direccion, @QueryParam("nit") String nit, @QueryParam("telefono") String telefono,
            @QueryParam("correo") String correo, @QueryParam("urlLogo") String urlLogo, @QueryParam("urlBanner") String urlBanner, @QueryParam("comite") int comite) throws Exception {

        EmpresaDAOImpl empresaDAO = new EmpresaDAOImpl();
        int resultado = 0;
        resultado = empresaDAO.editarEmpresas(idEmpresas, nombre, direccion, nit, telefono, correo, urlLogo, urlBanner, idUsuario, comite);
        return resultado;
    }

}
