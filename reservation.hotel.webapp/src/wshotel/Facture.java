
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
 * <p>Classe Java pour facture complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="facture"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateFacture" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="idFacture" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="montantRegle" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="reservation" type="{http://ws/}reservation" minOccurs="0"/&gt;
 *         &lt;element name="reservations" type="{http://ws/}reservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resteAPayer" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facture", propOrder = {
    "dateFacture",
    "idFacture",
    "montantRegle",
    "reservation",
    "reservations",
    "resteAPayer"
})
public class Facture {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFacture;
    protected int idFacture;
    protected double montantRegle;
    protected Reservation reservation;
    @XmlElement(nillable = true)
    protected List<Reservation> reservations;
    protected double resteAPayer;

    /**
     * Obtient la valeur de la propriété dateFacture.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateFacture() {
        return dateFacture;
    }

    /**
     * Définit la valeur de la propriété dateFacture.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateFacture(XMLGregorianCalendar value) {
        this.dateFacture = value;
    }

    /**
     * Obtient la valeur de la propriété idFacture.
     * 
     */
    public int getIdFacture() {
        return idFacture;
    }

    /**
     * Définit la valeur de la propriété idFacture.
     * 
     */
    public void setIdFacture(int value) {
        this.idFacture = value;
    }

    /**
     * Obtient la valeur de la propriété montantRegle.
     * 
     */
    public double getMontantRegle() {
        return montantRegle;
    }

    /**
     * Définit la valeur de la propriété montantRegle.
     * 
     */
    public void setMontantRegle(double value) {
        this.montantRegle = value;
    }

    /**
     * Obtient la valeur de la propriété reservation.
     * 
     * @return
     *     possible object is
     *     {@link Reservation }
     *     
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * Définit la valeur de la propriété reservation.
     * 
     * @param value
     *     allowed object is
     *     {@link Reservation }
     *     
     */
    public void setReservation(Reservation value) {
        this.reservation = value;
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
     * Obtient la valeur de la propriété resteAPayer.
     * 
     */
    public double getResteAPayer() {
        return resteAPayer;
    }

    /**
     * Définit la valeur de la propriété resteAPayer.
     * 
     */
    public void setResteAPayer(double value) {
        this.resteAPayer = value;
    }

}
