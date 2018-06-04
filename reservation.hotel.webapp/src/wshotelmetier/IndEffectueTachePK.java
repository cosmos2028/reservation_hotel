
package wshotelmetier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour indEffectueTachePK complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="indEffectueTachePK"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idIndependant" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idTache" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indEffectueTachePK", propOrder = {
    "idIndependant",
    "idTache"
})
public class IndEffectueTachePK {

    protected int idIndependant;
    protected int idTache;

    /**
     * Obtient la valeur de la propriété idIndependant.
     * 
     */
    public int getIdIndependant() {
        return idIndependant;
    }

    /**
     * Définit la valeur de la propriété idIndependant.
     * 
     */
    public void setIdIndependant(int value) {
        this.idIndependant = value;
    }

    /**
     * Obtient la valeur de la propriété idTache.
     * 
     */
    public int getIdTache() {
        return idTache;
    }

    /**
     * Définit la valeur de la propriété idTache.
     * 
     */
    public void setIdTache(int value) {
        this.idTache = value;
    }

}
