package com.webservice;


//import org.codehaus.xfire.client.XFireProxyFactory;
//import org.codehaus.xfire.service.binding.ObjectServiceFactory;
//import org.apache.commons.httpclient.protocol.Protocol;
//import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
//import org.codehaus.xfire.client.XFireProxyFactory;
//import org.codehaus.xfire.service.binding.ObjectServiceFactory;
//import org.codehaus.xfire.transport.http.EasySSLProtocolSocketFactory;

import com.webservice.ws.NciicServicesPortType;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;

public class TestWebServie {

    public static void main(String[] args) throws Exception {
//        NciicServices nciicServices = new NciicServices();
//        NciicServicesPortType nciicServicesPortType = nciicServices.getNciicServicesHttpPort();
//        System.out.println(nciicServicesPortType.nciicCompare("", ""));
//        NciicServices nciicServices = new NciicServices();
//        NciicServicesPortType nciicServicesPortType = nciicServices.getNciicServicesHttpPort();
//        nciicServicesPortType.nciicCompare("","");

//        ProtocolSocketFactory easy = new EasySSLProtocolSocketFactory();
//        Protocol protocol = new Protocol("https", easy, 443);
//        Protocol.registerProtocol("https", protocol);
//
        ObjectServiceFactory serviceFactory = new ObjectServiceFactory();
        org.codehaus.xfire.service.Service serviceModel = serviceFactory
                .create(NciicServicesPortType.class);
        XFireProxyFactory proxyFactory = new XFireProxyFactory();
        NciicServicesPortType service = (NciicServicesPortType) proxyFactory.create(
                serviceModel, "http://172.16.102.205:8080/nciic_ws/webservice/NciicServicesPortTypeImpl");
        //FileObject fileObject = new FileObject();
        //System.out.println(service.nciicCheckFile(fileObject));
        System.out.println(service.nciicCompare("123", "456"));
//        Client client = new Client(new URL("http://172.16.102.205:8080/nciic_ws/webservice?wsdl"));
//                Object[] obs = new Object[]{"123", "3245"};
//        Object[] results = client.invoke("nciicCompare", obs);
//        String xmlResult = results[0].toString();
//        System.out.println(xmlResult);

    }
}
