
package com.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para candidatos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="candidatos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claveElectoral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "candidatos", propOrder = {
    "claveElectoral"
})
public class Candidatos {

    protected String claveElectoral;

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

}
