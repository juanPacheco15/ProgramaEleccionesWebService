/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servidor;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.swing.JOptionPane;

@WebService(serviceName = "Conector")
public class Conector {

    MySQL_Conexion mysql = new MySQL_Conexion();

    //Java
    @WebMethod(operationName = "insertarCiudadano")
    public void insertarCiudadano(
            @WebParam(name = "claveElectoral") String claveElector,
            @WebParam(name = "nombreCiudadano") String nombre,
            @WebParam(name = "apellidoPaterno") String apellidoPaterno,
            @WebParam(name = "apellidoMaterno") String apellidoMaterno,
            @WebParam(name = "domicilio") String domicilio,
            @WebParam(name = "seccion") String seccion,
            @WebParam(name = "vigencia") String vigencia) throws RemoteException {

        mysql.insertar_ciudadano(claveElector, nombre, apellidoPaterno, apellidoMaterno, domicilio, seccion, vigencia);

    }

    @WebMethod(operationName = "insertarVotante")
    public void insertarVotante(@WebParam(name = "claveElector") String claveElector) {
        mysql.insertarVotante(claveElector);
    }

    @WebMethod(operationName = "mostrarDatos")
    public String mostrarDatos() {
        return mysql.mostrarDatos();
    }

    @WebMethod(operationName = "verificarCiudadano")
    public String verificarCiudadano(@WebParam(name = "claveElector") String claveElector) {
        return mysql.verificarCiudadano(claveElector);
    }

    @WebMethod(operationName = "verificarVotante")
    public String verificarVotante(@WebParam(name = "claveElector") String claveElector) {
        return mysql.verificarVotante(claveElector);
    }

    @WebMethod(operationName = "verificarVoto")
    public Boolean verificarVoto(@WebParam(name = "claveElector") String claveElector) {
        return mysql.verificarVoto(claveElector);
    }

    @WebMethod(operationName = "eliminarCiudadno")
    public void eliminarCiudadano(String claveElector) {
        mysql.eliminarCiudano(claveElector);
    }

    @WebMethod(operationName = "eliminarVotante")
    public void eliminarVotante(String claveElector) {
        mysql.eliminarVotante(claveElector);
    }

    @WebMethod(operationName = "actualizarCiudadano")
    public void actualizarCiudadano(
            @WebParam(name = "claveElectoralId") String claveElectorId,
            @WebParam(name = "claveElectoral") String claveElector,
            @WebParam(name = "nombreCiudadano") String nombre,
            @WebParam(name = "apellidoPaterno") String apellidoPaterno,
            @WebParam(name = "apellidoMaterno") String apellidoMaterno,
            @WebParam(name = "domicilio") String domicilio,
            @WebParam(name = "seccion") String seccion,
            @WebParam(name = "vigencia") String vigencia) throws RemoteException {

        mysql.actualizarCiudadano(claveElectorId, claveElector, nombre, apellidoPaterno, apellidoMaterno, domicilio, seccion, vigencia);

    }

    @WebMethod(operationName = "mostrarDatosCiudadanoEspecifico")
    public String mostrarDatosCiudadanoEspecifico(@WebParam(name = "claveElector") String claveElector) {
        return mysql.mostrarDatosCiudadanoEspecifico(claveElector);
    }

    @WebMethod(operationName = "mostrarCandidatosParaVotantes")
    public String mostrarCandidatosParaVotantes() {

        return mysql.datosCandidatosParaVotantes();
    }

    @WebMethod(operationName = "contarCandidatos")
    public String contadorCandidatos() {

        return mysql.contarCandidatos();
    }

    @WebMethod(operationName = "insertarUrna")
    public void insertarUrna(@WebParam(name = "idCandidato") String idCandidato, @WebParam(name = "votosTotales") String votosTotales) {
        mysql.insertarUrna(idCandidato, votosTotales);
    }

    @WebMethod(operationName = "obtenerVotosTotalesCandidato")
    public String obtenerVotosTotalesCandidato(@WebParam(name = "claveElector") String claveElector) {
        return mysql.obtenerVotosTotalesCandidato(claveElector);
    }

    @WebMethod(operationName = "verificarCandidatoSiEsta")
    public String verificarCandidatoSiEsta(@WebParam(name = "claveElector") String claveElector) {
        return mysql.verificarCandidatoSiEsta(claveElector);
    }

    @WebMethod(operationName = "obtenerIdCandidato")
    public String obtenerIdCandidato(@WebParam(name = "claveElector") String claveElector) {
        return mysql.obtenerIdCandidato(claveElector);
    }

    @WebMethod(operationName = "actualizarUrna")
    public void actualizarUrna(@WebParam(name = "idCandidato") String idCandidato, @WebParam(name = "votosTotales") String votosTotales) {
        mysql.actualizarUrna(idCandidato, votosTotales);
    }

    @WebMethod(operationName = "actualizarVotante")
    public void actualizarVotante(@WebParam(name = "voto") String voto, @WebParam(name = "claveElector") String claveElector) {
        mysql.actualizarVotante(voto, claveElector);
    }

    // C#
    @WebMethod(operationName = "candidatos")
    public String candidatos(@WebParam(name = "claveElectoral") String claveElectoral) throws RemoteException {
        return mysql.datoCiudadano(claveElectoral);
    }

    @WebMethod(operationName = "mostrarCandidatos")
    public String mostrarCandidatos() throws RemoteException {
        return mysql.datosCandidatos();
    }

    @WebMethod(operationName = "insertarCandidato")
    public void insertarCandidato(@WebParam(name = "claveElectoral") String claveElectoral,
            @WebParam(name = "partido") String partido) throws RemoteException {

        mysql.insertarCandidatos(claveElectoral, partido);

    }

    @WebMethod(operationName = "eliminarCandidato")
    public void eliminarCandidato(@WebParam(name = "idCandidato") int idCandidato) throws RemoteException {

        mysql.eliminarCandidatos(idCandidato);

    }

    @WebMethod(operationName = "modificarCandidato")
    public void modificarCandidato(@WebParam(name = "idCandidato") int idCandidato,
            @WebParam(name = "partido") String partido) throws RemoteException {

        mysql.modificarCandidatos(idCandidato, partido);

    }

    //python
    @WebMethod(operationName = "consultaVotantes")
    public String consultaVotantes() {
        return mysql.consultaVotantes();
    }

    @WebMethod(operationName = "consultarUrnaCandidatos")
    public String consultarUrnaCandidatos() {
        return mysql.consultarUrnaCandidatos();
    }

}
