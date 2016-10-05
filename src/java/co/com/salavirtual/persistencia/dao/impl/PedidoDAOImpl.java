/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao.impl;

import co.com.salavirtual.conexion.ConexionSQL;
import co.com.salavirtual.config.Config;
import co.com.salavirtual.modelo.dto.Empresa_TO;
import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.modelo.dto.Pedido_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.persistencia.dao.PedidoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.UIManager.getString;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad
 * Usuario
 *
 * @author Gustavo Cardenas
 */
public class PedidoDAOImpl implements PedidoDAO {

    private final Statement st = ConexionSQL.conexion();

    /**
     *
     * METODOS PARA CONSULTAR USUARIOS POR LOGIN
     *
     * @param idUsuario
     * @return @throws Exception
     */
    @Override
    public List<Pedido_TO> consultarPedidosPorId(int idUsuario) throws Exception {
        List<Pedido_TO> pedidos = new ArrayList<>();
        try {
            try {
                String sql = "SELECT `pedido`.`idPedido`, "
                        + "    `pedido`.`idUsuario`, "
                        + "    `pedido`.`nombreHijo`, "
                        + "    `pedido`.`edadHijo`, "
                        + "    `pedido`.`sexoHijo`, "
                        + "    `pedido`.`nombreEncargado`, "
                        + "    `pedido`.`ciudadEncargado`, "
                        + "    `pedido`.`emailEncargado`, "
                        + "    `pedido`.`telefonoEncargado`, "
                        + "    `pedido`.`fechaEntrega`, "
                        + "    `pedido`.`horaEntrega`, "
                        + "    `pedido`.`DireccionEntrega` "
                        + "FROM `salavirtual`.`pedido` as pedido where pedido.idUsuario = " + idUsuario + " and idInventario = 0 ;";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    pedidos.add(new Pedido_TO(rs.getInt(1), new Usuario_TO(rs.getInt(2)), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12)));
                }
            } catch (SQLException e) {
                pedidos = new ArrayList<>();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return pedidos;
    }

