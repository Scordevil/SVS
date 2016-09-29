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
public class Comite_inventario_TO {

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
     * Columna idInventario
     */
    private Inventario_TO idInventario;

    //constructores
    public Comite_inventario_TO() {
    }

    public Comite_inventario_TO(int idComite) {
        this.idComite = idComite;
    }

    public Comite_inventario_TO(int idComite, Estado_TO idEstado, Inventario_TO idInventario) {
        this.idComite = idComite;
        this.idEstado = idEstado;
        this.idInventario = idInventario;
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

    public Inventario_TO getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Inventario_TO idInventario) {
        this.idInventario = idInventario;
    }

    @Override
    public String toString() {
        return "Comite_inventario_TO{" + "idComite=" + idComite + ", idEstado=" + idEstado + ", idInventario=" + idInventario + '}';
    }

}
