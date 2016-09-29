/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Empresa_TO;
import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.persistencia.dao.JugueteDAO;
import co.com.salavirtual.persistencia.dao.impl.JugueteDAOImpl;
import co.com.salavirtual.servicio.ConsultarJuguetesPorEmpresa;
import java.util.List;
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
@Path("/consultarJuguetesPorEmpresa")
public class ConsultarJuguetesPorEmpresaImpl implements ConsultarJuguetesPorEmpresa {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Override
    public List<Inventario_TO> consultarJuguetesPorEmpresa(@QueryParam("idEmpresa") int idEmpresa) throws Exception {
        JugueteDAO jugueteDAO = new JugueteDAOImpl();
        return jugueteDAO.ConsultarJuguetesPorEmpresa(idEmpresa);
    }

}
