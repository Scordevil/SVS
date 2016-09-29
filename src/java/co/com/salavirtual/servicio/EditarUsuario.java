/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio;

/**
 *
 * @author VaioDevelopment
 */
public interface EditarUsuario {
    
    public int editarUsuario(int idUsuario, int idEmpresa, int idTipoUsuario, int idCiudad, int idDepartamento, String nombre, int codigoEmpleado, String cc, String telefono, String email, String contrasena, String usuario, String oficina, String areaTrabajo) throws Exception;
}
