/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.modelo.dto;

/**
 *
 * Objeto de negocios que modela una Ciudad
 *
 * Tabla Relacionada Ciudad
 *
 * @author Sistema
 */
public class Ciudad_TO {

    /**
     *
     * Columna idCiudad
     */
    private int idCiudad;

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
    private Departamento_TO idDepartamento;

    //Constructores
    public Ciudad_TO() {
    }

    public Ciudad_TO(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Ciudad_TO(int idCiudad, String nombre, String descricion, Departamento_TO departamento) {
        this.idCiudad = idCiudad;
        this.nombre = nombre;
        this.descripcion = descricion;
        this.idDepartamento = departamento;
    }

    //Getters and Setters
    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
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

    public Departamento_TO getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento_TO idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public String toString() {
        return "Ciudad_TO{" + "idCiudad=" + idCiudad + ", nombre=" + nombre + ", descripcion=" + descripcion + ", idDepartamento=" + idDepartamento + '}';
    }
    
   

}
