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
public class Comite_usuario_TO {

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
     * Columna IdUsuario
     */
    private Usuario_TO idUsuario;

    //costructores
    public Comite_usuario_TO() {
    }

    public Comite_usuario_TO(int idComite) {
        this.idComite = idComite;
    }

    public Comite_usuario_TO(int idComite, Estado_TO idEstado, Usuario_TO idUsuario) {
        this.idComite = idComite;
        this.idEstado = idEstado;
        this.idUsuario = idUsuario;
    }
    //Getters And Setters

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

    public Usuario_TO getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario_TO idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Comite_usuario_TO{" + "idComite=" + idComite + ", idEstado=" + idEstado + ", idUsuario=" + idUsuario + '}';
    }

}
