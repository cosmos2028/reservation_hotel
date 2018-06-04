
package wshotelmetier;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour client complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="client"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="avisclientsurhotels" type="{http://ws/}avisclientsurhotel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codePostal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="courriel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idClient" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="langue" type="{http://ws/}langue" minOccurs="0"/&gt;
 *         &lt;element name="motDePass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promotionchambres" type="{http://ws/}promotionchambre" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="reservations" type="{http://ws/}reservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client", propOrder = {
    "adresse",
    "avisclientsurhotels",
    "codePostal",
    "courriel",
    "idClient",
    "langue",
    "motDePass",
    "nom",
    "prenom",
    "promotionchambres",
    "reservations",
    "telephone",
    "ville"
})
public class Client {

    protected String adresse;
    @XmlElement(nillable = true)
    protected List<Avisclientsurhotel> avisclientsurhotels;
    protected int codePostal;
    protected String courriel;
    protected int idClient;
    protected Langue langue;
    protected String motDePass;
    protected String nom;
    protected String prenom;
    @XmlElement(nillable = true)
    protected List<Promotionchambre> promotionchambres;
    @XmlElement(nillable = true)
    protected List<Reservation> reservations;
    protected String telephone;
    protected String ville;

    /**
     * Obtient la valeur de la propri�t� adresse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * D�finit la valeur de la propri�t� adresse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresse(String value) {
        this.adresse = value;
    }

    /**
     * Gets the value of the avisclientsurhotels property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the avisclientsurhotels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvisclientsurhotels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Avisclientsurhotel }
     * 
     * 
     */
    public List<Avisclientsurhotel> getAvisclientsurhotels() {
        if (avisclientsurhotels == null) {
            avisclientsurhotels = new ArrayList<Avisclientsurhotel>();
        }
        return this.avisclientsurhotels;
    }

    /**
     * Obtient la valeur de la propri�t� codePostal.
     * 
     */
    public int getCodePostal() {
        return codePostal;
    }

    /**
     * D�finit la valeur de la propri�t� codePostal.
     * 
     */
    public void setCodePostal(int value) {
        this.codePostal = value;
    }

    /**
     * Obtient la valeur de la propri�t� courriel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourriel() {
        return courriel;
    }

    /**
     * D�finit la valeur de la propri�t� courriel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourriel(String value) {
        this.courriel = value;
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

    /**
     * Obtient la valeur de la propri�t� langue.
     * 
     * @return
     *     possible object is
     *     {@link Langue }
     *     
     */
    public Langue getLangue() {
        return langue;
    }

    /**
     * D�finit la valeur de la propri�t� langue.
     * 
     * @param value
     *     allowed object is
     *     {@link Langue }
     *     
     */
    public void setLangue(Langue value) {
        this.langue = value;
    }

    /**
     * Obtient la valeur de la propri�t� motDePass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotDePass() {
        return motDePass;
    }

    /**
     * D�finit la valeur de la propri�t� motDePass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotDePass(String value) {
        this.motDePass = value;
    }

    /**
     * Obtient la valeur de la propri�t� nom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * D�finit la valeur de la propri�t� nom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propri�t� prenom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * D�finit la valeur de la propri�t� prenom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenom(String value) {
        this.prenom = value;
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
     * Obtient la valeur de la propri�t� telephone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * D�finit la valeur de la propri�t� telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Obtient la valeur de la propri�t� ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * D�finit la valeur de la propri�t� ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

}
