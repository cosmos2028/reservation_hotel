package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the chambre database table.
 * 
 */
@Entity
@NamedQuery(name="Chambre.findAll", query="SELECT c FROM Chambre c")
public class Chambre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_chambre")
	private int idChambre;

	private int capaciteAccueil;

	private String description;

	private String photo;

	//bi-directional many-to-many association to Accessibilite
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name="accessibilitechambre"
		, joinColumns={
			@JoinColumn(name="id_chambre")
			}
		, inverseJoinColumns={
			@JoinColumn(name="id_acces")
			}
		)
	private Set<Accessibilite> accessibilites;

	//bi-directional many-to-one association to Hotel
	@ManyToOne
	@JoinColumn(name="code_hotel")
	private Hotel hotel;

	//bi-directional many-to-one association to Categoriechambre
	@ManyToOne
	@JoinColumn(name="id_catChambre")
	private Categoriechambre categoriechambre;

	//bi-directional many-to-one association to Chambrepublier
	@OneToMany(mappedBy="chambre", fetch=FetchType.EAGER)
	private Set<Chambrepublier> chambrepubliers;

	//bi-directional many-to-many association to Equipement
	@ManyToMany(mappedBy="chambres", fetch=FetchType.EAGER)
	private Set<Equipement> equipements;

	public Chambre() {
	}

	public int getIdChambre() {
		return this.idChambre;
	}

	public void setIdChambre(int idChambre) {
		this.idChambre = idChambre;
	}

	public int getCapaciteAccueil() {
		return this.capaciteAccueil;
	}

	public void setCapaciteAccueil(int capaciteAccueil) {
		this.capaciteAccueil = capaciteAccueil;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Set<Accessibilite> getAccessibilites() {
		return this.accessibilites;
	}

	public void setAccessibilites(Set<Accessibilite> accessibilites) {
		this.accessibilites = accessibilites;
	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Categoriechambre getCategoriechambre() {
		return this.categoriechambre;
	}

	public void setCategoriechambre(Categoriechambre categoriechambre) {
		this.categoriechambre = categoriechambre;
	}

	public Set<Chambrepublier> getChambrepubliers() {
		return this.chambrepubliers;
	}

	public void setChambrepubliers(Set<Chambrepublier> chambrepubliers) {
		this.chambrepubliers = chambrepubliers;
	}

	public Chambrepublier addChambrepublier(Chambrepublier chambrepublier) {
		getChambrepubliers().add(chambrepublier);
		chambrepublier.setChambre(this);

		return chambrepublier;
	}

	public Chambrepublier removeChambrepublier(Chambrepublier chambrepublier) {
		getChambrepubliers().remove(chambrepublier);
		chambrepublier.setChambre(null);

		return chambrepublier;
	}

	public Set<Equipement> getEquipements() {
		return this.equipements;
	}

	public void setEquipements(Set<Equipement> equipements) {
		this.equipements = equipements;
	}

}