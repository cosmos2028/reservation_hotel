package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@NamedQuery(name="Client.findAll", query="SELECT c FROM Client c")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_client")
	private int idClient;

	private String adresse;

	private int codePostal;

	private String courriel;

	private String motDePass;

	private String nom;

	private String prenom;

	private String telephone;

	private String ville;

	//bi-directional many-to-one association to Avisclientsurhotel
	@OneToMany(mappedBy="client", fetch=FetchType.EAGER)
	private Set<Avisclientsurhotel> avisclientsurhotels;

	//bi-directional many-to-one association to Langue
	@ManyToOne
	@JoinColumn(name="id_langue")
	private Langue langue;

	//bi-directional many-to-one association to Promotionchambre
	@OneToMany(mappedBy="client", fetch=FetchType.EAGER)
	private Set<Promotionchambre> promotionchambres;

	//bi-directional many-to-one association to Reservation
	@OneToMany(mappedBy="client", fetch=FetchType.EAGER)
	private Set<Reservation> reservations;

	public Client() {
	}

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
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

	public String getMotDePass() {
		return this.motDePass;
	}

	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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
		avisclientsurhotel.setClient(this);

		return avisclientsurhotel;
	}

	public Avisclientsurhotel removeAvisclientsurhotel(Avisclientsurhotel avisclientsurhotel) {
		getAvisclientsurhotels().remove(avisclientsurhotel);
		avisclientsurhotel.setClient(null);

		return avisclientsurhotel;
	}

	public Langue getLangue() {
		return this.langue;
	}

	public void setLangue(Langue langue) {
		this.langue = langue;
	}

	public Set<Promotionchambre> getPromotionchambres() {
		return this.promotionchambres;
	}

	public void setPromotionchambres(Set<Promotionchambre> promotionchambres) {
		this.promotionchambres = promotionchambres;
	}

	public Promotionchambre addPromotionchambre(Promotionchambre promotionchambre) {
		getPromotionchambres().add(promotionchambre);
		promotionchambre.setClient(this);

		return promotionchambre;
	}

	public Promotionchambre removePromotionchambre(Promotionchambre promotionchambre) {
		getPromotionchambres().remove(promotionchambre);
		promotionchambre.setClient(null);

		return promotionchambre;
	}

	public Set<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Reservation addReservation(Reservation reservation) {
		getReservations().add(reservation);
		reservation.setClient(this);

		return reservation;
	}

	public Reservation removeReservation(Reservation reservation) {
		getReservations().remove(reservation);
		reservation.setClient(null);

		return reservation;
	}

}