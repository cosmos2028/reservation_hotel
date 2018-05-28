
package wshotel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour categoriechambre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="categoriechambre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chambres" type="{http://ws/}chambre" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="id_catChambre" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nomCatChambre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categoriechambre", propOrder = {
    "chambres",
    "idCatChambre",
    "nomCatChambre"
})
public class Categoriechambre {

    @XmlElement(nillable = true)
    protected List<Chambre> chambres;
    @XmlElement(name = "id_catChambre")
    protected int idCatChambre;
    protected String nomCatChambre;

    /**
     * Gets the value of the chambres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chambres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChambres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chambre }
     * 
     * 
     */
    public List<Chambre> getChambres() {
        if (chambres == null) {
            chambres = new ArrayList<Chambre>();
        }
        return this.chambres;
    }

    /**
     * Obtient la valeur de la propriété idCatChambre.
     * 
     */
    public int getIdCatChambre() {
        return idCatChambre;
    }

    /**
     * Définit la valeur de la propriété idCatChambre.
     * 
     */
    public void setIdCatChambre(int value) {
        this.idCatChambre = value;
    }

    /**
     * Obtient la valeur de la propriété nomCatChambre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCatChambre() {
        return nomCatChambre;
    }

    /**
     * Définit la valeur de la propriété nomCatChambre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCatChambre(String value) {
        this.nomCatChambre = value;
    }

}
