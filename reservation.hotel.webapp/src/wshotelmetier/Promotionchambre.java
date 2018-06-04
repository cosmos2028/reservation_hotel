
package wshotelmetier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour promotionchambre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="promotionchambre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chambrepublier" type="{http://ws/}chambrepublier" minOccurs="0"/&gt;
 *         &lt;element name="client" type="{http://ws/}client" minOccurs="0"/&gt;
 *         &lt;element name="gagne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://ws/}promotionchambrePK" minOccurs="0"/&gt;
 *         &lt;element name="prixPropose" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotionchambre", propOrder = {
    "chambrepublier",
    "client",
    "gagne",
    "id",
    "prixPropose"
})
public class Promotionchambre {

    protected Chambrepublier chambrepublier;
    protected Client client;
    protected String gagne;
    protected PromotionchambrePK id;
    protected double prixPropose;

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
     * Obtient la valeur de la propriété gagne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGagne() {
        return gagne;
    }

    /**
     * Définit la valeur de la propriété gagne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGagne(String value) {
        this.gagne = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link PromotionchambrePK }
     *     
     */
    public PromotionchambrePK getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionchambrePK }
     *     
     */
    public void setId(PromotionchambrePK value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété prixPropose.
     * 
     */
    public double getPrixPropose() {
        return prixPropose;
    }

    /**
     * Définit la valeur de la propriété prixPropose.
     * 
     */
    public void setPrixPropose(double value) {
        this.prixPropose = value;
    }

}
