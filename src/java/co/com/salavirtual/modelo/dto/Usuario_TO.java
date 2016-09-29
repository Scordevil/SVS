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
public class Usuario_TO {

    /**
     *
     * Columna idUsuario
     */
    private int idUsuario;
    /**
     *
     * Columna idTipoUsuario
     */
    private Tipo_Usuario_TO idTipoUsuario;
    /**
     *
     * columna idCiudad
     */
    private Ciudad_TO idCiudad;
    /**
     *
     * Columna idDepartameno
     */
    private Departamento_TO idDepartamento;

    /**
     *
     * Columna idEmpresa
     */
    private Empresa_TO idEmpresa;
    /**
     *
     * Columna nombre
     */
    private String nombre;
    /**
     *
     * columna codigoEmpleado
     */
    private int codigoEmpleado;
    /**
     *
     * Columna cc
     */
    private String cc;
    /**
     *
     * Columna telefono
     */
    private String telefono;
    /**
     *
     * Columna email
     */
    private String email;
    /**
     *
     * Columna usuario
     */
    private String usuario;
    /**
     *
     * Columna contrasena
     */
    private String contrasena;
    /**
     *
     * Columna oficina
     */
    private String oficina;
    /**
     *
     * Columna areaTrabajo
     */
    private String areaTrabajo;
    
    private Comite_TO comite;
   
   
   

    //constructores
    
    
   

    public Usuario_TO(Empresa_TO idEmpresa, String nombre) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
    }

    public Usuario_TO() {
    }

    public Usuario_TO(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario_TO(int idUsuario, Tipo_Usuario_TO idTipoUsuario, Ciudad_TO idCiudad, Departamento_TO idDepartamento, Empresa_TO idEmpresa, String nombre, int codigoEmpleado, String cc, String telefono, String email, String usuario, String contrasena, String oficina, String areaTrabajo) {
        this.idUsuario = idUsuario;
        this.idTipoUsuario = idTipoUsuario;
        this.idCiudad = idCiudad;
        this.idDepartamento = idDepartamento;
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.cc = cc;
        this.telefono = telefono;
        this.email = email;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.oficina = oficina;
        this.areaTrabajo = areaTrabajo;              
    }

    public Usuario_TO(int idUsuario, String nombre, String email, Comite_TO comite) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.comite = comite;
    }

    public Usuario_TO(Tipo_Usuario_TO idTipoUsuario, Ciudad_TO idCiudad, Departamento_TO idDepartamento, Empresa_TO idEmpresa, String nombre, int codigoEmpleado, String cc, String telefono, String email, String usuario, String oficina) {
        this.idTipoUsuario = idTipoUsuario;
        this.idCiudad = idCiudad;
        this.idDepartamento = idDepartamento;
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.cc = cc;
        this.telefono = telefono;
        this.email = email;
        this.usuario = usuario;
        this.oficina = oficina;
           
    }

    
    
    public Usuario_TO(Tipo_Usuario_TO idTipoUsuario, Ciudad_TO idCiudad, Departamento_TO idDepartamento, Empresa_TO idEmpresa, String nombre, int codigoEmpleado, String cc, String telefono, String email, String usuario, String contrasena, String oficina, String areaTrabajo) {
        this.idTipoUsuario = idTipoUsuario;
        this.idCiudad = idCiudad;
        this.idDepartamento = idDepartamento;
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.cc = cc;
        this.telefono = telefono;
        this.email = email;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.oficina = oficina;
        this.areaTrabajo = areaTrabajo;            
    }    

    
    public Usuario_TO(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }  
 
       
    //Getters and Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Tipo_Usuario_TO getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Tipo_Usuario_TO idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public Ciudad_TO getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Ciudad_TO idCiudad) {
        this.idCiudad = idCiudad;
    }

    public Departamento_TO getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Departamento_TO idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public Empresa_TO getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa_TO idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Comite_TO getComite() {
        return comite;
    }

    public void setComite(Comite_TO comite) {
        this.comite = comite;
    }

    
    @Override
    public String toString() {
        return "Usuario_TO{" + "idUsuario=" + idUsuario + ", idTipoUsuario=" + idTipoUsuario + ", idCiudad=" + idCiudad + ", idDepartamento=" + idDepartamento + ", idEmpresa=" + idEmpresa + ", nombre=" + nombre + ", codigoEmpleado=" + codigoEmpleado + ", cc=" + cc + ", telefono=" + telefono + ", email=" + email + ", usuario=" + usuario + ", contrasena=" + contrasena + ", oficina=" + oficina + ", areaTrabajo=" + areaTrabajo + '}';
    }

  
    

    
    
    
    

    

}
