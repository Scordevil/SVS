/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.modelo.dto;

import java.util.Date;

/**
 *
 * Objeto de negocios que modela un Comite
 *
 * Tabla Relacionada Comite
 *
 * @author Sistemas
 */
public class Comite_TO {

    /**
     *
     * Columna idComite
     */
    private int idComite;
    /**
     *
     * Columna idEstado
     */
    private Estado_TO idEstado;
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
    /**
     *
     * Columna date fechaApertura
     */
    private Date fechaApertura;
    /**
     *
     * Columna String fechaApertura
     */
    private String fechaAperturaString;
    /**
     *
     * Columna date fechaCierre
     */
    private Date fechaCierre;
    /**
     *
     * Columna fechaApertura
     *
     */
    private String fechaCierreString;

    private Empresa_TO idEmpresa;

    //constructores
    public Comite_TO() {
        this.idComite = 0;
    }

    public Comite_TO(int idComite) {
        this.idComite = idComite;
    }

    public Comite_TO(String nombre, String fechaAperturaString, String fechaCierreString) {
        this.nombre = nombre;
        this.fechaAperturaString = fechaAperturaString;
        this.fechaCierreString = fechaCierreString;
    }

    public Comite_TO(int idComite, Estado_TO idEstado, String nombre, String descripcion, Date fechaApertura, Date fechaCierre, Empresa_TO empresa) {
        this.idComite = idComite;
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.idEmpresa = empresa;
    }

    public Comite_TO(int idComite, Estado_TO idEstado, String nombre, String descripcion, String fechaAperturaString, String fechaCierreString, Empresa_TO empresa) {
        this.idComite = idComite;
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaAperturaString = fechaAperturaString;
        this.fechaCierreString = fechaCierreString;
        this.idEmpresa = empresa;
    }

    public Comite_TO(int idComite, Estado_TO idEstado, String nombre, String descripcion, Date fechaApertura, String fechaAperturaString, Date fechaCierre, String fechaCierreString, Empresa_TO idEmpresa) {
        this.idComite = idComite;
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaApertura = fechaApertura;
        this.fechaAperturaString = fechaAperturaString;
        this.fechaCierre = fechaCierre;
        this.fechaCierre = fechaCierre;
        this.idEmpresa = idEmpresa;
    }


//Getters and Setters
    public int getIdComite() {
        return idComite;
    }

    public void setIdComite(int idComite) {
        this.idComite = idComite;
    }

    public Estado_TO getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Estado_TO idEstado) {
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

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getFechaAperturaString() {
        return fechaAperturaString;
    }

    public void setFechaAperturaString(String fechaAperturaString) {
        this.fechaAperturaString = fechaAperturaString;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getFechaCierreString() {
        return fechaCierreString;
    }

    public void setFechaCierreString(String fechaCierreString) {
        this.fechaCierreString = fechaCierreString;
    }

    public Empresa_TO getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa_TO idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

//to string
    @Override
    public String toString() {
        return "Comite_TO{" + "idComite=" + idComite + ", idEstado=" + idEstado + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechaApertura=" + fechaApertura + ", fechaAperturaString=" + fechaAperturaString + ", fechaCierre=" + fechaCierre + ", fechaCierreString=" + fechaCierreString + ", idEmpresa=" + idEmpresa + '}';
    }

}
