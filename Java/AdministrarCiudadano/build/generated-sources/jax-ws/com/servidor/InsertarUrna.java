
package com.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarUrna complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarUrna">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCandidato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="votosTotales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarUrna", propOrder = {
    "idCandidato",
    "votosTotales"
})
public class InsertarUrna {

    protected String idCandidato;
    protected String votosTotales;

    /**
     * Obtiene el valor de la propiedad idCandidato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCandidato() {
        return idCandidato;
    }

    /**
     * Define el valor de la propiedad idCandidato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCandidato(String value) {
        this.idCandidato = value;
    }

    /**
     * Obtiene el valor de la propiedad votosTotales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVotosTotales() {
        return votosTotales;
    }

    /**
     * Define el valor de la propiedad votosTotales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVotosTotales(String value) {
        this.votosTotales = value;
    }

}
