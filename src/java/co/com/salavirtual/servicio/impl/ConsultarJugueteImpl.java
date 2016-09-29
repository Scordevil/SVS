package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.persistencia.dao.impl.JugueteDAOImpl;
import co.com.salavirtual.servicio.ConsultarJuguete;
import co.com.salavirtual.servicio.ConsultarJuguetes;
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
@Path("/consultarJuguete")
public class ConsultarJugueteImpl implements ConsultarJuguete {

    @GET
    @Produces({"application/json"})
    @Override
    public Inventario_TO ConsultarJuguete(@QueryParam("idInventario") int idInventario) throws Exception {

        JugueteDAOImpl JugueteDAO = new JugueteDAOImpl();
        Inventario_TO inv = new Inventario_TO();
        inv = JugueteDAO.ConsultarJuguete(idInventario);
        return inv;
    }

}
