package wshotelmetier;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2018-06-01T21:12:24.827+02:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "HotelMetierImplService", 
                  wsdlLocation = "http://DESKTOP-28RSBAP:8080/reservation.hotel.ws.ejb/HotelMetierImpl?wsdl",
                  targetNamespace = "http://ws/") 
public class HotelMetierImplService extends javax.xml.ws.Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws/", "HotelMetierImplService");
    public final static QName HotelMetierImplPort = new QName("http://ws/", "HotelMetierImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://DESKTOP-28RSBAP:8080/reservation.hotel.ws.ejb/HotelMetierImpl?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HotelMetierImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://DESKTOP-28RSBAP:8080/reservation.hotel.ws.ejb/HotelMetierImpl?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HotelMetierImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HotelMetierImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelMetierImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HotelMetierImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HotelMetierImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HotelMetierImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HotelMetierImpl
     */
    @WebEndpoint(name = "HotelMetierImplPort")
    public HotelMetierImpl getHotelMetierImplPort() {
        return super.getPort(HotelMetierImplPort, HotelMetierImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelMetierImpl
     */
    @WebEndpoint(name = "HotelMetierImplPort")
    public HotelMetierImpl getHotelMetierImplPort(WebServiceFeature... features) {
        return super.getPort(HotelMetierImplPort, HotelMetierImpl.class, features);
    }

}
