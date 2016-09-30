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
public class Empresa_TO {

    /**
     *
     * Columna idEmpresa
     */
    private int idEmpresa;

    /**
     *
     * Columna nombre
     */
    private String nombre;
    /**
     *
     * Columna direccion
     */
    private String direccion;
    /**
     *
     * Columna nit
     */
    private String nit;
    /**
     *
     * Columna telefono
     */
    private String telefono;
    /**
     *
     * Columna correo
     */
    private String correo;
    /**
     *
     * Columna urlLogo
     */
    private String urlLogo;
    /**
     *
     * Columna urlBanner
     */
    private String urlBanner;

    private Usuario_TO idUsuario;

    private int comite;

    //constructores
    public Empresa_TO() {
    }

    public Empresa_TO(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Empresa_TO(Usuario_TO idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Empresa_TO(int idEmpresa, String nombre, String direccion, String nit, String telefono, String correo, String urlLogo, String urlBanner, Usuario_TO usuario, int comite) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = telefono;
        this.correo = correo;
        this.urlLogo = urlLogo;
        this.urlBanner = urlBanner;
        this.idUsuario = usuario;
        this.comite = comite;
    }

    public Empresa_TO(String nombre, String direccion, String nit, String telefono, String correo, String urlLogo, String urlBanner, Usuario_TO usuario, int comite) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = telefono;
        this.correo = correo;
        this.urlLogo = urlLogo;
        this.urlBanner = urlBanner;
        this.idUsuario = usuario;
        this.comite = comite;
    }

    //Getters And Setters
    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public String getUrlBanner() {
        return urlBanner;
    }

    public void setUrlBanner(String urlBanner) {
        this.urlBanner = urlBanner;
    }

    public Usuario_TO getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario_TO idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getComite() {
        return comite;
    }

    public void setComite(int comite) {
        this.comite = comite;
    }

    @Override
    public String toString() {
        return "Empresa_TO{" + "idEmpresa=" + idEmpresa + ", nombre=" + nombre + ", direccion=" + direccion + ", nit=" + nit + ", telefono=" + telefono + ", correo=" + correo + ", urlLogo=" + urlLogo + ", urlBanner=" + urlBanner + ", idUsuario=" + idUsuario + ", comite=" + comite + '}';
    }

}
