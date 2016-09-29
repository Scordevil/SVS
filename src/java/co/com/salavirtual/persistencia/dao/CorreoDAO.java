/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.salavirtual.persistencia.dao;

import co.com.salavirtual.modelo.dto.Empresa_TO;
import co.com.salavirtual.modelo.dto.Inventario_TO;
import co.com.salavirtual.modelo.dto.Pedido_TO;
import co.com.salavirtual.modelo.dto.Usuario_TO;

/**
 *
 * @author Desarrollo_Planit
 */
public interface CorreoDAO {

       
    public int enviarMensajeBienvenido();
    
    public int correoCreacionAdministrador(Usuario_TO usuario, Empresa_TO empresa);
    public int correoCreacionComite(Usuario_TO usuario, Empresa_TO empresa);
    public int correoVotacion(Usuario_TO usuario, Empresa_TO empresa);
    public int correoConfirmacionSeleccionJuguete(Usuario_TO usuario,  Inventario_TO inventario,  Pedido_TO pedido);
    public int correoSeleccionJuguete(Usuario_TO usuario,  Empresa_TO empresa);
    
    
}
