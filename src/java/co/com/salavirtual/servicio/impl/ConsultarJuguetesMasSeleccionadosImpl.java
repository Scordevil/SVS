package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.persistencia.dao.impl.JugueteDAOImpl;
import co.com.salavirtual.persistencia.dao.impl.PedidoDAOImpl;
import co.com.salavirtual.persistencia.dao.impl.VotacionDAOImpl;
import co.com.salavirtual.servicio.ConsultarJuguetesMasSeleccionados;
import co.com.salavirtual.servicio.ConsultarJuguetesMasVotados;
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
@Path("/consultarJuguetesMasSeleccionados")
public class ConsultarJuguetesMasSeleccionadosImpl implements ConsultarJuguetesMasSeleccionados {

    @GET
    @Produces({"application/json"})
    @Override
    public List<Inventario_TO> consultarJuguetesMasSeleccionados(@QueryParam("idEmpresa") int idEmpresa) throws Exception {

        PedidoDAOImpl pedidoDAO = new PedidoDAOImpl();
        List<Inventario_TO> inventarios = new ArrayList<>();
        inventarios = pedidoDAO.consultarMasSeleccionados(idEmpresa);
        return inventarios;
    }

}
