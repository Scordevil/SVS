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
public class Departamento_TO {

    /**
     *
     * Columna idDepartamento
     */
    private int idDepartamento;
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
    //constructores

    public Departamento_TO() {
    }

    
    //Getters And Setters

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public Departamento_TO(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Departamento_TO(int idDepartamento, String nombre, String descripcion) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
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
        return "Departamento_TO{" + "idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }

    

}
