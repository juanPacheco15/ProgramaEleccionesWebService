package com.servidor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySQL_Conexion {

    public String verificarCiudadano(String claveElector) {
        String Result = "No se encontro";
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "select*from ciudadanos WHERE claveElector='" + claveElector + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                String nom = rs.getString("claveElector");
                Result = nom;
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Result;
    }

    public String verificarVotante(String claveElector) {
        String Result = "No se encontro";
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "select*from ciudadanos WHERE claveElector='" + claveElector + "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                Result = rs.getString("vigencia");
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Result;
    }

    public boolean verificarVoto(String claveElector) {
        Boolean Result = false;
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "select voto from votantes inner join ciudadanos on ciudadanos.claveElector=claveElectorForaneaVotante where claveElectorForaneaVotante='" + claveElector + "';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                Result = rs.getBoolean("voto");
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Result;
    }

    public void insertar_ciudadano(String claveElector, String nombre, String apellidoPaterno,
            String apellidoMaterno,
            String domicilio, String seccion, String vigencia) {

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query1 = "insert into ciudadanos values('"
                    + claveElector + "','"
                    + nombre + "','"
                    + apellidoPaterno + "','"
                    + apellidoMaterno + "','"
                    + domicilio + "','"
                    + seccion + "','"
                    + vigencia + "')";

            Statement st = con.createStatement();
            st.executeUpdate(query1);
            st.close();
        } catch (Exception e) {

        }
    }

    public void insertarVotante(String claveElector) {
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query1 = "insert into votantes values(null,"
                    + "'" + claveElector + "',"
                    + "false);";

            Statement st = con.createStatement();
            st.executeUpdate(query1);
            st.close();
        } catch (Exception e) {

        }
    }

    public void eliminarVotante(String claveElector) {
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query1 = "delete from votantes where claveElectorForaneaVotante='" + claveElector + "';";
            Statement st = con.createStatement();
            st.executeUpdate(query1);
            st.close();
        } catch (Exception e) {

        }
    }

    public String mostrarDatosCiudadanoEspecifico(String claveElector) {

        String resultado = "";

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT*FROM ciudadanos where claveElector='" + claveElector + "';";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                resultado
                        += rs.getString("claveElector") + "-" + //claveElector
                        rs.getString("nombreCiudadano") + "-" +//nombreCiudado
                        rs.getString("apellidoPaternoCiudadano") + "-" +// apellidoPaternoCiudado
                        rs.getString("apellidoMaternoCiudadano") + "-" +//apellidoMaternoCiudado
                        rs.getString("domicilio") + "-" +//domicilio
                        rs.getString("seccion") + "-" +//seccion
                        rs.getString("vigencia");//vigencia

            }

            st.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return resultado;
    }

    public String mostrarDatos() {

        String resultado = "";

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT*FROM ciudadanos";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                resultado
                        += rs.getString("claveElector") + "-" + //claveElector
                        rs.getString("nombreCiudadano") + "-" +//nombreCiudado
                        rs.getString("apellidoPaternoCiudadano") + "-" +// apellidoPaternoCiudado
                        rs.getString("apellidoMaternoCiudadano") + "-" +//apellidoMaternoCiudado
                        rs.getString("domicilio") + "-" +//domicilio
                        rs.getString("seccion") + "-" +//seccion
                        rs.getString("vigencia")//vigencia
                        + "/";

            }

            st.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return resultado;
    }

    public void eliminarCiudano(String claveElector) {
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "delete from ciudadanos where claveElector='" + claveElector + "';";
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void actualizarCiudadano(
            String claveElectorId,
            String claveElector,
            String nombre, String apellidoPaterno,
            String apellidoMaterno,
            String domicilio, String seccion, String vigencia) {

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "UPDATE `ciudadanos` SET "
                    + "`claveElector`='" + claveElector + "'"
                    + ",`nombreCiudadano`='" + nombre + "'"
                    + ",`apellidoPaternoCiudadano`='" + apellidoPaterno + "'"
                    + ",`apellidoMaternoCiudadano`='" + apellidoMaterno + "'"
                    + ",`domicilio`='" + domicilio + "'"
                    + ",`seccion`='" + seccion + "'"
                    + ",`vigencia`='" + vigencia + "'"
                    + " WHERE claveElector='" + claveElectorId + "'";

            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void actualizarVotante(String voto, String claveElector) {

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "update votantes  inner join ciudadanos on ciudadanos.claveElector=claveElectorForaneaVotante set voto=" + voto + " where claveElectorForaneaVotante='" + claveElector + "';";
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String datosCandidatosParaVotantes() {

        String resultado = "";
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT candidatos.claveElectorForaneaCandidato,ciudadanos.nombreCiudadano,ciudadanos.apellidoPaternoCiudadano,ciudadanos.apellidoMaternoCiudadano from candidatos inner join ciudadanos on ciudadanos.claveElector=claveElectorForaneaCandidato;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                resultado += rs.getString("claveElectorForaneaCandidato") + "-"
                        + rs.getString("nombreCiudadano") + "-"
                        + rs.getString("apellidoPaternoCiudadano") + "-"
                        + rs.getString("apellidoMaternociudadano") + "/";
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    public String contarCandidatos() {
        String resultado = "";
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT count(*) from candidatos inner join ciudadanos on ciudadanos.claveElector=claveElectorForaneaCandidato;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                resultado = rs.getString(1);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    public void insertarUrna(String idCandidato, String votosTotales) {
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query1 = "insert into urna values(null,"
                    + "'" + idCandidato + "',"
                    + "'" + votosTotales + "');";

            Statement st = con.createStatement();
            st.executeUpdate(query1);
            st.close();
        } catch (Exception e) {

        }
    }

    public String obtenerVotosTotalesCandidato(String claveElector) {
        String Result = "No se encontro";
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "select urna.votosTotales from urna inner join candidatos on candidatos.idCandidato=urna.idCandidatoForanea where candidatos.claveElectorForaneaCandidato='" + claveElector + "';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                Result = rs.getString(1);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Result;
    }

    public String verificarCandidatoSiEsta(String claveElector) {
        String Result = "No se encontro";
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "select candidatos.claveElectorForaneaCandidato from urna inner join candidatos on candidatos.idCandidato=urna.idCandidatoForanea where candidatos.claveElectorForaneaCandidato='" + claveElector + "';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {

                Result = rs.getString(1);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Result;
    }

    public String obtenerIdCandidato(String claveElector) {
        String Result = "No se encontro";
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = " select idCandidato from candidatos where claveElectorForaneaCandidato='" + claveElector + "';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Result = rs.getString(1);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Result;
    }

    public void actualizarUrna(String idCandidato, String votosTotales) {

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "update urna set votosTotales='" + votosTotales + "' where idCandidatoForanea='" + idCandidato + "';";

            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    // Metodo para c#
    
    public String datoCiudadano(String claveElector){
        List ciudadanoLista = new ArrayList();
          String resultado = "";      
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "select claveElector, nombreCiudadano, apellidoPaternoCiudadano, apellidoMaternoCiudadano from ciudadanos where claveElector='"+claveElector+"';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                ciudadanoLista.add(rs.getString(1)+"-"+ rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4));
                resultado += rs.getString(1)+"-"+ rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4);
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public String datosCandidatos(){
        List ciudadanoLista = new ArrayList();
          String resultado = "";      
        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "SELECT candidatos.claveElectorForaneaCandidato,ciudadanos.nombreCiudadano,ciudadanos.apellidoPaternoCiudadano,ciudadanos.apellidoMaternoCiudadano,candidatos.partido from candidatos inner join ciudadanos on ciudadanos.claveElector=claveElectorForaneaCandidato;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                ciudadanoLista.add(rs.getString(1)+"-"+ rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4));
                resultado += rs.getString(1)+"-"+ rs.getString(2)+"-"+rs.getString(3)+"-"+rs.getString(4)+"-"+rs.getString(5)+",";
            }
            st.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
    
    public void insertarCandidatos(String claveElectoral, String partido) {

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query1 = "INSERT INTO `candidatos`VALUES (null,'"+claveElectoral+"','"+partido+"')";

            Statement st = con.createStatement();
            st.executeUpdate(query1);
            st.close();

        } catch (Exception e) {

        }

    }
    
    public void eliminarCandidatos(int idCandidato) {

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query1 = "DELETE FROM `candidatos` WHERE claveElectorForaneaCandidato = "+idCandidato+";";

            Statement st = con.createStatement();
            st.executeUpdate(query1);
            st.close();

        } catch (Exception e) {

        }

    }
    
    public void modificarCandidatos(int idCandidato, String partido) {

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query1 = "UPDATE `candidatos` SET `partido`='"+partido+"' WHERE claveElectorForaneaCandidato = "+idCandidato+";";

            Statement st = con.createStatement();
            st.executeUpdate(query1);
            st.close();

        } catch (Exception e) {

        }

    }
    
    
    
    //python
    
    public String consultaVotantes() {

        String resultado = "";

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "select ciudadanos.nombreCiudadano, ciudadanos.apellidoPaternoCiudadano, ciudadanos.apellidoMaternoCiudadano, ciudadanos.seccion, votantes.voto from ciudadanos inner join votantes on ciudadanos.claveElector = votantes.claveElectorForaneaVotante;";

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            int contador = 1;

            while (rs.next()) {
                resultado
                        += contador + "-" + rs.getString("nombreCiudadano") + " " +//nombreCiudado
                        rs.getString("apellidoPaternoCiudadano") + " " +// apellidoPaternoCiudado
                        rs.getString("apellidoMaternoCiudadano") + "-" +//apellidoMaternoCiudado
                        rs.getString("seccion") + "-" +//seccion
                        rs.getString("voto")//voto
                        +"/";
                contador++;
                
            }

            st.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return resultado;
    }
    
    public String consultarUrnaCandidatos() {

        String resultado = "";

        try {
            String myDriver = "com.mysql.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost/elecciones";
            Class.forName(myDriver);
            Connection con = DriverManager.getConnection(myUrl, "root", "");
            String query = "select ciudadanos.nombreCiudadano, ciudadanos.apellidoPaternoCiudadano, ciudadanos.apellidoMaternoCiudadano, candidatos.partido, urna.votosTotales from ciudadanos inner join candidatos on ciudadanos.claveElector = candidatos.claveElectorForaneaCandidato inner join urna on candidatos.idCandidato = urna.idCandidadoForanea;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                resultado
                        += rs.getString("nombreCiudadano") + " " +//nombreCiudado
                        rs.getString("apellidoPaternoCiudadano") + " " +// apellidoPaternoCiudado
                        rs.getString("apellidoMaternoCiudadano") + "-" +//apellidoMaternoCiudado
                        rs.getString("partido") + "-" +//partido
                        rs.getString("votosTotales")//votos
                        +"/";
                
            }

            st.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return resultado;
    }
    
    

}
