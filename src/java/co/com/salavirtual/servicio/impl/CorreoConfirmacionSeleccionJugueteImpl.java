/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.modelo.dto.Pedido_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.persistencia.dao.impl.CorreoDAOImpl;
import co.com.salavirtual.servicio.CorreoConfirmacionSeleccionJuguete;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author SISTEMAS
 */
@Stateless
@Path("/correoConfirmacionSeleccionJuguete")
public class CorreoConfirmacionSeleccionJugueteImpl implements CorreoConfirmacionSeleccionJuguete {

    Usuario_TO user = new Usuario_TO();
    Pedido_TO pedido = new Pedido_TO();
    Inventario_TO inventario = new Inventario_TO();

    @Override
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int correoConfirmacionSeleccionJuguete(@QueryParam("nombreUsuario") String nombreUsuario, @QueryParam("nombreHijo") String nombreHijo,
             @QueryParam("codigoInventario") String codigoInventario, @QueryParam("idPedido") int idPedido,
             @QueryParam("nombreJuguete") String nombreJuguete, @QueryParam("usuario") String usuario) throws Exception {

        CorreoDAOImpl correoDAO = new CorreoDAOImpl();
        
        user.setNombre(nombreUsuario);
        user.setEmail(usuario);
        pedido.setNombreHijo(nombreHijo);
        inventario.setCodigo(codigoInventario);
        pedido.setIdPedido(idPedido);
        inventario.setNombre(nombreJuguete);
 
        return correoDAO.correoConfirmacionSeleccionJuguete(user, inventario, pedido);
    }
}