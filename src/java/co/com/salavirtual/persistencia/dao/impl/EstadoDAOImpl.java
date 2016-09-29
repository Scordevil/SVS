/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao.impl;

import co.com.salavirtual.conexion.ConexionSQL;
import co.com.salavirtual.modelo.dto.Estado_TO;
import co.com.salavirtual.persistencia.dao.EstadoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author CristianCamilo
 */
public class EstadoDAOImpl implements EstadoDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public Estado_TO consultarEstado(Estado_TO estado) throws Exception {
        Estado_TO nuevoestado = new Estado_TO();
        try {
            try {
                String sql = "SELECT idEstado, nombre, descripcion FROM estado "
                        + "WHERE idEstado = '" + estado.getIdEstado() + "' or nombre = '" + estado.getNombre() + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    nuevoestado = new Estado_TO(rs.getInt(1), rs.getString(2), rs.getString(3));
                }
            } catch (SQLException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevoestado;
    }

}
