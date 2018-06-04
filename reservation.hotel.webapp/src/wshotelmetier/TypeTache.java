
package wshotelmetier;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeTache complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeTache"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="difficulte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idTypeTache" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pointAssocie" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="taches" type="{http://ws/}tache" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeTache", propOrder = {
    "difficulte",
    "idTypeTache",
    "libelle",
    "pointAssocie",
    "taches"
})
public class TypeTache {

    protected String difficulte;
    protected int idTypeTache;
    protected String libelle;
    protected int pointAssocie;
    @XmlElement(nillable = true)
    protected List<Tache> taches;

    /**
     * Obtient la valeur de la propri�t� difficulte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDifficulte() {
        return difficulte;
    }

    /**
     * D�finit la valeur de la propri�t� difficulte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDifficulte(String value) {
        this.difficulte = value;
    }

    /**
     * Obtient la valeur de la propri�t� idTypeTache.
     * 
     */
    public int getIdTypeTache() {
        return idTypeTache;
    }

    /**
     * D�finit la valeur de la propri�t� idTypeTache.
     * 
     */
    public void setIdTypeTache(int value) {
        this.idTypeTache = value;
    }

    /**
     * Obtient la valeur de la propri�t� libelle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * D�finit la valeur de la propri�t� libelle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibelle(String value) {
        this.libelle = value;
    }

    /**
     * Obtient la valeur de la propri�t� pointAssocie.
     * 
     */
    public int getPointAssocie() {
        return pointAssocie;
    }

    /**
     * D�finit la valeur de la propri�t� pointAssocie.
     * 
     */
    public void setPointAssocie(int value) {
        this.pointAssocie = value;
    }

    /**
     * Gets the value of the taches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tache }
     * 
     * 
     */
    public List<Tache> getTaches() {
        if (taches == null) {
            taches = new ArrayList<Tache>();
        }
        return this.taches;
    }

}
