/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao.impl;

import co.com.salavirtual.conexion.ConexionSQL;
import co.com.salavirtual.modelo.dto.Ciudad_TO;
import co.com.salavirtual.modelo.dto.Departamento_TO;
import co.com.salavirtual.persistencia.dao.CiudadDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad
 * Ciudad
 *
 * @author SISTEMAS
 */
public class CiudadDAOImpl implements CiudadDAO {

    private final Statement st = ConexionSQL.conexion();

    /**
     *
     * METODOS PARA CONSULTAR CIUDADES
     *
     * @return @throws Exception
     */
    @Override
    public List<Ciudad_TO> consultarCiudades() throws Exception {

        List<Ciudad_TO> ciudades = new ArrayList<>();

        try {

            String sql = "SELECT idciudad, nombre, descripcion, iddepartamento  FROM ciudad;";

            ResultSet rs = null;
            rs = st.executeQuery(sql);

            while (rs.next()) {
                ciudades.add(new Ciudad_TO(rs.getInt(1), rs.getString(2), rs.getString(3), new Departamento_TO(rs.getInt(4))));

            }

        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return ciudades;

    }

    @Override
    public Ciudad_TO consultarCiudad(Ciudad_TO ciudad) throws Exception {
        Ciudad_TO nuevaciudad = new Ciudad_TO();
        try {
            String sql = "SELECT idciudad, nombre, descripcion, idDepartamento  FROM ciudad "
                    + "WHERE idciudad = '" + ciudad.getIdCiudad() + "' or nombre = '" + ciudad.getNombre() + "'; ";

            ResultSet rs = null;
            rs = st.executeQuery(sql);

            while (rs.next()) {
                nuevaciudad = new Ciudad_TO(rs.getInt(1), rs.getString(2), rs.getString(3), new Departamento_TO(rs.getInt(4)));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return nuevaciudad;
    }

    @Override
    public List<Ciudad_TO> consultarCiudadesSegunDepartamento(Departamento_TO departamento) throws Exception {
        List<Ciudad_TO> ciudades = new ArrayList<>();

        try {

            String sql = "SELECT idciudad, nombre, descripcion, iddepartamento  FROM ciudad "
                    + "WHERE iddepartamento = " + departamento.getIdDepartamento() + "; ";

            ResultSet rs = null;
            rs = st.executeQuery(sql);

            while (rs.next()) {
                ciudades.add(new Ciudad_TO(rs.getInt(1), rs.getString(2), rs.getString(3), new Departamento_TO(rs.getInt(4))));

            }

        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return ciudades;

    }

}
