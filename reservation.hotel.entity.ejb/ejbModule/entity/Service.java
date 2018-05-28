package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the service database table.
 * 
 */
@Entity
@NamedQuery(name="Service.findAll", query="SELECT s FROM Service s")
public class Service implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_service")
	private int idService;

	private String description;

	private String libelle;

	private byte offert;

	private String photo;

	//bi-directional many-to-many association to Hotel
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(
		name="serviceshotel"
		, joinColumns={
			@JoinColumn(name="id_service")
			}
		, inverseJoinColumns={
			@JoinColumn(name="code_hotel")
			}
		)
	private Set<Hotel> hotels;

	public Service() {
	}

	public int getIdService() {
		return this.idService;
	}

	public void setIdService(int idService) {
		this.idService = idService;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public byte getOffert() {
		return this.offert;
	}

	public void setOffert(byte offert) {
		this.offert = offert;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Set<Hotel> getHotels() {
		return this.hotels;
	}

	public void setHotels(Set<Hotel> hotels) {
		this.hotels = hotels;
	}

}