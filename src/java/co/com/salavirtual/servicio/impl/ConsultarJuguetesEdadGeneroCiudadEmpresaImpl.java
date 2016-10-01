/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.persistencia.dao.impl.JugueteDAOImpl;
import co.com.salavirtual.servicio.ConsultarJuguetesEdadGeneroCiudadEmpresa;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**                                                                             
 *
 * @author Gustavo Cardenas
 */
@Stateless
@Path("/ConsultarJuguetesEdadGeneroCiudadEmpresa")
public class ConsultarJuguetesEdadGeneroCiudadEmpresaImpl implements ConsultarJuguetesEdadGeneroCiudadEmpresa {

   @GET
    @Produces({"application/json"})
    @Override
    public List<Inventario_TO> ConsultarJuguetesEdadGeneroCiudadEmpresa(@QueryParam("idEmpresa") int idEmpresa, @QueryParam("edad") int edad, @QueryParam("genero") String genero, @QueryParam("idCiudad") String idCiudad ) throws Exception {

        JugueteDAOImpl jugueteDao = new JugueteDAOImpl();
        List<Inventario_TO> seleciones = new ArrayList<>();
        seleciones = jugueteDao.ConsultarJuguetesEdadGeneroCiudadEmpresa(idEmpresa , edad , genero, idCiudad);
        return seleciones;
    }
    
}

