
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createRoom complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createRoom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seudoname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createRoom", propOrder = {
    "seudoname"
})
public class CreateRoom {

    protected String seudoname;

    /**
     * Obtiene el valor de la propiedad seudoname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeudoname() {
        return seudoname;
    }

    /**
     * Define el valor de la propiedad seudoname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeudoname(String value) {
        this.seudoname = value;
    }

}
