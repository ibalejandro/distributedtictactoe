
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para joinRoom complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="joinRoom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="joiner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "joinRoom", propOrder = {
    "creator",
    "joiner"
})
public class JoinRoom {

    protected String creator;
    protected String joiner;

    /**
     * Obtiene el valor de la propiedad creator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Define el valor de la propiedad creator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Obtiene el valor de la propiedad joiner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoiner() {
        return joiner;
    }

    /**
     * Define el valor de la propiedad joiner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoiner(String value) {
        this.joiner = value;
    }

}
