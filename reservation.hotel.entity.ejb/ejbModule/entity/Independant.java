package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the independant database table.
 * 
 */
@Entity
@NamedQuery(name="Independant.findAll", query="SELECT i FROM Independant i")
public class Independant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_independant")
	private int idIndependant;

	private String adresse;

	private int codePostal;

	private String courriel;

	private String nom;

	private String prenom;

	private String profil;

	private String telephone;

	@Column(name="total_point")
	private int totalPoint;

	private String ville;

	//bi-directional many-to-one association to IndEffectueTache
	@OneToMany(mappedBy="independant", fetch=FetchType.EAGER)
	private Set<IndEffectueTache> indEffectueTaches;

	//bi-directional many-to-one association to Reservation
	@OneToMany(mappedBy="independant", fetch=FetchType.EAGER)
	private Set<Reservation> reservations;

	public Independant() {
	}

	public int getIdIndependant() {
		return this.idIndependant;
	}

	public void setIdIndependant(int idIndependant) {
		this.idIndependant = idIndependant;
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

	public String getProfil() {
		return this.profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getTotalPoint() {
		return this.totalPoint;
	}

	public void setTotalPoint(int totalPoint) {
		this.totalPoint = totalPoint;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Set<IndEffectueTache> getIndEffectueTaches() {
		return this.indEffectueTaches;
	}

	public void setIndEffectueTaches(Set<IndEffectueTache> indEffectueTaches) {
		this.indEffectueTaches = indEffectueTaches;
	}

	public IndEffectueTache addIndEffectueTach(IndEffectueTache indEffectueTach) {
		getIndEffectueTaches().add(indEffectueTach);
		indEffectueTach.setIndependant(this);

		return indEffectueTach;
	}

	public IndEffectueTache removeIndEffectueTach(IndEffectueTache indEffectueTach) {
		getIndEffectueTaches().remove(indEffectueTach);
		indEffectueTach.setIndependant(null);

		return indEffectueTach;
	}

	public Set<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Reservation addReservation(Reservation reservation) {
		getReservations().add(reservation);
		reservation.setIndependant(this);

		return reservation;
	}

	public Reservation removeReservation(Reservation reservation) {
		getReservations().remove(reservation);
		reservation.setIndependant(null);

		return reservation;
	}

}