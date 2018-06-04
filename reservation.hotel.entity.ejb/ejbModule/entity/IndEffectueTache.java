package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ind_effectue_tache database table.
 * 
 */
@Entity
@Table(name="ind_effectue_tache")
@NamedQuery(name="IndEffectueTache.findAll", query="SELECT i FROM IndEffectueTache i")
public class IndEffectueTache implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private IndEffectueTachePK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_deb")
	private Date dateDeb;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_fin")
	private Date dateFin;

	private int nb_heure_effectue;

	//bi-directional many-to-one association to Independant
	@ManyToOne
	@JoinColumn(name="id_independant", insertable=false, updatable=false)
	private Independant independant;

	//bi-directional many-to-one association to Tache
	@ManyToOne
	@JoinColumn(name="id_tache", insertable=false, updatable=false)
	private Tache tache;

	public IndEffectueTache() {
	}

	public IndEffectueTachePK getId() {
		return this.id;
	}

	public void setId(IndEffectueTachePK id) {
		this.id = id;
	}

	public Date getDateDeb() {
		return this.dateDeb;
	}

	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}

	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getNb_heure_effectue() {
		return this.nb_heure_effectue;
	}

	public void setNb_heure_effectue(int nb_heure_effectue) {
		this.nb_heure_effectue = nb_heure_effectue;
	}

	public Independant getIndependant() {
		return this.independant;
	}

	public void setIndependant(Independant independant) {
		this.independant = independant;
	}

	public Tache getTache() {
		return this.tache;
	}

	public void setTache(Tache tache) {
		this.tache = tache;
	}

}