package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the accessibilite database table.
 * 
 */
@Entity
@NamedQuery(name="Accessibilite.findAll", query="SELECT a FROM Accessibilite a")
public class Accessibilite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_acces")
	private int idAcces;

	private String libelle;

	//bi-directional many-to-many association to Chambre
	@ManyToMany(mappedBy="accessibilites", fetch=FetchType.EAGER)
	private Set<Chambre> chambres;

	public Accessibilite() {
	}

	public int getIdAcces() {
		return this.idAcces;
	}

	public void setIdAcces(int idAcces) {
		this.idAcces = idAcces;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Set<Chambre> getChambres() {
		return this.chambres;
	}

	public void setChambres(Set<Chambre> chambres) {
		this.chambres = chambres;
	}

}