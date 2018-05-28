package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the chambrepublier database table.
 * 
 */
@Entity
@NamedQuery(name="Chambrepublier.findAll", query="SELECT c FROM Chambrepublier c")
public class Chambrepublier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_publication")
	private int idPublication;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_fin_enchere")
	private Date dateFinEnchere;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_publication")
	private Date datePublication;

	private byte enchere;

	private double prix;

	private String statut;

	//bi-directional many-to-one association to Chambre
	@ManyToOne
	@JoinColumn(name="id_chambre")
	private Chambre chambre;

	//bi-directional many-to-one association to Promotionchambre
	@OneToMany(mappedBy="chambrepublier", fetch=FetchType.EAGER)
	private Set<Promotionchambre> promotionchambres;

	//bi-directional many-to-one association to Reservation
	@OneToMany(mappedBy="chambrepublier", fetch=FetchType.EAGER)
	private Set<Reservation> reservations;

	public Chambrepublier() {
	}

	public int getIdPublication() {
		return this.idPublication;
	}

	public void setIdPublication(int idPublication) {
		this.idPublication = idPublication;
	}

	public Date getDateFinEnchere() {
		return this.dateFinEnchere;
	}

	public void setDateFinEnchere(Date dateFinEnchere) {
		this.dateFinEnchere = dateFinEnchere;
	}

	public Date getDatePublication() {
		return this.datePublication;
	}

	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}

	public byte getEnchere() {
		return this.enchere;
	}

	public void setEnchere(byte enchere) {
		this.enchere = enchere;
	}

	public double getPrix() {
		return this.prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public Chambre getChambre() {
		return this.chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public Set<Promotionchambre> getPromotionchambres() {
		return this.promotionchambres;
	}

	public void setPromotionchambres(Set<Promotionchambre> promotionchambres) {
		this.promotionchambres = promotionchambres;
	}

	public Promotionchambre addPromotionchambre(Promotionchambre promotionchambre) {
		getPromotionchambres().add(promotionchambre);
		promotionchambre.setChambrepublier(this);

		return promotionchambre;
	}

	public Promotionchambre removePromotionchambre(Promotionchambre promotionchambre) {
		getPromotionchambres().remove(promotionchambre);
		promotionchambre.setChambrepublier(null);

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
		reservation.setChambrepublier(this);

		return reservation;
	}

	public Reservation removeReservation(Reservation reservation) {
		getReservations().remove(reservation);
		reservation.setChambrepublier(null);

		return reservation;
	}

}