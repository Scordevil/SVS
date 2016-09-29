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
import co.com.salavirtual.servicio.CrearJuguete;
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
@Path("/registrarJuguete")
public class CrearJugueteImpl implements CrearJuguete {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int Crearjuguete(@QueryParam("codigo") String codigo,
            @QueryParam("nombre") String nombre,
            @QueryParam("descripcion") String descripcion,
            @QueryParam("edadDesde") int edadDesde,
            @QueryParam("edadHasta") int edadHasta,
            @QueryParam("genero") String genero,
            @QueryParam("cantidad") int cantidad,
            @QueryParam("url1") String url1,
            @QueryParam("url2") String url2,
            @QueryParam("url3") String url3,
            @QueryParam("url4") String url4,
            @QueryParam("url5") String url5,
            @QueryParam("url6") String url6,
            @QueryParam("url7") String url7,
            @QueryParam("url8") String url8,
            @QueryParam("url9") String url9,
            @QueryParam("url10") String url10,
            @QueryParam("url11") String url11,
            @QueryParam("url12") String url12,
            @QueryParam("observacion") String observacion,
            @QueryParam("idEmpresa") int idEmpresa) throws Exception {
        Inventario_TO juguete = new Inventario_TO(codigo, nombre, descripcion, edadDesde, edadHasta, genero, cantidad, url1, url2, url3, url4, url5, url6, url7, url8, url9, url10, url11, url12, observacion, new Empresa_TO(idEmpresa));
        JugueteDAO jugueteDao = new JugueteDAOImpl();
        return jugueteDao.CrearJuguete(juguete);
    }

}
