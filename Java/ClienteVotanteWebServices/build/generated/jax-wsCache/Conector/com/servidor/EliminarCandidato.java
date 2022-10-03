
package com.servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eliminarCandidato complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="eliminarCandidato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCandidato" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eliminarCandidato", propOrder = {
    "idCandidato"
})
public class EliminarCandidato {

    protected int idCandidato;

    /**
     * Obtiene el valor de la propiedad idCandidato.
     * 
     */
    public int getIdCandidato() {
        return idCandidato;
    }

    /**
     * Define el valor de la propiedad idCandidato.
     * 
     */
    public void setIdCandidato(int value) {
        this.idCandidato = value;
    }

}
