/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao.impl;

import co.com.salavirtual.conexion.ConexionSQL;
import co.com.salavirtual.modelo.dto.Ciudad_TO;
import co.com.salavirtual.modelo.dto.Comite_TO;
import co.com.salavirtual.modelo.dto.Empresa_TO;
import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.modelo.dto.Pedido_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.persistencia.dao.JugueteDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.UIManager.getString;

/**
 *
 * @author cesar
 */
public class JugueteDAOImpl implements JugueteDAO {

    private final Statement st = ConexionSQL.conexion();

    List<Inventario_TO> inventario = new ArrayList();

    /**
     *
     * METODOS PARA CONSULTAR Juguetes
     *
     * @return @throws Exception
     */
    @Override
    public List<Inventario_TO> ConsultarJuguetes() throws Exception {

        List<Inventario_TO> inventario = new ArrayList<>();
        try {

            String sql = "SELECT idInventario, codigo, nombre, descripcion, edadDesde, edadHasta, genero, cantidad, url1, url2, url3, url4, url5, url6, url7, url8, url9, url10, url11, url12, observacion, idEmpresa FROM inventario;";
            ResultSet rs = null;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                inventario.add(new Inventario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), getString(18), rs.getString(19), rs.getString(20), rs.getString(21), new Empresa_TO(rs.getInt(22))));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return inventario;
    }

    /**
     *
     * METODOS PARA CONSULTAR Juguetes
     *
     * @param idComite
     * @return @throws Exception
     */
    @Override
    public List<Inventario_TO> ConsultarJuguetesPorComite(int idComite) throws Exception {

        List<Inventario_TO> inventario = new ArrayList<>();
        try {

            String sql = "SELECT i.idInventario, i.codigo, i.nombre, i.descripcion, i.edadDesde, i.edadHasta, i.genero, i.cantidad, i.url1, i.url2, i.url3, i.url4, i.url5, i.url6, i.url7, i.url8, i.url9, i.url10, i.url11, i.url12, i.observacion, i.idEmpresa FROM inventario as i, comite_inventario as ci where ci.idComite = " + idComite + " and ci.idInventario = i.idInventario ;";
            ResultSet rs = null;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                inventario.add(new Inventario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), getString(18), rs.getString(19), rs.getString(20), rs.getString(21), new Empresa_TO(rs.getInt(22))));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return inventario;
    }

    /**
     *
     * METODOS PARA CONSULTAR Juguete
     *
     * @param idInventario
     * @return @throws Exception
     */
    @Override
    public Inventario_TO ConsultarJuguete(int idInventario) throws Exception {

        Inventario_TO inv = new Inventario_TO();
        try {

            String sql = "SELECT idInventario, codigo, nombre, descripcion, edadDesde, edadHasta, genero, cantidad, url1, url2, url3, url4, url5, url6, url7, url8, url9, url10, url11, url12, observacion, idEmpresa FROM inventario"
                    + " where idInventario = " + idInventario + ";";
            ResultSet rs = null;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                inv = new Inventario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), getString(18), rs.getString(19), rs.getString(20), rs.getString(21), new Empresa_TO(rs.getInt(22)));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return inv;
    }

    @Override
    public int CrearJuguete(Inventario_TO juguete) throws Exception {
        Inventario_TO inventario = new Inventario_TO();
        int resultado = 0;
        try {
            String sql = "INSERT INTO inventario (codigo, nombre, descripcion, edadDesde,"
                    + " edadHasta, genero, cantidad, url1, url2, url3, url4, url5, url6, url7, url8, url9, url10, url11, url12, observacion, idEmpresa)"
                    + " VALUES ('" + juguete.getCodigo() + "',"
                    + " '" + juguete.getNombre() + "',"
                    + " '" + juguete.getDescripcion() + "',"
                    + " " + juguete.getEdadDesde() + ","
                    + " " + juguete.getEdadHasta() + ","
                    + " '" + juguete.getGenero() + "',"
                    + " " + juguete.getCantidad() + ","
                    + " '" + juguete.getUrl1() + "',"
                    + " '" + juguete.getUrl2() + "',"
                    + " '" + juguete.getUrl3() + "',"
                    + " '" + juguete.getUrl4() + "',"
                    + " '" + juguete.getUrl5() + "',"
                    + " '" + juguete.getUrl6() + "',"
                    + " '" + juguete.getUrl7() + "',"
                    + " '" + juguete.getUrl8() + "',"
                    + " '" + juguete.getUrl9() + "',"
                    + " '" + juguete.getUrl10() + "',"
                    + " '" + juguete.getUrl11() + "',"
                    + " '" + juguete.getUrl12() + "',"
                    + " '" + juguete.getObservacion() + "',"
                    + " '" + juguete.getIdEmpresa().getIdEmpresa() + "')";
            st.execute(sql);
            resultado = 1;
        } catch (SQLException e) {
            inventario = new Inventario_TO();
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return resultado;
    }

    @Override
    public int EditarJuguete(Inventario_TO juguete) throws Exception {
        Inventario_TO inventario = new Inventario_TO();
        int resultado = 0;
        try {
            String sql = "UPDATE inventario SET codigo = '" + juguete.getCodigo() + "',"
                    + " nombre = '" + juguete.getNombre() + "',"
                    + " descripcion = '" + juguete.getDescripcion() + "',"
                    + " edadDesde = " + juguete.getEdadDesde() + ","
                    + " edadHasta = " + juguete.getEdadHasta() + ","
                    + " genero = '" + juguete.getGenero() + "',"
                    + " cantidad = " + juguete.getCantidad() + ","
                    + " url1 = '" + juguete.getUrl1() + "',"
                    + " url2 = '" + juguete.getUrl2() + "',"
                    + " url3 = '" + juguete.getUrl3() + "',"
                    + " url4 = '" + juguete.getUrl4() + "',"
                    + " url5 = '" + juguete.getUrl5() + "',"
                    + " url6 = '" + juguete.getUrl6() + "',"
                    + " url7 = '" + juguete.getUrl7() + "',"
                    + " url8 = '" + juguete.getUrl8() + "',"
                    + " url9 = '" + juguete.getUrl9() + "',"
                    + " url10 = '" + juguete.getUrl10() + "',"
                    + " url11 = '" + juguete.getUrl11() + "',"
                    + " url12 = '" + juguete.getUrl12() + "',"
                    + " observacion = '" + juguete.getObservacion() + "',"
                    + " idEmpresa = '" + juguete.getIdEmpresa().getIdEmpresa() + "' "
                    + " WHERE idInventario = " + juguete.getIdInventario() + "";

            st.execute(sql);
            resultado = 1;

        } catch (SQLException e) {
            inventario = new Inventario_TO();
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return resultado;
    }

    @Override
    public int EliminarJuguete(Inventario_TO juguete) throws Exception {
        int resultado = 0;
        try {
            String sql = "DELETE FROM inventario "
                    + "WHERE idInventario = " + juguete.getIdInventario() + "";
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

    /**
     *
     * METODOS PARA CONSULTAR Juguetes con parametros
     *
     * @param edad
     * @param genero
     * @return @throws Exception
     */
    @Override
    public List<Inventario_TO> ConsultarJuguetesEdadGenero(int edad, String genero) throws Exception {

        List<Inventario_TO> juguetes = new ArrayList<>();

        try {
            String sql = "SELECT idInventario, codigo, nombre, descripcion, edadDesde, edadHasta, genero, cantidad, url1, url2, url3, url4, url5, url6, url7, url8, url9, url10, url11, url12, observacion, idEmpresa FROM inventario WHERE edadDesde <= " + edad + "  and " + edad + "  <= edadHasta AND genero in ('A','" + genero + "') ;";
            ResultSet rs = null;
            rs = st.executeQuery(sql);

            while (rs.next()) {
                juguetes.add(new Inventario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), getString(18), rs.getString(19), rs.getString(20), rs.getString(21), new Empresa_TO(rs.getInt(22))));
            }

        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return juguetes;
    }

    /**
     *
     * METODOS PARA CONSULTAR Juguetes con parametros
     *
     * @param desde
     * @param hasta
     * @param genero
     * @return @throws Exception
     */
    @Override
    public List<Inventario_TO> ConsultarJuguetesRangoGenero(int desde, int hasta, String genero) throws Exception {

        List<Inventario_TO> juguetes = new ArrayList<>();

        try {

            String sql = "";
            if (!(genero.equals("A"))) {
                sql = "SELECT idInventario, codigo, nombre, descripcion, edadDesde, edadHasta, genero, cantidad, url1, url2, url3, url4, url5, url6, url7, url8, url9, url10, url11, url12, observacion, idEmpresa FROM inventario WHERE edadDesde >= " + desde + "  and edadHasta <= " + hasta + "  AND genero = 'A' OR genero = '" + genero + "'";
            } else {
                sql = "SELECT idInventario, codigo, nombre, descripcion, edadDesde, edadHasta, genero, cantidad, url1, url2, url3, url4, url5, url6, url7, url8, url9, url10, url11, url12, observacion, idEmpresa FROM inventario WHERE edadDesde >= " + desde + "  and edadHasta <= " + hasta + "";

            }
            ResultSet rs = null;
            rs = st.executeQuery(sql);

            while (rs.next()) {
                juguetes.add(new Inventario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), getString(18), rs.getString(19), rs.getString(20), rs.getString(21), new Empresa_TO(rs.getInt(22))));
            }

        } catch (Exception e) {
            juguetes = new ArrayList<>();
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return juguetes;
    }

    @Override
    public int RegistrarjuguetesComite(Inventario_TO juguete, Comite_TO comite) throws Exception {
        Inventario_TO inventario = new Inventario_TO();
        int resultado = 0;
        try {
            String sql = "INSERT INTO comite_inventario (idComite, idInventario)"
                    + " VALUES ('" + comite.getIdComite() + "',"
                    + " '" + juguete.getIdInventario() + "')";
            st.execute(sql);
            resultado = 1;
        } catch (SQLException e) {
            inventario = new Inventario_TO();
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return resultado;
    }

    @Override
    public List<Inventario_TO> BuscarJuguetes(String valor) throws Exception {
        List<Inventario_TO> inventario = new ArrayList<>();
        try {

            String sql = "SELECT idInventario, codigo, nombre, descripcion, edadDesde, edadHasta, genero, cantidad, url1, url2, url3, url4, url5, url6, url7, url8, url9, url10, url11, url12, observacion, idEmpresa FROM inventario "
                    + "WHERE codigo LIKE '%" + valor + "%' OR nombre LIKE '%" + valor + "%' OR "
                    + "descripcion LIKE '%" + valor + "%' OR  edadDesde LiKE '%" + valor + "%' OR "
                    + "edadHasta LIKE '%" + valor + "%' OR genero LIKE '%" + valor + "%' OR "
                    + "cantidad LIKE '%" + valor + "%' OR observacion LIKE '%" + valor + "%'";
            ResultSet rs = null;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                inventario.add(new Inventario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), getString(18), rs.getString(19), rs.getString(20), rs.getString(21), new Empresa_TO(rs.getInt(22))));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return inventario;
    }

    @Override
    public List<Inventario_TO> ConsultarJuguetesPorEmpresa(int idEmpresa) throws Exception {
        List<Inventario_TO> inventario = new ArrayList<>();
        try {

            String sql = "SELECT idInventario, codigo, nombre, descripcion, edadDesde, edadHasta, genero, cantidad, url1, url2, url3, url4, url5, url6, url7, url8, url9, url10, url11, url12, observacion, idEmpresa FROM inventario"
                    + " where idEmpresa = " + idEmpresa + ";";
            ResultSet rs = null;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                inventario.add(new Inventario_TO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), getString(18), rs.getString(19), rs.getString(20), rs.getString(21), new Empresa_TO(rs.getInt(22))));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return inventario;
    }

    @Override
    public int ActualizarInventario(Inventario_TO juguete) throws Exception {
        int resultado = 0;
        Inventario_TO inv = new Inventario_TO();
        int cantidad = 0;
        try {
            String sql = "SELECT idInventario, cantidad FROM `inventario` where idInventario=" + juguete.getIdInventario() + "";
            ResultSet rs = null;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                inv = new Inventario_TO(rs.getInt(1), rs.getInt(2));
            }

            cantidad = (inv.getCantidad() - juguete.getCantidad());

            System.out.println("-----------------" + inv.getCantidad() + juguete.getCantidad() + cantidad);

            String sql1 = "UPDATE `inventario` SET `cantidad`=" + cantidad + " WHERE idInventario=" + juguete.getIdInventario() + ";";

            st.execute(sql1);
            resultado = 1;

        } catch (SQLException e) {
            resultado = 1;
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return resultado;
    }

    @Override
    public List<Inventario_TO> ConsultarJuguetesEdadGeneroCiudadEmpresa(int idEmpresa, int edad, String genero, int idCiudad) throws Exception {

        List<Inventario_TO> juguetesSeleccion = new ArrayList<>();

        try {
            String sql = "SELECT cc, us.nombre,ci.idCiudad, ci.nombre, ped.nombreHijo, ped.edadHijo, "
                    + " ped.sexoHijo,inv.idInventario, inv.nombre "
                    + " from usuario as us, ciudad as ci, pedido as ped ,inventario as inv, empresa as em  "
                    + "                   where us.idUsuario=ped.idUsuario "
                    + "                   and us.idCiudad=ci.idCiudad "
                    + "                   and ped.idInventario=inv.idInventario "
                    + "                   and ped.idInventario >0 "
                    + "                   and em.idEmpresa=us.idEmpresa "
                    + "                   and us.idEmpresa="+idEmpresa
                    + "                   and ci.idCiudad= "+idCiudad 
                    + "                   and ped.sexoHijo='" + genero 
                    + "'                   and ped.edadHijo= "+ edad 
                    + "                   GROUP BY ped.idInventario, cc, us.nombre,ci.idCiudad, ci.nombre, ped.nombreHijo, ped.edadHijo, "
                    + "						 ped.sexoHijo,inv.idInventario, inv.nombre  "
                    + "						 order by inv.idInventario desc ";
            ResultSet rs = null;
            rs = st.executeQuery(sql);

            while (rs.next()) {
                juguetesSeleccion.add(new Inventario_TO(rs.getInt(8), rs.getString(9), rs.getString(7), new Empresa_TO(new Usuario_TO(new Ciudad_TO(rs.getInt(3), rs.getString(4)), rs.getString(1), rs.getString(2))), new Pedido_TO(rs.getString(5), rs.getInt(6))));
            }

        } catch (Exception e) {
            juguetesSeleccion = new ArrayList<>();
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return juguetesSeleccion;
    }

        
}
