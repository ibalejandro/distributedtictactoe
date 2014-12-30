
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para play complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="play">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userPlayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="posI" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="posJ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "play", propOrder = {
    "creator",
    "userPlayed",
    "posI",
    "posJ"
})
public class Play {

    protected String creator;
    protected boolean userPlayed;
    protected int posI;
    protected int posJ;

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
     * Obtiene el valor de la propiedad userPlayed.
     * 
     */
    public boolean isUserPlayed() {
        return userPlayed;
    }

    /**
     * Define el valor de la propiedad userPlayed.
     * 
     */
    public void setUserPlayed(boolean value) {
        this.userPlayed = value;
    }

    /**
     * Obtiene el valor de la propiedad posI.
     * 
     */
    public int getPosI() {
        return posI;
    }

    /**
     * Define el valor de la propiedad posI.
     * 
     */
    public void setPosI(int value) {
        this.posI = value;
    }

    /**
     * Obtiene el valor de la propiedad posJ.
     * 
     */
    public int getPosJ() {
        return posJ;
    }

    /**
     * Define el valor de la propiedad posJ.
     * 
     */
    public void setPosJ(int value) {
        this.posJ = value;
    }

}
