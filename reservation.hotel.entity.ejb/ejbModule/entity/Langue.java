package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the langue database table.
 * 
 */
@Entity
@NamedQuery(name="Langue.findAll", query="SELECT l FROM Langue l")
public class Langue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_langue")
	private int idLangue;

	@Column(name="nom_langue")
	private String nomLangue;

	//bi-directional many-to-one association to Client
	@OneToMany(mappedBy="langue", fetch=FetchType.EAGER)
	private Set<Client> clients;

	public Langue() {
	}

	public int getIdLangue() {
		return this.idLangue;
	}

	public void setIdLangue(int idLangue) {
		this.idLangue = idLangue;
	}

	public String getNomLangue() {
		return this.nomLangue;
	}

	public void setNomLangue(String nomLangue) {
		this.nomLangue = nomLangue;
	}

	public Set<Client> getClients() {
		return this.clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	public Client addClient(Client client) {
		getClients().add(client);
		client.setLangue(this);

		return client;
	}

	public Client removeClient(Client client) {
		getClients().remove(client);
		client.setLangue(null);

		return client;
	}

}