
package wshotelmetier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour indEffectueTache complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="indEffectueTache"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateDeb" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dateFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://ws/}indEffectueTachePK" minOccurs="0"/&gt;
 *         &lt;element name="independant" type="{http://ws/}independant" minOccurs="0"/&gt;
 *         &lt;element name="nb_heure_effectue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tache" type="{http://ws/}tache" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indEffectueTache", propOrder = {
    "dateDeb",
    "dateFin",
    "id",
    "independant",
    "nbHeureEffectue",
    "tache"
})
public class IndEffectueTache {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateDeb;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFin;
    protected IndEffectueTachePK id;
    protected Independant independant;
    @XmlElement(name = "nb_heure_effectue")
    protected int nbHeureEffectue;
    protected Tache tache;

    /**
     * Obtient la valeur de la propri�t� dateDeb.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateDeb() {
        return dateDeb;
    }

    /**
     * D�finit la valeur de la propri�t� dateDeb.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateDeb(XMLGregorianCalendar value) {
        this.dateDeb = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateFin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFin() {
        return dateFin;
    }

    /**
     * D�finit la valeur de la propri�t� dateFin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFin(XMLGregorianCalendar value) {
        this.dateFin = value;
    }

    /**
     * Obtient la valeur de la propri�t� id.
     * 
     * @return
     *     possible object is
     *     {@link IndEffectueTachePK }
     *     
     */
    public IndEffectueTachePK getId() {
        return id;
    }

    /**
     * D�finit la valeur de la propri�t� id.
     * 
     * @param value
     *     allowed object is
     *     {@link IndEffectueTachePK }
     *     
     */
    public void setId(IndEffectueTachePK value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propri�t� independant.
     * 
     * @return
     *     possible object is
     *     {@link Independant }
     *     
     */
    public Independant getIndependant() {
        return independant;
    }

    /**
     * D�finit la valeur de la propri�t� independant.
     * 
     * @param value
     *     allowed object is
     *     {@link Independant }
     *     
     */
    public void setIndependant(Independant value) {
        this.independant = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbHeureEffectue.
     * 
     */
    public int getNbHeureEffectue() {
        return nbHeureEffectue;
    }

    /**
     * D�finit la valeur de la propri�t� nbHeureEffectue.
     * 
     */
    public void setNbHeureEffectue(int value) {
        this.nbHeureEffectue = value;
    }

    /**
     * Obtient la valeur de la propri�t� tache.
     * 
     * @return
     *     possible object is
     *     {@link Tache }
     *     
     */
    public Tache getTache() {
        return tache;
    }

    /**
     * D�finit la valeur de la propri�t� tache.
     * 
     * @param value
     *     allowed object is
     *     {@link Tache }
     *     
     */
    public void setTache(Tache value) {
        this.tache = value;
    }

}
