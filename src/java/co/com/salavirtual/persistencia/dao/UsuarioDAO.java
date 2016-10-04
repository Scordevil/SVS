/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao;

import co.com.salavirtual.modelo.dto.Comite_TO;
import co.com.salavirtual.modelo.dto.Tipo_Usuario_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;
import java.util.List;

/**
 *
 * Interfaz que contiene los metodos de persistencia relacionados con la entidad
 * Usuario
 *
 * @author Gustavo Cardenas
 */
public interface UsuarioDAO {

    public int registrarUsuarios(Usuario_TO usuario) throws Exception;

    public int editarUsuario(Usuario_TO usuario) throws Exception;
    
    public int quitarAcceso(int idUsuario) throws Exception;

    public int eliminarUsuario(Usuario_TO usuario) throws Exception;
    
    public Usuario_TO consultarUsuarioPorLogin(Usuario_TO usuario) throws Exception;
    
    public Usuario_TO consultarUsuarioPorCC(String Cc) throws Exception;

    public List<Usuario_TO> consultarUsuarios() throws Exception;
    
    public List<Usuario_TO> consultarUsuariosPorTipoUsuario(Tipo_Usuario_TO tipo) throws Exception;
    
    public List<Usuario_TO> buscarUsuariosPorTipo(String valor, Tipo_Usuario_TO tipo) throws Exception;

    public int RegistrarUsuariosComite(Usuario_TO usuario, Comite_TO comite) throws Exception;
    
    public List<Usuario_TO> consultarUsuariosEmpresa(int idEmpresa) throws Exception;
    
    public List<Usuario_TO> consultarUsuariosEmpresaLike(int idEmpresa , String nombre) throws Exception;
    
    public List<Usuario_TO> consultarUsuariosEmpresaLikeInicio(int idEmpresa , String nombre) throws Exception;

    public List<Usuario_TO> consultarUsuariosEmpresaLikeInicioComite(int idEmpresa , String nombre) throws Exception;
   
}
