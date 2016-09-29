/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio.impl;

import co.com.salavirtual.modelo.dto.Ciudad_TO;
import co.com.salavirtual.modelo.dto.Departamento_TO;
import co.com.salavirtual.modelo.dto.Empresa_TO;
import co.com.salavirtual.modelo.dto.Tipo_Usuario_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.persistencia.dao.UsuarioDAO;
import co.com.salavirtual.persistencia.dao.impl.UsuarioDAOImpl;
import co.com.salavirtual.servicio.RegistrarUsuario;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author VaioDevelopment
 */
@Stateless
@Path("/registrarUsuario")
public class RegistrarUsuarioImpl implements RegistrarUsuario {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Override
    public int registrarUsuario(@QueryParam("idEmpresa") int idEmpresa,
            @QueryParam("idTipoUsuario") int idTipoUsuario,
            @QueryParam("idCiudad") int idCiudad,
            @QueryParam("idDepartamento") int idDepartamento,
            @QueryParam("nombre") String nombre,
            @QueryParam("codigoEmpleado") int codigoEmpleado,
            @QueryParam("cc") String cc,
            @QueryParam("telefono") String telefono,
            @QueryParam("email") String email,
            @QueryParam("usuario") String usuario,
            @QueryParam("contrasena") String contrasena,
            @QueryParam("oficina") String oficina) throws Exception {

        Usuario_TO user = new Usuario_TO(new Tipo_Usuario_TO(idTipoUsuario), new Ciudad_TO(idCiudad), new Departamento_TO(idDepartamento), new Empresa_TO(idEmpresa), nombre, codigoEmpleado, cc, telefono, email, usuario, contrasena, oficina, "");
        UsuarioDAO usuarioDao = new UsuarioDAOImpl();
        return usuarioDao.registrarUsuarios(user);
    }

}
