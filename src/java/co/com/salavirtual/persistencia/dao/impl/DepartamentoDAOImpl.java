/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao.impl;

import co.com.salavirtual.conexion.ConexionSQL;
import co.com.salavirtual.modelo.dto.Departamento_TO;
import co.com.salavirtual.persistencia.dao.DepartamentoDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VaioDevelopment
 */
public class DepartamentoDAOImpl implements DepartamentoDAO {

    private final Statement st = ConexionSQL.conexion();

    @Override
    public List<Departamento_TO> consultarDepartamentos() throws Exception {
        List<Departamento_TO> departamentos = new ArrayList<>();
        try {
            try {
                String sql = "SELECT idDepartamento, nombre, descripcion from departamento";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    departamentos.add(new Departamento_TO(rs.getInt(1), rs.getString(2), rs.getString(3)));
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return departamentos;
    }

    @Override
    public Departamento_TO consultarDepartamento(Departamento_TO departamento) throws Exception {
        Departamento_TO ndepartamento = new Departamento_TO();
        try {
            try {
                String sql = "SELECT idDepartamento, nombre, descripcion from departamento WHERE "
                        + "idDepartamento = " + departamento.getIdDepartamento() + " or nombre = '" + departamento.getNombre() + "'";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    ndepartamento = new Departamento_TO(rs.getInt(1), rs.getString(2), rs.getString(3));
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return ndepartamento;
    }

}
