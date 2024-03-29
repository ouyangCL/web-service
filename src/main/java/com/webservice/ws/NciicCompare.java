
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
 *         &lt;element name="inLicense" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inConditions" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "inLicense",
    "inConditions"
})
@XmlRootElement(name = "nciicCompare")
public class NciicCompare {

    @XmlElement(required = true, nillable = true)
    protected String inLicense;
    @XmlElement(required = true, nillable = true)
    protected String inConditions;

    /**
     * 获取inLicense属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLicense() {
        return inLicense;
    }

    /**
     * 设置inLicense属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLicense(String value) {
        this.inLicense = value;
    }

    /**
     * 获取inConditions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConditions() {
        return inConditions;
    }

    /**
     * 设置inConditions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConditions(String value) {
        this.inConditions = value;
    }

}
