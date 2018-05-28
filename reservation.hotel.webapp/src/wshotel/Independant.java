
package wshotel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour independant complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="independant"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codePostal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="courriel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idIndependant" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="indEffectueTaches" type="{http://ws/}indEffectueTache" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reservations" type="{http://ws/}reservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalPoint" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "independant", propOrder = {
    "adresse",
    "codePostal",
    "courriel",
    "idIndependant",
    "indEffectueTaches",
    "nom",
    "prenom",
    "profil",
    "reservations",
    "telephone",
    "totalPoint",
    "ville"
})
public class Independant {

    protected String adresse;
    protected int codePostal;
    protected String courriel;
    protected int idIndependant;
    @XmlElement(nillable = true)
    protected List<IndEffectueTache> indEffectueTaches;
    protected String nom;
    protected String prenom;
    protected String profil;
    @XmlElement(nillable = true)
    protected List<Reservation> reservations;
    protected String telephone;
    protected int totalPoint;
    protected String ville;

    /**
     * Obtient la valeur de la propriété adresse.
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
     * Définit la valeur de la propriété adresse.
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
     * Obtient la valeur de la propriété codePostal.
     * 
     */
    public int getCodePostal() {
        return codePostal;
    }

    /**
     * Définit la valeur de la propriété codePostal.
     * 
     */
    public void setCodePostal(int value) {
        this.codePostal = value;
    }

    /**
     * Obtient la valeur de la propriété courriel.
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
     * Définit la valeur de la propriété courriel.
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
     * Obtient la valeur de la propriété nom.
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
     * Définit la valeur de la propriété nom.
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
     * Obtient la valeur de la propriété prenom.
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
     * Définit la valeur de la propriété prenom.
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
     * Obtient la valeur de la propriété profil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfil() {
        return profil;
    }

    /**
     * Définit la valeur de la propriété profil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfil(String value) {
        this.profil = value;
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
     * Obtient la valeur de la propriété telephone.
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
     * Définit la valeur de la propriété telephone.
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
     * Obtient la valeur de la propriété totalPoint.
     * 
     */
    public int getTotalPoint() {
        return totalPoint;
    }

    /**
     * Définit la valeur de la propriété totalPoint.
     * 
     */
    public void setTotalPoint(int value) {
        this.totalPoint = value;
    }

    /**
     * Obtient la valeur de la propriété ville.
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
     * Définit la valeur de la propriété ville.
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
