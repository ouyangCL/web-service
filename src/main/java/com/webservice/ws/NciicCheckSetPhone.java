
package com.webservice.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fileObject" type="{http://ws.webservices.com}FileObjectSetPhone"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fileObject"
})
@XmlRootElement(name = "nciicCheckSetPhone")
public class NciicCheckSetPhone {

    @XmlElement(required = true, nillable = true)
    protected FileObjectSetPhone fileObject;

    /**
     * ��ȡfileObject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FileObjectSetPhone }
     *     
     */
    public FileObjectSetPhone getFileObject() {
        return fileObject;
    }

    /**
     * ����fileObject���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FileObjectSetPhone }
     *     
     */
    public void setFileObject(FileObjectSetPhone value) {
        this.fileObject = value;
    }

}
