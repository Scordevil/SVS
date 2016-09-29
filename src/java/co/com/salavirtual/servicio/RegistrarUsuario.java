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
public interface RegistrarUsuario {
    
    public int registrarUsuario(int idEmpresa, int idTipoUsuario, int idCiudad, int idDepartamento, String nombre, int codigoEmpleado, String cc, String telefono, String email, String usuario, String contraseña, String oficina) throws Exception;
    
}
