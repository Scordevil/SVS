/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio;

import co.com.salavirtual.modelo.dto.Inventario_TO;
import java.util.List;

/**
 *
 * @author CristianCamilo
 */
public interface BuscarJuguetes {

    public List<Inventario_TO> buscarJuguetes(String valor) throws Exception;

}
