package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.persistencia.dao.impl.JugueteDAOImpl;
import co.com.salavirtual.servicio.ConsultarJuguetes;
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
@Path("/consultarJuguetes")
public class ConsultarJuguetesImpl implements ConsultarJuguetes {

    @GET
    @Produces({"application/json"})
    @Override
    public List<Inventario_TO> ConsultarJuguetes() throws Exception {

        JugueteDAOImpl JugueteDAO = new JugueteDAOImpl();
        List<Inventario_TO> inventario = new ArrayList<>();
        inventario = JugueteDAO.ConsultarJuguetes();
        return inventario;
    }

}
