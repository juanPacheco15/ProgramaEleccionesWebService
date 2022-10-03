
package com.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insertarCandidato complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insertarCandidato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claveElectoral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertarCandidato", propOrder = {
    "claveElectoral",
    "partido"
})
public class InsertarCandidato {

    protected String claveElectoral;
    protected String partido;

    /**
     * Obtiene el valor de la propiedad claveElectoral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveElectoral() {
        return claveElectoral;
    }

    /**
     * Define el valor de la propiedad claveElectoral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveElectoral(String value) {
        this.claveElectoral = value;
    }

    /**
     * Obtiene el valor de la propiedad partido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartido() {
        return partido;
    }

    /**
     * Define el valor de la propiedad partido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartido(String value) {
        this.partido = value;
    }

}
