/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.persistencia.dao.impl.VotacionDAOImpl;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import co.com.salavirtual.servicio.ConsultarIdJugueteMasVotado;

/**
 *
 * @author kira
 */
@Stateless
@Path("/consultarIdJugueteMasVotado")
public class ConsultarIdJugueteMasVotadoImpl implements ConsultarIdJugueteMasVotado{

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int consultarIdJugueteMasVotado() throws Exception  {
        VotacionDAOImpl votacionDAO = new VotacionDAOImpl();
        int idInv = 0;
        idInv = votacionDAO.consultarIdJugueteMasVotado();
        return idInv;
    }
    
}