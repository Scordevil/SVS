/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao;

import co.com.salavirtual.modelo.dto.Comite_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import java.util.List;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad
 * Ciudad
 *
 * @author cesar
 */
public interface ComiteDAO {

    public List<Comite_TO> consultarComite() throws Exception;

    public Comite_TO consultarComite(Comite_TO comite) throws Exception;

    public int crearComite(int idEstado, String nombre, String descripcion, String fechaApertura, String fechaCierre, int idEmpresa) throws Exception;

    public int editarComite(int idComite, int idEstado, String nombre, String descripcion, String fechaApertura, String fechaCierre, int idEmpresa) throws Exception;

    public int eliminarComite(int idComite) throws Exception;

    public int consultarComitePorUsuario(int idUsuario) throws Exception;

    public List<Comite_TO> consultarComitesPorUsuario(int idUsuario) throws Exception;
    
}
