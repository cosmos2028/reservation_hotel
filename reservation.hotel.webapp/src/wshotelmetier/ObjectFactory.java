
package wshotelmetier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wshotelmetier package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AjouterUtilisateur_QNAME = new QName("http://ws/", "ajouterUtilisateur");
    private final static QName _AjouterUtilisateurResponse_QNAME = new QName("http://ws/", "ajouterUtilisateurResponse");
    private final static QName _AnnulerReservation_QNAME = new QName("http://ws/", "annulerReservation");
    private final static QName _AnnulerReservationResponse_QNAME = new QName("http://ws/", "annulerReservationResponse");
    private final static QName _AuthentificationParProfil_QNAME = new QName("http://ws/", "authentificationParProfil");
    private final static QName _AuthentificationParProfilResponse_QNAME = new QName("http://ws/", "authentificationParProfilResponse");
    private final static QName _ClientParticipeAuxEnchere_QNAME = new QName("http://ws/", "clientParticipeAuxEnchere");
    private final static QName _ClientParticipeAuxEnchereResponse_QNAME = new QName("http://ws/", "clientParticipeAuxEnchereResponse");
    private final static QName _CommenterHoter_QNAME = new QName("http://ws/", "commenterHoter");
    private final static QName _CommenterHoterResponse_QNAME = new QName("http://ws/", "commenterHoterResponse");
    private final static QName _ConsulterChambresEnchere_QNAME = new QName("http://ws/", "consulterChambresEnchere");
    private final static QName _ConsulterChambresEnchereResponse_QNAME = new QName("http://ws/", "consulterChambresEnchereResponse");
    private final static QName _ConsulterChambresHotel_QNAME = new QName("http://ws/", "consulterChambresHotel");
    private final static QName _ConsulterChambresHotelResponse_QNAME = new QName("http://ws/", "consulterChambresHotelResponse");
    private final static QName _ConsulterChambresParAdresse_QNAME = new QName("http://ws/", "consulterChambresParAdresse");
    private final static QName _ConsulterChambresParAdresseResponse_QNAME = new QName("http://ws/", "consulterChambresParAdresseResponse");
    private final static QName _ConsulterChambresParCriteres_QNAME = new QName("http://ws/", "consulterChambresParCriteres");
    private final static QName _ConsulterChambresParCriteresResponse_QNAME = new QName("http://ws/", "consulterChambresParCriteresResponse");
    private final static QName _ConsulterChambresParIntervallePrix_QNAME = new QName("http://ws/", "consulterChambresParIntervallePrix");
    private final static QName _ConsulterChambresParIntervallePrixResponse_QNAME = new QName("http://ws/", "consulterChambresParIntervallePrixResponse");
    private final static QName _ConsulterChambresParServices_QNAME = new QName("http://ws/", "consulterChambresParServices");
    private final static QName _ConsulterChambresParServicesResponse_QNAME = new QName("http://ws/", "consulterChambresParServicesResponse");
    private final static QName _ConsulterChambresParVilleOuParCodeDepartement_QNAME = new QName("http://ws/", "consulterChambresParVilleOuParCodeDepartement");
    private final static QName _ConsulterChambresParVilleOuParCodeDepartementResponse_QNAME = new QName("http://ws/", "consulterChambresParVilleOuParCodeDepartementResponse");
    private final static QName _ConsulterHotelsRegion_QNAME = new QName("http://ws/", "consulterHotelsRegion");
    private final static QName _ConsulterHotelsRegionResponse_QNAME = new QName("http://ws/", "consulterHotelsRegionResponse");
    private final static QName _ConsulterProfils_QNAME = new QName("http://ws/", "consulterProfils");
    private final static QName _ConsulterProfilsResponse_QNAME = new QName("http://ws/", "consulterProfilsResponse");
    private final static QName _ReservationChambre_QNAME = new QName("http://ws/", "reservationChambre");
    private final static QName _ReservationChambreResponse_QNAME = new QName("http://ws/", "reservationChambreResponse");
    private final static QName _SupprimerCompteUtilisateur_QNAME = new QName("http://ws/", "supprimerCompteUtilisateur");
    private final static QName _SupprimerCompteUtilisateurResponse_QNAME = new QName("http://ws/", "supprimerCompteUtilisateurResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wshotelmetier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsulterChambresParCriteres }
     * 
     */
    public ConsulterChambresParCriteres createConsulterChambresParCriteres() {
        return new ConsulterChambresParCriteres();
    }

    /**
     * Create an instance of {@link ConsulterChambresParCriteres.Arg0 }
     * 
     */
    public ConsulterChambresParCriteres.Arg0 createConsulterChambresParCriteresArg0() {
        return new ConsulterChambresParCriteres.Arg0();
    }

    /**
     * Create an instance of {@link AjouterUtilisateur }
     * 
     */
    public AjouterUtilisateur createAjouterUtilisateur() {
        return new AjouterUtilisateur();
    }

    /**
     * Create an instance of {@link AjouterUtilisateurResponse }
     * 
     */
    public AjouterUtilisateurResponse createAjouterUtilisateurResponse() {
        return new AjouterUtilisateurResponse();
    }

    /**
     * Create an instance of {@link AnnulerReservation }
     * 
     */
    public AnnulerReservation createAnnulerReservation() {
        return new AnnulerReservation();
    }

    /**
     * Create an instance of {@link AnnulerReservationResponse }
     * 
     */
    public AnnulerReservationResponse createAnnulerReservationResponse() {
        return new AnnulerReservationResponse();
    }

    /**
     * Create an instance of {@link AuthentificationParProfil }
     * 
     */
    public AuthentificationParProfil createAuthentificationParProfil() {
        return new AuthentificationParProfil();
    }

    /**
     * Create an instance of {@link AuthentificationParProfilResponse }
     * 
     */
    public AuthentificationParProfilResponse createAuthentificationParProfilResponse() {
        return new AuthentificationParProfilResponse();
    }

    /**
     * Create an instance of {@link ClientParticipeAuxEnchere }
     * 
     */
    public ClientParticipeAuxEnchere createClientParticipeAuxEnchere() {
        return new ClientParticipeAuxEnchere();
    }

    /**
     * Create an instance of {@link ClientParticipeAuxEnchereResponse }
     * 
     */
    public ClientParticipeAuxEnchereResponse createClientParticipeAuxEnchereResponse() {
        return new ClientParticipeAuxEnchereResponse();
    }

    /**
     * Create an instance of {@link CommenterHoter }
     * 
     */
    public CommenterHoter createCommenterHoter() {
        return new CommenterHoter();
    }

    /**
     * Create an instance of {@link CommenterHoterResponse }
     * 
     */
    public CommenterHoterResponse createCommenterHoterResponse() {
        return new CommenterHoterResponse();
    }

    /**
     * Create an instance of {@link ConsulterChambresEnchere }
     * 
     */
    public ConsulterChambresEnchere createConsulterChambresEnchere() {
        return new ConsulterChambresEnchere();
    }

    /**
     * Create an instance of {@link ConsulterChambresEnchereResponse }
     * 
     */
    public ConsulterChambresEnchereResponse createConsulterChambresEnchereResponse() {
        return new ConsulterChambresEnchereResponse();
    }

    /**
     * Create an instance of {@link ConsulterChambresHotel }
     * 
     */
    public ConsulterChambresHotel createConsulterChambresHotel() {
        return new ConsulterChambresHotel();
    }

    /**
     * Create an instance of {@link ConsulterChambresHotelResponse }
     * 
     */
    public ConsulterChambresHotelResponse createConsulterChambresHotelResponse() {
        return new ConsulterChambresHotelResponse();
    }

    /**
     * Create an instance of {@link ConsulterChambresParAdresse }
     * 
     */
    public ConsulterChambresParAdresse createConsulterChambresParAdresse() {
        return new ConsulterChambresParAdresse();
    }

    /**
     * Create an instance of {@link ConsulterChambresParAdresseResponse }
     * 
     */
    public ConsulterChambresParAdresseResponse createConsulterChambresParAdresseResponse() {
        return new ConsulterChambresParAdresseResponse();
    }

    /**
     * Create an instance of {@link ConsulterChambresParCriteresResponse }
     * 
     */
    public ConsulterChambresParCriteresResponse createConsulterChambresParCriteresResponse() {
        return new ConsulterChambresParCriteresResponse();
    }

    /**
     * Create an instance of {@link ConsulterChambresParIntervallePrix }
     * 
     */
    public ConsulterChambresParIntervallePrix createConsulterChambresParIntervallePrix() {
        return new ConsulterChambresParIntervallePrix();
    }

    /**
     * Create an instance of {@link ConsulterChambresParIntervallePrixResponse }
     * 
     */
    public ConsulterChambresParIntervallePrixResponse createConsulterChambresParIntervallePrixResponse() {
        return new ConsulterChambresParIntervallePrixResponse();
    }

    /**
     * Create an instance of {@link ConsulterChambresParServices }
     * 
     */
    public ConsulterChambresParServices createConsulterChambresParServices() {
        return new ConsulterChambresParServices();
    }

    /**
     * Create an instance of {@link ConsulterChambresParServicesResponse }
     * 
     */
    public ConsulterChambresParServicesResponse createConsulterChambresParServicesResponse() {
        return new ConsulterChambresParServicesResponse();
    }

    /**
     * Create an instance of {@link ConsulterChambresParVilleOuParCodeDepartement }
     * 
     */
    public ConsulterChambresParVilleOuParCodeDepartement createConsulterChambresParVilleOuParCodeDepartement() {
        return new ConsulterChambresParVilleOuParCodeDepartement();
    }

    /**
     * Create an instance of {@link ConsulterChambresParVilleOuParCodeDepartementResponse }
     * 
     */
    public ConsulterChambresParVilleOuParCodeDepartementResponse createConsulterChambresParVilleOuParCodeDepartementResponse() {
        return new ConsulterChambresParVilleOuParCodeDepartementResponse();
    }

    /**
     * Create an instance of {@link ConsulterHotelsRegion }
     * 
     */
    public ConsulterHotelsRegion createConsulterHotelsRegion() {
        return new ConsulterHotelsRegion();
    }

    /**
     * Create an instance of {@link ConsulterHotelsRegionResponse }
     * 
     */
    public ConsulterHotelsRegionResponse createConsulterHotelsRegionResponse() {
        return new ConsulterHotelsRegionResponse();
    }

    /**
     * Create an instance of {@link ConsulterProfils }
     * 
     */
    public ConsulterProfils createConsulterProfils() {
        return new ConsulterProfils();
    }

    /**
     * Create an instance of {@link ConsulterProfilsResponse }
     * 
     */
    public ConsulterProfilsResponse createConsulterProfilsResponse() {
        return new ConsulterProfilsResponse();
    }

    /**
     * Create an instance of {@link ReservationChambre }
     * 
     */
    public ReservationChambre createReservationChambre() {
        return new ReservationChambre();
    }

    /**
     * Create an instance of {@link ReservationChambreResponse }
     * 
     */
    public ReservationChambreResponse createReservationChambreResponse() {
        return new ReservationChambreResponse();
    }

    /**
     * Create an instance of {@link SupprimerCompteUtilisateur }
     * 
     */
    public SupprimerCompteUtilisateur createSupprimerCompteUtilisateur() {
        return new SupprimerCompteUtilisateur();
    }

    /**
     * Create an instance of {@link SupprimerCompteUtilisateurResponse }
     * 
     */
    public SupprimerCompteUtilisateurResponse createSupprimerCompteUtilisateurResponse() {
        return new SupprimerCompteUtilisateurResponse();
    }

    /**
     * Create an instance of {@link Chambre }
     * 
     */
    public Chambre createChambre() {
        return new Chambre();
    }

    /**
     * Create an instance of {@link Accessibilite }
     * 
     */
    public Accessibilite createAccessibilite() {
        return new Accessibilite();
    }

    /**
     * Create an instance of {@link Categoriechambre }
     * 
     */
    public Categoriechambre createCategoriechambre() {
        return new Categoriechambre();
    }

    /**
     * Create an instance of {@link Chambrepublier }
     * 
     */
    public Chambrepublier createChambrepublier() {
        return new Chambrepublier();
    }

    /**
     * Create an instance of {@link Promotionchambre }
     * 
     */
    public Promotionchambre createPromotionchambre() {
        return new Promotionchambre();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link Avisclientsurhotel }
     * 
     */
    public Avisclientsurhotel createAvisclientsurhotel() {
        return new Avisclientsurhotel();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link AvisclientsurhotelPK }
     * 
     */
    public AvisclientsurhotelPK createAvisclientsurhotelPK() {
        return new AvisclientsurhotelPK();
    }

    /**
     * Create an instance of {@link Langue }
     * 
     */
    public Langue createLangue() {
        return new Langue();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link Facture }
     * 
     */
    public Facture createFacture() {
        return new Facture();
    }

    /**
     * Create an instance of {@link Independant }
     * 
     */
    public Independant createIndependant() {
        return new Independant();
    }

    /**
     * Create an instance of {@link IndEffectueTache }
     * 
     */
    public IndEffectueTache createIndEffectueTache() {
        return new IndEffectueTache();
    }

    /**
     * Create an instance of {@link IndEffectueTachePK }
     * 
     */
    public IndEffectueTachePK createIndEffectueTachePK() {
        return new IndEffectueTachePK();
    }

    /**
     * Create an instance of {@link Tache }
     * 
     */
    public Tache createTache() {
        return new Tache();
    }

    /**
     * Create an instance of {@link TypeTache }
     * 
     */
    public TypeTache createTypeTache() {
        return new TypeTache();
    }

    /**
     * Create an instance of {@link PromotionchambrePK }
     * 
     */
    public PromotionchambrePK createPromotionchambrePK() {
        return new PromotionchambrePK();
    }

    /**
     * Create an instance of {@link Equipement }
     * 
     */
    public Equipement createEquipement() {
        return new Equipement();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Profil }
     * 
     */
    public Profil createProfil() {
        return new Profil();
    }

    /**
     * Create an instance of {@link ConsulterChambresParCriteres.Arg0 .Entry }
     * 
     */
    public ConsulterChambresParCriteres.Arg0 .Entry createConsulterChambresParCriteresArg0Entry() {
        return new ConsulterChambresParCriteres.Arg0 .Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ajouterUtilisateur")
    public JAXBElement<AjouterUtilisateur> createAjouterUtilisateur(AjouterUtilisateur value) {
        return new JAXBElement<AjouterUtilisateur>(_AjouterUtilisateur_QNAME, AjouterUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ajouterUtilisateurResponse")
    public JAXBElement<AjouterUtilisateurResponse> createAjouterUtilisateurResponse(AjouterUtilisateurResponse value) {
        return new JAXBElement<AjouterUtilisateurResponse>(_AjouterUtilisateurResponse_QNAME, AjouterUtilisateurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerReservation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "annulerReservation")
    public JAXBElement<AnnulerReservation> createAnnulerReservation(AnnulerReservation value) {
        return new JAXBElement<AnnulerReservation>(_AnnulerReservation_QNAME, AnnulerReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnnulerReservationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "annulerReservationResponse")
    public JAXBElement<AnnulerReservationResponse> createAnnulerReservationResponse(AnnulerReservationResponse value) {
        return new JAXBElement<AnnulerReservationResponse>(_AnnulerReservationResponse_QNAME, AnnulerReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthentificationParProfil }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "authentificationParProfil")
    public JAXBElement<AuthentificationParProfil> createAuthentificationParProfil(AuthentificationParProfil value) {
        return new JAXBElement<AuthentificationParProfil>(_AuthentificationParProfil_QNAME, AuthentificationParProfil.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthentificationParProfilResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "authentificationParProfilResponse")
    public JAXBElement<AuthentificationParProfilResponse> createAuthentificationParProfilResponse(AuthentificationParProfilResponse value) {
        return new JAXBElement<AuthentificationParProfilResponse>(_AuthentificationParProfilResponse_QNAME, AuthentificationParProfilResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientParticipeAuxEnchere }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "clientParticipeAuxEnchere")
    public JAXBElement<ClientParticipeAuxEnchere> createClientParticipeAuxEnchere(ClientParticipeAuxEnchere value) {
        return new JAXBElement<ClientParticipeAuxEnchere>(_ClientParticipeAuxEnchere_QNAME, ClientParticipeAuxEnchere.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientParticipeAuxEnchereResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "clientParticipeAuxEnchereResponse")
    public JAXBElement<ClientParticipeAuxEnchereResponse> createClientParticipeAuxEnchereResponse(ClientParticipeAuxEnchereResponse value) {
        return new JAXBElement<ClientParticipeAuxEnchereResponse>(_ClientParticipeAuxEnchereResponse_QNAME, ClientParticipeAuxEnchereResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommenterHoter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "commenterHoter")
    public JAXBElement<CommenterHoter> createCommenterHoter(CommenterHoter value) {
        return new JAXBElement<CommenterHoter>(_CommenterHoter_QNAME, CommenterHoter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommenterHoterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "commenterHoterResponse")
    public JAXBElement<CommenterHoterResponse> createCommenterHoterResponse(CommenterHoterResponse value) {
        return new JAXBElement<CommenterHoterResponse>(_CommenterHoterResponse_QNAME, CommenterHoterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresEnchere }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresEnchere")
    public JAXBElement<ConsulterChambresEnchere> createConsulterChambresEnchere(ConsulterChambresEnchere value) {
        return new JAXBElement<ConsulterChambresEnchere>(_ConsulterChambresEnchere_QNAME, ConsulterChambresEnchere.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresEnchereResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresEnchereResponse")
    public JAXBElement<ConsulterChambresEnchereResponse> createConsulterChambresEnchereResponse(ConsulterChambresEnchereResponse value) {
        return new JAXBElement<ConsulterChambresEnchereResponse>(_ConsulterChambresEnchereResponse_QNAME, ConsulterChambresEnchereResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresHotel")
    public JAXBElement<ConsulterChambresHotel> createConsulterChambresHotel(ConsulterChambresHotel value) {
        return new JAXBElement<ConsulterChambresHotel>(_ConsulterChambresHotel_QNAME, ConsulterChambresHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresHotelResponse")
    public JAXBElement<ConsulterChambresHotelResponse> createConsulterChambresHotelResponse(ConsulterChambresHotelResponse value) {
        return new JAXBElement<ConsulterChambresHotelResponse>(_ConsulterChambresHotelResponse_QNAME, ConsulterChambresHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresParAdresse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresParAdresse")
    public JAXBElement<ConsulterChambresParAdresse> createConsulterChambresParAdresse(ConsulterChambresParAdresse value) {
        return new JAXBElement<ConsulterChambresParAdresse>(_ConsulterChambresParAdresse_QNAME, ConsulterChambresParAdresse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresParAdresseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresParAdresseResponse")
    public JAXBElement<ConsulterChambresParAdresseResponse> createConsulterChambresParAdresseResponse(ConsulterChambresParAdresseResponse value) {
        return new JAXBElement<ConsulterChambresParAdresseResponse>(_ConsulterChambresParAdresseResponse_QNAME, ConsulterChambresParAdresseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresParCriteres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresParCriteres")
    public JAXBElement<ConsulterChambresParCriteres> createConsulterChambresParCriteres(ConsulterChambresParCriteres value) {
        return new JAXBElement<ConsulterChambresParCriteres>(_ConsulterChambresParCriteres_QNAME, ConsulterChambresParCriteres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresParCriteresResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresParCriteresResponse")
    public JAXBElement<ConsulterChambresParCriteresResponse> createConsulterChambresParCriteresResponse(ConsulterChambresParCriteresResponse value) {
        return new JAXBElement<ConsulterChambresParCriteresResponse>(_ConsulterChambresParCriteresResponse_QNAME, ConsulterChambresParCriteresResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresParIntervallePrix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresParIntervallePrix")
    public JAXBElement<ConsulterChambresParIntervallePrix> createConsulterChambresParIntervallePrix(ConsulterChambresParIntervallePrix value) {
        return new JAXBElement<ConsulterChambresParIntervallePrix>(_ConsulterChambresParIntervallePrix_QNAME, ConsulterChambresParIntervallePrix.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresParIntervallePrixResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresParIntervallePrixResponse")
    public JAXBElement<ConsulterChambresParIntervallePrixResponse> createConsulterChambresParIntervallePrixResponse(ConsulterChambresParIntervallePrixResponse value) {
        return new JAXBElement<ConsulterChambresParIntervallePrixResponse>(_ConsulterChambresParIntervallePrixResponse_QNAME, ConsulterChambresParIntervallePrixResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresParServices }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresParServices")
    public JAXBElement<ConsulterChambresParServices> createConsulterChambresParServices(ConsulterChambresParServices value) {
        return new JAXBElement<ConsulterChambresParServices>(_ConsulterChambresParServices_QNAME, ConsulterChambresParServices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresParServicesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresParServicesResponse")
    public JAXBElement<ConsulterChambresParServicesResponse> createConsulterChambresParServicesResponse(ConsulterChambresParServicesResponse value) {
        return new JAXBElement<ConsulterChambresParServicesResponse>(_ConsulterChambresParServicesResponse_QNAME, ConsulterChambresParServicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresParVilleOuParCodeDepartement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresParVilleOuParCodeDepartement")
    public JAXBElement<ConsulterChambresParVilleOuParCodeDepartement> createConsulterChambresParVilleOuParCodeDepartement(ConsulterChambresParVilleOuParCodeDepartement value) {
        return new JAXBElement<ConsulterChambresParVilleOuParCodeDepartement>(_ConsulterChambresParVilleOuParCodeDepartement_QNAME, ConsulterChambresParVilleOuParCodeDepartement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterChambresParVilleOuParCodeDepartementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterChambresParVilleOuParCodeDepartementResponse")
    public JAXBElement<ConsulterChambresParVilleOuParCodeDepartementResponse> createConsulterChambresParVilleOuParCodeDepartementResponse(ConsulterChambresParVilleOuParCodeDepartementResponse value) {
        return new JAXBElement<ConsulterChambresParVilleOuParCodeDepartementResponse>(_ConsulterChambresParVilleOuParCodeDepartementResponse_QNAME, ConsulterChambresParVilleOuParCodeDepartementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterHotelsRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterHotelsRegion")
    public JAXBElement<ConsulterHotelsRegion> createConsulterHotelsRegion(ConsulterHotelsRegion value) {
        return new JAXBElement<ConsulterHotelsRegion>(_ConsulterHotelsRegion_QNAME, ConsulterHotelsRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterHotelsRegionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterHotelsRegionResponse")
    public JAXBElement<ConsulterHotelsRegionResponse> createConsulterHotelsRegionResponse(ConsulterHotelsRegionResponse value) {
        return new JAXBElement<ConsulterHotelsRegionResponse>(_ConsulterHotelsRegionResponse_QNAME, ConsulterHotelsRegionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterProfils }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterProfils")
    public JAXBElement<ConsulterProfils> createConsulterProfils(ConsulterProfils value) {
        return new JAXBElement<ConsulterProfils>(_ConsulterProfils_QNAME, ConsulterProfils.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsulterProfilsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "consulterProfilsResponse")
    public JAXBElement<ConsulterProfilsResponse> createConsulterProfilsResponse(ConsulterProfilsResponse value) {
        return new JAXBElement<ConsulterProfilsResponse>(_ConsulterProfilsResponse_QNAME, ConsulterProfilsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationChambre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "reservationChambre")
    public JAXBElement<ReservationChambre> createReservationChambre(ReservationChambre value) {
        return new JAXBElement<ReservationChambre>(_ReservationChambre_QNAME, ReservationChambre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReservationChambreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "reservationChambreResponse")
    public JAXBElement<ReservationChambreResponse> createReservationChambreResponse(ReservationChambreResponse value) {
        return new JAXBElement<ReservationChambreResponse>(_ReservationChambreResponse_QNAME, ReservationChambreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerCompteUtilisateur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "supprimerCompteUtilisateur")
    public JAXBElement<SupprimerCompteUtilisateur> createSupprimerCompteUtilisateur(SupprimerCompteUtilisateur value) {
        return new JAXBElement<SupprimerCompteUtilisateur>(_SupprimerCompteUtilisateur_QNAME, SupprimerCompteUtilisateur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerCompteUtilisateurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "supprimerCompteUtilisateurResponse")
    public JAXBElement<SupprimerCompteUtilisateurResponse> createSupprimerCompteUtilisateurResponse(SupprimerCompteUtilisateurResponse value) {
        return new JAXBElement<SupprimerCompteUtilisateurResponse>(_SupprimerCompteUtilisateurResponse_QNAME, SupprimerCompteUtilisateurResponse.class, null, value);
    }

}
