
package wshotelmetier;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour langue complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="langue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clients" type="{http://ws/}client" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="idLangue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nomLangue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "langue", propOrder = {
    "clients",
    "idLangue",
    "nomLangue"
})
public class Langue {

    @XmlElement(nillable = true)
    protected List<Client> clients;
    protected int idLangue;
    protected String nomLangue;

    /**
     * Gets the value of the clients property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clients property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClients().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Client }
     * 
     * 
     */
    public List<Client> getClients() {
        if (clients == null) {
            clients = new ArrayList<Client>();
        }
        return this.clients;
    }

    /**
     * Obtient la valeur de la propriété idLangue.
     * 
     */
    public int getIdLangue() {
        return idLangue;
    }

    /**
     * Définit la valeur de la propriété idLangue.
     * 
     */
    public void setIdLangue(int value) {
        this.idLangue = value;
    }

    /**
     * Obtient la valeur de la propriété nomLangue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomLangue() {
        return nomLangue;
    }

    /**
     * Définit la valeur de la propriété nomLangue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomLangue(String value) {
        this.nomLangue = value;
    }

}
