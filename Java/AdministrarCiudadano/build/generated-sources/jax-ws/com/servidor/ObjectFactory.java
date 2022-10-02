
package com.servidor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.servidor package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarCiudadanoResponse_QNAME = new QName("http://servidor.com/", "actualizarCiudadanoResponse");
    private final static QName _VerificarCandidatoSiEstaResponse_QNAME = new QName("http://servidor.com/", "verificarCandidatoSiEstaResponse");
    private final static QName _VerificarVotante_QNAME = new QName("http://servidor.com/", "verificarVotante");
    private final static QName _EliminarVotante_QNAME = new QName("http://servidor.com/", "eliminarVotante");
    private final static QName _MostrarDatosResponse_QNAME = new QName("http://servidor.com/", "mostrarDatosResponse");
    private final static QName _InsertarUrna_QNAME = new QName("http://servidor.com/", "insertarUrna");
    private final static QName _VerificarCiudadano_QNAME = new QName("http://servidor.com/", "verificarCiudadano");
    private final static QName _VerificarCiudadanoResponse_QNAME = new QName("http://servidor.com/", "verificarCiudadanoResponse");
    private final static QName _InsertarUrnaResponse_QNAME = new QName("http://servidor.com/", "insertarUrnaResponse");
    private final static QName _ObtenerVotosTotalesCandidatoResponse_QNAME = new QName("http://servidor.com/", "obtenerVotosTotalesCandidatoResponse");
    private final static QName _ObtenerIdCandidato_QNAME = new QName("http://servidor.com/", "obtenerIdCandidato");
    private final static QName _VerificarVotoResponse_QNAME = new QName("http://servidor.com/", "verificarVotoResponse");
    private final static QName _ObtenerVotosTotalesCandidato_QNAME = new QName("http://servidor.com/", "obtenerVotosTotalesCandidato");
    private final static QName _MostrarDatos_QNAME = new QName("http://servidor.com/", "mostrarDatos");
    private final static QName _ActualizarUrnaResponse_QNAME = new QName("http://servidor.com/", "actualizarUrnaResponse");
    private final static QName _MostrarDatosCiudadanoEspecifico_QNAME = new QName("http://servidor.com/", "mostrarDatosCiudadanoEspecifico");
    private final static QName _EliminarCiudadno_QNAME = new QName("http://servidor.com/", "eliminarCiudadno");
    private final static QName _MostrarCandidatosParaVotantesResponse_QNAME = new QName("http://servidor.com/", "mostrarCandidatosParaVotantesResponse");
    private final static QName _ContarCandidatos_QNAME = new QName("http://servidor.com/", "contarCandidatos");
    private final static QName _ObtenerIdCandidatoResponse_QNAME = new QName("http://servidor.com/", "obtenerIdCandidatoResponse");
    private final static QName _VerificarVotanteResponse_QNAME = new QName("http://servidor.com/", "verificarVotanteResponse");
    private final static QName _ContarCandidatosResponse_QNAME = new QName("http://servidor.com/", "contarCandidatosResponse");
    private final static QName _ActualizarUrna_QNAME = new QName("http://servidor.com/", "actualizarUrna");
    private final static QName _EliminarCiudadnoResponse_QNAME = new QName("http://servidor.com/", "eliminarCiudadnoResponse");
    private final static QName _VerificarCandidatoSiEsta_QNAME = new QName("http://servidor.com/", "verificarCandidatoSiEsta");
    private final static QName _MostrarCandidatosParaVotantes_QNAME = new QName("http://servidor.com/", "mostrarCandidatosParaVotantes");
    private final static QName _VerificarVoto_QNAME = new QName("http://servidor.com/", "verificarVoto");
    private final static QName _InsertarCiudadanoResponse_QNAME = new QName("http://servidor.com/", "insertarCiudadanoResponse");
    private final static QName _InsertarVotante_QNAME = new QName("http://servidor.com/", "insertarVotante");
    private final static QName _EliminarVotanteResponse_QNAME = new QName("http://servidor.com/", "eliminarVotanteResponse");
    private final static QName _MostrarDatosCiudadanoEspecificoResponse_QNAME = new QName("http://servidor.com/", "mostrarDatosCiudadanoEspecificoResponse");
    private final static QName _InsertarCiudadano_QNAME = new QName("http://servidor.com/", "insertarCiudadano");
    private final static QName _InsertarVotanteResponse_QNAME = new QName("http://servidor.com/", "insertarVotanteResponse");
    private final static QName _ActualizarCiudadano_QNAME = new QName("http://servidor.com/", "actualizarCiudadano");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.servidor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarCiudadano }
     * 
     */
    public ActualizarCiudadano createActualizarCiudadano() {
        return new ActualizarCiudadano();
    }

    /**
     * Create an instance of {@link InsertarVotanteResponse }
     * 
     */
    public InsertarVotanteResponse createInsertarVotanteResponse() {
        return new InsertarVotanteResponse();
    }

    /**
     * Create an instance of {@link InsertarCiudadano }
     * 
     */
    public InsertarCiudadano createInsertarCiudadano() {
        return new InsertarCiudadano();
    }

    /**
     * Create an instance of {@link EliminarVotanteResponse }
     * 
     */
    public EliminarVotanteResponse createEliminarVotanteResponse() {
        return new EliminarVotanteResponse();
    }

    /**
     * Create an instance of {@link MostrarDatosCiudadanoEspecificoResponse }
     * 
     */
    public MostrarDatosCiudadanoEspecificoResponse createMostrarDatosCiudadanoEspecificoResponse() {
        return new MostrarDatosCiudadanoEspecificoResponse();
    }

    /**
     * Create an instance of {@link InsertarVotante }
     * 
     */
    public InsertarVotante createInsertarVotante() {
        return new InsertarVotante();
    }

    /**
     * Create an instance of {@link InsertarCiudadanoResponse }
     * 
     */
    public InsertarCiudadanoResponse createInsertarCiudadanoResponse() {
        return new InsertarCiudadanoResponse();
    }

    /**
     * Create an instance of {@link VerificarVoto }
     * 
     */
    public VerificarVoto createVerificarVoto() {
        return new VerificarVoto();
    }

    /**
     * Create an instance of {@link MostrarCandidatosParaVotantes }
     * 
     */
    public MostrarCandidatosParaVotantes createMostrarCandidatosParaVotantes() {
        return new MostrarCandidatosParaVotantes();
    }

    /**
     * Create an instance of {@link ActualizarUrna }
     * 
     */
    public ActualizarUrna createActualizarUrna() {
        return new ActualizarUrna();
    }

    /**
     * Create an instance of {@link EliminarCiudadnoResponse }
     * 
     */
    public EliminarCiudadnoResponse createEliminarCiudadnoResponse() {
        return new EliminarCiudadnoResponse();
    }

    /**
     * Create an instance of {@link VerificarCandidatoSiEsta }
     * 
     */
    public VerificarCandidatoSiEsta createVerificarCandidatoSiEsta() {
        return new VerificarCandidatoSiEsta();
    }

    /**
     * Create an instance of {@link ContarCandidatosResponse }
     * 
     */
    public ContarCandidatosResponse createContarCandidatosResponse() {
        return new ContarCandidatosResponse();
    }

    /**
     * Create an instance of {@link VerificarVotanteResponse }
     * 
     */
    public VerificarVotanteResponse createVerificarVotanteResponse() {
        return new VerificarVotanteResponse();
    }

    /**
     * Create an instance of {@link ContarCandidatos }
     * 
     */
    public ContarCandidatos createContarCandidatos() {
        return new ContarCandidatos();
    }

    /**
     * Create an instance of {@link ObtenerIdCandidatoResponse }
     * 
     */
    public ObtenerIdCandidatoResponse createObtenerIdCandidatoResponse() {
        return new ObtenerIdCandidatoResponse();
    }

    /**
     * Create an instance of {@link MostrarCandidatosParaVotantesResponse }
     * 
     */
    public MostrarCandidatosParaVotantesResponse createMostrarCandidatosParaVotantesResponse() {
        return new MostrarCandidatosParaVotantesResponse();
    }

    /**
     * Create an instance of {@link EliminarCiudadno }
     * 
     */
    public EliminarCiudadno createEliminarCiudadno() {
        return new EliminarCiudadno();
    }

    /**
     * Create an instance of {@link MostrarDatosCiudadanoEspecifico }
     * 
     */
    public MostrarDatosCiudadanoEspecifico createMostrarDatosCiudadanoEspecifico() {
        return new MostrarDatosCiudadanoEspecifico();
    }

    /**
     * Create an instance of {@link ActualizarUrnaResponse }
     * 
     */
    public ActualizarUrnaResponse createActualizarUrnaResponse() {
        return new ActualizarUrnaResponse();
    }

    /**
     * Create an instance of {@link MostrarDatos }
     * 
     */
    public MostrarDatos createMostrarDatos() {
        return new MostrarDatos();
    }

    /**
     * Create an instance of {@link ObtenerVotosTotalesCandidato }
     * 
     */
    public ObtenerVotosTotalesCandidato createObtenerVotosTotalesCandidato() {
        return new ObtenerVotosTotalesCandidato();
    }

    /**
     * Create an instance of {@link VerificarVotoResponse }
     * 
     */
    public VerificarVotoResponse createVerificarVotoResponse() {
        return new VerificarVotoResponse();
    }

    /**
     * Create an instance of {@link ObtenerIdCandidato }
     * 
     */
    public ObtenerIdCandidato createObtenerIdCandidato() {
        return new ObtenerIdCandidato();
    }

    /**
     * Create an instance of {@link ObtenerVotosTotalesCandidatoResponse }
     * 
     */
    public ObtenerVotosTotalesCandidatoResponse createObtenerVotosTotalesCandidatoResponse() {
        return new ObtenerVotosTotalesCandidatoResponse();
    }

    /**
     * Create an instance of {@link InsertarUrnaResponse }
     * 
     */
    public InsertarUrnaResponse createInsertarUrnaResponse() {
        return new InsertarUrnaResponse();
    }

    /**
     * Create an instance of {@link InsertarUrna }
     * 
     */
    public InsertarUrna createInsertarUrna() {
        return new InsertarUrna();
    }

    /**
     * Create an instance of {@link VerificarCiudadano }
     * 
     */
    public VerificarCiudadano createVerificarCiudadano() {
        return new VerificarCiudadano();
    }

    /**
     * Create an instance of {@link VerificarCiudadanoResponse }
     * 
     */
    public VerificarCiudadanoResponse createVerificarCiudadanoResponse() {
        return new VerificarCiudadanoResponse();
    }

    /**
     * Create an instance of {@link MostrarDatosResponse }
     * 
     */
    public MostrarDatosResponse createMostrarDatosResponse() {
        return new MostrarDatosResponse();
    }

    /**
     * Create an instance of {@link EliminarVotante }
     * 
     */
    public EliminarVotante createEliminarVotante() {
        return new EliminarVotante();
    }

    /**
     * Create an instance of {@link ActualizarCiudadanoResponse }
     * 
     */
    public ActualizarCiudadanoResponse createActualizarCiudadanoResponse() {
        return new ActualizarCiudadanoResponse();
    }

    /**
     * Create an instance of {@link VerificarCandidatoSiEstaResponse }
     * 
     */
    public VerificarCandidatoSiEstaResponse createVerificarCandidatoSiEstaResponse() {
        return new VerificarCandidatoSiEstaResponse();
    }

    /**
     * Create an instance of {@link VerificarVotante }
     * 
     */
    public VerificarVotante createVerificarVotante() {
        return new VerificarVotante();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCiudadanoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "actualizarCiudadanoResponse")
    public JAXBElement<ActualizarCiudadanoResponse> createActualizarCiudadanoResponse(ActualizarCiudadanoResponse value) {
        return new JAXBElement<ActualizarCiudadanoResponse>(_ActualizarCiudadanoResponse_QNAME, ActualizarCiudadanoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarCandidatoSiEstaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "verificarCandidatoSiEstaResponse")
    public JAXBElement<VerificarCandidatoSiEstaResponse> createVerificarCandidatoSiEstaResponse(VerificarCandidatoSiEstaResponse value) {
        return new JAXBElement<VerificarCandidatoSiEstaResponse>(_VerificarCandidatoSiEstaResponse_QNAME, VerificarCandidatoSiEstaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarVotante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "verificarVotante")
    public JAXBElement<VerificarVotante> createVerificarVotante(VerificarVotante value) {
        return new JAXBElement<VerificarVotante>(_VerificarVotante_QNAME, VerificarVotante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarVotante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "eliminarVotante")
    public JAXBElement<EliminarVotante> createEliminarVotante(EliminarVotante value) {
        return new JAXBElement<EliminarVotante>(_EliminarVotante_QNAME, EliminarVotante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarDatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "mostrarDatosResponse")
    public JAXBElement<MostrarDatosResponse> createMostrarDatosResponse(MostrarDatosResponse value) {
        return new JAXBElement<MostrarDatosResponse>(_MostrarDatosResponse_QNAME, MostrarDatosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUrna }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "insertarUrna")
    public JAXBElement<InsertarUrna> createInsertarUrna(InsertarUrna value) {
        return new JAXBElement<InsertarUrna>(_InsertarUrna_QNAME, InsertarUrna.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarCiudadano }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "verificarCiudadano")
    public JAXBElement<VerificarCiudadano> createVerificarCiudadano(VerificarCiudadano value) {
        return new JAXBElement<VerificarCiudadano>(_VerificarCiudadano_QNAME, VerificarCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarCiudadanoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "verificarCiudadanoResponse")
    public JAXBElement<VerificarCiudadanoResponse> createVerificarCiudadanoResponse(VerificarCiudadanoResponse value) {
        return new JAXBElement<VerificarCiudadanoResponse>(_VerificarCiudadanoResponse_QNAME, VerificarCiudadanoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUrnaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "insertarUrnaResponse")
    public JAXBElement<InsertarUrnaResponse> createInsertarUrnaResponse(InsertarUrnaResponse value) {
        return new JAXBElement<InsertarUrnaResponse>(_InsertarUrnaResponse_QNAME, InsertarUrnaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVotosTotalesCandidatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "obtenerVotosTotalesCandidatoResponse")
    public JAXBElement<ObtenerVotosTotalesCandidatoResponse> createObtenerVotosTotalesCandidatoResponse(ObtenerVotosTotalesCandidatoResponse value) {
        return new JAXBElement<ObtenerVotosTotalesCandidatoResponse>(_ObtenerVotosTotalesCandidatoResponse_QNAME, ObtenerVotosTotalesCandidatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerIdCandidato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "obtenerIdCandidato")
    public JAXBElement<ObtenerIdCandidato> createObtenerIdCandidato(ObtenerIdCandidato value) {
        return new JAXBElement<ObtenerIdCandidato>(_ObtenerIdCandidato_QNAME, ObtenerIdCandidato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarVotoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "verificarVotoResponse")
    public JAXBElement<VerificarVotoResponse> createVerificarVotoResponse(VerificarVotoResponse value) {
        return new JAXBElement<VerificarVotoResponse>(_VerificarVotoResponse_QNAME, VerificarVotoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerVotosTotalesCandidato }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "obtenerVotosTotalesCandidato")
    public JAXBElement<ObtenerVotosTotalesCandidato> createObtenerVotosTotalesCandidato(ObtenerVotosTotalesCandidato value) {
        return new JAXBElement<ObtenerVotosTotalesCandidato>(_ObtenerVotosTotalesCandidato_QNAME, ObtenerVotosTotalesCandidato.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarDatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "mostrarDatos")
    public JAXBElement<MostrarDatos> createMostrarDatos(MostrarDatos value) {
        return new JAXBElement<MostrarDatos>(_MostrarDatos_QNAME, MostrarDatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarUrnaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "actualizarUrnaResponse")
    public JAXBElement<ActualizarUrnaResponse> createActualizarUrnaResponse(ActualizarUrnaResponse value) {
        return new JAXBElement<ActualizarUrnaResponse>(_ActualizarUrnaResponse_QNAME, ActualizarUrnaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarDatosCiudadanoEspecifico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "mostrarDatosCiudadanoEspecifico")
    public JAXBElement<MostrarDatosCiudadanoEspecifico> createMostrarDatosCiudadanoEspecifico(MostrarDatosCiudadanoEspecifico value) {
        return new JAXBElement<MostrarDatosCiudadanoEspecifico>(_MostrarDatosCiudadanoEspecifico_QNAME, MostrarDatosCiudadanoEspecifico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCiudadno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "eliminarCiudadno")
    public JAXBElement<EliminarCiudadno> createEliminarCiudadno(EliminarCiudadno value) {
        return new JAXBElement<EliminarCiudadno>(_EliminarCiudadno_QNAME, EliminarCiudadno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarCandidatosParaVotantesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "mostrarCandidatosParaVotantesResponse")
    public JAXBElement<MostrarCandidatosParaVotantesResponse> createMostrarCandidatosParaVotantesResponse(MostrarCandidatosParaVotantesResponse value) {
        return new JAXBElement<MostrarCandidatosParaVotantesResponse>(_MostrarCandidatosParaVotantesResponse_QNAME, MostrarCandidatosParaVotantesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContarCandidatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "contarCandidatos")
    public JAXBElement<ContarCandidatos> createContarCandidatos(ContarCandidatos value) {
        return new JAXBElement<ContarCandidatos>(_ContarCandidatos_QNAME, ContarCandidatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerIdCandidatoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "obtenerIdCandidatoResponse")
    public JAXBElement<ObtenerIdCandidatoResponse> createObtenerIdCandidatoResponse(ObtenerIdCandidatoResponse value) {
        return new JAXBElement<ObtenerIdCandidatoResponse>(_ObtenerIdCandidatoResponse_QNAME, ObtenerIdCandidatoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarVotanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "verificarVotanteResponse")
    public JAXBElement<VerificarVotanteResponse> createVerificarVotanteResponse(VerificarVotanteResponse value) {
        return new JAXBElement<VerificarVotanteResponse>(_VerificarVotanteResponse_QNAME, VerificarVotanteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContarCandidatosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "contarCandidatosResponse")
    public JAXBElement<ContarCandidatosResponse> createContarCandidatosResponse(ContarCandidatosResponse value) {
        return new JAXBElement<ContarCandidatosResponse>(_ContarCandidatosResponse_QNAME, ContarCandidatosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarUrna }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "actualizarUrna")
    public JAXBElement<ActualizarUrna> createActualizarUrna(ActualizarUrna value) {
        return new JAXBElement<ActualizarUrna>(_ActualizarUrna_QNAME, ActualizarUrna.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarCiudadnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "eliminarCiudadnoResponse")
    public JAXBElement<EliminarCiudadnoResponse> createEliminarCiudadnoResponse(EliminarCiudadnoResponse value) {
        return new JAXBElement<EliminarCiudadnoResponse>(_EliminarCiudadnoResponse_QNAME, EliminarCiudadnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarCandidatoSiEsta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "verificarCandidatoSiEsta")
    public JAXBElement<VerificarCandidatoSiEsta> createVerificarCandidatoSiEsta(VerificarCandidatoSiEsta value) {
        return new JAXBElement<VerificarCandidatoSiEsta>(_VerificarCandidatoSiEsta_QNAME, VerificarCandidatoSiEsta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarCandidatosParaVotantes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "mostrarCandidatosParaVotantes")
    public JAXBElement<MostrarCandidatosParaVotantes> createMostrarCandidatosParaVotantes(MostrarCandidatosParaVotantes value) {
        return new JAXBElement<MostrarCandidatosParaVotantes>(_MostrarCandidatosParaVotantes_QNAME, MostrarCandidatosParaVotantes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarVoto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "verificarVoto")
    public JAXBElement<VerificarVoto> createVerificarVoto(VerificarVoto value) {
        return new JAXBElement<VerificarVoto>(_VerificarVoto_QNAME, VerificarVoto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCiudadanoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "insertarCiudadanoResponse")
    public JAXBElement<InsertarCiudadanoResponse> createInsertarCiudadanoResponse(InsertarCiudadanoResponse value) {
        return new JAXBElement<InsertarCiudadanoResponse>(_InsertarCiudadanoResponse_QNAME, InsertarCiudadanoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarVotante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "insertarVotante")
    public JAXBElement<InsertarVotante> createInsertarVotante(InsertarVotante value) {
        return new JAXBElement<InsertarVotante>(_InsertarVotante_QNAME, InsertarVotante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarVotanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "eliminarVotanteResponse")
    public JAXBElement<EliminarVotanteResponse> createEliminarVotanteResponse(EliminarVotanteResponse value) {
        return new JAXBElement<EliminarVotanteResponse>(_EliminarVotanteResponse_QNAME, EliminarVotanteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarDatosCiudadanoEspecificoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "mostrarDatosCiudadanoEspecificoResponse")
    public JAXBElement<MostrarDatosCiudadanoEspecificoResponse> createMostrarDatosCiudadanoEspecificoResponse(MostrarDatosCiudadanoEspecificoResponse value) {
        return new JAXBElement<MostrarDatosCiudadanoEspecificoResponse>(_MostrarDatosCiudadanoEspecificoResponse_QNAME, MostrarDatosCiudadanoEspecificoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarCiudadano }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "insertarCiudadano")
    public JAXBElement<InsertarCiudadano> createInsertarCiudadano(InsertarCiudadano value) {
        return new JAXBElement<InsertarCiudadano>(_InsertarCiudadano_QNAME, InsertarCiudadano.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarVotanteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "insertarVotanteResponse")
    public JAXBElement<InsertarVotanteResponse> createInsertarVotanteResponse(InsertarVotanteResponse value) {
        return new JAXBElement<InsertarVotanteResponse>(_InsertarVotanteResponse_QNAME, InsertarVotanteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCiudadano }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servidor.com/", name = "actualizarCiudadano")
    public JAXBElement<ActualizarCiudadano> createActualizarCiudadano(ActualizarCiudadano value) {
        return new JAXBElement<ActualizarCiudadano>(_ActualizarCiudadano_QNAME, ActualizarCiudadano.class, null, value);
    }

}
