
package wshotelmetier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour avisclientsurhotelPK complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="avisclientsurhotelPK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codeHotel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idClient" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "avisclientsurhotelPK", propOrder = {
    "codeHotel",
    "idClient"
})
public class AvisclientsurhotelPK {

    protected int codeHotel;
    protected int idClient;

    /**
     * Obtient la valeur de la propri�t� codeHotel.
     * 
     */
    public int getCodeHotel() {
        return codeHotel;
    }

    /**
     * D�finit la valeur de la propri�t� codeHotel.
     * 
     */
    public void setCodeHotel(int value) {
        this.codeHotel = value;
    }

    /**
     * Obtient la valeur de la propri�t� idClient.
     * 
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * D�finit la valeur de la propri�t� idClient.
     * 
     */
    public void setIdClient(int value) {
        this.idClient = value;
    }

}
