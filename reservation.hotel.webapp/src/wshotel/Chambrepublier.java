
package wshotel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour chambrepublier complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="chambrepublier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chambre" type="{http://ws/}chambre" minOccurs="0"/&gt;
 *         &lt;element name="dateFinEnchere" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datePublication" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="enchere" type="{http://www.w3.org/2001/XMLSchema}byte"/&gt;
 *         &lt;element name="idPublication" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="promotionchambres" type="{http://ws/}promotionchambre" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reservations" type="{http://ws/}reservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="statut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chambrepublier", propOrder = {
    "chambre",
    "dateFinEnchere",
    "datePublication",
    "enchere",
    "idPublication",
    "prix",
    "promotionchambres",
    "reservations",
    "statut"
})
public class Chambrepublier {

    protected Chambre chambre;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFinEnchere;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datePublication;
    protected byte enchere;
    protected int idPublication;
    protected double prix;
    @XmlElement(nillable = true)
    protected List<Promotionchambre> promotionchambres;
    @XmlElement(nillable = true)
    protected List<Reservation> reservations;
    protected String statut;

    /**
     * Obtient la valeur de la propri�t� chambre.
     * 
     * @return
     *     possible object is
     *     {@link Chambre }
     *     
     */
    public Chambre getChambre() {
        return chambre;
    }

    /**
     * D�finit la valeur de la propri�t� chambre.
     * 
     * @param value
     *     allowed object is
     *     {@link Chambre }
     *     
     */
    public void setChambre(Chambre value) {
        this.chambre = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateFinEnchere.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFinEnchere() {
        return dateFinEnchere;
    }

    /**
     * D�finit la valeur de la propri�t� dateFinEnchere.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFinEnchere(XMLGregorianCalendar value) {
        this.dateFinEnchere = value;
    }

    /**
     * Obtient la valeur de la propri�t� datePublication.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatePublication() {
        return datePublication;
    }

    /**
     * D�finit la valeur de la propri�t� datePublication.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatePublication(XMLGregorianCalendar value) {
        this.datePublication = value;
    }

    /**
     * Obtient la valeur de la propri�t� enchere.
     * 
     */
    public byte getEnchere() {
        return enchere;
    }

    /**
     * D�finit la valeur de la propri�t� enchere.
     * 
     */
    public void setEnchere(byte value) {
        this.enchere = value;
    }

    /**
     * Obtient la valeur de la propri�t� idPublication.
     * 
     */
    public int getIdPublication() {
        return idPublication;
    }

    /**
     * D�finit la valeur de la propri�t� idPublication.
     * 
     */
    public void setIdPublication(int value) {
        this.idPublication = value;
    }

    /**
     * Obtient la valeur de la propri�t� prix.
     * 
     */
    public double getPrix() {
        return prix;
    }

    /**
     * D�finit la valeur de la propri�t� prix.
     * 
     */
    public void setPrix(double value) {
        this.prix = value;
    }

    /**
     * Gets the value of the promotionchambres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionchambres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionchambres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Promotionchambre }
     * 
     * 
     */
    public List<Promotionchambre> getPromotionchambres() {
        if (promotionchambres == null) {
            promotionchambres = new ArrayList<Promotionchambre>();
        }
        return this.promotionchambres;
    }

    /**
     * Gets the value of the reservations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reservation }
     * 
     * 
     */
    public List<Reservation> getReservations() {
        if (reservations == null) {
            reservations = new ArrayList<Reservation>();
        }
        return this.reservations;
    }

    /**
     * Obtient la valeur de la propri�t� statut.
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
     * D�finit la valeur de la propri�t� statut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatut(String value) {
        this.statut = value;
    }

}
