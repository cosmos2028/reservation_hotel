package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the promotionchambre database table.
 * 
 */
@Embeddable
public class PromotionchambrePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_client")
	private int idClient;

	@Column(name="id_publication")
	private int idPublication;

	public PromotionchambrePK() {
	}
	public int getIdClient() {
		return this.idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}
	public int getIdPublication() {
		return this.idPublication;
	}
	public void setIdPublication(int idPublication) {
		this.idPublication = idPublication;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PromotionchambrePK)) {
			return false;
		}
		PromotionchambrePK castOther = (PromotionchambrePK)other;
		return 
			(this.idClient == castOther.idClient)
			&& (this.idPublication == castOther.idPublication);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idClient;
		hash = hash * prime + this.idPublication;
		
		return hash;
	}
}