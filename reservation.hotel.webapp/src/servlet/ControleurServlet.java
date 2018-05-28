package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wshotel.Hotel;
import wshotel.HotelCRUD;
import wshotel.HotelCRUDService;


//@WebServlet("/MaServlet")
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HotelCRUDService service;
	int dernierSlash,dernierPoint;
	String action="aucune",vue=null;

	/**
	 * elle s'exécute une fois que l'objet est chargé en mémoire(on aura q'une seule instance de cette objet)
	 */
	@Override
	public void init() throws ServletException {
		 service = new HotelCRUDService();
		super.init();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		/**
		 * récupération de l'url
		 */
		String url = request.getRequestURI();
	
		/**
		 * 
		 * exemple url http://localhost:8080/reservation.hotel.webapp/monUrl.GLM
		 * ici on récuper la position du dernier slash et celle du dernier point
		 * 
		 */
		dernierSlash = url.lastIndexOf('/');
		dernierPoint = url.lastIndexOf('.');
		PrintWriter out = response.getWriter();
		out.println("proxy=" + dernierPoint + "<br>");
		
		if (dernierPoint > dernierSlash && dernierPoint >= 0) {
			action = url.substring(dernierSlash+1, dernierPoint);
		}
		
		/**
		 * effectuer un mapping entre la vue et le traitement
		 */
		switch (action) {
		case "VueHotel":
			vue = "/views/VueHotel.jsp";
			break;

		default:
			vue = "/views/VueHotel.jsp";
			break;
		}
		getServletContext().getRequestDispatcher(vue).forward(request, response);
		
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<h1>TestServlet</h1>");
//		HotelCRUD proxy = service.getHotelCRUDPort();
//		out.println("proxy=" + proxy + "<br>");
//		Hotel hotel = proxy.getHotel(1);
//		out.print("Hotel " + hotel.getNomHotel() + " " + hotel.getAdresse()+ "<br>");
//		Collection<Hotel> hotels = proxy.getHotels();
//		for(Hotel h : hotels) {
//			out.print("p " + h.getCodeHotel() + " " + h.getNomHotel() + " " + h.getAdresse() + "<br>");
//		}
//		proxy.createHotel("accorHotel", "54 Bd de rue 875214");
//		proxy.deleteHotel(5);
//		proxy.updateHotel(4, "hello", "29 rue dolatela");
//		out.println("transactions JTA terminées");
	}

}
