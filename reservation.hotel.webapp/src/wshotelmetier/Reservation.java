
package wshotelmetier;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour reservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="reservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chambrepublier" type="{http://ws/}chambrepublier" minOccurs="0"/&gt;
 *         &lt;element name="client" type="{http://ws/}client" minOccurs="0"/&gt;
 *         &lt;element name="dateReserv" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="etat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="facture" type="{http://ws/}facture" minOccurs="0"/&gt;
 *         &lt;element name="factures" type="{http://ws/}facture" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="idReservation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="independant" type="{http://ws/}independant" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reservation", propOrder = {
    "chambrepublier",
    "client",
    "dateReserv",
    "etat",
    "facture",
    "factures",
    "idReservation",
    "independant"
})
public class Reservation {

    protected Chambrepublier chambrepublier;
    protected Client client;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateReserv;
    protected String etat;
    protected Facture facture;
    @XmlElement(nillable = true)
    protected List<Facture> factures;
    protected int idReservation;
    protected Independant independant;

    /**
     * Obtient la valeur de la propriété chambrepublier.
     * 
     * @return
     *     possible object is
     *     {@link Chambrepublier }
     *     
     */
    public Chambrepublier getChambrepublier() {
        return chambrepublier;
    }

    /**
     * Définit la valeur de la propriété chambrepublier.
     * 
     * @param value
     *     allowed object is
     *     {@link Chambrepublier }
     *     
     */
    public void setChambrepublier(Chambrepublier value) {
        this.chambrepublier = value;
    }

    /**
     * Obtient la valeur de la propriété client.
     * 
     * @return
     *     possible object is
     *     {@link Client }
     *     
     */
    public Client getClient() {
        return client;
    }

    /**
     * Définit la valeur de la propriété client.
     * 
     * @param value
     *     allowed object is
     *     {@link Client }
     *     
     */
    public void setClient(Client value) {
        this.client = value;
    }

    /**
     * Obtient la valeur de la propriété dateReserv.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateReserv() {
        return dateReserv;
    }

    /**
     * Définit la valeur de la propriété dateReserv.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateReserv(XMLGregorianCalendar value) {
        this.dateReserv = value;
    }

    /**
     * Obtient la valeur de la propriété etat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Définit la valeur de la propriété etat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtat(String value) {
        this.etat = value;
    }

    /**
     * Obtient la valeur de la propriété facture.
     * 
     * @return
     *     possible object is
     *     {@link Facture }
     *     
     */
    public Facture getFacture() {
        return facture;
    }

    /**
     * Définit la valeur de la propriété facture.
     * 
     * @param value
     *     allowed object is
     *     {@link Facture }
     *     
     */
    public void setFacture(Facture value) {
        this.facture = value;
    }

    /**
     * Gets the value of the factures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the factures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Facture }
     * 
     * 
     */
    public List<Facture> getFactures() {
        if (factures == null) {
            factures = new ArrayList<Facture>();
        }
        return this.factures;
    }

    /**
     * Obtient la valeur de la propriété idReservation.
     * 
     */
    public int getIdReservation() {
        return idReservation;
    }

    /**
     * Définit la valeur de la propriété idReservation.
     * 
     */
    public void setIdReservation(int value) {
        this.idReservation = value;
    }

    /**
     * Obtient la valeur de la propriété independant.
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
     * Définit la valeur de la propriété independant.
     * 
     * @param value
     *     allowed object is
     *     {@link Independant }
     *     
     */
    public void setIndependant(Independant value) {
        this.independant = value;
    }

}
