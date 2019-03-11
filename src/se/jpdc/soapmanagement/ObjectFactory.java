
package se.jpdc.soapmanagement;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the se.jpdc.soapmanagement package. 
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

    private final static QName _AddNewSoapResponse_QNAME = new QName("http://soapmanagement.jpdc.se/", "addNewSoapResponse");
    private final static QName _GetSoapsNyBrandResponse_QNAME = new QName("http://soapmanagement.jpdc.se/", "getSoapsNyBrandResponse");
    private final static QName _GetSoapsNyBrand_QNAME = new QName("http://soapmanagement.jpdc.se/", "getSoapsNyBrand");
    private final static QName _GetAllSoapsResponse_QNAME = new QName("http://soapmanagement.jpdc.se/", "getAllSoapsResponse");
    private final static QName _AddNewSoap_QNAME = new QName("http://soapmanagement.jpdc.se/", "addNewSoap");
    private final static QName _GetAllSoaps_QNAME = new QName("http://soapmanagement.jpdc.se/", "getAllSoaps");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: se.jpdc.soapmanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddNewSoap }
     * 
     */
    public AddNewSoap createAddNewSoap() {
        return new AddNewSoap();
    }

    /**
     * Create an instance of {@link GetAllSoaps }
     * 
     */
    public GetAllSoaps createGetAllSoaps() {
        return new GetAllSoaps();
    }

    /**
     * Create an instance of {@link GetSoapsNyBrand }
     * 
     */
    public GetSoapsNyBrand createGetSoapsNyBrand() {
        return new GetSoapsNyBrand();
    }

    /**
     * Create an instance of {@link GetAllSoapsResponse }
     * 
     */
    public GetAllSoapsResponse createGetAllSoapsResponse() {
        return new GetAllSoapsResponse();
    }

    /**
     * Create an instance of {@link GetSoapsNyBrandResponse }
     * 
     */
    public GetSoapsNyBrandResponse createGetSoapsNyBrandResponse() {
        return new GetSoapsNyBrandResponse();
    }

    /**
     * Create an instance of {@link AddNewSoapResponse }
     * 
     */
    public AddNewSoapResponse createAddNewSoapResponse() {
        return new AddNewSoapResponse();
    }

    /**
     * Create an instance of {@link HandSoap }
     * 
     */
    public HandSoap createHandSoap() {
        return new HandSoap();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewSoapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapmanagement.jpdc.se/", name = "addNewSoapResponse")
    public JAXBElement<AddNewSoapResponse> createAddNewSoapResponse(AddNewSoapResponse value) {
        return new JAXBElement<AddNewSoapResponse>(_AddNewSoapResponse_QNAME, AddNewSoapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoapsNyBrandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapmanagement.jpdc.se/", name = "getSoapsNyBrandResponse")
    public JAXBElement<GetSoapsNyBrandResponse> createGetSoapsNyBrandResponse(GetSoapsNyBrandResponse value) {
        return new JAXBElement<GetSoapsNyBrandResponse>(_GetSoapsNyBrandResponse_QNAME, GetSoapsNyBrandResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoapsNyBrand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapmanagement.jpdc.se/", name = "getSoapsNyBrand")
    public JAXBElement<GetSoapsNyBrand> createGetSoapsNyBrand(GetSoapsNyBrand value) {
        return new JAXBElement<GetSoapsNyBrand>(_GetSoapsNyBrand_QNAME, GetSoapsNyBrand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSoapsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapmanagement.jpdc.se/", name = "getAllSoapsResponse")
    public JAXBElement<GetAllSoapsResponse> createGetAllSoapsResponse(GetAllSoapsResponse value) {
        return new JAXBElement<GetAllSoapsResponse>(_GetAllSoapsResponse_QNAME, GetAllSoapsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewSoap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapmanagement.jpdc.se/", name = "addNewSoap")
    public JAXBElement<AddNewSoap> createAddNewSoap(AddNewSoap value) {
        return new JAXBElement<AddNewSoap>(_AddNewSoap_QNAME, AddNewSoap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSoaps }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soapmanagement.jpdc.se/", name = "getAllSoaps")
    public JAXBElement<GetAllSoaps> createGetAllSoaps(GetAllSoaps value) {
        return new JAXBElement<GetAllSoaps>(_GetAllSoaps_QNAME, GetAllSoaps.class, null, value);
    }

}
