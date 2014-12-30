
package webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPlayerInTurn complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPlayerInTurn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gameCreator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPlayerInTurn", propOrder = {
    "gameCreator"
})
public class GetPlayerInTurn {

    protected String gameCreator;

    /**
     * Obtiene el valor de la propiedad gameCreator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGameCreator() {
        return gameCreator;
    }

    /**
     * Define el valor de la propiedad gameCreator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGameCreator(String value) {
        this.gameCreator = value;
    }

}
