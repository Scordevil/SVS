/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao.impl;

import co.com.salavirtual.conexion.ConexionSQL;
import co.com.salavirtual.config.Config;
import co.com.salavirtual.modelo.dto.Ciudad_TO;
import co.com.salavirtual.modelo.dto.Comite_TO;
import co.com.salavirtual.modelo.dto.Departamento_TO;
import co.com.salavirtual.modelo.dto.Empresa_TO;
import co.com.salavirtual.modelo.dto.Tipo_Usuario_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.persistencia.dao.UsuarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad
 * Usuario
 *
 * @author Gustavo Cardenas
 */
public class UsuarioDAOImpl implements UsuarioDAO {

    private final Statement st = ConexionSQL.conexion();

    /**
     *
     * METODOS PARA REGISTRAR USUARIOS
     *
     * @param usuario
     * @return @throws Exception
     */
    @Override
    public int registrarUsuarios(Usuario_TO usuario) throws Exception {

        Usuario_TO user = new Usuario_TO();
        int resultado = 0;
        try {
            try {
                String sql = "INSERT INTO usuario "
                        + "(idEmpresa, "
                        + "idTipoUsuario, "
                        + "idCiudad, "
                        + "idDepartamento, "
                        + "nombre, "
                        + "codigoEmpleado, "
                        + "cc, "
                        + "telefono, "
                        + "email, "
                        + "usuario, "
                        + "contrasena, "
                        + "oficina) "
                        + "VALUES "
                        + "('" + usuario.getIdEmpresa().getIdEmpresa() + "', "
                        + "'" + usuario.getIdTipoUsuario().getIdTipoUsuario() + "', "
                        + "'" + usuario.getIdCiudad().getIdCiudad() + "', "
                        + "'" + usuario.getIdDepartamento().getIdDepartamento() + "', "
                        + "'" + usuario.getNombre() + "', "
                        + "'" + usuario.getCodigoEmpleado() + "', "
                        + "'" + usuario.getCc() + "', "
                        + "'" + usuario.getTelefono() + "', "
                        + "'" + usuario.getEmail() + "', "
                        + "'" + usuario.getUsuario() + "', "
                        + "'" + usuario.getContrasena() + "', "
                        + "'" + usuario.getOficina() + "');";

                st.execute(sql);
                resultado = 1;
            } catch (Exception e) {
                resultado = 0;
                throw e;

            }

        } catch (Exception e) {
            throw e;

        } finally {
            ConexionSQL.CerrarConexion();

        }
        return resultado;
    }

