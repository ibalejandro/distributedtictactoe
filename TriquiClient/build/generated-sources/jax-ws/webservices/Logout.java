
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para logout complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="logout">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="logout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logout", propOrder = {
    "logout"
})
public class Logout {

    protected String logout;

    /**
     * Obtiene el valor de la propiedad logout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogout() {
        return logout;
    }

    /**
     * Define el valor de la propiedad logout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogout(String value) {
        this.logout = value;
    }

}
