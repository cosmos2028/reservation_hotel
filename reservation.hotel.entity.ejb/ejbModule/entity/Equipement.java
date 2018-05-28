package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the equipement database table.
 * 
 */
@Entity
@NamedQuery(name="Equipement.findAll", query="SELECT e FROM Equipement e")
public class Equipement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_equipement")
	private int idEquipement;

	private String libelle;

	//bi-directional many-to-many association to Chambre
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name="equipementdeschambres"
		, joinColumns={
			@JoinColumn(name="id_equipement")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_chambre")
			}
		)
	private Set<Chambre> chambres;

	public Equipement() {
	}

	public int getIdEquipement() {
		return this.idEquipement;
	}

	public void setIdEquipement(int idEquipement) {
		this.idEquipement = idEquipement;
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