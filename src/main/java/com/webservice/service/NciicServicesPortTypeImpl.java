package com.webservice.service;

import com.webservice.ws.FileObject;
import com.webservice.ws.FileObjectSetPhone;
import com.webservice.ws.NciicServicesPortType;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.Random;

@Component
@WebService(name = "NciicServicesPortTypeImpl", targetNamespace = "http://ws.webservice.com")
public class NciicServicesPortTypeImpl implements NciicServicesPortType {
    @Override
    public String nciicDiscern(String inLicense, String inConditions) {
        return null;
    }

    @Override
    public FileObjectSetPhone nciicCheckGetPhone(String inLicense, String id) {
        return null;
    }

    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://ws.webservice.com")
    @RequestWrapper(localName = "nciicCheckChina", targetNamespace = "http://ws.webservice.com", className = "com.webservice.ws.Nci icCheckChina")
    @ResponseWrapper(localName = "nciicCheckChinaResponse", targetNamespace = "http://ws.webservice.com", className = "com.webservice.ws.NciicCheckChinaResponse")
    @Override
    public String nciicCheckChina(@WebParam(name = "inLicense")
                                              String inLicense,
                                  @WebParam(name = "inConditions")
                                              String inConditions) {
        String a = inConditions + inLicense;
        return a;
    }

    @Override
    public String nciicGetCondition(String inLicense) {
        return null;
    }

    @Override
    public String nciicExactSearch(String inLicense, String inConditions) {
        return null;
    }

    @Override
    public String nciicCourt(String inLicense, String inConditions) {
        return null;
    }

    @Override
    public String nciicFmxxEntry(String inLicense, String inConditions) {
        return null;
    }

    @Override
    public String nciicCheck(String inLicense, String inConditions) {
        return null;
    }

    @Override
    public String nciicCombineSearch(String inLicense, String inConditions) {
        return null;
    }

    @Override
    public String nciicCheckMobile(String inLicense, String inConditions) {
        return null;
    }


    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://ws.webservice.com")
    @RequestWrapper(localName = "nciicCheckFile", targetNamespace = "http://ws.webservice.com", className = "com.webservice.ws.NciicCheckFile")
    @ResponseWrapper(localName = "nciicCheckFileResponse", targetNamespace = "http://ws.webservice.com", className = "com.webservice.ws.NciicCheckFileResponse")
    @Override
    public String nciicCheckFile(@WebParam(name = "fileObject", targetNamespace = "http://ws.webservice.com")
                                         FileObject fileObject) throws InterruptedException {
        int max=300;
        int min=200;
        Random random = new Random();
        int a = random.nextInt(max) % (max - min + 1) + min;
        System.out.println("aaaaaaaaa:"+a);
        Thread.sleep((long) a);
        if(a>200){
            return "<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?><ROWS><ROW no=\\\"1\\\"><INPUT><gmsfhm>610323198510045913</gmsfhm><xm>于辉</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xm></xm><result_xm>一致</result_xm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xp></xp><result_xp></result_xp><result_fx>系统判断为同一人</result_fx><result_fs>89</result_fs></ITEM></OUTPUT></ROW></ROWS>";
        }else{
            return "<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\"?><ROWS><ROW no=\\\"1\\\"><INPUT><gmsfhm>610323198510045913</gmsfhm><xm>于已辉</xm></INPUT><OUTPUT><ITEM><gmsfhm></gmsfhm><result_gmsfhm>一致</result_gmsfhm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xm></xm><result_xm>不一致</result_xm><result_fx></result_fx><result_fs></result_fs></ITEM><ITEM><xp></xp><result_xp></result_xp><result_fx></result_fx><result_fs></result_fs></ITEM></OUTPUT></ROW></ROWS>";
        }
    }

    @Override
    public String nciicCheckHotel(String inLicense, String inConditions) {
        return null;
    }

    @Override
    public String nciicKyxxEntry(String inLicense, String inConditions) {
        return null;
    }

    @Override
    public String nciicCompareScan(String inLicense, String inConditions, String inKey) {
        return null;
    }

    @Override
    public String nciicBirthplaceCompare(String inLicense, String inConditions) {
        return null;
    }

    @Override
    public FileObject nciicGetFile(String inLicense, String id) {
        return null;
    }

    @Override
    public String nciicAddrExactSearch(String inLicense, String inConditions) {
        return null;
    }

    @Override
    public FileObjectSetPhone nciicCheckSetPhone(FileObjectSetPhone fileObject) {
        return null;
    }

    @WebMethod
    @WebResult(name = "out", targetNamespace = "http://ws.webservice.com")
    @RequestWrapper(localName = "nciicCompare", targetNamespace = "http://ws.webservice.com", className = "com.webservice.ws.NciicCompare")
    @ResponseWrapper(localName = "nciicCompareResponse", targetNamespace = "http://ws.webservice.com", className = "com.webservice.ws.NciicCompareResponse")
    @Override
    public String nciicCompare(
            @WebParam(name = "inLicense", targetNamespace = "http://ws.webservice.com")
                    String inLicense,
            @WebParam(name = "inConditions", targetNamespace = "http://ws.webservice.com")
                    String inConditions) {
        return "compare";
    }

    @Override
    public String nciicDateCollection(String inLicense, String inConditions) {
        return null;
    }

    @Override
    public String nciicCheckScan(String inLicense, String inConditions, String inKey) {
        return null;
    }
}
