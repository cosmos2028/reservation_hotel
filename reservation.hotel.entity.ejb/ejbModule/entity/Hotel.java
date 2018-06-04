package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the hotel database table.
 * 
 */
@Entity
@NamedQuery(name="Hotel.findAll", query="SELECT h FROM Hotel h")
public class Hotel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="code_hotel")
	private int codeHotel;

	private String adresse;

	private int codePostal;

	private String courriel;

	@Column(name="nom_hotel")
	private String nomHotel;

	private String telephone;

	private String ville;

	//bi-directional many-to-one association to Avisclientsurhotel
	@OneToMany(mappedBy="hotel", fetch=FetchType.EAGER)
	private Set<Avisclientsurhotel> avisclientsurhotels;

	//bi-directional many-to-one association to Chambre
	@OneToMany(mappedBy="hotel", fetch=FetchType.EAGER)
	private Set<Chambre> chambres;

	//bi-directional many-to-many association to Service
	@ManyToMany(mappedBy="hotels", fetch=FetchType.EAGER)
	private Set<Service> services;

	public Hotel() {
	}

	public int getCodeHotel() {
		return this.codeHotel;
	}

	public void setCodeHotel(int codeHotel) {
		this.codeHotel = codeHotel;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getCourriel() {
		return this.courriel;
	}

	public void setCourriel(String courriel) {
		this.courriel = courriel;
	}

	public String getNomHotel() {
		return this.nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Set<Avisclientsurhotel> getAvisclientsurhotels() {
		return this.avisclientsurhotels;
	}

	public void setAvisclientsurhotels(Set<Avisclientsurhotel> avisclientsurhotels) {
		this.avisclientsurhotels = avisclientsurhotels;
	}

	public Avisclientsurhotel addAvisclientsurhotel(Avisclientsurhotel avisclientsurhotel) {
		getAvisclientsurhotels().add(avisclientsurhotel);
		avisclientsurhotel.setHotel(this);

		return avisclientsurhotel;
	}

	public Avisclientsurhotel removeAvisclientsurhotel(Avisclientsurhotel avisclientsurhotel) {
		getAvisclientsurhotels().remove(avisclientsurhotel);
		avisclientsurhotel.setHotel(null);

		return avisclientsurhotel;
	}

	public Set<Chambre> getChambres() {
		return this.chambres;
	}

	public void setChambres(Set<Chambre> chambres) {
		this.chambres = chambres;
	}

	public Chambre addChambre(Chambre chambre) {
		getChambres().add(chambre);
		chambre.setHotel(this);

		return chambre;
	}

	public Chambre removeChambre(Chambre chambre) {
		getChambres().remove(chambre);
		chambre.setHotel(null);

		return chambre;
	}

	public Set<Service> getServices() {
		return this.services;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

}