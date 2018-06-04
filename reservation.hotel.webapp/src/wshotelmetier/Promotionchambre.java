
package wshotelmetier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour promotionchambre complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propri�t� chambrepublier.
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
     * D�finit la valeur de la propri�t� chambrepublier.
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
     * Obtient la valeur de la propri�t� client.
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
     * D�finit la valeur de la propri�t� client.
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
     * Obtient la valeur de la propri�t� gagne.
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
     * D�finit la valeur de la propri�t� gagne.
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
     * Obtient la valeur de la propri�t� id.
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
     * D�finit la valeur de la propri�t� id.
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
     * Obtient la valeur de la propri�t� prixPropose.
     * 
     */
    public double getPrixPropose() {
        return prixPropose;
    }

    /**
     * D�finit la valeur de la propri�t� prixPropose.
     * 
     */
    public void setPrixPropose(double value) {
        this.prixPropose = value;
    }

}
