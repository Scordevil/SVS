/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao;

import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import co.com.salavirtual.modelo.dto.Votacion_TO;
import java.util.List;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad
 * Votacion
 *
 * @author SISTEMAS
 */
public interface VotacionDAO {

    public List<Votacion_TO> consultarVotacion() throws Exception;

    public int crearVotacion(int idUsuario, int idInventario, int idComite, String fechaCalificacion, String descripcion) throws Exception;

    public int validarVotacionPorUsuario(int idUsuario) throws Exception;
    
    public List<Usuario_TO> validarQuienVoto(int idComite) throws Exception;
    
    public List<Usuario_TO> validarQuienNoVoto(int idComite) throws Exception;
    
    public int consultarIdJugueteMasVotado() throws Exception;
    
     public List<Inventario_TO> consultarJuguetesMasVotados(int idEmpresa) throws Exception;
    
    
    

}
