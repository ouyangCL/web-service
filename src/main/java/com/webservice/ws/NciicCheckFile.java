
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
 *         &lt;element name="fileObject" type="{http://ws.webservices.com}FileObject"/>
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
@XmlRootElement(name = "nciicCheckFile")
public class NciicCheckFile {

    @XmlElement(required = true, nillable = true)
    protected FileObject fileObject;

    /**
     * ��ȡfileObject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FileObject }
     *     
     */
    public FileObject getFileObject() {
        return fileObject;
    }

    /**
     * ����fileObject���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FileObject }
     *     
     */
    public void setFileObject(FileObject value) {
        this.fileObject = value;
    }

}
