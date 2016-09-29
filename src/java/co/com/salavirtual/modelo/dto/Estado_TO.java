/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.modelo.dto;

/**
 *
 * @author SISTEMAS
 */
public class Estado_TO {

    /**
     *
     * Columna idEstado
     */
    private int idEstado;
    /**
     *
     * Columna nombre
     */
    private String nombre;
    /**
     *
     * Columna descripcion
     */
    private String descripcion;

    //costrctores
    public Estado_TO() {
    }

    public Estado_TO(int idEstado) {
        this.idEstado = idEstado;
    }

    public Estado_TO(int idEstado, String nombre, String descripcion) {
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    //Getters and Setters

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
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
        return "Estado_TO{" + "idEstado=" + idEstado + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

}
