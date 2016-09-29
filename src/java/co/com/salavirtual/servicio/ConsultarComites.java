/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio;

import co.com.salavirtual.modelo.dto.Comite_TO;
import java.util.List;

/**
 *
 * @author SISTEMAS
 */
public interface ConsultarComites {

    public List<Comite_TO> consultarComite() throws Exception;

}
