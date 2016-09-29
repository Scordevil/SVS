/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Comite_TO;
import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.persistencia.dao.JugueteDAO;
import co.com.salavirtual.persistencia.dao.impl.JugueteDAOImpl;
import co.com.salavirtual.servicio.RegistrarJuguetesComite;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author CristianCamilo
 */
@Stateless
@Path("/registrarJuguetesComite")
public class RegistrarJuguetesComiteImpl implements RegistrarJuguetesComite{

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int registrarJuguetesComite(@QueryParam("idComite") int idComite, @QueryParam("idInventario") int idInventario) throws Exception {
        Inventario_TO inventario = new Inventario_TO(idInventario);
        Comite_TO comite = new Comite_TO(idComite);
        JugueteDAO jugueteDao = new JugueteDAOImpl();
        return jugueteDao.RegistrarjuguetesComite(inventario, comite);
    }
    
}
