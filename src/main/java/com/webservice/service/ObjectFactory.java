
package com.webservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservice.service package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://service.webservice.com/", "helloResponse");
    private final static QName _Mytest_QNAME = new QName("http://service.webservice.com/", "mytest");
    private final static QName _Hello_QNAME = new QName("http://service.webservice.com/", "hello");
    private final static QName _MytestResponse_QNAME = new QName("http://service.webservice.com/", "mytestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Mytest }
     * 
     */
    public Mytest createMytest() {
        return new Mytest();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link MytestResponse }
     * 
     */
    public MytestResponse createMytestResponse() {
        return new MytestResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.com/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mytest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.com/", name = "mytest")
    public JAXBElement<Mytest> createMytest(Mytest value) {
        return new JAXBElement<Mytest>(_Mytest_QNAME, Mytest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.com/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MytestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.webservice.com/", name = "mytestResponse")
    public JAXBElement<MytestResponse> createMytestResponse(MytestResponse value) {
        return new JAXBElement<MytestResponse>(_MytestResponse_QNAME, MytestResponse.class, null, value);
    }

}
