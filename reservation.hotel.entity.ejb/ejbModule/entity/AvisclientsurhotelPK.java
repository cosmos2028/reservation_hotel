package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the avisclientsurhotel database table.
 * 
 */
@Embeddable
public class AvisclientsurhotelPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="code_hotel")
	private int codeHotel;

	@Column(name="id_client")
	private int idClient;

	public AvisclientsurhotelPK() {
	}
	public int getCodeHotel() {
		return this.codeHotel;
	}
	public void setCodeHotel(int codeHotel) {
		this.codeHotel = codeHotel;
	}
	public int getIdClient() {
		return this.idClient;
	}
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AvisclientsurhotelPK)) {
			return false;
		}
		AvisclientsurhotelPK castOther = (AvisclientsurhotelPK)other;
		return 
			(this.codeHotel == castOther.codeHotel)
			&& (this.idClient == castOther.idClient);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codeHotel;
		hash = hash * prime + this.idClient;
		
		return hash;
	}
}