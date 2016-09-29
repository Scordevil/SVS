/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao;

import co.com.salavirtual.modelo.dto.Empresa_TO;
import java.util.List;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad
 * Ciudad
 *
 * @author Cesar
 *
 *
 */
public interface EmpresaDAO {

    public List<Empresa_TO> consultarEmpresas() throws Exception;

    public List<Empresa_TO> consultarEmpresasPorAdministrador(int idUsuario) throws Exception;

    public List<Empresa_TO> consultarEmpresasConComite() throws Exception;

    public Empresa_TO consultarEmpresa(int idNombre, String nombre) throws Exception;

    public int crearEmpresas(String nombre, String direccion, String nit, String telefono, String correo, String urlLogo, String urlBanner, int idUsuario, int comite) throws Exception;

    public int editarEmpresas(int idEmpresa, String nombre, String direccion, String nit, String telefono, String correo, String urlLogo, String urlBanner, int idUsuario, int comite) throws Exception;

    public int eliminarEmpresas(int idEmpresa) throws Exception;

}
