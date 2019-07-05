
package com.webservice.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取fileObject属性的值。
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
     * 设置fileObject属性的值。
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
