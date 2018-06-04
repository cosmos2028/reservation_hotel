package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the promotionchambre database table.
 * 
 */
@Entity
@NamedQuery(name="Promotionchambre.findAll", query="SELECT p FROM Promotionchambre p")
public class Promotionchambre implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PromotionchambrePK id;

	private String gagne;

	@Column(name="prix_propose")
	private double prixPropose;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="id_client", insertable=false, updatable=false)
	private Client client;

	//bi-directional many-to-one association to Chambrepublier
	@ManyToOne
	@JoinColumn(name="id_publication", insertable=false, updatable=false)
	private Chambrepublier chambrepublier;

	public Promotionchambre() {
	}

	public PromotionchambrePK getId() {
		return this.id;
	}

	public void setId(PromotionchambrePK id) {
		this.id = id;
	}

	public String getGagne() {
		return this.gagne;
	}

	public void setGagne(String gagne) {
		this.gagne = gagne;
	}

	public double getPrixPropose() {
		return this.prixPropose;
	}

	public void setPrixPropose(double prixPropose) {
		this.prixPropose = prixPropose;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Chambrepublier getChambrepublier() {
		return this.chambrepublier;
	}

	public void setChambrepublier(Chambrepublier chambrepublier) {
		this.chambrepublier = chambrepublier;
	}

}