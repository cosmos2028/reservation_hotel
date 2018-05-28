
package wshotel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour tache complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="tache"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTache" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="indEffectueTaches" type="{http://ws/}indEffectueTache" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="libelle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="typeTache" type="{http://ws/}typeTache" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tache", propOrder = {
    "idTache",
    "indEffectueTaches",
    "libelle",
    "statut",
    "typeTache"
})
public class Tache {

    protected int idTache;
    @XmlElement(nillable = true)
    protected List<IndEffectueTache> indEffectueTaches;
    protected String libelle;
    protected String statut;
    protected TypeTache typeTache;

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

    /**
     * Gets the value of the indEffectueTaches property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indEffectueTaches property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndEffectueTaches().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndEffectueTache }
     * 
     * 
     */
    public List<IndEffectueTache> getIndEffectueTaches() {
        if (indEffectueTaches == null) {
            indEffectueTaches = new ArrayList<IndEffectueTache>();
        }
        return this.indEffectueTaches;
    }

    /**
     * Obtient la valeur de la propriété libelle.
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
     * Définit la valeur de la propriété libelle.
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
     * Obtient la valeur de la propriété statut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatut() {
        return statut;
    }

    /**
     * Définit la valeur de la propriété statut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatut(String value) {
        this.statut = value;
    }

    /**
     * Obtient la valeur de la propriété typeTache.
     * 
     * @return
     *     possible object is
     *     {@link TypeTache }
     *     
     */
    public TypeTache getTypeTache() {
        return typeTache;
    }

    /**
     * Définit la valeur de la propriété typeTache.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTache }
     *     
     */
    public void setTypeTache(TypeTache value) {
        this.typeTache = value;
    }

}
