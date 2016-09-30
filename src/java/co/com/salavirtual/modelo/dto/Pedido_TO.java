/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.modelo.dto;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author kira
 */
public class Pedido_TO {

    /**
     *
     * Columna idPedido
     */
    private int idPedido;
    /**
     *
     * Columna idUsuario
     */
    private Usuario_TO idUsuario;
    /**
     *
     * Columna nombreHijo
     */
    private String nombreHijo;
    /**
     *
     * Columna edadHijo
     */
    private int edadHijo;
    /**
     *
     * Columna sexoHijo
     */
    private String sexoHijo;
    /**
     *
     * Columna nombreEncargad
     */
    private String nombreEncargado;
    /**
     *
     * Columna ciudadEncargado
     */
    private String ciudadEncargado;
    /**
     *
     * Columa emailEncargado
     */
    private String emailEncargado;
    /**
     *
     * Columa telefonoEncargado
     */
    private String telefonoEncargado;
    /**
     *
     * Columa Date fechaEntrega
     */
    private Date fechaEntrega;
    /**
     *
     * Columa Date fechaEntrega
     */
    private String fechaEntregaString;

    /**
     *
     * Columa horaEntrega
     */
    private Time horaEntrega;

    /**
     *
     * Columa horaEntrega
     */
    private String horaEntregaString;
    /**
     *
     * Columa DireccionEntrega
     */
    private String direccionEntrega;

    private int idInventario;

    //constructores
    public Pedido_TO() {
    }

    public Pedido_TO(int idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido_TO(int idPedido, int idInventario) {
        this.idPedido = idPedido;
        this.idInventario = idInventario;
    }

    public Pedido_TO(String nombreHijo, int edadHijo) {
        this.nombreHijo = nombreHijo;
        this.edadHijo = edadHijo;
    }

    public Pedido_TO(int idPedido, Usuario_TO idUsuario, String nombreHijo, int edadHijo, String sexoHijo, String nombreEncargado, String ciudadEncargado, String emailEncargado, String telefonoEncargado, Date fechaEntrega, String fechaEntregaString, String horaEntregaString, String direccionEntrega) {
        this.idPedido = idPedido;
        this.idUsuario = idUsuario;
        this.nombreHijo = nombreHijo;
        this.edadHijo = edadHijo;
        this.sexoHijo = sexoHijo;
        this.nombreEncargado = nombreEncargado;
        this.ciudadEncargado = ciudadEncargado;
        this.emailEncargado = emailEncargado;
        this.telefonoEncargado = telefonoEncargado;
        this.fechaEntrega = fechaEntrega;
        this.fechaEntregaString = fechaEntregaString;
        this.horaEntregaString = horaEntregaString;
        this.direccionEntrega = direccionEntrega;
    }

    public Pedido_TO(int idPedido, Usuario_TO idUsuario, String nombreHijo, int edadHijo, String sexoHijo, String nombreEncargado, String ciudadEncargado, String emailEncargado, String telefonoEncargado, String fechaEntregaString, String horaEntregaString, String direccionEntrega) {
        this.idPedido = idPedido;
        this.idUsuario = idUsuario;
        this.nombreHijo = nombreHijo;
        this.edadHijo = edadHijo;
        this.sexoHijo = sexoHijo;
        this.nombreEncargado = nombreEncargado;
        this.ciudadEncargado = ciudadEncargado;
        this.emailEncargado = emailEncargado;
        this.telefonoEncargado = telefonoEncargado;
        this.fechaEntregaString = fechaEntregaString;
        this.horaEntregaString = horaEntregaString;
        this.direccionEntrega = direccionEntrega;
    }

    public Pedido_TO(Usuario_TO idUsuario, String nombreHijo, int edadHijo, String sexoHijo) {
        this.idUsuario = idUsuario;
        this.nombreHijo = nombreHijo;
        this.edadHijo = edadHijo;
        this.sexoHijo = sexoHijo;
    }

    public Pedido_TO(Usuario_TO idUsuario, String nombreHijo, int edadHijo, String sexoHijo, int idInventario) {
        this.idUsuario = idUsuario;
        this.nombreHijo = nombreHijo;
        this.edadHijo = edadHijo;
        this.sexoHijo = sexoHijo;
        this.idInventario = idInventario;
    }

    //Getters And Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Usuario_TO getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario_TO idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreHijo() {
        return nombreHijo;
    }

    public void setNombreHijo(String nombreHijo) {
        this.nombreHijo = nombreHijo;
    }

    public int getEdadHijo() {
        return edadHijo;
    }

    public void setEdadHijo(int edadHijo) {
        this.edadHijo = edadHijo;
    }

    public String getSexoHijo() {
        return sexoHijo;
    }

    public void setSexoHijo(String sexoHijo) {
        this.sexoHijo = sexoHijo;
    }

    public String getNombreEncargado() {
        return nombreEncargado;
    }

    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public String getCiudadEncargado() {
        return ciudadEncargado;
    }

    public void setCiudadEncargado(String ciudadEncargado) {
        this.ciudadEncargado = ciudadEncargado;
    }

    public String getEmailEncargado() {
        return emailEncargado;
    }

    public void setEmailEncargado(String emailEncargado) {
        this.emailEncargado = emailEncargado;
    }

    public String getTelefonoEncargado() {
        return telefonoEncargado;
    }

    public void setTelefonoEncargado(String telefonoEncargado) {
        this.telefonoEncargado = telefonoEncargado;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getFechaEntregaString() {
        return fechaEntregaString;
    }

    public void setFechaEntregaString(String fechaEntregaString) {
        this.fechaEntregaString = fechaEntregaString;
    }

    public Time getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(Time horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getHoraEntregaString() {
        return horaEntregaString;
    }

    public void setHoraEntregaString(String horaEntregaString) {
        this.horaEntregaString = horaEntregaString;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    @Override
    public String toString() {
        return "Pedido_TO{" + "idPedido=" + idPedido + ", idUsuario=" + idUsuario + ", nombreHijo=" + nombreHijo + ", edadHijo=" + edadHijo + ", sexoHijo=" + sexoHijo + ", nombreEncargado=" + nombreEncargado + ", ciudadEncargado=" + ciudadEncargado + ", emailEncargado=" + emailEncargado + ", telefonoEncargado=" + telefonoEncargado + ", fechaEntrega=" + fechaEntrega + ", fechaEntregaString=" + fechaEntregaString + ", horaEntrega=" + horaEntrega + ", horaEntregaString=" + horaEntregaString + ", direccionEntrega=" + direccionEntrega + '}';
    }

}
