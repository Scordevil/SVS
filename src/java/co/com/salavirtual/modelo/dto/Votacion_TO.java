/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.modelo.dto;

import java.util.Date;

/**
 *
 * @author kira
 */
public class Votacion_TO {

    /**
     *
     * Columna idVotacion
     */
    private int idVotacion;
    /**
     *
     * Columna calificacion
     */
    private String calificacion;
    /**
     *
     * Columna Date fechaCalificacion
     */
    private Date fechaCalificacion;
    /**
     *
     * Columna String fechaCAlificacion
     */
    private String fechaCalificacionString;
    /**
     *
     * Columna idComite
     */
    private Comite_TO idComite;
    /**
     *
     * Columna idInventario
     */
    private Inventario_TO idInventario;
    /**
     *
     * Columna idUsuario
     */
    private Usuario_TO idUsuario;

    //constructores
    public Votacion_TO() {
    }

    public Votacion_TO(int idVotacion) {
        this.idVotacion = idVotacion;
    }

    public Votacion_TO(int idVotacion, String calificacion, Date fechaCalificacion, String fechaCalificacionString, Comite_TO idComite, Inventario_TO idInventario, Usuario_TO idUsuario) {
        this.idVotacion = idVotacion;
        this.calificacion = calificacion;
        this.fechaCalificacion = fechaCalificacion;
        this.fechaCalificacionString = fechaCalificacionString;
        this.idComite = idComite;
        this.idInventario = idInventario;
        this.idUsuario = idUsuario;
    }

    public Votacion_TO(int idVotacion, String calificacion, String fechaCalificacionString, Comite_TO idComite, Inventario_TO idInventario, Usuario_TO idUsuario) {
        this.idVotacion = idVotacion;
        this.calificacion = calificacion;
        this.fechaCalificacionString = fechaCalificacionString;
        this.idComite = idComite;
        this.idInventario = idInventario;
        this.idUsuario = idUsuario;
    }

    //Getters And Setters
    public int getIdVotacion() {
        return idVotacion;
    }

    public void setIdVotacion(int idVotacion) {
        this.idVotacion = idVotacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFechaCalificacion() {
        return fechaCalificacion;
    }

    public void setFechaCalificacion(Date fechaCalificacion) {
        this.fechaCalificacion = fechaCalificacion;
    }

    public String getFechaCalificacionString() {
        return fechaCalificacionString;
    }

    public void setFechaCalificacionString(String fechaCalificacionString) {
        this.fechaCalificacionString = fechaCalificacionString;
    }

    public Comite_TO getIdComite() {
        return idComite;
    }

    public void setIdComite(Comite_TO idComite) {
        this.idComite = idComite;
    }

    public Inventario_TO getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Inventario_TO idInventario) {
        this.idInventario = idInventario;
    }

    public Usuario_TO getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario_TO idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Votacion_TO{" + "idVotacion=" + idVotacion + ", calificacion=" + calificacion + ", fechaCalificacion=" + fechaCalificacion + ", fechaCalificacionString=" + fechaCalificacionString + ", idComite=" + idComite + ", idInventario=" + idInventario + ", idUsuario=" + idUsuario + '}';
    }

}
