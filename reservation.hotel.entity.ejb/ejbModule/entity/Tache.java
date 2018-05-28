package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the tache database table.
 * 
 */
@Entity
@NamedQuery(name="Tache.findAll", query="SELECT t FROM Tache t")
public class Tache implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_tache")
	private int idTache;

	private String libelle;

	private String statut;

	//bi-directional many-to-one association to IndEffectueTache
	@OneToMany(mappedBy="tache", fetch=FetchType.EAGER)
	private Set<IndEffectueTache> indEffectueTaches;

	//bi-directional many-to-one association to TypeTache
	@ManyToOne
	@JoinColumn(name="id_type_tache")
	private TypeTache typeTache;

	public Tache() {
	}

	public int getIdTache() {
		return this.idTache;
	}

	public void setIdTache(int idTache) {
		this.idTache = idTache;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Set<IndEffectueTache> getIndEffectueTaches() {
		return this.indEffectueTaches;
	}

	public void setIndEffectueTaches(Set<IndEffectueTache> indEffectueTaches) {
		this.indEffectueTaches = indEffectueTaches;
	}

	public IndEffectueTache addIndEffectueTach(IndEffectueTache indEffectueTach) {
		getIndEffectueTaches().add(indEffectueTach);
		indEffectueTach.setTache(this);

		return indEffectueTach;
	}

	public IndEffectueTache removeIndEffectueTach(IndEffectueTache indEffectueTach) {
		getIndEffectueTaches().remove(indEffectueTach);
		indEffectueTach.setTache(null);

		return indEffectueTach;
	}

	public TypeTache getTypeTache() {
		return this.typeTache;
	}

	public void setTypeTache(TypeTache typeTache) {
		this.typeTache = typeTache;
	}

}