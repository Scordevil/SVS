/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.modelo.dto;

/**
 *
 * @author kira
 */
public class Tipo_Usuario_TO {

    /**
     *
     * Columa idTipoUsuario
     */
    private int idTipoUsuario;
    /**
     *
     * Columa nombre
     */
    private String nombre;
    /**
     *
     * Columa descripcion
     */
    private String descripcion;

    //contructores
    public Tipo_Usuario_TO() {
    }

    public Tipo_Usuario_TO(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public Tipo_Usuario_TO(int idTipoUsuario, String nombre, String descripcion) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Tipo_Usuario_TO(int idTipoUsuario, String nombre) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombre = nombre;
    }
    
    

    //Getters And Setters
    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tipo_Usuario_TO{" + "idTipoUsuario=" + idTipoUsuario + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
