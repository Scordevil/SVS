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
public class Inventario_TO {

    /**
     *
     * Columna idInventario
     */
    private int idInventario;
    /**
     *
     * Columna codigo
     */
    private String codigo;
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
     * Columna edadDesde
     */
    private int edadDesde;
    /**
     *
     * Columna edadHasta
     */
    private int edadHasta;
    /**
     *
     * Columna genero
     */
    private String genero;
    /**
     *
     * columna cantidad
     */
    private int cantidad;
    /**
     *
     * Columna url1
     */
    private String url1;
    /**
     *
     * Columa url2
     */
    private String url2;
    /**
     *
     * Columa url3
     */
    private String url3;
    /**
     *
     * Columa url4
     */
    private String url4;
    /**
     *
     * Columa url5
     */
    private String url5;
    /**
     *
     * Columa url6
     */
    private String url6;
    /**
     *
     * Columa url7
     */
    private String url7;
    /**
     *
     * Columa url8
     */
    private String url8;
    /**
     *
     * Columa url9
     */
    private String url9;
    /**
     *
     * Columa url10
     */
    private String url10;
    /**
     *
     * Columa url11
     */
    private String url11;
    /**
     *
     * Columa url2
     */
    private String url12;
    /**
     *
     * Columna observacion
     */
    private String observacion;

    /**
     *
     * Columna Suma
     */
    private int sumatoria;

    private Empresa_TO idEmpresa;

    //constructores

    public Inventario_TO(int idInventario, int cantidad) {
        this.idInventario = idInventario;
        this.cantidad = cantidad;
    }
    
    
    public Inventario_TO() {
    }

    public Inventario_TO(int idInventario) {
        this.idInventario = idInventario;
    }
    
    

    public Inventario_TO(int idInventario, String codigo, String nombre, String descripcion, int edadDesde, int edadHasta, String genero, int cantidad, String url1, String url2, String url3, String url4, String url5, String url6, String url7, String url8, String url9, String url10, String url11, String url12, String observacion, Empresa_TO idEmpresa) {
        this.idInventario = idInventario;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.edadDesde = edadDesde;
        this.edadHasta = edadHasta;
        this.genero = genero;
        this.cantidad = cantidad;
        this.url1 = url1;
        this.url2 = url2;
        this.url3 = url3;
        this.url4 = url4;
        this.url5 = url5;
        this.url6 = url6;
        this.url7 = url7;
        this.url8 = url8;
        this.url9 = url9;
        this.url10 = url10;
        this.url11 = url11;
        this.url12 = url12;
        this.observacion = observacion;
        this.idEmpresa = idEmpresa;
    }

    public Inventario_TO(int idInventario, String codigo, String nombre, String descripcion, int edadDesde, int edadHasta, String genero, int cantidad, String url1, String url2, String url3, String url4, String url5, String url6, String url7, String url8, String url9, String url10, String url11, String url12, String observacion, int sumatoria, Empresa_TO idEmpresa) {
        this.idInventario = idInventario;
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.edadDesde = edadDesde;
        this.edadHasta = edadHasta;
        this.genero = genero;
        this.cantidad = cantidad;
        this.url1 = url1;
        this.url2 = url2;
        this.url3 = url3;
        this.url4 = url4;
        this.url5 = url5;
        this.url6 = url6;
        this.url7 = url7;
        this.url8 = url8;
        this.url9 = url9;
        this.url10 = url10;
        this.url11 = url11;
        this.url12 = url12;
        this.observacion = observacion;
        this.sumatoria = sumatoria;
        this.idEmpresa = idEmpresa;
    }   
    

    public Inventario_TO(String codigo, String nombre, String descripcion, int edadDesde, int edadHasta, String genero, int cantidad, String url1, String url2, String url3, String url4, String url5, String url6, String url7, String url8, String url9, String url10, String url11, String url12, String observacion, Empresa_TO idEmpresa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.edadDesde = edadDesde;
        this.edadHasta = edadHasta;
        this.genero = genero;
        this.cantidad = cantidad;
        this.url1 = url1;
        this.url2 = url2;
        this.url3 = url3;
        this.url4 = url4;
        this.url5 = url5;
        this.url6 = url6;
        this.url7 = url7;
        this.url8 = url8;
        this.url9 = url9;
        this.url10 = url10;
        this.url11 = url11;
        this.url12 = url12;
        this.observacion = observacion;
        this.idEmpresa = idEmpresa;
    }

    //Getters And Setters
    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public int getEdadDesde() {
        return edadDesde;
    }

    public void setEdadDesde(int edadDesde) {
        this.edadDesde = edadDesde;
    }

    public int getEdadHasta() {
        return edadHasta;
    }

    public void setEdadHasta(int edadHasta) {
        this.edadHasta = edadHasta;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getUrl1() {
        return url1;
    }

    public void setUrl1(String url1) {
        this.url1 = url1;
    }

    public String getUrl2() {
        return url2;
    }

    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    public String getUrl3() {
        return url3;
    }

    public void setUrl3(String url3) {
        this.url3 = url3;
    }

    public String getUrl4() {
        return url4;
    }

    public void setUrl4(String url4) {
        this.url4 = url4;
    }

    public String getUrl5() {
        return url5;
    }

    public void setUrl5(String url5) {
        this.url5 = url5;
    }

    public String getUrl6() {
        return url6;
    }

    public void setUrl6(String url6) {
        this.url6 = url6;
    }

    public String getUrl7() {
        return url7;
    }

    public void setUrl7(String url7) {
        this.url7 = url7;
    }

    public String getUrl8() {
        return url8;
    }

    public void setUrl8(String url8) {
        this.url8 = url8;
    }

    public String getUrl9() {
        return url9;
    }

    public void setUrl9(String url9) {
        this.url9 = url9;
    }

    public String getUrl10() {
        return url10;
    }

    public void setUrl10(String url10) {
        this.url10 = url10;
    }

    public String getUrl11() {
        return url11;
    }

    public void setUrl11(String url11) {
        this.url11 = url11;
    }

    public String getUrl12() {
        return url12;
    }

    public void setUrl12(String url12) {
        this.url12 = url12;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Empresa_TO getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa_TO idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(int sumatoria) {
        this.sumatoria = sumatoria;
    }
    
    

    @Override
    public String toString() {
        return "Inventario_TO{" + "idInventario=" + idInventario + ", codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", edadDesde=" + edadDesde + ", edadHasta=" + edadHasta + ", genero=" + genero + ", cantidad=" + cantidad + ", url1=" + url1 + ", url2=" + url2 + ", url3=" + url3 + ", url4=" + url4 + ", url5=" + url5 + ", url6=" + url6 + ", url7=" + url7 + ", url8=" + url8 + ", url9=" + url9 + ", url10=" + url10 + ", url11=" + url11 + ", url12=" + url12 + ", observacion=" + observacion + ", idEmpresa=" + idEmpresa + '}';
    }

}
