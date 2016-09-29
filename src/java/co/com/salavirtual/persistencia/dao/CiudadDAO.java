/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao;

import co.com.salavirtual.modelo.dto.Ciudad_TO;
import co.com.salavirtual.modelo.dto.Departamento_TO;
import java.util.List;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad
 * Ciudad
 *
 * @author SISTEMAS
 */
public interface CiudadDAO {

    public List<Ciudad_TO> consultarCiudades() throws Exception;
    
    public List<Ciudad_TO> consultarCiudadesSegunDepartamento(Departamento_TO departamento) throws Exception;
    
    public Ciudad_TO consultarCiudad(Ciudad_TO ciudad) throws Exception;
    
    

}
