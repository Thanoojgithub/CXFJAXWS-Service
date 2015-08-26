
package com.cxfjaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cxfjaxws package. 
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

    private final static QName _EmployeeRequest_QNAME = new QName("http://cxfjaxws.com/", "employeeRequest");
    private final static QName _EmployeeResponse_QNAME = new QName("http://cxfjaxws.com/", "employeeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cxfjaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeRequest }
     * 
     */
    public EmployeeRequest createEmployeeRequest() {
        return new EmployeeRequest();
    }

    /**
     * Create an instance of {@link EmployeeResponse }
     * 
     */
    public EmployeeResponse createEmployeeResponse() {
        return new EmployeeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxfjaxws.com/", name = "employeeRequest")
    public JAXBElement<EmployeeRequest> createEmployeeRequest(EmployeeRequest value) {
        return new JAXBElement<EmployeeRequest>(_EmployeeRequest_QNAME, EmployeeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxfjaxws.com/", name = "employeeResponse")
    public JAXBElement<EmployeeResponse> createEmployeeResponse(EmployeeResponse value) {
        return new JAXBElement<EmployeeResponse>(_EmployeeResponse_QNAME, EmployeeResponse.class, null, value);
    }

}
