
package wshotel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour hotel complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="hotel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="avisclientsurhotels" type="{http://ws/}avisclientsurhotel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="chambres" type="{http://ws/}chambre" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codeHotel" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codePostal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="courriel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomHotel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="profil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="services" type="{http://ws/}service" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "hotel", propOrder = {
    "adresse",
    "avisclientsurhotels",
    "chambres",
    "codeHotel",
    "codePostal",
    "courriel",
    "nomHotel",
    "profil",
    "services",
    "telephone",
    "ville"
})
public class Hotel {

    protected String adresse;
    @XmlElement(nillable = true)
    protected List<Avisclientsurhotel> avisclientsurhotels;
    @XmlElement(nillable = true)
    protected List<Chambre> chambres;
    protected int codeHotel;
    protected int codePostal;
    protected String courriel;
    protected String nomHotel;
    protected String profil;
    @XmlElement(nillable = true)
    protected List<Service> services;
    protected String telephone;
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
     * Obtient la valeur de la propriété codeHotel.
     * 
     */
    public int getCodeHotel() {
        return codeHotel;
    }

    /**
     * Définit la valeur de la propriété codeHotel.
     * 
     */
    public void setCodeHotel(int value) {
        this.codeHotel = value;
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
     * Obtient la valeur de la propriété nomHotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomHotel() {
        return nomHotel;
    }

    /**
     * Définit la valeur de la propriété nomHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomHotel(String value) {
        this.nomHotel = value;
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
     * Gets the value of the services property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the services property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Service }
     * 
     * 
     */
    public List<Service> getServices() {
        if (services == null) {
            services = new ArrayList<Service>();
        }
        return this.services;
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
