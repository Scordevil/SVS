/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Jose
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method. It is automatically
     * populated with all resources defined in the project. If required, comment
     * out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.com.salavirtual.servicio.impl.ActualizarInventarioImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.BuscarJugueteGeneroImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.BuscarUsuarioPorTipo.class);
        resources.add(co.com.salavirtual.servicio.impl.BuscarjuguetesImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarCiudadImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarCiudadesImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarCiudadesSegunDepartamentoImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarComiteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarComitePorUsuarioImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarComitesImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarComitesPorUsuarioImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarDepartamentoImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarDepartamentosImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarEmpresaImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarEmpresasConComiteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarEmpresasImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarEmpresasPorAdministradorImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarEstadoImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarIdJugueteMasVotadoImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarInventarioPorComiteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarInventarioRangoGeneroImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarJugueteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarJuguetesEdadGeneroCiudadEmpresaImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarJuguetesImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarJuguetesMasSeleccionadosImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarJuguetesMasVotadosImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarJuguetesPorEmpresaImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarPedidoImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarPedidoPorIdYNombreImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarPedidosPorIdImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarTipoUsuarioImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarTipoUsuariosImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarTipoUsuariosRestringidosImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarUsuarioImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarUsuarioPorCCImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarUsuarioPorLoginImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarUsuariosEmpresaLikeImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarUsuariosEmpresaLikeInicioComiteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarUsuariosEmpresaLikeInicioImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarUsuariosPorEmpresaImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ConsultarUsuariosPorTipoUsuarioImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.CorreoConfirmacionSeleccionJugueteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.CorreoCreacionAdministradorImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.CorreoCreacionComiteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.CorreoSeleccionJugueteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.CorreoVotacionImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.CrearJugueteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.EditarComiteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.EditarEmpresasImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.EditarJugueteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.EditarPedidoImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.EditarUsuarioImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.EliminarComiteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.EliminarEmpresasImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.EliminarJugueteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.EliminarUsuarioImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.EnviarMensajeBienvenidoImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.QuitarAccesoImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.RegistrarComiteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.RegistrarEmpresasImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.RegistrarJuguetesComiteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.RegistrarPedidoImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.RegistrarUsuarioImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.RegistrarUsuariosComiteImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.RegistrarVotacionImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ValidarQuienNoVotoImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ValidarQuienVotoImpl.class);
        resources.add(co.com.salavirtual.servicio.impl.ValidarVotacionPorUsuarioImpl.class);
    }

}
