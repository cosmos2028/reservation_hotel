package ws;

import java.util.Collection;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entity.Hotel;


@WebService
@Stateless
public class HotelCRUD {
	
	@PersistenceContext
	EntityManager entityManager;

	public Hotel getHotel(int code_hotel) {
		System.out.println("getHotel("+code_hotel+")");
		System.out.println("entityManager=" + entityManager);
		return entityManager.find(Hotel.class, code_hotel);
	}
	
	public Collection<Hotel> getHotels() {
		System.out.println("getHotel()");
		Query query = entityManager.createQuery("from Hotel");
		return query.getResultList();
	}
	
	public void createHotel(String nomHotel, String adresse) {
		Hotel hotel = new Hotel();
		hotel.setNomHotel(nomHotel);
		hotel.setAdresse(adresse);
		entityManager.persist(hotel);
		System.out.println("createHotel("+nomHotel+","+adresse+")");
	}
	
	public void updateHotel(int code_hotel, String nomHotel, String adresse) {
		Hotel hotel = entityManager.find(Hotel.class, code_hotel);
		if (hotel!=null) {
			hotel.setNomHotel(nomHotel);
			hotel.setAdresse(adresse);
		}
		System.out.println("updateHotel("+code_hotel+","+nomHotel+","+adresse+")");
	}
	
	public void deleteHotel(int code_hotel) {
		Hotel hotel = entityManager.find(Hotel.class, code_hotel);
		if (hotel!=null) {
			entityManager.remove(hotel);
		}
		System.out.println("deleteHotel("+code_hotel+")");
	}
}
