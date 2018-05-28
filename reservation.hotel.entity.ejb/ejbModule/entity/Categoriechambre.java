package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the categoriechambre database table.
 * 
 */
@Entity
@NamedQuery(name="Categoriechambre.findAll", query="SELECT c FROM Categoriechambre c")
public class Categoriechambre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_catChambre;

	private String nomCatChambre;

	//bi-directional many-to-one association to Chambre
	@OneToMany(mappedBy="categoriechambre", fetch=FetchType.EAGER)
	private Set<Chambre> chambres;

	public Categoriechambre() {
	}

	public int getId_catChambre() {
		return this.id_catChambre;
	}

	public void setId_catChambre(int id_catChambre) {
		this.id_catChambre = id_catChambre;
	}

	public String getNomCatChambre() {
		return this.nomCatChambre;
	}

	public void setNomCatChambre(String nomCatChambre) {
		this.nomCatChambre = nomCatChambre;
	}

	public Set<Chambre> getChambres() {
		return this.chambres;
	}

	public void setChambres(Set<Chambre> chambres) {
		this.chambres = chambres;
	}

	public Chambre addChambre(Chambre chambre) {
		getChambres().add(chambre);
		chambre.setCategoriechambre(this);

		return chambre;
	}

	public Chambre removeChambre(Chambre chambre) {
		getChambres().remove(chambre);
		chambre.setCategoriechambre(null);

		return chambre;
	}

}