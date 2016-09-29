/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.servicio;

/**
 *
 * @author CristianCamilo
 */
public interface CrearJuguete {
    
     public int Crearjuguete(String codigo, String nombre, String descripcion, int edadDesde, int edadHasta,
            String genero, int cantidad, String url1, String url2, String url3, String url4, String url5, String url6,
            String url7, String url8, String url9, String url10, String url11, String url12, String observacion, int idEmpresa) throws Exception;

}
