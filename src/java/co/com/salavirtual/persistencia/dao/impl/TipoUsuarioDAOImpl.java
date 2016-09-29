/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao.impl;

import co.com.salavirtual.conexion.ConexionSQL;
import co.com.salavirtual.modelo.dto.Tipo_Usuario_TO;
import co.com.salavirtual.persistencia.dao.TipoUsuarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VaioDevelopment
 */
public class TipoUsuarioDAOImpl implements TipoUsuarioDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public Tipo_Usuario_TO consultarTipoUsuario(Tipo_Usuario_TO tipo) throws Exception {
        Tipo_Usuario_TO tipousuario = new Tipo_Usuario_TO();
        try {
            try {
                String sql = "select idTipoUsuario, nombre, descripcion from tipousuario "
                        + "where idTipoUsuario = " + tipo.getIdTipoUsuario() + " or nombre = '" + tipo.getNombre() + "' ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    tipousuario = new Tipo_Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return tipousuario;
    }

    @Override
    public List<Tipo_Usuario_TO> consultarTipoUsuarios() throws Exception {
        List<Tipo_Usuario_TO> tipousuarios = new ArrayList<>();
        try {
            try {
                String sql = "select idTipoUsuario, nombre, descripcion from tipousuario ";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    tipousuarios.add(new Tipo_Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3)));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            tipousuarios = new ArrayList<>();
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return tipousuarios;
    }

    @Override
    public List<Tipo_Usuario_TO> consultarTipoUsuariosRestringidos() throws Exception {
        List<Tipo_Usuario_TO> tipousuarios = new ArrayList<>();
        try {
            try {
                String sql = "select idTipoUsuario, nombre, descripcion from tipousuario where idTipoUsuario > 2";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    tipousuarios.add(new Tipo_Usuario_TO(rs.getInt(1), rs.getString(2), rs.getString(3)));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            tipousuarios = new ArrayList<>();
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return tipousuarios;
    }

}
