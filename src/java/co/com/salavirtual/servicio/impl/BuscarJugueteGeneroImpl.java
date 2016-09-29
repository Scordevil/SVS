/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.persistencia.dao.impl.JugueteDAOImpl;
import co.com.salavirtual.servicio.BuscarJugueteGenero;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

/**
 *
 * @author SISTEMAS
 */
@Stateless
@Path("/consultarJuguetesPorEdadYGenero")
public class BuscarJugueteGeneroImpl implements BuscarJugueteGenero {

    @GET
    @Produces({"application/json"})
    @Override
    public List<Inventario_TO> ConsultarJuguetesEdadGenero(@QueryParam("edad") int edad, @QueryParam("genero") String genero) throws Exception {

        JugueteDAOImpl JugueteDAO = new JugueteDAOImpl();
        List<Inventario_TO> juguetes = new ArrayList<>();
        juguetes = JugueteDAO.ConsultarJuguetesEdadGenero(edad, genero) ;
        return juguetes;
    }

}
