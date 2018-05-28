package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the reservation database table.
 * 
 */
@Entity
@NamedQuery(name="Reservation.findAll", query="SELECT r FROM Reservation r")
public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_reservation")
	private int idReservation;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateReserv;

	private String etat;

	//bi-directional many-to-one association to Facture
	@OneToMany(mappedBy="reservation", fetch=FetchType.EAGER)
	private Set<Facture> factures;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;

	//bi-directional many-to-one association to Facture
	@ManyToOne
	@JoinColumn(name="id_facture")
	private Facture facture;

	//bi-directional many-to-one association to Independant
	@ManyToOne
	@JoinColumn(name="id_independant")
	private Independant independant;

	//bi-directional many-to-one association to Chambrepublier
	@ManyToOne
	@JoinColumn(name="id_publication")
	private Chambrepublier chambrepublier;

	public Reservation() {
	}

	public int getIdReservation() {
		return this.idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateReserv() {
		return this.dateReserv;
	}

	public void setDateReserv(Date dateReserv) {
		this.dateReserv = dateReserv;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Set<Facture> getFactures() {
		return this.factures;
	}

	public void setFactures(Set<Facture> factures) {
		this.factures = factures;
	}

	public Facture addFacture(Facture facture) {
		getFactures().add(facture);
		facture.setReservation(this);

		return facture;
	}

	public Facture removeFacture(Facture facture) {
		getFactures().remove(facture);
		facture.setReservation(null);

		return facture;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Facture getFacture() {
		return this.facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Independant getIndependant() {
		return this.independant;
	}

	public void setIndependant(Independant independant) {
		this.independant = independant;
	}

	public Chambrepublier getChambrepublier() {
		return this.chambrepublier;
	}

	public void setChambrepublier(Chambrepublier chambrepublier) {
		this.chambrepublier = chambrepublier;
	}

}