
package com.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizarVotante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizarVotante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="voto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="claveElector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizarVotante", propOrder = {
    "voto",
    "claveElector"
})
public class ActualizarVotante {

    protected String voto;
    protected String claveElector;

    /**
     * Obtiene el valor de la propiedad voto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoto() {
        return voto;
    }

    /**
     * Define el valor de la propiedad voto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoto(String value) {
        this.voto = value;
    }

    /**
     * Obtiene el valor de la propiedad claveElector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveElector() {
        return claveElector;
    }

    /**
     * Define el valor de la propiedad claveElector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveElector(String value) {
        this.claveElector = value;
    }

}
