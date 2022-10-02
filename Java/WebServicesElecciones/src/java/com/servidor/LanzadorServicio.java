/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servidor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.xml.ws.Endpoint;

public class LanzadorServicio {

    public final static String urlCalculadoraWS = "http://192.168.1.68:8080/WebServicesElecciones/Conector";

    public static void main(String[] args) {
       Endpoint.publish(urlCalculadoraWS, new Conector());
      System.out.println("Servicio Web en espera en "+urlCalculadoraWS);  
        
   
    }
}
