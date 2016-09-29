package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Comite_TO;
import co.com.salavirtual.persistencia.dao.impl.ComiteDAOImpl;
import co.com.salavirtual.servicio.ConsultarComites;
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
@Path("/consultarComites")
public class ConsultarComitesImpl implements ConsultarComites {

    @GET
    @Produces({"application/json"})
    @Override
    public List<Comite_TO> consultarComite() throws Exception {

        ComiteDAOImpl comiteDAO = new ComiteDAOImpl();
        List<Comite_TO> comite = new ArrayList<>();
        comite = comiteDAO.consultarComite();
        return comite;
    }

}
