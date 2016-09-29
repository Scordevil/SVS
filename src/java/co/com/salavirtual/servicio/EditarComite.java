/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio;

/**
 *
 * @author Gustavo Cardenas
 */
public interface EditarComite {

    public int editarComite(int idComite, int idEstado, String nombre, String descripcion, String fechaApertura, String fechaCierre, int idEmpresa) throws Exception;

}
