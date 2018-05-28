package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the facture database table.
 * 
 */
@Entity
@NamedQuery(name="Facture.findAll", query="SELECT f FROM Facture f")
public class Facture implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_facture")
	private int idFacture;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_facture")
	private Date dateFacture;

	@Column(name="montant_regle")
	private double montantRegle;

	@Column(name="reste_a_payer")
	private double resteAPayer;

	//bi-directional many-to-one association to Reservation
	@ManyToOne
	@JoinColumn(name="id_reservation")
	private Reservation reservation;

	//bi-directional many-to-one association to Reservation
	@OneToMany(mappedBy="facture", fetch=FetchType.EAGER)
	private Set<Reservation> reservations;

	public Facture() {
	}

	public int getIdFacture() {
		return this.idFacture;
	}

	public void setIdFacture(int idFacture) {
		this.idFacture = idFacture;
	}

	public Date getDateFacture() {
		return this.dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public double getMontantRegle() {
		return this.montantRegle;
	}

	public void setMontantRegle(double montantRegle) {
		this.montantRegle = montantRegle;
	}

	public double getResteAPayer() {
		return this.resteAPayer;
	}

	public void setResteAPayer(double resteAPayer) {
		this.resteAPayer = resteAPayer;
	}

	public Reservation getReservation() {
		return this.reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Set<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Reservation addReservation(Reservation reservation) {
		getReservations().add(reservation);
		reservation.setFacture(this);

		return reservation;
	}

	public Reservation removeReservation(Reservation reservation) {
		getReservations().remove(reservation);
		reservation.setFacture(null);

		return reservation;
	}

}