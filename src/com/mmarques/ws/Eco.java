
package com.mmarques.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de eco complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="eco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametro1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eco", propOrder = {
    "parametro1"
})
public class Eco {

    protected String parametro1;

    /**
     * Obtém o valor da propriedade parametro1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametro1() {
        return parametro1;
    }

    /**
     * Define o valor da propriedade parametro1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametro1(String value) {
        this.parametro1 = value;
    }

}