    @Override
    public int editarPedido(Pedido_TO pedido) throws Exception {
        int resultado = 0;
        try {
            try {
                String sql = "UPDATE pedido SET  "
                        //                        + "    `nombreEncargado`, "
                        //                        + "    `ciudadEncargado`, "
                        //                        + "    `emailEncargado`, "
                        //                        + "    `telefonoEncargado`, "
                        //                        + "    `fechaEntrega`, "
                        //                        + "    `horaEntrega`, "
                        //                        + "    `DireccionEntrega` "
                        + "    `idInventario` = " + pedido.getIdInventario()
                        + "     where pedido.idPedido = " + pedido.getIdPedido() + ";";

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
    public List<Inventario_TO> consultarMasSeleccionados(int idEmpresa) throws Exception {
        List<Inventario_TO> inventarios = new ArrayList<>();
        try {

            String sql = "SELECT count(pe.idInventario) AS Inventario, pe.idInventario, inv.codigo, inv.nombre, inv.descripcion, inv.edadDesde, inv.edadHasta,\n"
                    + "  inv.genero, inv.cantidad, inv.url1, inv.url2, inv.url3, inv.url4, inv.url5, inv.url6, inv.url7, inv.url8, inv.url9, inv.url10,\n"
                    + "  inv.url11, inv.url12, inv.observacion, inv.idEmpresa "
                    + "FROM pedido as pe, inventario as inv "
                    + "where pe.idInventario = inv.idInventario and inv.idEmpresa = '" + idEmpresa + "' and pe.idInventario > 0 "
                    + "GROUP BY idInventario order by Inventario desc";

            ResultSet rs = null;
            rs = st.executeQuery(sql);
            while (rs.next()) {
                inventarios.add(new Inventario_TO(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getString(8), rs.getInt(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getString(17), rs.getString(18), getString(19), rs.getString(20), rs.getString(21), rs.getString(22), new Empresa_TO(rs.getInt(23))));
            }

        } catch (Exception e) {
            inventarios = new ArrayList<>();
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return inventarios;
    }

    /**
     *
     * METODOS PARA CONSULTAR USUARIOS POR LOGIN
     *
     * @param idPedido
     * @return @throws Exception
     */
    @Override
    public Pedido_TO consultarPedido(int idPedido) throws Exception {
        Pedido_TO pedido = new Pedido_TO();
        try {
            try {
                String sql = "SELECT `pedido`.`idPedido`, "
                        + "    `pedido`.`idUsuario`, "
                        + "    `pedido`.`nombreHijo`, "
                        + "    `pedido`.`edadHijo`, "
                        + "    `pedido`.`sexoHijo`, "
                        + "    `pedido`.`nombreEncargado`, "
                        + "    `pedido`.`ciudadEncargado`, "
                        + "    `pedido`.`emailEncargado`, "
                        + "    `pedido`.`telefonoEncargado`, "
                        + "    `pedido`.`fechaEntrega`, "
                        + "    `pedido`.`horaEntrega`, "
                        + "    `pedido`.`DireccionEntrega` "
                        + "FROM `salavirtual`.`pedido` as pedido where pedido.idPedido = " + idPedido + ";";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    pedido = new Pedido_TO(rs.getInt(1), new Usuario_TO(rs.getInt(2)), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12));
                }
            } catch (SQLException e) {
                pedido = new Pedido_TO();
                throw e;
            }
        } catch (Exception e) {
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return pedido;
    }

    /**
     *
     * METODOS PARA CONSULTAR USUARIOS POR LOGIN
     *
     * @param idUsuario
     * @param nombreHijo
     * @return @throws Exception
     */
    @Override
    public Pedido_TO consultarPedidoPorIdYNombre(int idUsuario, String nombreHijo) throws Exception {
        Pedido_TO pedido = new Pedido_TO();
        try {
            try {
                String sql = "SELECT `pedido`.`idPedido`, "
                        + "    `pedido`.`idUsuario`, "
                        + "    `pedido`.`nombreHijo`, "
                        + "    `pedido`.`edadHijo`, "
                        + "    `pedido`.`sexoHijo`, "
                        + "    `pedido`.`nombreEncargado`, "
                        + "    `pedido`.`ciudadEncargado`, "
                        + "    `pedido`.`emailEncargado`, "
                        + "    `pedido`.`telefonoEncargado`, "
                        + "    `pedido`.`fechaEntrega`, "
                        + "    `pedido`.`horaEntrega`, "
                        + "    `pedido`.`DireccionEntrega` "
                        + "FROM `salavirtual`.`pedido` as pedido where pedido.idUsuario = " + idUsuario + " and pedido.nombreHijo = '" + nombreHijo + "';";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    pedido = new Pedido_TO(rs.getInt(1), new Usuario_TO(rs.getInt(2)), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12));
                }
            } catch (SQLException e) {
                pedido = new Pedido_TO();
                throw e;
            }
        } catch (Exception e) {
            pedido = new Pedido_TO();
            throw e;
        } finally {
            ConexionSQL.CerrarConexion();
        }
        return pedido;
    }

    /**
     *
     * METODOS PARA REGISTRAR USUARIOS
     *
     * @param pedido
     * @return @throws Exception
     */
    @Override
    public int registrarPedido(Pedido_TO pedido) throws Exception {

        Pedido_TO ped = new Pedido_TO();
        int resultado = 0;
        try {
            String sql = "INSERT INTO `salavirtual`.`pedido` "
                    + "(`idUsuario`, "
                    + "`nombreHijo`, "
                    + "`edadHijo`, "
                    + "`sexoHijo`, "
                    + "`idInventario`) "
                    + "VALUES "
                    + "(" + pedido.getIdUsuario().getIdUsuario() + ", '"
                    + pedido.getNombreHijo() + "', "
                    + pedido.getEdadHijo() + ",' "
                    + pedido.getSexoHijo() + "', "
                    + pedido.getIdInventario() + ");";

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

}
