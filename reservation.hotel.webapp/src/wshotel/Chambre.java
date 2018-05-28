
package wshotel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour chambre complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="chambre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessibilites" type="{http://ws/}accessibilite" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="capaciteAccueil" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="categoriechambre" type="{http://ws/}categoriechambre" minOccurs="0"/&gt;
 *         &lt;element name="chambrepubliers" type="{http://ws/}chambrepublier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="equipements" type="{http://ws/}equipement" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="hotel" type="{http://ws/}hotel" minOccurs="0"/&gt;
 *         &lt;element name="idChambre" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="photo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chambre", propOrder = {
    "accessibilites",
    "capaciteAccueil",
    "categoriechambre",
    "chambrepubliers",
    "description",
    "equipements",
    "hotel",
    "idChambre",
    "photo"
})
public class Chambre {

    @XmlElement(nillable = true)
    protected List<Accessibilite> accessibilites;
    protected int capaciteAccueil;
    protected Categoriechambre categoriechambre;
    @XmlElement(nillable = true)
    protected List<Chambrepublier> chambrepubliers;
    protected String description;
    @XmlElement(nillable = true)
    protected List<Equipement> equipements;
    protected Hotel hotel;
    protected int idChambre;
    protected String photo;

    /**
     * Gets the value of the accessibilites property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessibilites property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessibilites().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Accessibilite }
     * 
     * 
     */
    public List<Accessibilite> getAccessibilites() {
        if (accessibilites == null) {
            accessibilites = new ArrayList<Accessibilite>();
        }
        return this.accessibilites;
    }

    /**
     * Obtient la valeur de la propri�t� capaciteAccueil.
     * 
     */
    public int getCapaciteAccueil() {
        return capaciteAccueil;
    }

    /**
     * D�finit la valeur de la propri�t� capaciteAccueil.
     * 
     */
    public void setCapaciteAccueil(int value) {
        this.capaciteAccueil = value;
    }

    /**
     * Obtient la valeur de la propri�t� categoriechambre.
     * 
     * @return
     *     possible object is
     *     {@link Categoriechambre }
     *     
     */
    public Categoriechambre getCategoriechambre() {
        return categoriechambre;
    }

    /**
     * D�finit la valeur de la propri�t� categoriechambre.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoriechambre }
     *     
     */
    public void setCategoriechambre(Categoriechambre value) {
        this.categoriechambre = value;
    }

    /**
     * Gets the value of the chambrepubliers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chambrepubliers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChambrepubliers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Chambrepublier }
     * 
     * 
     */
    public List<Chambrepublier> getChambrepubliers() {
        if (chambrepubliers == null) {
            chambrepubliers = new ArrayList<Chambrepublier>();
        }
        return this.chambrepubliers;
    }

    /**
     * Obtient la valeur de la propri�t� description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * D�finit la valeur de la propri�t� description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the equipements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Equipement }
     * 
     * 
     */
    public List<Equipement> getEquipements() {
        if (equipements == null) {
            equipements = new ArrayList<Equipement>();
        }
        return this.equipements;
    }

    /**
     * Obtient la valeur de la propri�t� hotel.
     * 
     * @return
     *     possible object is
     *     {@link Hotel }
     *     
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * D�finit la valeur de la propri�t� hotel.
     * 
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *     
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
    }

    /**
     * Obtient la valeur de la propri�t� idChambre.
     * 
     */
    public int getIdChambre() {
        return idChambre;
    }

    /**
     * D�finit la valeur de la propri�t� idChambre.
     * 
     */
    public void setIdChambre(int value) {
        this.idChambre = value;
    }

    /**
     * Obtient la valeur de la propri�t� photo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * D�finit la valeur de la propri�t� photo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoto(String value) {
        this.photo = value;
    }

}
