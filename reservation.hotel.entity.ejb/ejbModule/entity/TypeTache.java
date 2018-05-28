package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the type_tache database table.
 * 
 */
@Entity
@Table(name="type_tache")
@NamedQuery(name="TypeTache.findAll", query="SELECT t FROM TypeTache t")
public class TypeTache implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_type_tache")
	private int idTypeTache;

	private String difficulte;

	private String libelle;

	@Column(name="point_associe")
	private int pointAssocie;

	//bi-directional many-to-one association to Tache
	@OneToMany(mappedBy="typeTache", fetch=FetchType.EAGER)
	private Set<Tache> taches;

	public TypeTache() {
	}

	public int getIdTypeTache() {
		return this.idTypeTache;
	}

	public void setIdTypeTache(int idTypeTache) {
		this.idTypeTache = idTypeTache;
	}

	public String getDifficulte() {
		return this.difficulte;
	}

	public void setDifficulte(String difficulte) {
		this.difficulte = difficulte;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getPointAssocie() {
		return this.pointAssocie;
	}

	public void setPointAssocie(int pointAssocie) {
		this.pointAssocie = pointAssocie;
	}

	public Set<Tache> getTaches() {
		return this.taches;
	}

	public void setTaches(Set<Tache> taches) {
		this.taches = taches;
	}

	public Tache addTach(Tache tach) {
		getTaches().add(tach);
		tach.setTypeTache(this);

		return tach;
	}

	public Tache removeTach(Tache tach) {
		getTaches().remove(tach);
		tach.setTypeTache(null);

		return tach;
	}

}