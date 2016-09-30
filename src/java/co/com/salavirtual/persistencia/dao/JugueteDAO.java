/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao;

import co.com.salavirtual.modelo.dto.Comite_TO;
import co.com.salavirtual.modelo.dto.Inventario_TO;
import java.util.List;

/**
 *
 * @author cesar
 */
public interface JugueteDAO {

    public List<Inventario_TO> ConsultarJuguetes() throws Exception;

    public List<Inventario_TO> BuscarJuguetes(String valor) throws Exception;
    
    public List<Inventario_TO> ConsultarJuguetesPorComite(int idComite) throws Exception;
    
    public List<Inventario_TO> ConsultarJuguetesPorEmpresa(int idEmpresa) throws Exception;
    
    public Inventario_TO ConsultarJuguete(int idInventario) throws Exception;

    public int CrearJuguete(Inventario_TO juguete) throws Exception;

    public int RegistrarjuguetesComite(Inventario_TO juguete, Comite_TO comite) throws Exception;

    public int EditarJuguete(Inventario_TO juguete) throws Exception;

    public int EliminarJuguete(Inventario_TO juguete) throws Exception;

    public List<Inventario_TO> ConsultarJuguetesEdadGenero(int edad, String genero) throws Exception;
    
    public List<Inventario_TO> ConsultarJuguetesRangoGenero(int desde,int hasta, String genero) throws Exception;

    public int ActualizarInventario(Inventario_TO juguete) throws Exception;
    
    public List<Inventario_TO> ConsultarJuguetesSeleccionEdadGeneroCiudadEmpresa(int idEmpresa, int edad, String genero, int idCiudad) throws Exception;
}
