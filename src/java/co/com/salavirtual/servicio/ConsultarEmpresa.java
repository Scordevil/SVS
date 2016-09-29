/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio;

import co.com.salavirtual.modelo.dto.Empresa_TO;

/**
 *
 * @author VaioDevelopment
 */
public interface ConsultarEmpresa {
   
    public Empresa_TO consultarEmpresa(int idEmpresa, String nombre) throws Exception;
    
}
