package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ind_effectue_tache database table.
 * 
 */
@Embeddable
public class IndEffectueTachePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_tache")
	private int idTache;

	@Column(name="id_independant")
	private int idIndependant;

	public IndEffectueTachePK() {
	}
	public int getIdTache() {
		return this.idTache;
	}
	public void setIdTache(int idTache) {
		this.idTache = idTache;
	}
	public int getIdIndependant() {
		return this.idIndependant;
	}
	public void setIdIndependant(int idIndependant) {
		this.idIndependant = idIndependant;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof IndEffectueTachePK)) {
			return false;
		}
		IndEffectueTachePK castOther = (IndEffectueTachePK)other;
		return 
			(this.idTache == castOther.idTache)
			&& (this.idIndependant == castOther.idIndependant);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idTache;
		hash = hash * prime + this.idIndependant;
		
		return hash;
	}
}