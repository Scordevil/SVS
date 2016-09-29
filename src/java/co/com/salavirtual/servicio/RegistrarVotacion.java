/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio;

/**
 *
 * @author cesar
 */
public interface RegistrarVotacion {

    public int crearVotacion(int idUsuario, int idInventario, int idComite, String fechaCalificacion, String descripcion) throws Exception;

}
