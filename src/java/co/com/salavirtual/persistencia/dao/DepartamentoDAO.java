/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao;

import co.com.salavirtual.modelo.dto.Departamento_TO;
import java.util.List;

/**
 *
 * @author VaioDevelopment
 */
public interface DepartamentoDAO {
    
    public List<Departamento_TO> consultarDepartamentos() throws Exception;
    
    public Departamento_TO consultarDepartamento(Departamento_TO departamento) throws Exception;
    
}
