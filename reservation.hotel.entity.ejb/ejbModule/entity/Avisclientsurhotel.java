package entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the avisclientsurhotel database table.
 * 
 */
@Entity
@NamedQuery(name="Avisclientsurhotel.findAll", query="SELECT a FROM Avisclientsurhotel a")
public class Avisclientsurhotel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AvisclientsurhotelPK id;

	private String commentaire;

	private int note;

	//bi-directional many-to-one association to Hotel
	@ManyToOne
	@JoinColumn(name="code_hotel", insertable=false, updatable=false)
	private Hotel hotel;

	//bi-directional many-to-one association to Client
	@ManyToOne
	@JoinColumn(name="id_client", insertable=false, updatable=false)
	private Client client;

	public Avisclientsurhotel() {
	}

	public AvisclientsurhotelPK getId() {
		return this.id;
	}

	public void setId(AvisclientsurhotelPK id) {
		this.id = id;
	}

	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public int getNote() {
		return this.note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}