    @Override
    public int editarUsuario(Usuario_TO usuario) throws Exception {
        int resultado = 0;
        try {
            Config md5 = new Config();
            try {
                String sql = "UPDATE usuario SET  "
                        + "`idEmpresa` = " + usuario.getIdEmpresa().getIdEmpresa() + ", "
                        + "`idTipoUsuario` = " + usuario.getIdTipoUsuario().getIdTipoUsuario() + ", "
                        + "`idCiudad` = " + usuario.getIdCiudad().getIdCiudad() + ", "
                        + "`idDepartamento` = " + usuario.getIdDepartamento().getIdDepartamento() + " , "
                        + "`nombre`= '" + usuario.getNombre() + "', "
                        + "`codigoEmpleado` = " + usuario.getCodigoEmpleado() + ", "
                        + "`cc` = " + usuario.getCc() + ", "
                        + "`telefono` = '" + usuario.getTelefono() + "', "
                        + "`email` = '" + usuario.getEmail() + "', "
                        + "`contrasena` = '" + usuario.getContrasena() + "', "
                        + "`usuario` = '" + usuario.getUsuario() + "', "
                        + "`oficina` = '" + usuario.getOficina() + "', "
                        + "`areaTrabajo` = '" + usuario.getAreaTrabajo() + "' "
                        + "WHERE idUsuario = " + usuario.getIdUsuario() + "";

                st.execute(sql);
                resultado = 1;
            } catch (Exception e) {
                resultado = 0;
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return resultado;
    }

    @Override
    public int quitarAcceso(int idUsuario) throws Exception {
        int resultado = 0;
        try {

            try {
                String sql = "UPDATE usuario SET  "
                        + "`contrasena` = '' "
                        + " WHERE idUsuario = " + idUsuario + ";";

                st.execute(sql);
                resultado = 1;
            } catch (Exception e) {
                resultado = 0;
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return resultado;
    }

    @Override
    public int eliminarUsuario(Usuario_TO usuario) throws Exception {
        int resultado = 0;

        try {
            String sql = "DELETE FROM usuario WHERE idUsuario = " + usuario.getIdUsuario() + ";";
            st.execute(sql);
            resultado = 1;
        } catch (Exception e) {
            resultado = 0;
            throw e;

        } finally {
            ConexionSQL.CerrarConexion();
        }
        return resultado;
    }

    @Override
    public List<Usuario_TO> consultarUsuarios() throws Exception {
        List<Usuario_TO> usuarios = new ArrayList<>();

        try {
            String sql = "SELECT  `idUsuario`, `idEmpresa`, `idTipoUsuario`, `idCiudad`, `idDepartamento`, `nombre`, `codigoEmpleado`, `cc`, `telefono`, "
                    + "`email`,`usuario`, `contrasena`, `oficina`, `areaTrabajo` FROM usuario";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                usuarios.add(new Usuario_TO(rs.getInt(1),
                        new Tipo_Usuario_TO(rs.getInt(3)),
                        new Ciudad_TO(rs.getInt(4)),
                        new Departamento_TO(rs.getInt(5)),
                        new Empresa_TO(rs.getInt(2)),
                        rs.getString(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getString(14)));
            }
        } catch (SQLException e) {
            usuarios = new ArrayList<>();
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return usuarios;
    }

    /**
     *
     * METODOS PARA CONSULTAR USUARIOS POR LOGIN
     *
     * @param usuario
     * @return @throws Exception
     */
    @Override
    public Usuario_TO consultarUsuarioPorLogin(Usuario_TO usuario) throws Exception {
        Usuario_TO user = new Usuario_TO();
        try {
            try {
                String sql = "SELECT `usuario`.`idUsuario`, "
                        + "    `usuario`.`idEmpresa`, "
                        + "    `usuario`.`idTipoUsuario`, "
                        + "    `usuario`.`idCiudad`, "
                        + "    `usuario`.`idDepartamento`, "
                        + "    `usuario`.`nombre`, "
                        + "    `usuario`.`codigoEmpleado`, "
                        + "    `usuario`.`cc`, "
                        + "    `usuario`.`telefono`, "
                        + "    `usuario`.`email`, "
                        + "    `usuario`.`usuario`, "
                        + "    `usuario`.`contrasena`, "
                        + "    `usuario`.`oficina`, "
                        + "    `usuario`.`areaTrabajo` "
                        + "FROM `salavirtual`.`usuario` as usuario where usuario.usuario = '" + usuario.getUsuario() + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    user = new Usuario_TO(rs.getInt(1), new Tipo_Usuario_TO(rs.getInt(3)), new Ciudad_TO(rs.getInt(4)), new Departamento_TO(rs.getInt(5)), new Empresa_TO(rs.getInt(2)), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14));
                }
            } catch (SQLException e) {
                user = new Usuario_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return user;
    }

    /**
     *
     * METODOS PARA CONSULTAR USUARIOS POR LOGIN
     *
     * @param Cc
     * @return @throws Exception
     */
    @Override
    public Usuario_TO consultarUsuarioPorCC(String Cc) throws Exception {
        Usuario_TO user = new Usuario_TO();
        try {
            try {
                String sql = "SELECT `usuario`.`idUsuario`, "
                        + "    `usuario`.`idEmpresa`, "
                        + "    `usuario`.`idTipoUsuario`, "
                        + "    `usuario`.`idCiudad`, "
                        + "    `usuario`.`idDepartamento`, "
                        + "    `usuario`.`nombre`, "
                        + "    `usuario`.`codigoEmpleado`, "
                        + "    `usuario`.`cc`, "
                        + "    `usuario`.`telefono`, "
                        + "    `usuario`.`email`, "
                        + "    `usuario`.`usuario`, "
                        + "    `usuario`.`contrasena`, "
                        + "    `usuario`.`oficina`, "
                        + "    `usuario`.`areaTrabajo` "
                        + "FROM `salavirtual`.`usuario` as usuario where usuario.cc = '" + Cc + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    user = new Usuario_TO(rs.getInt(1), new Tipo_Usuario_TO(rs.getInt(3)), new Ciudad_TO(rs.getInt(4)), new Departamento_TO(rs.getInt(5)), new Empresa_TO(rs.getInt(2)), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14));
                }
            } catch (SQLException e) {
                user = new Usuario_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return user;
    }

    @Override
    public List<Usuario_TO> consultarUsuariosPorTipoUsuario(Tipo_Usuario_TO tipo) throws Exception {
        List<Usuario_TO> usuarios = new ArrayList<>();
        try {
            try {
                String sql = "SELECT  `idUsuario`, `idEmpresa`, `idTipoUsuario`, `idCiudad`, `idDepartamento`, `nombre`, `codigoEmpleado`, `cc`, `telefono`, "
                        + "`email`,`usuario`, `contrasena`, `oficina`, `areaTrabajo` FROM usuario "
                        + "WHERE idTipoUsuario = '" + tipo.getIdTipoUsuario() + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    usuarios.add(new Usuario_TO(rs.getInt(1),
                            new Tipo_Usuario_TO(rs.getInt(3)),
                            new Ciudad_TO(rs.getInt(4)),
                            new Departamento_TO(rs.getInt(5)),
                            new Empresa_TO(rs.getInt(2)),
                            rs.getString(6),
                            rs.getInt(7),
                            rs.getString(8),
                            rs.getString(9),
                            rs.getString(10),
                            rs.getString(11),
                            rs.getString(12),
                            rs.getString(13),
                            rs.getString(14)));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return usuarios;
    }

    @Override
    public int RegistrarUsuariosComite(Usuario_TO usuario, Comite_TO comite) throws Exception {
        int resultado = 0;
        try {
            try {
                String sql = "INSERT INTO comite_usuario "
                        + "(idComite, idUsuario) "
                        + "VALUES "
                        + "('" + comite.getIdComite() + "', "
                        + "'" + usuario.getIdUsuario() + "');";
                st.execute(sql);
                resultado = 1;
            } catch (Exception e) {
                resultado = 0;
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return resultado;
    }

    @Override
    public List<Usuario_TO> buscarUsuariosPorTipo(String valor, Tipo_Usuario_TO tipo) throws Exception {
        List<Usuario_TO> usuarios = new ArrayList<>();
        try {
            try {
                String sql = "SELECT  u.idUsuario, u.idEmpresa, u.idTipoUsuario, u.idCiudad, u.idDepartamento, u.nombre, u.codigoEmpleado, u.cc, u.telefono, "
                        + "u.email, u.usuario, u.contrasena, u.oficina, u.areaTrabajo FROM usuario as u, ciudad as c, empresa as p, departamento as d "
                        + "WHERE u.idTipoUsuario = '" + tipo.getIdTipoUsuario() + "' AND u.idCiudad = c.idCiudad AND u.idDepartamento = d.idDepartamento "
                        + "AND u.idEmpresa = p.idEmpresa AND "
                        + "(p.nombre LIKE '%" + valor + "%' OR c.nombre LIKE '%" + valor + "%' "
                        + "OR d.nombre LIKE '%" + valor + "%' OR u.nombre LIKE '%" + valor + "%' "
                        + "OR u.codigoEmpleado LIKE '%" + valor + "%' OR u.cc LIKE '%" + valor + "%' "
                        + "OR u.telefono LIKE '%" + valor + "%' OR u.email LIKE '%" + valor + "%' "
                        + "OR u.oficina LIKE '%" + valor + "%' OR u.areaTrabajo LIKE '%" + valor + "%')";

                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    usuarios.add(new Usuario_TO(rs.getInt(1),
                            new Tipo_Usuario_TO(rs.getInt(3)),
                            new Ciudad_TO(rs.getInt(4)),
                            new Departamento_TO(rs.getInt(5)),
                            new Empresa_TO(rs.getInt(2)),
                            rs.getString(6),
                            rs.getInt(7),
                            rs.getString(8),
                            rs.getString(9),
                            rs.getString(10),
                            rs.getString(11),
                            rs.getString(12),
                            rs.getString(13),
                            rs.getString(14)));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return usuarios;
    }

    @Override
    public List<Usuario_TO> consultarUsuariosEmpresa(int idEmpresa) throws Exception {
        List<Usuario_TO> usuarios = new ArrayList<>();
        try {
            try {
                String sql = "SELECT  u.`idUsuario`, u.`idEmpresa`, u.`idTipoUsuario`, u.`idCiudad`, u.`idDepartamento`, u.`nombre`, u.`codigoEmpleado`, u.`cc`, u.`telefono`, "
                        + " u.`email`,u.`usuario`, u. `contrasena`, u.`oficina`, u.`areaTrabajo`, tu.`nombre` FROM usuario as u, tipousuario as tu"
                        + " WHERE u.idEmpresa = " + idEmpresa + " and tu.idTipoUsuario=u.idTipoUsuario;";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    usuarios.add(new Usuario_TO(rs.getInt(1),
                            new Tipo_Usuario_TO(rs.getInt(3), rs.getString(15)),
                            new Ciudad_TO(rs.getInt(4)),
                            new Departamento_TO(rs.getInt(5)),
                            new Empresa_TO(rs.getInt(2)),
                            rs.getString(6),
                            rs.getInt(7),
                            rs.getString(8),
                            rs.getString(9),
                            rs.getString(10),
                            rs.getString(11),
                            rs.getString(12),
                            rs.getString(13),
                            rs.getString(14)));
                }
            } catch (SQLException e) {
                usuarios = new ArrayList<>();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return usuarios;
    }

    @Override
    public List<Usuario_TO> consultarUsuariosEmpresaLike(int idEmpresa, String nombre) throws Exception {
        List<Usuario_TO> usuarios = new ArrayList<>();

        try {
            try {
                String sql = "SELECT  `idUsuario`, `idEmpresa`, `idTipoUsuario`, `idCiudad`, `idDepartamento`, `nombre`, `codigoEmpleado`, `cc`, `telefono`, "
                        + "`email`,`usuario`, `contrasena`, `oficina`, `areaTrabajo` FROM usuario "
                        + "WHERE usuario.nombre LIKE '%" + nombre + "%'\n"
                        + "and usuario.idEmpresa=" + idEmpresa;
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    usuarios.add(new Usuario_TO(rs.getInt(1),
                            new Tipo_Usuario_TO(rs.getInt(3)),
                            new Ciudad_TO(rs.getInt(4)),
                            new Departamento_TO(rs.getInt(5)),
                            new Empresa_TO(rs.getInt(2)),
                            rs.getString(6),
                            rs.getInt(7),
                            rs.getString(8),
                            rs.getString(9),
                            rs.getString(10),
                            rs.getString(11),
                            rs.getString(12),
                            rs.getString(13),
                            rs.getString(14)));
                }
            } catch (SQLException e) {
                usuarios = new ArrayList<>();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return usuarios;
    }
}
